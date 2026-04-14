import java.util.Scanner;

public class Menu17Main {
    static Scanner sc = new Scanner(System.in);

    static Mahasiswa17[] mhs = {
        new Mahasiswa17("22001", "Andi", "TI"),
        new Mahasiswa17("22002", "Budi", "TI"),
        new Mahasiswa17("22003", "Citra", "SIB")
    };

    static Buku17[] buku = {
        new Buku17("B001", "Algoritma", 2020),
        new Buku17("B002", "Basis Data", 2019),
        new Buku17("B003", "Pemrograman", 2021),
        new Buku17("B004", "Fisika", 2024)
    };

    static Peminjaman17[] pinjam = {
        new Peminjaman17(mhs[0], buku[0], 7),
        new Peminjaman17(mhs[1], buku[1], 3),
        new Peminjaman17(mhs[2], buku[2], 10),
        new Peminjaman17(mhs[2], buku[3], 6),
        new Peminjaman17(mhs[0], buku[1], 4)
    };

    public static void main(String[] args) {
        int pilih;

        do {
            menu();
            pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    menu1();
                    break;
                case 2:
                    menu2();
                    break;
                case 3:
                    menu3();
                    break;
                case 4:
                    menu4();
                    break;
                case 5:
                    menu5();
                    break;
                case 6:
                    menu6();
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
            }
        } while (pilih != 0);
    }

    static void menu() {
        System.out.println("\n=== MENU ===");
        System.out.println("1. Tampilkan Mahasiswa");
        System.out.println("2. Tampilkan Buku");
        System.out.println("3. Tampilkan Peminjaman");
        System.out.println("4. Urutkan berdasarkan  Denda"); //Insertion Sort
        System.out.println("5. Cari berdasarkan NIM"); //Binary Search
        System.out.println("6. Tampilkan Peminjaman Tanpa Denda"); //Binary Search
        System.out.println("0. Keluar");
        System.out.print("Pilih: ");
    }

    // ================= CASE 1 =================
    static void menu1() {
        System.out.println("\n=== DATA MAHASISWA ===");
        for (Mahasiswa17 m : mhs) {
            m.tampil();
        }
    }

    // ================= CASE 2 =================
    static void menu2() {
        System.out.println("\n=== DATA BUKU ===");
        for (Buku17 b : buku) {
            b.tampil();
        }
    }

    // ================= CASE 3 =================
    static void menu3() {
        System.out.println("\n=== DATA PEMINJAMAN ===");
        for (Peminjaman17 p : pinjam) {
            p.tampil();
        }
    }

    // ================= CASE 4 =================
    static void menu4() {
        insertionSort(pinjam);

        System.out.println("\n=== DATA SETELAH SORTING DENDA ===");
        for (Peminjaman17 p : pinjam) {
            p.tampil();
        }
    }

    // ================= CASE 5 =================
    static void menu5() {
        insertionSortNIM(pinjam);

        System.out.print("\nMasukkan NIM: ");
        String key = sc.next();

        int hasil = binarySearch(pinjam, key);

        if (hasil != -1) {
            System.out.println("Data ditemukan:");
            pinjam[hasil].tampil();
        } else {
            System.out.println("Data tidak ditemukan!");
        }
    }


    static void menu6() {
        System.out.println("\n=== PEMINJAMAN TANPA DENDA ===");
        boolean ada = false;
        for (Peminjaman17 p : pinjam) {
            if (p.denda == 0) {
                p.tampil();
                ada = true;
            }
        }
        if (!ada) {
            System.out.println("Tidak ada peminjaman tanpa denda.");
        }
    }

    // ================= SORTING =================
    static void insertionSort(Peminjaman17[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman17 temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].denda < temp.denda) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    static void insertionSortNIM(Peminjaman17[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Peminjaman17 temp = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].mhs.nim.compareTo(temp.mhs.nim) > 0) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }
    }

    // ================= SEARCHING =================
    static int binarySearch(Peminjaman17[] arr, String key) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid].mhs.nim.equals(key)) {
                return mid;
            } else if (arr[mid].mhs.nim.compareTo(key) < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}