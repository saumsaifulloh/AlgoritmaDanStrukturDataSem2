public class SingleLinkedList17 {
    Node17 head;
    Node17 tail;

    boolean isEmpty() {
        return head == null;
    }

    void print() {
        if (!isEmpty()) {
            Node17 tmp = head;
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                tmp.data.tampilInformasi();
                System.out.println("----------------");
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    void addFirst(Mahasiswa17 input) {
        Node17 ndInput = new Node17(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            ndInput.next = head;
            head = ndInput;
        }
    }

    void addLast(Mahasiswa17 input) {
        Node17 ndInput = new Node17(input, null);
        if (isEmpty()) {
            head = tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    void insertAfter(String key, Mahasiswa17 input) {
        Node17 temp = head;
        while (temp != null) {
            if (temp.data.nim.equals(key)) {
                Node17 ndInput = new Node17(input, temp.next);
                temp.next = ndInput;

                if (ndInput.next == null) {
                    tail = ndInput;
                }
                break;
            }
            temp = temp.next;
        }
    }

    void insertAt(int index, Mahasiswa17 input) {
        if (index == 0) {
            addFirst(input);
        } else {
            Node17 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node17 ndInput = new Node17(input, temp.next);
            temp.next = ndInput;

            if (ndInput.next == null) {
                tail = ndInput;
            }
        }
    }

    Mahasiswa17 getData(int index) {
        Node17 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int indexOf(String key) {
        Node17 tmp = head;
        int index = 0;

        while (tmp != null) {
            if (tmp.data.nim.equals(key)) {
                return index;
            }
            tmp = tmp.next;
            index++;
        }
        return -1;
    }

    void removeFirst() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
        }
    }

    void removeLast() {
        if (isEmpty()) {
            System.out.println("Linked List masih kosong");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node17 temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void remove(int index) {
        if (index == 0) {
            removeFirst();
        } else {
            Node17 temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }

            if (temp.next == tail) {
                tail = temp;
            }

            temp.next = temp.next.next;
        }
    }
}