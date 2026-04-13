import java.util.Locale;
import java.util.Scanner;

public class MahasiswaDemo17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US); // penting untuk desimal

        MahasiswaBerprestasi17 list = new MahasiswaBerprestasi17();

        list.tambah(new Mahasiswa17("001", "Andi", "A", 3.2));
        list.tambah(new Mahasiswa17("002", "Budi", "B", 3.5));
        list.tambah(new Mahasiswa17("003", "Caca", "A", 3.7));
        list.tambah(new Mahasiswa17("004", "Dedi", "B", 3.8));
        list.tambah(new Mahasiswa17("005", "Eka", "A", 3.9));

        System.out.println("Data Mahasiswa:");
        list.tampil();

        double cari;
        while (true) {
            System.out.print("Masukkan IPK yang dicari: ");
            if (sc.hasNextDouble()) {
                cari = sc.nextDouble();
                break;
            } else {
                System.out.println("Input harus angka! Contoh: 3.9");
                sc.next();
            }
        }

        // Sequential Search
        System.out.println("\n=== Sequential Search ===");
        int pos = list.sequentialSearch(cari);
        list.tampilPosisi(cari, pos);
        list.tampilDataSearch(pos);

        // Binary Search
        System.out.println("\n=== Binary Search ===");
        int pos2 = list.findBinarySearch(cari, 0, list.listMhs.length - 1);
        list.tampilPosisi(cari, pos2);
        list.tampilDataSearch(pos2);

        sc.close();
    }
}