public class BinaryTreeArray17 {
    Mahasiswa17[] dataMahasiswa;
    int idxLast;

    // Konstruktor - inisialisasi array dengan kapasitas 10
    public BinaryTreeArray17() {
        this.dataMahasiswa = new Mahasiswa17[10];
    }

    // Method populateData() - mengisi data tree sekaligus dari luar class
    void populateData(Mahasiswa17 dataMhs[], int idxLast) {
        this.dataMahasiswa = dataMhs;
        this.idxLast = idxLast;
    }

    // Method traverseInOrder() - kunjungi kiri, node, kanan (hasil terurut ascending)
    // Anak kiri = indeks 2*i+1, anak kanan = indeks 2*i+2
    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                traverseInOrder(2 * idxStart + 1);
                dataMahasiswa[idxStart].tampilInformasi();
                traverseInOrder(2 * idxStart + 2);
            }
        }
    }

    // TUGAS 4 - Method add() - menambahkan data baru ke array tree
    // idxLast di-increment dulu, lalu data diisi di posisi tersebut
    void add(Mahasiswa17 data) {
        idxLast++;
        dataMahasiswa[idxLast] = data;
    }

    // TUGAS 4 - Method traversePreOrder() - kunjungi node dulu, lalu kiri, lalu kanan
    // Anak kiri = indeks 2*i+1, anak kanan = indeks 2*i+2
    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (dataMahasiswa[idxStart] != null) {
                dataMahasiswa[idxStart].tampilInformasi();
                traversePreOrder(2 * idxStart + 1);
                traversePreOrder(2 * idxStart + 2);
            }
        }
    }
}