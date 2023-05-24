import VehicleDomen.Bus;
import VehicleDomen.Car;

public class App {
    public static void main(String[] args) throws Exception {
        Bus bus1 = new Bus(100, "Автобус");
        Car car1 = new Car(200, "Автомобиль");

        double busSpeed = bus1.CalculateAllowedSpeed();
        double carSpeed = car1.CalculateAllowedSpeed();

        System.out.println("Для " + bus1.getType() + " max допустимая скорость: " + busSpeed);
        System.out.println("Для " + car1.getType() + " max допустимая скорость: " + carSpeed);
    }
}