import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        int[] array = { 1, 12, 5, 6, 17, 2, 9, 11, 20, 14, 10 };

        useBinarySearch(array);
        useInsertionSort(array);
        useSelectionSort(array);

    }

    public static void useBinarySearch(int[] array) {
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Binary search result: " + binarySearch(array, 9, 0, array.length - 1));
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

    public static void useInsertionSort(int[] array) {
        System.out.println(Arrays.toString(array));
        System.out.println("Insertion sort result: " + Arrays.toString(insertionSort(array, array.length)));
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

    public static void useSelectionSort(int[] array) {
        System.out.println(Arrays.toString(array));
        System.out.println("Selection sort result: " + Arrays.toString(selectionSort(array, array.length, 0)));
    }

    public static int[] selectionSort(int[] array, int n, int index) {
        if (index == n)
            return array;

        int k = minIndex(array, index, n - 1);

        if (k != index) {
            int temp = array[k];
            array[k] = array[index];
            array[index] = temp;
        }
        return selectionSort(array, n, index + 1);
    }

    public static int minIndex(int a[], int i, int j) {
        if (i == j)
            return i;

        int k = minIndex(a, i + 1, j);

        return (a[i] < a[k]) ? i : k;
    }

}
