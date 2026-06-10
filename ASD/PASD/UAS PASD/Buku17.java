public class Buku17 {
    String kodeBuku;
    String judul;
    String penulis;
    int tahunTerbit;

    public Buku17(String kodeBuku, String judul, String penulis, int tahunTerbit) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.tahunTerbit = tahunTerbit;
    }

    public void tampilInformasi() {
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul     : " + judul);
        System.out.println("Penulis   : " + penulis);
        System.out.println("Tahun     : " + tahunTerbit);
        System.out.println("-------------------------");
    }
}