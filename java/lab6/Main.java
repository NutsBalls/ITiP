import sales.SalesTracker;

public class Main {
    public static void main(String[] args) {
        SalesTracker tracker = new SalesTracker();

        tracker.addSale("Яблоки", 50.0);
        tracker.addSale("Яблоки", 50.0);
        tracker.addSale("Апельсины", 80.0);
        tracker.addSale("Бананы", 30.0);
        tracker.addSale("Бананы", 30.0);
        tracker.addSale("Бананы", 30.0);

        tracker.printSales();

        System.out.printf("Общая сумма продаж: %.2f%n", tracker.getTotalSales());

        System.out.println("Наиболее популярный товар: " + tracker.getMostPopularProduct());
    }
}
