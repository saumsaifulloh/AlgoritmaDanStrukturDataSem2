    import java.util.Scanner;

    public class tugas1 {
            public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] KODE = {
            "A","B","D","E","F","G","H","L","N","T"
        };

String[][] KOTA = {
    {"Serang"},
    {"Jakarta"},
    {"Bandung"},
    {"Cirebon"},
    {"Bogor"},
    {"Pekalongan"},
    {"Semarang"},
    {"Surabaya"},
    {"Malang"},
    {"Tegal"}
};

System.out.print("Masukkan kode plat nomor: ");
String cari = input.next();  

boolean ditemukan = false;

for (int i = 0; i < KODE.length; i++) {
    if (KODE[i].equals(cari)) {
        System.out.println("Nama kota: " + KOTA[i][0]);
        ditemukan = true;
        break;
    }
}

if (!ditemukan) {
    System.out.println("Kode plat tidak ditemukan");
}

 input.close();
}

}
