package OOPs.Genreics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomArraylist {

    private int[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomArraylist() {
        this.data = new int[DEFAULT_SIZE];
    }
    public void add(int num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        int [] temp = new int[data.length*2];
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    public int remove(){
        int removed = data[--size];
        return removed;
    }
    public int get(int index){
        return data[index];
    }
    public int size(){
        return  size;
    }
    public void set(int index, int value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>();
//                   ↓
//                Generics

        CustomArraylist list = new CustomArraylist();
//        list.add(4);
        for (int i = 0; i <14 ; i++) {
            list.add(i*2);
        }
        list.remove();
        System.out.println(list.size);

        list.set(5,9);
        System.out.println(list.get(5));
        System.out.println(list);
    }
}
