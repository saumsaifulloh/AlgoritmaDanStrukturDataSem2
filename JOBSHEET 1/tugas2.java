import java.util.Scanner;

public class tugas2 {
    static void inputJadwal(String[][] jadwal, int n) {
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("\nJadwal ke-" + (i + 1));
            System.out.print("Mata Kuliah : ");
            jadwal[i][0] = input.nextLine();
            System.out.print("Ruang       : ");
            jadwal[i][1] = input.nextLine();
            System.out.print("Hari        : ");
            jadwal[i][2] = input.nextLine();
            System.out.print("Jam         : ");
            jadwal[i][3] = input.nextLine();
        }
    }
    static void tampilSemua(String[][] jadwal, int n) {
        System.out.println("\n===== SEMUA JADWAL =====");
        for (int i = 0; i < n; i++) {
            System.out.println(
                jadwal[i][0] + " | " +
                jadwal[i][1] + " | " +
                jadwal[i][2] + " | " +
                jadwal[i][3]
            );
        }
    }
    static void cariHari(String[][] jadwal, int n, String hari) {
        System.out.println("\nJadwal hari " + hari + ":");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][2].equalsIgnoreCase(hari)) {
                System.out.println(
                    jadwal[i][0] + " | " +
                    jadwal[i][1] + " | " +
                    jadwal[i][3]
                );
            }
        }
    }

    static void cariMataKuliah(String[][] jadwal, int n, String mk) {
        System.out.println("\nJadwal mata kuliah " + mk + ":");
        for (int i = 0; i < n; i++) {
            if (jadwal[i][0].equalsIgnoreCase(mk)) {
                System.out.println(
                    jadwal[i][1] + " | " +
                    jadwal[i][2] + " | " +
                    jadwal[i][3]
                );
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah jadwal: ");
        int n = input.nextInt();
        input.nextLine();

        String[][] jadwal = new String[n][4];
        inputJadwal(jadwal, n);
        tampilSemua(jadwal, n);
        System.out.print("\nCari jadwal berdasarkan hari: ");
        String hari = input.nextLine();
        cariHari(jadwal, n, hari);
        System.out.print("\nCari jadwal berdasarkan mata kuliah: ");
        String mk = input.nextLine();
        cariMataKuliah(jadwal, n, mk);

        input.close();
    }
}
