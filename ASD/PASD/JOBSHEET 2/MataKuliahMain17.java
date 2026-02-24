public class MataKuliahMain17 {
    public static void main(String[] args) {

        MataKuliah17 mk1 = new MataKuliah17();
        mk1.kodeMK = "ASD01";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        

        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);

        MataKuliah17 mk2 = new MataKuliah17(
                "BD02",
                "Basis Data",
                3,
                6
        );

        mk2.tampilInformasi();
        mk2.tambahJam(1);
        mk2.kurangiJam(10);
    }
}