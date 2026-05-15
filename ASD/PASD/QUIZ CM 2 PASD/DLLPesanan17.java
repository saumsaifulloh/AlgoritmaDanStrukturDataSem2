public class DLLPesanan17 {

    Pesanan17 head, tail;

    public void tambahPesanan(int kode, String namaPesanan, int harga, String namaPembeli) {

        Pesanan17 baru = new Pesanan17(kode, namaPesanan, harga, namaPembeli);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }
    }

    public void sorting() {

        if (head == null) {
            return;
        }

        for (Pesanan17 i = head; i.next != null; i = i.next) {

            for (Pesanan17 j = head; j.next != null; j = j.next) {

                if (j.namaPesanan.compareToIgnoreCase(j.next.namaPesanan) > 0) {

                    int kode = j.kodePesanan;
                    String nama = j.namaPesanan;
                    int harga = j.harga;
                    String pembeli = j.namaPembeli;

                    j.kodePesanan = j.next.kodePesanan;
                    j.namaPesanan = j.next.namaPesanan;
                    j.harga = j.next.harga;
                    j.namaPembeli = j.next.namaPembeli;

                    j.next.kodePesanan = kode;
                    j.next.namaPesanan = nama;
                    j.next.harga = harga;
                    j.next.namaPembeli = pembeli;
                }
            }
        }
    }

    public void tampilPesanan() {

        if (head == null) {
            System.out.println("Belum ada pesanan");
            return;
        }

        sorting();

        Pesanan17 temp = head;
        int total = 0;

        System.out.println("=== LAPORAN PESANAN ===");

        while (temp != null) {

            System.out.println(
                    temp.kodePesanan + " | " +
                    temp.namaPesanan + " | " +
                    temp.harga + " | " +
                    temp.namaPembeli);

            total += temp.harga;

            temp = temp.next;
        }

        System.out.println("Total Pendapatan : " + total);
    }
}