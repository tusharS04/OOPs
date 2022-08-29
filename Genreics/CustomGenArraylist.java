package OOPs.Genreics;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomGenArraylist<T> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0;

    public CustomGenArraylist() {

        this.data = new Object[DEFAULT_SIZE];
    }
    public void add(T num) {
        if (isFull()) {
            resize();
        }
        data[size++] = num;
    }

    private void resize() {
        Object [] temp = new Object[data.length*2];
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }
    public T remove(){
        T removed = ((T)data[--size]);
        return removed;
    }
    public T get(int index){
        return (T)data[index];
    }
    public int size(){
        return  size;
    }
    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString() {
        return "CustomGenArraylist{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {

        CustomGenArraylist<Integer> list = new CustomGenArraylist<>();
//        list.add(5);
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
