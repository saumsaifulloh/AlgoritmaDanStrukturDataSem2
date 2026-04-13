public class Mahasiswa17 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa17(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void tampilInformasi() {
        System.out.println(nim + " | " + nama + " | " + kelas + " | " + ipk);
    }
} 
    
