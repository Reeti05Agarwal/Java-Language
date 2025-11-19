package Codes;
import java.util.ArrayList;


public class Array {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        System.out.println(arr);
        System.out.println(arr.size());
        arr.remove(3);
        System.out.println(arr);
        System.out.println(arr.size());
    }
}
