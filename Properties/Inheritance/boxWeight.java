package OOPs.Properties.Inheritance;

public class boxWeight extends box{
    double weight;

    public boxWeight (){
        this.weight = -1;
    }

    static void greeting(){
        System.out.println("Hey, I am in BoxWeight class. Greeting!");

    }

    public boxWeight(double l, double w, double h,double weight){
        super(l, w, h); // calls the parent class constructor
//        used to initialise values present in parent class
        this.weight = weight;
    }
    boxWeight (boxWeight other){
        super(other);
        weight = other.weight;
    }

    public boxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
