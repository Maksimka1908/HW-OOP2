import service.ServiceStation;
import transport.Bicycle;
import transport.Car;
import transport.Truck;

public class Main {

    public static void main(String[] args) {
        ServiceStation serviceStation = new ServiceStation();

        Bicycle bicycle = new Bicycle("Stels", 2);
        Car car = new Car("LADA", 4);
        Truck truck = new Truck("Scania", 10);

        serviceStation.service(bicycle);
        serviceStation.service(car);
        serviceStation.service(truck);

    }
}