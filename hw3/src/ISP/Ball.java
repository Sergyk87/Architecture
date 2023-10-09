package ISP;

public class Ball implements iShape3d {
    int radius;

    public Ball(int radius) {
        this.radius = radius;
    }

    @Override
    public double volume() {
        return 4 / 3 * Math.PI * radius * radius * radius;
    }
}
