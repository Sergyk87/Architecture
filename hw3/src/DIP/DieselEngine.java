package DIP;

public class DieselEngine implements iEngine{
    @Override
    public void start() {
        System.out.println("Запущен дизельный двигатель");
    }
}
