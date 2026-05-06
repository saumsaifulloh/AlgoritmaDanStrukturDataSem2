class StackTugasMahasiswa17 {
    Mahasiswa17[] stack;
    int size;
    int top;
    int jumlahTugas() {
    return top + 1;
    }

    StackTugasMahasiswa17(int size) {
        this.size = size;
        stack = new Mahasiswa17[size];
        top = -1;
    }

    boolean isFull() {
        return top == size - 1;
    }

    boolean isEmpty() {
        return top == -1;
    }

    void push(Mahasiswa17 mhs) {
        if (!isFull()) {
            top++;
            stack[top] = mhs;
            System.out.println("Tugas " + mhs.nama + " berhasil dikumpulkan");
        } else {
            System.out.println("Stack penuh!");
        }
    }

    Mahasiswa17 pop() {
        if (!isEmpty()) {
            Mahasiswa17 m = stack[top];
            top--;
            return m;
        } else {
            System.out.println("Stack kosong!");
            return null;
        }
    }

    Mahasiswa17 peek() {
        if (!isEmpty()) {
            return stack[top];
        } else {
            return null;
        }
    }

    void print() {
        System.out.println("Nama\tNIM\tKelas");
        for (int i = top; i >= 0; i--) {
            System.out.println(stack[i].nama + "\t" + stack[i].nim + "\t" + stack[i].kelas);
        }
    }
        Mahasiswa17 lihatBawah() {
        if (!isEmpty()) {
            return stack[0];
        } else {
            return null;
        }
    }
    String konversiDesimalKeBiner(int nilai) {
    StackKonversi17 stack = new StackKonversi17(32);
    String biner = "";

    while (nilai > 0) {
        int sisa = nilai % 2;
        stack.push(sisa);
        nilai = nilai / 2;
    }

    while (!stack.isEmpty()) {
        biner += stack.pop();
    }

    return biner;
}
}