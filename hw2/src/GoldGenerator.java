public class GoldGenerator extends ItemFabric {
    @Override
    public iGameItem createItem() {
        System.out.println("Создал новый сундук1");
        return new GoldReward();
    }
}
