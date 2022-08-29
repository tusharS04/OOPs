package OOPs.Properties.Polymorhphism;

public class Numbers {
    double sum(double a, int b){
        return a+b;
    }
    double sum(int a, int b){
        return a+b;
    }
    static double sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Numbers obj = new Numbers();
        System.out.println(obj.sum(4,5,6));
    }
}

class Numbers2 extends Numbers{
    //static method can be inherited
    void printSum(){
        double a = sum(4,5,1);
    }

}