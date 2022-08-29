package OOPs.Properties.Inheritance;

public class boxPrice extends boxWeight{
    double cost;
    boxPrice (){
        super();
        this.cost = -1;
    }

    public boxPrice(double l, double w, double h, double weight, double cost) {
        super(l, w, h, weight);
        this.cost = cost;
    }

    boxPrice (double side, double weight, double cost){
        super(side, weight);
        this.cost = cost;
    }
    boxPrice (boxPrice other){
        super(other);
        cost = other.cost;
    }

}


