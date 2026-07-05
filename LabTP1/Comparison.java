import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Comparison {
    public static void main(String[] args) {

        // generate data random sebanyak 1000 biji
        Random rand = new Random(42);
        int[] initialArray = new int[1000];
        ArrayList<Integer> initialList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            int val = rand.nextInt(10000);
            initialArray[i] = val;
            initialList.add(val);
        }

        // target ngambil data random dari data itu sendiri, biar pasti ada
        int target = initialArray[rand.nextInt(1000)];
        int arrIndex = ArrayOperations.linearSearch(initialArray, target);
        System.out.println("Pencarian " + target + " dalam Array: Ditemukan di indeks " + arrIndex);
        int listIndex = ArrayListOperations.search(initialList, target);
        System.out.println("Pencarian " + target + " dalam ArrayList: Ditemukan di indeks " + listIndex);
        System.out.println();

        // insert data random, index random
        int insertVal = rand.nextInt(10000);
        int insertIndex = rand.nextInt(1000);

        // dan mulai benchmark
        long startInsertArr = System.nanoTime();
        int[] insertedArray = ArrayOperations.insert(initialArray, insertVal, insertIndex);
        long endInsertArr = System.nanoTime();
        double timeInsertArr = (endInsertArr - startInsertArr) / 1e6;

        long startInsertList = System.nanoTime();
        ArrayListOperations.add(initialList, insertVal);
        ArrayListOperations.sort(initialList);
        long endInsertList = System.nanoTime();
        double timeInsertList = (endInsertList - startInsertList) / 1e6;

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
        System.out.printf("Waktu eksekusi penyisipan pada Array: %.4f ms\n", timeInsertArr);
        System.out.printf("Waktu eksekusi penyisipan pada ArrayList: %.4f ms\n", timeInsertList);
        System.out.println();
    }
}
