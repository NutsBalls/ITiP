public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.put("one", 1);
        hashTable.put("two", 2);
        
        System.out.println("Выполнение задания 1");
        System.out.println(hashTable.get("one"));
        System.out.println(hashTable.size());
        System.out.println(hashTable.isEmpty());
        
        hashTable.remove("one");
        System.out.println(hashTable.get("one"));


        CarPark carPark = new CarPark();
        
        
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2018);
        Car car3 = new Car("Ford", "Focus", 2019);
        
   
        carPark.addCar("ABC123", car1);
        carPark.addCar("XYZ456", car2);
        carPark.addCar("LMN789", car3);
        
        System.out.println("--------------------");
        System.out.println("Выполнение задания 2");
        System.out.println(carPark.getCar("ABC123")); 
        System.out.println(carPark.removeCar("XYZ456"));
        System.out.println("Количество машин в автопарке=" + carPark.size());
        System.out.println(carPark.isEmpty()); 
    }
}
