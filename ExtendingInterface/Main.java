package OOPs.ExtendingInterface;

public class Main implements B{

    @Override
    public void fun() {
        System.out.println("HeHe FuN");
    }

    @Override
    public void greet() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.fun();
        main.greet();
    }
}
