package OOPs.Abstraction;

public abstract class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    static void hello(){
        System.out.println("Hey");
    }
      void normal(){
        System.out.println("this is a normal method");
    }

    abstract void career();
    abstract void partner();
}
