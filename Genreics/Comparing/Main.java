package OOPs.Genreics.Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main  implements GenericInterface<Integer>{
    public static void main(String[] args) {
        Student kunal = new Student(12,99f);
        Student rahul = new Student(5, 89.45f);
        Student arpit = new Student(13, 77f);
        Student karan = new Student(15, 83f);
        Student sachin = new Student(7, 95f);


        Student[] list = {kunal, rahul, arpit, karan, sachin};
        System.out.println(Arrays.toString(list));
        Arrays.sort(list, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return -(int) (o1.marks - o2.marks);
            }
        });
//        Arrays.sort(list, (o1, o2) -> -(int) (o1.marks - o2.marks)); /Lambda Function

        System.out.println(Arrays.toString(list));

//        if(rahul.compareTo(kunal)<0){
//            System.out.println(kunal.compareTo(rahul));
//            System.out.println("kunal has more marks");
//        }
    }

    @Override
    public void display(Integer value) {

    }
}
