package sales;

import java.util.concurrent.ConcurrentHashMap;

public class SalesTracker {
    // Карта для учета проданных товаров: ключ - название товара, значение - объект Item
    private final ConcurrentHashMap<String, Item> sales = new ConcurrentHashMap<>();

    // Метод для добавления проданного товара
    public void addSale(String productName, double price) {
        sales.compute(productName, (name, item) -> {
            if (item == null) {
                item = new Item(name, price);
            }
            item.incrementCount();
            return item;
        });
    }

    // Метод для вывода списка проданных товаров
    public void printSales() {
        System.out.println("Список проданных товаров:");
        sales.forEach((name, item) -> System.out.printf("%s: %d шт. (%.2f за шт., всего: %.2f)%n",
                item.getName(), item.getCount(), item.getPrice(), item.getTotal()));
    }

    // Метод для подсчета общей суммы продаж
    public double getTotalSales() {
        return sales.values().stream().mapToDouble(Item::getTotal).sum();
    }

    // Метод для нахождения самого популярного товара
    public String getMostPopularProduct() {
        return sales.values().stream()
                .max((a, b) -> Integer.compare(a.getCount(), b.getCount()))
                .map(Item::getName)
                .orElse("Нет проданных товаров");
    }
}

