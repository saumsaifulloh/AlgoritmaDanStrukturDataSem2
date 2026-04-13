public class MahasiswaDemo17 {
    public static void main(String[] args) {
        MahasiswaBerprestasi17 mb = new MahasiswaBerprestasi17();
        mb.tambah(new Mahasiswa17("01", "Ani", "TI-1", 3.5));
        mb.tambah(new Mahasiswa17("02", "Budi", "TI-1", 3.8));
        mb.tambah(new Mahasiswa17("03", "Cici", "TI-1", 3.2));
        mb.tambah(new Mahasiswa17("04", "Dodi", "TI-1", 3.9));
        mb.tambah(new Mahasiswa17("05", "Eka", "TI-1", 3.4));

        mb.tampil();
        mb.insertionSort();
        mb.tampil();
    }
}