import java.util.Scanner;

public class LayananAkademikSIAKAD17 {
    public static void menu() {
        System.out.println("\n=== MENU ANTRIAN LAYANAN AKADEMIK ===");
        System.out.println("1. Tambah Mahasiswa ke Antrian");
        System.out.println("2. Layani Mahasiswa");
        System.out.println("3. Cek Mahasiswa Terdepan");
        System.out.println("4. Tampilkan Semua Antrian");
        System.out.println("5. Jumlah Mahasiswa dalam Antrian");
        System.out.println("6. Cek Antrian Paling Belakang");
        System.out.println("0. Keluar");
        System.out.print("Pilih menu: ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        AntrianLayanan17 antrian = new AntrianLayanan17(5); // Kapasitas antrian default 5

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Prodi : ");
                    String prodi = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();

                    System.out.println("Menambahkan mahasiswa ke antrian...");

                    Mahasiswa mhs = new Mahasiswa(nim, nama, prodi, kelas);
                    antrian.enqueue(mhs);
                    break;

                case 2:
                    Mahasiswa keluar = antrian.dequeue();
                    if (keluar != null) {
                        System.out.println("Melayani Mahasiswa :");
                        keluar.tampilkanData();
                    }
                    break;

                case 3:
                    antrian.peek();
                    break;

                case 4:
                    antrian.print();
                    break;

                case 5:
                    antrian.clear();
                    break;
                
                case 6:
                    antrian.lihatAkhir();
                    break;
            }

        } while (pilih != 0);

        sc.close();
    }
}