package DIP;

public class BenzinEngine implements iEngine {
    @Override
    public void start() {
        System.out.println("Запущен бензиновый двигатель");
    }
}
