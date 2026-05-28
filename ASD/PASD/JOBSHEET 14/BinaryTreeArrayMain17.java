public class BinaryTreeArrayMain17 {
    public static void main(String[] args) {
        BinaryTreeArray17 bta = new BinaryTreeArray17();

        // Membuat objek mahasiswa
        Mahasiswa17 mhs1 = new Mahasiswa17("244160121", "Ali", "A", 3.57);
        Mahasiswa17 mhs2 = new Mahasiswa17("244160185", "Candra", "C", 3.41);
        Mahasiswa17 mhs3 = new Mahasiswa17("244160221", "Badar", "B", 3.75);
        Mahasiswa17 mhs4 = new Mahasiswa17("244160220", "Dewi", "B", 3.35);
        Mahasiswa17 mhs5 = new Mahasiswa17("244160131", "Devi", "A", 3.48);
        Mahasiswa17 mhs6 = new Mahasiswa17("244160205", "Ehsan", "D", 3.61);
        Mahasiswa17 mhs7 = new Mahasiswa17("244160170", "Fizi", "B", 3.86);

        // Populate data ke tree array
        Mahasiswa17[] dataMahasiswas = {mhs1, mhs2, mhs3, mhs4, mhs5, mhs6, mhs7, null, null, null};
        int idxLast = 6;
        bta.populateData(dataMahasiswas, idxLast);

        System.out.println("\nInorder Traversal Mahasiswa: ");
        bta.traverseInOrder(0);

        // TUGAS 1 - addRekursif
        System.out.println("\n--- Tugas 1: addRekursif ---");
        BinaryTree17 bst2 = new BinaryTree17();
        bst2.addRekursif(new Mahasiswa17("244160121", "Ali", "A", 3.57));
        bst2.addRekursif(new Mahasiswa17("244160221", "Badar", "B", 3.85));
        bst2.addRekursif(new Mahasiswa17("244160185", "Candra", "C", 3.21));
        System.out.println("InOrder setelah addRekursif:");
        bst2.traverseInOrder(bst2.root);

        // TUGAS 2 - cariMinIPK dan cariMaxIPK (pakai bst2)
        System.out.println("\n--- Tugas 2: Min dan Max IPK ---");
        bst2.cariMinIPK();
        bst2.cariMaxIPK();

        // TUGAS 3 - tampilMahasiswaIPKdiAtas (pakai bst2)
        System.out.println("\n--- Tugas 3: IPK di atas 3.50 ---");
        bst2.tampilMahasiswaIPKdiAtas(3.50);

        // TUGAS 4 - traversePreOrder dan add
        System.out.println("\n--- Tugas 4: PreOrder Traversal ---");
        bta.traversePreOrder(0);

        System.out.println("\nTambah data baru dengan add:");
        bta.add(new Mahasiswa17("244160999", "Gilang", "A", 3.90));
        System.out.println("InOrder setelah add:");
        bta.traverseInOrder(0);
    }
}