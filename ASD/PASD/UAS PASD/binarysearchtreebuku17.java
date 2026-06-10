public class binarysearchtreebuku17 {
    NodeBuku17 root;

    public boolean isEmpty() {
        return root == null;
    }

    public void add(Buku17 data) {
        NodeBuku17 newNode = new NodeBuku17(data);
        if (isEmpty()) {
            root = newNode;
            return;
        }

        NodeBuku17 current = root;

        while (true) {
            if (data.kodeBuku.compareTo(current.data.kodeBuku) < 0) {
                if (current.left == null) {
                    current.left = newNode;
                    break;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    break;
                }
                current = current.right;
            }
        }
    }

    public boolean find(String kodeBuku) {
        NodeBuku17 current = root;

        while (current != null) {
            int hasil = kodeBuku.compareTo(current.data.kodeBuku);

            if (hasil == 0) {
                return true;
            } else if (hasil < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    public void traverseInOrder(NodeBuku17 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    public void traversePreOrder(NodeBuku17 node) {
        if (node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    public int hitungJumlahBuku(NodeBuku17 node) {
        if (node == null) {
            return 0;
        }

        return 1 + hitungJumlahBuku(node.left)
                 + hitungJumlahBuku(node.right);
    }

    public Buku17 cariBukuTertua(NodeBuku17 node) {
        if (node == null) {
            return null;
        }

        Buku17 tertua = node.data;

        Buku17 kiri = cariBukuTertua(node.left);
        Buku17 kanan = cariBukuTertua(node.right);

        if (kiri != null && kiri.tahunTerbit < tertua.tahunTerbit) {
            tertua = kiri;
        }

        if (kanan != null && kanan.tahunTerbit < tertua.tahunTerbit) {
            tertua = kanan;
        }

        return tertua;
    }
}