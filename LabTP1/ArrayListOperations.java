import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {
    public static void add(ArrayList<Integer> list, int element) {
        list.add(element);
    }

    public static void remove(ArrayList<Integer> list, Integer element) {
        list.remove(element);
    }

    public static int search(ArrayList<Integer> list, int target) {
        return list.indexOf(target);
    }

    public static void sort(ArrayList<Integer> list) {
        Collections.sort(list);
    }

    public static void traverse(ArrayList<Integer> list) {
        System.out.println(list);
    }
}
