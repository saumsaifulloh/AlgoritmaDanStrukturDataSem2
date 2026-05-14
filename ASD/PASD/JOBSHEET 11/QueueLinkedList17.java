public class QueueLinkedList17 {
    NodeAntrian17 front;
    NodeAntrian17 rear;
    int size = 0;

    boolean isEmpty() {
        return front == null;
    }

    void enqueue(MahasiswaAntrian17 data) {
        NodeAntrian17 newNode = new NodeAntrian17(data, null);

        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
    }

    void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            System.out.println("Memanggil antrian:");
            front.data.tampil();
            front = front.next;
            size--;

            if (front == null) {
                rear = null;
            }
        }
    }

    void peekFront() {
        if (!isEmpty()) {
            System.out.println("Antrian terdepan:");
            front.data.tampil();
        }
    }

    void peekRear() {
        if (!isEmpty()) {
            System.out.println("Antrian terakhir:");
            rear.data.tampil();
        }
    }

    void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrian dikosongkan");
    }

    void print() {
        if (isEmpty()) {
            System.out.println("Antrian kosong");
        } else {
            NodeAntrian17 temp = front;
            System.out.println("Daftar Antrian:");
            while (temp != null) {
                temp.data.tampil();
                System.out.println("----------------");
                temp = temp.next;
            }
        }
    }

    void jumlahAntrian() {
        System.out.println("Jumlah mahasiswa mengantre: " + size);
    }
}