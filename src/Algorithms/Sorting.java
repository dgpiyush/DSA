package Algorithms;

public class Sorting {

    public static void bubbleSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
    }

    public static void SelectionSort(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int small = i;

            for (int j = i + 1; j < a.length; j++)
                if (a[small] > a[j])
                    small = j;

            int temp = a[i];
            a[i] = a[small];
            a[small] = temp;

        }
    }

    public static void InsertionSort(int[] a) {

    }

    public static void main(String[] args) {
        int[] a = { 3, 5, 2, 6, 2 };
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

        SelectionSort(a);
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

}
