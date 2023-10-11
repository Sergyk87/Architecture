package ISP;

public class Cube implements iShape, iShape3d {

    private int lengtsEdge;
    
    public Cube(int lengtsEdge) {
        this.lengtsEdge = lengtsEdge;
    }
   
    public int getLengtsEdge() {
        return lengtsEdge;
    }
    public void setLengtsEdge(int lengtsEdge) {
        this.lengtsEdge = lengtsEdge;
    }

     @Override
    public double area() {
        return lengtsEdge * lengtsEdge * 6;
    }

    @Override
    public double volume() {
        return Math.pow(lengtsEdge, 3); // в третей степени
    }
    
}
