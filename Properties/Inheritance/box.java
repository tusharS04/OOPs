package OOPs.Properties.Inheritance;

public class box {
    double l;
    double w;
    double h;
    double weight;

    static void greeting(){
        System.out.println("hey , I am in Box class. Greetings!");
    }

    public double getL() {
        return l;
    }

    box () {
       super (); //object class
        this.l = -1;
        this.w = -1;
        this.h = -1;
    }

    public box (double side){
        this.l = side;
        this.w = side;
        this.h = side;
    }
    public box (double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }
    box(box old){
       this.l = old.l;
       this.w = old.w;
       this.h = old.h;
    }
}