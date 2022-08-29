package OOPs.Properties.Inheritance;
//Inherits from boxWeight
public class boxColor extends boxWeight{
    String color;

    public boxColor() {
        super();
        this.color = "Black";
    }

    public boxColor(double side, double weight, String color) {
        super(side, weight);
        this.color = color;
    }

    public boxColor(boxWeight other, String color) {
        super(other);
        this.color = color;
    }

    public boxColor(double l, double w, double h, double weight, String color) {
        super(l, w, h, weight);
        this.color = color;
    }
}
