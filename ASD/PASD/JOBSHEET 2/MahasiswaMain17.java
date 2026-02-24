public class MahasiswaMain17 {
    public static void main(String[] args) {

        Mahasiswa17 mhs1 = new Mahasiswa17("254107060155", "Muhammad Saum Saifulloh", "SIB 1E", 3.29);

        System.out.println("Data Awal:");
        mhs1.tampilkanInformasi();

        mhs1.ubahKelas("SIB 1E");
        mhs1.updateIpk(3.60);

        System.out.println("Setelah Update:");
        mhs1.tampilkanInformasi();
    }
}