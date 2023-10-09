package DIP;
//Создать класс Car, который заводит двигатель через интерфейс iEngine.
// И создать два класса двигателей бензин и дизель, которые имплиментируют iEngine

public class main {
    public static void main(String[] args) {
        Car carBenzin = new Car(new BenzinEngine());
        carBenzin.startEngine();

        Car carDiesel = new Car(new DieselEngine());
        carDiesel.startEngine();
    }
}