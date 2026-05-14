import java.util.Scanner;
public class DoubleLinkedListMain17 {
    static Scanner sc = new Scanner(System.in);

    public static Mahasiswa17 inputMahasiswa() {
        System.out.print("Masukkan NIM   : ");
        String nim = sc.nextLine();

        System.out.print("Masukkan Nama  : ");
        String nama = sc.nextLine();

        System.out.print("Masukkan Kelas : ");
        String kelas = sc.nextLine();

        System.out.print("Masukkan IPK   : ");
        String inputIpk = sc.nextLine().replace(",", ".");
        Double ipk = Double.parseDouble(inputIpk);

        return new Mahasiswa17(nim, nama, kelas, ipk);
    }

    public static void main(String[] args) {
        DoubleLinkedList17 dll = new DoubleLinkedList17();
        int pilih;

        do {
            System.out.println("===== MENU DOUBLE LINKED LIST =====");
            System.out.println("1. Tambah data di awal");
            System.out.println("2. Tambah data di akhir");
            System.out.println("3. Sisipkan data di tengah (setelah NIM)");
            System.out.println("4. Hapus data di awal");
            System.out.println("5. Hapus data di akhir");
            System.out.println("6. Tampilkan data");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilih = Integer.parseInt(sc.nextLine());

            switch (pilih) {
                case 1:
                    dll.addFirst(inputMahasiswa());
                    break;

                case 2:
                    dll.addLast(inputMahasiswa());
                    break;

                case 3:
                    System.out.print("Masukkan NIM setelah data mana disisipkan: ");
                    String key = sc.nextLine();
                    dll.insertAfter(key, inputMahasiswa());
                    break;

                case 4:
                    dll.removeFirst();
                    break;

                case 5:
                    dll.removeLast();
                    break;

                case 6:
                    dll.print();
                    break;

                case 0:
                    System.out.println("Program selesai");
                    break;

                default:
                    System.out.println("Menu tidak valid");
            }

            System.out.println();
        } while (pilih != 0);
    }
}