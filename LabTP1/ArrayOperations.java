public class ArrayOperations {
    public static void traverse(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + (i < arr.length - 1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) >>> 1;
            if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] > target) {
                high = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int[] insert(int[] arr, int element, int index) {
        int[] result = new int[arr.length + 1];
        System.arraycopy(arr, 0, result, 0, index);
        result[index] = element;
        System.arraycopy(arr, index, result, index + 1, arr.length - index);
        return result;
    }

    public static int[] delete(int[] arr, int target) {
        int index = linearSearch(arr, target);
        if (index == -1) {
            return arr;
        }
        int[] result = new int[arr.length - 1];
        System.arraycopy(arr, 0, result, 0, index);
        System.arraycopy(arr, index + 1, result, index, arr.length - index - 1);
        return result;
    }
}
