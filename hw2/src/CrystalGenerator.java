public class CrystalGenerator extends ItemFabric {

    @Override
    public iGameItem createItem() {
        System.out.println("Создал новый сундук3");
        return new CrystalReward();
    }

}
