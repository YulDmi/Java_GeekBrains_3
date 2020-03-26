package lesson01;

import java.util.ArrayList;
import java.util.Arrays;

public class Task<T> {
    private T[] arr;

    public Task(T[] arr) {
        this.arr = arr;
    }

    public void changeItem() {
        for (int j = 0; j < arr.length - 1; j = j + 2) {
            T b = arr[j];
            arr[j] = arr[j + 1];
            arr[j + 1] = b;
        }
    }

    public ArrayList<T> change() {
        ArrayList<T> list = new ArrayList<>();
        for (T a : arr) {
            list.add(a);
        }
        return list;
    }

    @Override
    public String toString() {
        return Arrays.toString(arr);
    }

    public static void main(String[] args) {
        Task<Integer> task1 = new Task<>(new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14});
        task1.changeItem();
        System.out.println(task1.toString());
        System.out.println("ArrayList size =  " + task1.change().size());

        Task<String> word = new Task<>(new String[]{"uno", "dos", "tres", "cuatro", "cinco"});
        word.changeItem();
        System.out.println(word);
        System.out.println(word.change().size());
    }


}
