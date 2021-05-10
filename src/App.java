import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        // useBinarySearch();
        // useInsertionSort();

    }

    public static void useBinarySearch() {
        int[] array = { 1, 12, 5, 6, 17, 2, 9, 11, 20, 14, 10 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Result: " + binarySearch(array, 9, 0, array.length - 1));
    }

    public static int binarySearch(int[] array, int arg, int inf, int sup) {

        if (inf <= sup) {
            int med = (inf + sup) / 2;

            if (arg == array[med]) {
                return med;
            } else if (arg < array[med]) {
                return binarySearch(array, arg, inf, med - 1);

            } else if (arg > array[med]) {
                return binarySearch(array, arg, med + 1, sup);
            }
        }

        return -1;
    }

    public static void useInsertionSort() {
        int[] array = { 1, 12, 5, 6, 17, 2, 9, 11, 20, 14, 10 };
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(insertionSort(array, array.length)));
    }

    public static int[] insertionSort(int[] array, int n) {

        if (n <= 1)
            return array;

        insertionSort(array, n - 1);

        int last = array[n - 1];
        int j = n - 2;

        while (j >= 0 && array[j] > last) {
            array[j + 1] = array[j];
            j--;
        }
        array[j + 1] = last;
        return array;
    }

}
