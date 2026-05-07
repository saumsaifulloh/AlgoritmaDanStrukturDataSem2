public class AntrianKRS17 {
    Mahasiswa[] data;
    int front, rear, size, max;
    int sudahProses = 0;

    public AntrianKRS17(int n) {
        max = n;
        data = new Mahasiswa[max];
        front = rear = -1;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == max;
    }

    public int tampil() {
        return size;
    }
    
    public void clear() {
        front = rear = -1;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    public void enqueue(Mahasiswa mhs) {
        if (isFull()) {
            System.out.println("Antrian penuh!");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % max;
        }
        data[rear] = mhs;
        size++;
        System.out.println("Mahasiswa masuk antrian");
    }

    public void dequeue2() {
        if (size < 2) {
            System.out.println("Antrian kurang dari 2!");
            return;
        }

        System.out.println("Dipanggil:");
        for (int i = 0; i < 2; i++) {
            data[front].tampilkanData();
            front = (front + 1) % max;
            size--;
            sudahProses++;
        }
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
            return;
        }

        int i = front;
        System.out.println("Daftar Antrian:");
        for (int j = 0; j < size; j++) {
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
    }

    public void peek2() {
        if (size < 2) {
            System.out.println("Kurang dari 2 antrian");
            return;
        }

        System.out.println("2 Antrian Terdepan:");
        int i = front;
        for (int j = 0; j < 2; j++) {
            data[i].tampilkanData();
            i = (i + 1) % max;
        }
    }

    public void lihatAkhir() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Antrian terakhir:");
            data[rear].tampilkanData();
        }
    }

    public void jumlahAntrian() {
        System.out.println("Jumlah antrian: " + size);
    }

    public void jumlahSudah() {
        System.out.println("Sudah proses KRS: " + sudahProses);
    }

    public void belumProses() {
        System.out.println("Belum proses: " + (30 - sudahProses));
    }
}