package OOPs.Abstraction;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(19);
        son.career();
        son.normal();

        Daughter daughter = new Daughter(17);
        daughter.career();
//        Parent mom = new Parent(){}; / > You cannot create object of an abstract class
        Parent.hello();

    }
}
