public class DLLPesanan17 {

    // Node dalam DLL untuk Pesanan
    class NodePesanan {
        Pesanan17 data;
        NodePesanan prev;
        NodePesanan next;

        NodePesanan(Pesanan17 data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    NodePesanan head;
    NodePesanan tail;
    int ukuran;

    public DLLPesanan17() {
        head = null;
        tail = null;
        ukuran = 0;
    }

    // Tambah pesanan di belakang
    public void tambahPesanan(Pesanan17 pesanan) {
        NodePesanan nodeBaru = new NodePesanan(pesanan);

        if (head == null) {
            head = nodeBaru;
            tail = nodeBaru;
        } else {
            nodeBaru.prev = tail;
            tail.next = nodeBaru;
            tail = nodeBaru;
        }
        ukuran++;
    }

    // Sorting manual berdasarkan nama pesanan (Bubble Sort)
    public void sortByNama() {
        if (head == null || head.next == null) return;

        boolean swap;
        do {
            swap = false;
            NodePesanan current = head;
            while (current.next != null) {
                if (current.data.namaPesanan.compareToIgnoreCase(current.next.data.namaPesanan) > 0) {
                    // tukar data
                    Pesanan17 temp = current.data;
                    current.data = current.next.data;
                    current.next.data = temp;
                    swap = true;
                }
                current = current.next;
            }
        } while (swap);
    }

    // Tampilkan laporan pesanan terurut berdasarkan nama
    public void cetakLaporan() {
        if (head == null) {
            System.out.println("Belum ada pesanan.");
            return;
        }

        sortByNama();

        System.out.println("======================================");
        System.out.println("LAPORAN PESANAN (URUT NAMA PESANAN)");
        System.out.println("======================================");
        System.out.printf("%-15s %-25s %-10s%n", "Kode Pesanan", "Nama Pesanan", "Harga");

        NodePesanan current = head;
        while (current != null) {
            System.out.printf("%-15d %-25s %-10d%n",
                    current.data.kodePesanan,
                    current.data.namaPesanan,
                    current.data.harga);
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return head == null;
    }
}