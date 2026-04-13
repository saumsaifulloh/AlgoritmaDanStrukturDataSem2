public class SortingMain17 {
    public static void main(String[] args) {
        int[] a = {34, 12, 5, 67, 23};
        Sorting17 dataurut1 = new Sorting17(a, a.length);
        dataurut1.bubbleSort();
        dataurut1.tampil();

        int[] b = {20, 10, 50, 40, 30};
        Sorting17 dataurut2 = new Sorting17(b, b.length);
        dataurut2.selectionSort();
        dataurut2.tampil();

        int[] c = {9, 7, 5, 3, 1};
        Sorting17 dataurut3 = new Sorting17(c, c.length);
        dataurut3.insertionSort();
        dataurut3.tampil();
    }
}