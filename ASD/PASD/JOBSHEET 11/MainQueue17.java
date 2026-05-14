import java.util.Scanner;

public class MainQueue17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLinkedList17 q = new QueueLinkedList17();
        int pilih;

        do {
            System.out.println("\n=== MENU ANTRIAN ===");
            System.out.println("1. Tambah Antrian");
            System.out.println("2. Panggil Antrian");
            System.out.println("3. Tampilkan Antrian");
            System.out.println("4. Lihat Antrian Terdepan");
            System.out.println("5. Lihat Antrian Terakhir");
            System.out.println("6. Jumlah Antrian");
            System.out.println("7. Kosongkan Antrian");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM: ");
                    String nim = sc.nextLine();

                    System.out.print("Masukkan Nama: ");
                    String nama = sc.nextLine();

                    MahasiswaAntrian17 mhs = new MahasiswaAntrian17(nim, nama);
                    q.enqueue(mhs);
                    break;

                case 2:
                    q.dequeue();
                    break;

                case 3:
                    q.print();
                    break;

                case 4:
                    q.peekFront();
                    break;

                case 5:
                    q.peekRear();
                    break;

                case 6:
                    q.jumlahAntrian();
                    break;

                case 7:
                    q.clear();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

        } while (pilih != 0);

        sc.close();
    }
}