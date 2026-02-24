import java.util.Scanner;

public class Matakuliah17 {

    String kode;
    String nama;
    int sks;
    int JumlahJam;

    public Matakuliah17(String kode, String nama, int sks, int JumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.JumlahJam = JumlahJam;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Matakuliah17[] arrayOfMatakuliah17 = new Matakuliah17[3];
        String kode, nama, dummy;
        int sks, JumlahJam;

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("SKS        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            JumlahJam = Integer.parseInt(dummy);
            System.out.println("-----------------------------------");

            arrayOfMatakuliah17[i] = new Matakuliah17(kode, nama, sks, JumlahJam);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            System.out.println("Kode       : " + arrayOfMatakuliah17[i].kode);
            System.out.println("Nama       : " + arrayOfMatakuliah17[i].nama);
            System.out.println("SKS        : " + arrayOfMatakuliah17[i].sks);
            System.out.println("Jumlah Jam : " + arrayOfMatakuliah17[i].JumlahJam);
            System.out.println("-----------------------------------");
        }
    }
}