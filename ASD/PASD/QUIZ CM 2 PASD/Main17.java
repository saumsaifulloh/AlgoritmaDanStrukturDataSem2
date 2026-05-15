import java.util.Scanner;

public class Main17 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        DoubleLinkedListPembeli17 antrean = new DoubleLinkedListPembeli17();
        DLLPesanan17 pesanan = new DLLPesanan17();
        int pilih;

        do {
            System.out.println("\n=== ROYAL DELISH ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Cetak Antrian");
            System.out.println("3. Hapus Antrian & Pesan");
            System.out.println("4. Laporan Pesanan");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {

                case 1:
                    System.out.print("Nama Pembeli : ");
                    String nama = sc.nextLine();

                    System.out.print("No HP : ");
                    String hp = sc.nextLine();

                    antrean.tambahAntrian(nama, hp);
                    break;

                case 2:
                    antrean.cetakAntrian();
                    break;

                case 3:
                    Pembeli17 p = antrean.hapusAntrian();

                    if (p != null) {
                        System.out.println("Pembeli : "
                                + p.namaPembeli);

                        System.out.print("Kode Pesanan : ");
                        int kode = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Nama Pesanan : ");
                        String np = sc.nextLine();

                        System.out.print("Harga : ");
                        int harga = sc.nextInt();

                        pesanan.tambahPesanan(kode,
                                np, harga, p.namaPembeli);

                        System.out.println("Pesanan berhasil ditambahkan");
                    }
                    break;

                case 4:
                    pesanan.tampilPesanan();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak tersedia");
            }

        } while (pilih != 0);
    }
}