
public class ArraySorted {
    public static void main(String[] args) {
        System.out.println("Array Sorter Application");

        int[] array = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Original array:");
        printArray(array);
        System.out.println();
    }

    public static void printArray(int[] arr) {
        for (int j : arr) { System.out.print(j + " "); }
        System.out.println();
    }
}