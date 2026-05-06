class MahasiswaBerprestasi17 {
    Mahasiswa17[] listMhs = new Mahasiswa17[5];
    int idx;

    void tambah(Mahasiswa17 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        }
    }

    void tampil() {
        for (Mahasiswa17 m : listMhs) {
            if (m != null) {
                m.tampilInformasi();
            }
        }
    }

    // SEQUENTIAL SEARCH
    int sequentialSearch(double cari) {
        for (int i = 0; i < listMhs.length; i++) {
            if (listMhs[i] != null &&
                Math.abs(listMhs[i].ipk - cari) < 0.0001) {
                return i;
            }
        }
        return -1;
    }

    void tampilPosisi(double x, int pos) {
        if (pos != -1) {
            System.out.println("Data dengan IPK " + x + " ditemukan di index " + pos);
        } else {
            System.out.println("Data dengan IPK " + x + " tidak ditemukan");
        }
    }

    void tampilDataSearch(int pos) {
        if (pos != -1) {
            listMhs[pos].tampilInformasi();
        }
    }

    // BINARY SEARCH (DATA HARUS URUT)
    int findBinarySearch(double cari, int left, int right) {
        if (right >= left) {
            int mid = (left + right) / 2;

            if (listMhs[mid] == null) return -1;

            if (Math.abs(listMhs[mid].ipk - cari) < 0.0001) {
                return mid;
            } else if (listMhs[mid].ipk > cari) {
                return findBinarySearch(cari, left, mid - 1);
            } else {
                return findBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }
}       