package sales;


import java.util.concurrent.atomic.AtomicInteger;

public class Item {
    private final String name;          // Название товараs
    private final double price;         // Цена товара
    private final AtomicInteger count;  // Количество продаж

    public Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.count = new AtomicInteger(0);
    }

    public void incrementCount() {
        count.incrementAndGet();
    }

    public int getCount() {
        return count.get();
    }

    public double getTotal() {
        return count.get() * price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
