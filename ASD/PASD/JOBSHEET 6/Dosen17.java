public class Dosen17 {
    String kode, nama;
    boolean jenisKelamin; 
    int usia;

    public Dosen17(String kode, String nama, boolean jk, int usia) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jk;
        this.usia = usia;
    }

    void tampil() {
        String jk = jenisKelamin ? "L" : "P";
        System.out.println(kode + " | " + nama + " | " + jk + " | " + usia);
    }
}