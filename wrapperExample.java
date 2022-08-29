package OOPs;

public class wrapperExample {
    public static void main(String[] args) {
//        int a = 10;
//        Integer num = new Integer(10);
        Integer num = 10; //consider primitive as an object
//        int b = 20;
//        swap(a,b);
        Integer a = 10;
        Integer b = 20;
        System.out.println(a+" "+b);

        final A kunal = new A("Kunal Kushwaha");
        kunal.name = "New Name";
//        kunal = new A("new name");
        System.out.println(kunal.name);

        A obj = new A("Attack titan");
        for (int i = 0; i <10000000 ; i++) {
            obj = new A("Kyojin");
        }
    }
    static void swap (Integer a, Integer b){
        Integer temp = a;
        a = b;
        b = temp;
    }
}
class A{
    final int num = 10;
    String name;
    public A(String name){
        this.name = name;
    }
//Garbage collection: we can't destroy the object by own (it does automatically) but we can tell what to do when GC hits.
    @Override
    protected void finalize() throws Throwable {
        System.out.println("Obj Destroyed");
    }
}
