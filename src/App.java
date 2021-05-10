import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {

        useBinarySearch();

    }

    public static void useBinarySearch() {
        int[] array = { 1, 8, 34, 67, 9, 6, 78, 12, 56, 41, 90 };
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        System.out.println("Result: " + BinarySearch(array, 9, 0, array.length - 1));
    }

    public static int BinarySearch(int[] array, int arg, int inf, int sup) {

        if (inf <= sup) {
            int med = (inf + sup) / 2;

            if (arg == array[med]) {
                return med;
            } else if (arg < array[med]) {
                return BinarySearch(array, arg, inf, med - 1);

            } else if (arg > array[med]) {
                return BinarySearch(array, arg, med + 1, sup);
            }
        }

        return -1;
    }
}
