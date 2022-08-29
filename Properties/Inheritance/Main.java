package OOPs.Properties.Inheritance;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        box box = new box(1.51, 2.48, 7.97);
        box box1 = new box(box);

        boxWeight box2 = new boxWeight();
        System.out.println(box2.l + " "+ box2.w + " "+ box2.h);
        System.out.println(box2.weight);

        boxWeight box3 = new boxWeight(1.2,2.5,6.2,5);
        System.out.println(box3.l + " "+ box3.w + " "+ box3.h +" "+ box3.weight);

        box box4 = new boxWeight(2,3,4,5);
        System.out.println(box4.w);

        // there are many variables in both parent and child classes
        // you are given access to variables that are in the ref type i.e. BoxWeight
        // hence, you should have access to weight variable
        // this also means, that the ones you are trying to access should be initialised
        // but here, when the obj itself is of type parent class, how will you call the constructor of child class
        // this is why error
//        boxWeight box5 = new box(2,4,5); cant do

        boxPrice box6 = new boxPrice(4,4,4,4,4);
        System.out.println(box6.cost);

        boxColor box5 = new boxColor(1,2,3,7,"white");
        System.out.println(box5.color);

        box.greeting();
        box box7 = new boxWeight();
//        static method cannot be overridden
//        it will call the greeting form the parent class boz static method doesn't  depend on object
        box7.greeting();

        System.out.println(box.getL()); //we can access private variables using get function
        // accessing via func in that class only

    }

}
