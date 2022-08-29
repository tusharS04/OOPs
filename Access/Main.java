package OOPs.Access;

public class Main {
    public static void main(String[] args) {
        A obj = new A(10, "tushar");
        System.out.println(obj.num);

        obj.getNum();
        int n = obj.num;
    }
}
