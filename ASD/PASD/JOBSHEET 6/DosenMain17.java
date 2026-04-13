import java.util.Scanner;

public class DosenMain17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen17 dd = new DataDosen17();
        int pilih;

        do {
            System.out.println("MENU");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda -> Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua -> Termuda)");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Kode: ");
                    String kd = sc.nextLine();
                    System.out.print("Nama: ");
                    String nm = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P): ");
                    boolean jk = sc.nextLine().equalsIgnoreCase("L");
                    System.out.print("Usia: ");
                    int us = sc.nextInt(); sc.nextLine();
                    dd.tambah(new Dosen17(kd, nm, jk, us));
                    break;
                case 2:
                    dd.tampil();
                    break;
                case 3:
                    dd.sortingASC();
                    dd.tampil();
                    break;
                case 4:
                    dd.sortingDSC();
                    dd.tampil();
                    break;
            }
        } while (pilih != 0);
    }
}