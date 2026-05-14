public class Mahasiswa17main {
    public static void main(String[] args) {
     
    MataKuliah17 mk1 = new MataKuliah17("MK001", "Praktikum Algoritma dan Struktur Data", 6);
    MataKuliah17 mk2 = new MataKuliah17("MK002", "Basis Data", 4);
    MataKuliah17 mk3 = new MataKuliah17("MK003", "Pemrograman Dasar", 3);

    Mahasiswa17 mhs1 = new Mahasiswa17("254107060155", "Muhammad Saum Saifulloh", 2025);
    mhs1.tambahMataKuliah17(mk1);
    mhs1.tambahMataKuliah17(mk2);
    mhs1.tambahMataKuliah17(mk3);

    mhs1.tampilkaninfo();
    }
}