class StackSurat17 {
    Surat17[] stack;
    int top;
    int size;

    StackSurat17(int size) {
        this.size = size;
        stack = new Surat17[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Surat17  s) {
        if (!isFull()) {
            top++;
            stack[top] = s;
            System.out.println("Surat berhasil ditambahkan");
        } else {
            System.out.println("Stack penuh");
        }
    }

    Surat17 pop() {
        if (!isEmpty()) {
            Surat17 s = stack[top];
            top--;
            return s;
        } else {
            System.out.println("Stack kosong");
            return null;
        }
    }

    Surat17 peek() {
        if (!isEmpty()) {
            return stack[top];
        }
        return null;
    }

    boolean cari(String nama) {
        for (int i = 0; i <= top; i++) {
            if (stack[i].namaMahasiswa.equalsIgnoreCase(nama)) {
                return true;
            }
        }
        return false;
    }
}