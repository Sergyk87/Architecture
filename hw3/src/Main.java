import OCP.Bus;
import OCP.Car;
import OCP.Vehicle;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    public static void mainOcp() {
        Vehicle car = new Car(123);
        car.calculateAllowedSpeed();
        Vehicle bus = new Bus(60);

    }

}