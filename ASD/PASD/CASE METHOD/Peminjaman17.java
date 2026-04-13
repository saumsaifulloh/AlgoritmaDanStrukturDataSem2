class Peminjaman17 {
    Mahasiswa17 mhs;
    Buku17 buku;
    int lamaPinjam, denda;

    Peminjaman17(Mahasiswa17 mhs, Buku17 buku, int lamaPinjam) {
        this.mhs = mhs;
        this.buku = buku;
        this.lamaPinjam = lamaPinjam;
        hitungDenda();
    }

    void hitungDenda() {
        int terlambat = lamaPinjam - 5;
        if (terlambat > 0) {
            denda = terlambat * 2000;
        } else {
            denda = 0;
        }
    }

    void tampil() {
        System.out.println(mhs.nim + " | " + mhs.nama + " | " +
                buku.judul + " | " + lamaPinjam + " hari | Denda: " + denda);
    }
}