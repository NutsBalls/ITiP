import java.util.HashMap;

public class CarPark {
    private final HashMap<String, Car> carMap;

    public CarPark() {
        carMap = new HashMap<>();
    }

    public void addCar(String licensePlate, Car car) {
        carMap.put(licensePlate, car);
    }

    public Car getCar(String licensePlate) {
        return carMap.get(licensePlate);
    }

    public Car removeCar(String licensePlate) {
        return carMap.remove(licensePlate);
    }

    public int size() {
        return carMap.size();
    }

    public boolean isEmpty() {
        return carMap.isEmpty();
    }
}
