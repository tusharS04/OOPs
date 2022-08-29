package OOPs.Questions;

import java.util.Scanner;

public class Abstract {
    public static void main(String []args){
        MyBook new_novel=new MyBook();
        new_novel.setTitle(new_novel.title);
        System.out.println("The title is: "+new_novel.getTitle());

    }
}

abstract class Book{
    String title;
    abstract void setTitle(String s);
    String getTitle(){
        return title;
    }

}

class MyBook extends Book{
    void setTitle(String title){
        this.title = "A tale of two cities";
    }
}
