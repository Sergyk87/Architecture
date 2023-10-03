import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        ItemFabric generator = new GoldGenerator();
        generator.openRewgard();
        generator = new GoldGenerator();
        generator.openRewgard();
        generator = new GemGenerator();
        generator.openRewgard();

        Random rnd = ThreadLocalRandom.current();
        List<ItemFabric> fabricList = new ArrayList<>();

        fabricList.add(new CrystalGenerator());
        fabricList.add(new GoldGenerator());
        fabricList.add(new GemGenerator());

        for (int i = 0; i < 20; i++) {
            int index = Math.abs(rnd.nextInt() % fabricList.size());
            ItemFabric fabric = fabricList.get(index);
            fabric.openRewgard();
        }
    }
}
