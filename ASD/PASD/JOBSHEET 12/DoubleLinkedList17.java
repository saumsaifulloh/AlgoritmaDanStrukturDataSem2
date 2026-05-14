public class DoubleLinkedList17 {
    Node17 head;
    Node17 tail;

    public DoubleLinkedList17() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(Mahasiswa17 data) {
        Node17 newNode = new Node17(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Mahasiswa17 data) {
        Node17 newNode = new Node17(null, data, null);

        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public Node17 search(String nim) {
        Node17 current = head;

        while (current != null) {
            if (current.data.nim.equals(nim)) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void insertAfter(String keyNim, Mahasiswa17 data) {
        Node17 current = search(keyNim);

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        }

        Node17 newNode = new Node17(current, data, current.next);

        if (current.next != null) {
            current.next.prev = newNode;
        } else {
            tail = newNode;
        }

        current.next = newNode;
    }

    public void print() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node17 current = head;
        while (current != null) {
            current.data.tampil();
            current = current.next;
        }
    }

    public void printReverse() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
            return;
        }

        Node17 current = tail;
        while (current != null) {
            current.data.tampil();
            current = current.prev;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data berhasil dihapus:");
        head.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List kosong");
            return;
        }

        System.out.println("Data berhasil dihapus:");
        tail.data.tampil();

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }
}