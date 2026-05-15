public class Mahasiswa17 {
 String NIM;
 String Nama;
 int TahunMasuk;
 MataKuliah17[] mataKuliahDiambil;
 int jumlahMataKuliah;

public Mahasiswa17(String Nama, String NIM, int TahunMasuk) {
    this.NIM = NIM;
    this.Nama = Nama;
    this.TahunMasuk = TahunMasuk;
    this.mataKuliahDiambil = new MataKuliah17[10]; // Maksimal 10 mata kuliah
    this.jumlahMataKuliah = 0;
}

public void tampilkaninfo() {
    System.out.println("NIM: " + NIM);
    System.out.println("Nama: " + Nama);
    System.out.println("Tahun Masuk: " + TahunMasuk);
    System.out.println("================================");
    System.out.println("Mata Kuliah yang Diambil:");
    
    
    for (int i = 0; i < jumlahMataKuliah; i++) {
        mataKuliahDiambil[i].tampilkanInfo();
    }

    System.out.println("Total SKS: " + hitungTotalSKS());
    System.out.println("================================");
}
    public void tambahMataKuliah17(MataKuliah17 mataKuliah) {
        if (jumlahMataKuliah < mataKuliahDiambil.length) {
            mataKuliahDiambil[jumlahMataKuliah] = mataKuliah;
            jumlahMataKuliah++;
        } else {
            System.out.println("Kapasitas mata kuliah sudah penuh.");
        }
    }

    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMataKuliah; i++) {
            totalSKS += mataKuliahDiambil[i].SKS;
        }
        return totalSKS;
    }
}
