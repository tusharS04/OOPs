package OOPs.Properties.Polymorhphism;

public class Circle extends  Shapes{

//    this will run when object of circle is created
//    hence it will override parent method
    @Override // this is called annotation
    void area(){
        System.out.println("Area is pie * r * r ");
    }
}
