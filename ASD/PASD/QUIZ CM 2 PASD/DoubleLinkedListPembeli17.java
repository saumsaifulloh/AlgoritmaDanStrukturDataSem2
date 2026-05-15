public class DoubleLinkedListPembeli17 {
    Pembeli17 head, tail;
    int nomor = 1;

    public void tambahAntrian(String nama, String hp) {
        Pembeli17 baru = new Pembeli17(nomor++, nama, hp);

        if (head == null) {
            head = tail = baru;
        } else {
            tail.next = baru;
            baru.prev = tail;
            tail = baru;
        }

        System.out.println("Antrian berhasil ditambahkan");
    }

    public void cetakAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong");
            return;
        }

        Pembeli17 temp = head;

        System.out.println("=== DAFTAR ANTRIAN ===");
        while (temp != null) {
            System.out.println(temp.noAntrian + " | " +
                    temp.namaPembeli + " | " + temp.noHp);
            temp = temp.next;
        }
    }

    public Pembeli17 hapusAntrian() {
        if (head == null) {
            System.out.println("Antrian kosong");
            return null;
        }

        Pembeli17 keluar = head;

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }

        return keluar;
    }
}