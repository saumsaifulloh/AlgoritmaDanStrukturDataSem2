import java.util.Scanner;

public class NilaiMain {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine();

        Mahasiswa[] mhs = new Mahasiswa[n];

        for(int i=0;i<n;i++){
            System.out.println("Data mahasiswa ke-" + (i+1));

            System.out.print("Nama : ");
            String nama = sc.nextLine();

            System.out.print("Nilai UTS : ");
            int uts = sc.nextInt();

            System.out.print("Nilai UAS : ");
            int uas = sc.nextInt();
            sc.nextLine();

            mhs[i] = new Mahasiswa(nama, uts, uas);
        }

        Nilai nilai = new Nilai(mhs);

        System.out.println("UTS Tertinggi : " + nilai.utsTertinggiDC(0, n-1));
        System.out.println("UTS Terendah : " + nilai.utsTerendahDC(0, n-1));
        System.out.println("Rata-rata UAS : " + nilai.rataUASBF());
    }
}