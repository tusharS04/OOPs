package OOPs.Access;
// Overridden methods available in object class

public class ObjectDemo {
    int num;
    float value;

    public ObjectDemo(int num, float value){
        this.num = num;
        this.value = value ;
    }

    public ObjectDemo() {
        super();
    }
//  gives the toString representation
    @Override
    public String toString() {
        return super.toString();
    }

//    it gets called when garbage collection hits
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

//    A number representation of an object
    @Override
    public int hashCode() {
//        return super.hashCode();
        return  num;
    }

    @Override
    public boolean equals(Object obj) {
//        return super.equals(obj);
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(35, 53.5f);
        ObjectDemo obj2 = new ObjectDemo(35, 53.5f);

        if(obj == obj2){
            System.out.println("obj is equal to obj2");
        }
        if(obj.equals(obj2)){
            System.out.println("obj is equal to obj2");
        }
//        System.out.println(obj.hashCode());
//        System.out.println(obj2.hashCode());
    }
}
