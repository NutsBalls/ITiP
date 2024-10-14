public class Main {
    public static void main(String[] args) {
        HashTable<String, Integer> hashTable = new HashTable<>();
        hashTable.put("one", 1);
        hashTable.put("two", 2);
        
        System.out.println(hashTable.get("one")); // Вывод: 1
        System.out.println(hashTable.size()); // Вывод: 2
        System.out.println(hashTable.isEmpty()); // Вывод: false
        
        hashTable.remove("one");
        System.out.println(hashTable.get("one")); // Вывод: null


        CarPark carPark = new CarPark();
        
        // Создаем автомобили
        Car car1 = new Car("Toyota", "Camry", 2020);
        Car car2 = new Car("Honda", "Civic", 2018);
        Car car3 = new Car("Ford", "Focus", 2019);
        
        // Добавляем автомобили в автопарк
        carPark.addCar("ABC123", car1);
        carPark.addCar("XYZ456", car2);
        carPark.addCar("LMN789", car3);
        
        // Поиск автомобиля
        System.out.println(carPark.getCar("ABC123")); // Вывод: Car{brand='Toyota', model='Camry', year=2020}
        
        // Удаление автомобиля
        System.out.println(carPark.removeCar("XYZ456")); // Вывод: Car{brand='Honda', model='Civic', year=2018}
        
        // Проверка размера автопарка
        System.out.println(carPark.size()); // Вывод: 2
        System.out.println(carPark.isEmpty()); // Вывод: false
    }
}
