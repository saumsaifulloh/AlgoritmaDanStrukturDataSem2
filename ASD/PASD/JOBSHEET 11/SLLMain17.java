public class SLLMain17 {
    public static void main(String[] args) {
        SingleLinkedList17 sll = new SingleLinkedList17();

        Mahasiswa17 mhs1 = new Mahasiswa17("221212203", "Dirga", "4D", 3.6);
        Mahasiswa17 mhs2 = new Mahasiswa17("24212200", "Alvaro", "1A", 4.0);
        Mahasiswa17 mhs3 = new Mahasiswa17("222122202", "Cintia", "3C", 3.5);
        Mahasiswa17 mhs4 = new Mahasiswa17("23212201", "Bimon", "2B", 3.8);

        // ================= PRAKTIKUM 2.1 =================
        sll.print();

        sll.addFirst(mhs1);
        sll.print();

        sll.addLast(mhs2);
        sll.print();

        sll.insertAfter("221212203", mhs3);
        sll.print();

        sll.insertAt(2, mhs4);
        sll.print();

        // ================= PRAKTIKUM 2.2 =================
        System.out.println("data index 1 : ");
        sll.getData(1).tampilInformasi();

        System.out.println("data mahasiswa an Bimon berada pada index : "
                + sll.indexOf("23212201"));

        sll.removeFirst();
        sll.removeLast();
        sll.print();

        sll.remove(0);
        sll.print();
    }
}