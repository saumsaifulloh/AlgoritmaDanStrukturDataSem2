public class DoubleLinkedListPembeli17 {

    // Node dalam DLL untuk Pembeli
    class NodePembeli {
        Pembeli17 data;
        NodePembeli prev;
        NodePembeli next;

        NodePembeli(Pembeli17 data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    NodePembeli head;
    NodePembeli tail;
    int ukuran;
    int counterAntrian; // untuk nomor antrian otomatis

    public DoubleLinkedListPembeli17() {
        head = null;
        tail = null;
        ukuran = 0;
        counterAntrian = 0;
    }

    // Tambah antrian (enqueue - tambah di belakang)
    public void tambahAntrian(Pembeli17 pembeli) {
        counterAntrian++;
        pembeli.noAntrian = counterAntrian;

        NodePembeli nodeBaru = new NodePembeli(pembeli);

        if (head == null) {
            head = nodeBaru;
            tail = nodeBaru;
        } else {
            nodeBaru.prev = tail;
            tail.next = nodeBaru;
            tail = nodeBaru;
        }
        ukuran++;
        System.out.println("Antrian berhasil ditambahkan dengan nomor: " + pembeli.noAntrian);
    }

    // Cetak semua antrian
    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong.");
            return;
        }
        System.out.println("==============================");
        System.out.println("Daftar Antrian Pembeli");
        System.out.println("==============================");
        System.out.printf("%-15s %-20s %-15s%n", "No Antrian", "Nama", "No HP");
        NodePembeli current = head;
        while (current != null) {
            System.out.printf("%-15d %-20s %-15s%n",
                    current.data.noAntrian,
                    current.data.namaPembeli,
                    current.data.noHp);
            current = current.next;
        }
    }

    // Hapus antrian terdepan (dequeue) dan kembalikan data pembeli
    public Pembeli17 hapusAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong, tidak ada yang bisa dihapus.");
            return null;
        }
        Pembeli17 pembeli = head.data;
        head = head.next;
        if (head != null) {
            head.prev = null;
        } else {
            tail = null;
        }
        ukuran--;
        return pembeli;
    }

    public boolean isEmpty() {
        return head == null;
    }
}