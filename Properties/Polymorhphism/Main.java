package OOPs.Properties.Polymorhphism;

public class Main {
    public static void main(String[] args) {
        Shapes shapes = new Shapes();
        Shapes circle = new Circle();
        Shapes square = new Square();

        circle.area();
        square.area();
    }
}
