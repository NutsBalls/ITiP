package task3;


import java.util.*;
import java.util.concurrent.*;

public class WarehouseTransfer {

    public static void main(String[] args) {
        List<Integer> items = Collections.synchronizedList(new ArrayList<>(Arrays.asList(
            50, 30, 20, 40, 10, 60, 70, 80, 90, 100
        )));

        Warehouse warehouse = new Warehouse(items);

        int numLoaders = 3;

        CyclicBarrier barrier = new CyclicBarrier(numLoaders, () -> {
            System.out.println("Все грузчики достигли барьера. Отправляем груз на другой склад.\n");
            warehouse.resetTotalWeight();
        });

        Thread[] threads = new Thread[3];

        for(int i = 1; i <= numLoaders; i++) {
            Loader loader = new Loader("Грузчик-" + i, warehouse, barrier);
            Thread th = new Thread(loader);
            threads[i-1] = th;
            th.start();
        }

        for (Thread t: threads){
            try{
                t.join();
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        
        System.out.println("Все грузы были перенесены");

    }
}

class Warehouse {
    private final List<Integer> items;
    private int totalWeight;

    public Warehouse(List<Integer> items) {
        this.items = items;
        this.totalWeight = 0;
    }

    public synchronized Integer takeItem() {
        if (items.isEmpty()) {
            return null;
        }
        return items.remove(0);
    }

    public synchronized void returnItem(int item) {
        items.add(0, item);
    }

    public synchronized boolean tryAddWeight(int weight) {
        if (totalWeight + weight > 150) {
            return false;
        } else {
            totalWeight += weight;
            return true;
        }
    }

    public synchronized void resetTotalWeight() {
        totalWeight = 0;
    }

    public synchronized int getTotalWeight() {
        return totalWeight;
    }

    public synchronized boolean hasItems() {
        return !items.isEmpty();
    }
}

class Loader implements Runnable {
    private final String name;
    private final Warehouse warehouse;
    private final CyclicBarrier barrier;
    private final List<Integer> carriedItems;
    private int carriedWeight;

    public Loader(String name, Warehouse warehouse, CyclicBarrier barrier) {
        this.name = name;
        this.warehouse = warehouse;
        this.barrier = barrier;
        this.carriedItems = new ArrayList<>();
        this.carriedWeight = 0;
    }

    @Override
    public void run() {
        try {
            while (warehouse.hasItems()) {
                Integer item;
                boolean needToAwait = false;

                synchronized (warehouse) {
                    if (!warehouse.hasItems()) {
                        break;
                    }

                    item = warehouse.takeItem();

                    if (item == null) {
                        break;
                    }
                    

                    boolean added = warehouse.tryAddWeight(item);

                    if (added) {
                        carriedItems.add(item);
                        carriedWeight += item;
                        System.out.println(name + " перенёс товар весом " + item + " кг. Текущий суммарный вес: " + warehouse.getTotalWeight() + " кг");

                        if (warehouse.getTotalWeight() >= 150) {
                            needToAwait = true;
                        }
                    } else {
                        warehouse.returnItem(item);
                        System.out.println(name + " не может перенести товар весом " + item + " кг. Ожидает на барьере.");
                        needToAwait = true;
                    }
                }

                if (needToAwait) {
                    barrier.await();
                }
                Thread.sleep(100);
            }

            synchronized (warehouse) {
                if (carriedWeight > 0) {
                    System.out.println(name + " завершил перенос товаров. Ожидает отправки оставшегося груза.");
                }
            }

            barrier.await();

        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
    }
}

