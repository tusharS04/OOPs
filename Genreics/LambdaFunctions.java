package OOPs.Genreics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i <5 ; i++) {
            arr.add(i+1);
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
//        arr.forEach((item) -> System.out.print((item*2) + " ")); // Lambda function --> inline function (function of one line)
//        Consumer<Integer> fun = (item) -> System.out.print((item*2) + " "); // Consumer type
//        arr.forEach(fun);

        Operation sum = ((a,b) -> (a+b));
        Operation prod = ((a, b) -> a*b);
        Operation sub = ((a, b) -> a-b);

        LambdaFunctions MyCal = new LambdaFunctions();
        System.out.println(MyCal.operate(5,2,sum));
        System.out.println(MyCal.operate(5,2,prod));
        System.out.println(MyCal.operate(5,2,sub));
    }
    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }
}

interface Operation {
    int operation(int a, int b);
}