import java.util.ArrayList;
import java.util.Arrays;

public class soal1 {
    public static void main(String[] args) {
        int[] initialArray = {10, 20, 30, 40, 50};
        ArrayList<Integer> initialList = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));

        System.out.print("Array Traversal: ");
        ArrayOperations.traverse(initialArray);
        System.out.print("ArrayList Traversal: ");
        ArrayListOperations.traverse(initialList);
        System.out.println();

        int target = 30;
        int arrIndex = ArrayOperations.linearSearch(initialArray, target);
        System.out.println("Pencarian " + target + " dalam Array: Ditemukan di indeks " + arrIndex);
        int listIndex = ArrayListOperations.search(initialList, target);
        System.out.println("Pencarian " + target + " dalam ArrayList: Ditemukan di indeks " + listIndex);
        System.out.println();

        int insertVal = 25;
        int insertIndex = 2;
        int[] insertedArray = ArrayOperations.insert(initialArray, insertVal, insertIndex);
        ArrayListOperations.add(initialList, insertVal);
        ArrayListOperations.sort(initialList);

        System.out.print("Array setelah penyisipan elemen " + insertVal + ": ");
        ArrayOperations.traverse(insertedArray);
        System.out.print("ArrayList setelah penyisipan elemen " + insertVal + ": ");
        ArrayListOperations.traverse(initialList);
        System.out.println();

        long startSearchArr = System.nanoTime();
        ArrayOperations.linearSearch(initialArray, target);
        long endSearchArr = System.nanoTime();
        double timeSearchArr = (endSearchArr - startSearchArr) / 1e6;

        long startSearchList = System.nanoTime();
        ArrayListOperations.search(initialList, target);
        long endSearchList = System.nanoTime();
        double timeSearchList = (endSearchList - startSearchList) / 1e6;

        System.out.printf("Waktu eksekusi pencarian pada Array: %.4f ms\n", timeSearchArr);
        System.out.printf("Waktu eksekusi pencarian pada ArrayList: %.4f ms\n", timeSearchList);
        System.out.println();
    }
}
