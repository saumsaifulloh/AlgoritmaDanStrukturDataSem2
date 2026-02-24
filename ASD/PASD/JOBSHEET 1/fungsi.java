import java.util.Scanner;
public class fungsi {
     static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }
    static int hitungPendapatan(int[] stok) {
        int hargaAglonema = 75000;
        int hargaKeladi = 50000;
        int hargaAlocasia = 60000;
        int hargaMawar = 10000;

        return (stok[0] * hargaAglonema) +
               (stok[1] * hargaKeladi) +
               (stok[2] * hargaAlocasia) +
               (stok[3] * hargaMawar);
    } 

    public static void main(String[] args) {
        String[] cabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };
        int[][] stokBunga = {
            {10, 5, 15, 7},
            {6, 11, 9, 12},
            {2, 10, 10, 5},
            {5, 7, 12, 9}
        };
        System.out.println("===== PENDAPATAN ROYAL GARDEN =====");
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = hitungPendapatan(stokBunga[i]);
            String status = statusCabang(pendapatan);

            System.out.println(cabang[i]);
            System.out.println("Pendapatan : Rp " + pendapatan);
            System.out.println("Status     : " + status);
            System.out.println();
        }
    }
}
