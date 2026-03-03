public class MataKuliah17main {
    public static void main(String[] args) {
     
    MataKuliah17 mk1 = new MataKuliah17("MK001", "Praktikum Algoritma dan Struktur Data", 6);
    MataKuliah17 mk2 = new MataKuliah17("MK002", "Basis Data", 4);
    MataKuliah17 mk3 = new MataKuliah17("MK003", "Sistem Operasi", 3);

    mk1.tampilkanInfo();
    mk2.tampilkanInfo();
    mk3.tampilkanInfo();

    mk1.ubahnamaMK(mk1, "Praktikum Algoritma dan Struktur Data");
    mk1.ubahSKS(5);

    mk1.tampilkanInfo();
    }
}
