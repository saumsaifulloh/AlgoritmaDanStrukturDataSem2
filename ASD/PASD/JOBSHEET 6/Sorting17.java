public class Sorting17 {
    int[] data;
    int jmlData;

    public Sorting17(int[] data, int jmlData) {
        this.data = data;
        this.jmlData = jmlData;
    }

    void bubbleSort() {
        for (int i = 0; i < jmlData - 1; i++) {
            for (int j = 0; j < jmlData - i - 1; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }
            }
        }
    }

    void selectionSort() {
        for (int i = 0; i < jmlData - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < jmlData; j++) {
                if (data[j] < data[idxMin]) {
                    idxMin = j;
                }
            }
            int temp = data[idxMin];
            data[idxMin] = data[i];
            data[i] = temp;
        }
    }

    void insertionSort() {
        for (int i = 1; i < jmlData; i++) {
            int temp = data[i];
            int j = i;
            while (j > 0 && data[j - 1] > temp) {
                data[j] = data[j - 1];
                j--;
            }
            data[j] = temp;
        }
    }

    void tampil() {
        for (int i = 0; i < jmlData; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }
}