import java.util.Scanner;

public class Main17 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoubleLinkedListPembeli17 antrean = new DoubleLinkedListPembeli17();
        DLLPesanan17 pesanan = new DLLPesanan17();
        int pilih;

        do {
            System.out.println("\n==============================");
            System.out.println("SISTEM ANTRIAN ROYAL DELISH");
            System.out.println("==============================");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian & Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("5. Cetak Antrian Mundur");  // <-- MENU BARU
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    // Tambah antrian - input nama dan no HP
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();
                    System.out.print("No HP        : ");
                    String noHp = sc.nextLine();

                    Pembeli17 pembeli = new Pembeli17(nama, noHp);
                    antrean.tambahAntrian(pembeli);
                    break;

                case 2:
                    // Cetak semua antrian (maju)
                    antrean.cetakAntrian();
                    break;

                case 3:
                    // Hapus antrian terdepan dan input pesanan
                    if (antrean.isEmpty()) {
                        System.out.println("Antrian kosong!");
                        break;
                    }

                    // Ambil pembeli pertama dari antrian
                    Pembeli17 pembeliHapus = antrean.hapusAntrian();

                    System.out.print("Kode Pesanan  : ");
                    int kode = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Nama Pesanan  : ");
                    String namaPesanan = sc.nextLine();
                    System.out.print("Harga         : ");
                    int harga = sc.nextInt();
                    sc.nextLine();

                    Pesanan17 p = new Pesanan17(kode, namaPesanan, harga);
                    pesanan.tambahPesanan(p);

                    System.out.println(pembeliHapus.namaPembeli + " telah memesan " + namaPesanan);
                    break;

                case 4:
                    // Laporan pesanan terurut nama
                    pesanan.cetakLaporan();
                    break;

                case 5:
                    // -----------------------------------------------
                    // FITUR BARU: Traversal mundur menggunakan ptr prev
                    // -----------------------------------------------
                    antrean.cetakAntrianMundur();
                    break;

                case 0:
                    System.out.println("Terima kasih, program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
                    break;
            }

        } while (pilih != 0);

        sc.close();
    }
}