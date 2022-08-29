package OOPs.Access;

public class subclass extends A {
    public subclass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        A obj = new A(4, "tushar");
        int n = obj.num;
        System.out.println(obj instanceof A);
        System.out.println(obj.getClass());
    }
}

//class subsubclass extends  subclass{
//    public subsubclass (int num, String name){
//        super(num, name);
//    }

//    public static void main(String[] args) {
//        subsubclass obj = new subsubclass(4, "tushar");
//        int n = obj.num;
//    }
//}

//class subclass2 extends A {
//    public subclass2(int num, String name) {
//        super(num, name);
//    }
//
//}