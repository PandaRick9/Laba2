import java.sql.SQLOutput;

public class ArraySorted {
    public static void main(String[] args) {
        System.out.println("Array Sorter Application");

        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(array);
        System.out.println();
        bubbleSort(array);
        System.out.println("It's my life");

    }
    public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
    public static void printArray(int[] arr) {
        for (int j : arr) { System.out.print(j + " "); }
        System.out.println();
        System.out.println("New print");
    }
}