public class BinaryTree17 {
    Node17 root;

    // Konstruktor - inisialisasi root dengan null (tree kosong)
    public BinaryTree17() {
        root = null;
    }

    // Method isEmpty() - mengecek apakah tree kosong
    public boolean isEmpty() {
        return root == null;
    }

    // Method add() - menambahkan node secara iteratif
    // Node ditempatkan sesuai nilai IPK (kiri=lebih kecil, kanan=lebih besar)
    public void add(Mahasiswa17 mahasiswa) {
        Node17 newNode = new Node17(mahasiswa);
        if (isEmpty()) {
            root = newNode;
        } else {
            Node17 current = root;
            Node17 parent = null;
            while (true) {
                parent = current;
                if (mahasiswa.ipk < current.mahasiswa.ipk) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // TUGAS 1 - Method addRekursif() - menambahkan node secara rekursif
    public void addRekursif(Mahasiswa17 mahasiswa) {
        root = addRekursifHelper(root, mahasiswa);
    }

    // Helper rekursif untuk addRekursif
    // Jika node null, buat node baru. Jika IPK lebih kecil ke kiri, lebih besar ke kanan
    private Node17 addRekursifHelper(Node17 node, Mahasiswa17 mahasiswa) {
        if (node == null) {
            return new Node17(mahasiswa);
        }
        if (mahasiswa.ipk < node.mahasiswa.ipk) {
            node.left = addRekursifHelper(node.left, mahasiswa);
        } else {
            node.right = addRekursifHelper(node.right, mahasiswa);
        }
        return node;
    }

    // Method find() - mencari data berdasarkan IPK, return true jika ditemukan
    boolean find(double ipk) {
        boolean result = false;
        Node17 current = root;
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                result = true;
                break;
            } else if (ipk > current.mahasiswa.ipk) {
                current = current.right;
            } else {
                current = current.left;
            }
        }
        return result;
    }

    // Method traversePreOrder() - kunjungi node, lalu kiri, lalu kanan
    void traversePreOrder(Node17 node) {
        if (node != null) {
            node.mahasiswa.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // Method traverseInOrder() - kunjungi kiri, node, lalu kanan (hasil terurut)
    void traverseInOrder(Node17 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.mahasiswa.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    // Method traversePostOrder() - kunjungi kiri, kanan, lalu node
    void traversePostOrder(Node17 node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            node.mahasiswa.tampilInformasi();
        }
    }

    // Method getSuccessor() - mencari node pengganti saat node dihapus memiliki 2 anak
    // Successor adalah node terkecil di subtree kanan
    Node17 getSuccessor(Node17 del) {
        Node17 successor = del.right;
        Node17 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    // Method delete() - menghapus node berdasarkan IPK
    void delete(double ipk) {
        if (isEmpty()) {
            System.out.println("Binary tree kosong");
            return;
        }
        Node17 parent = root;
        Node17 current = root;
        boolean isLeftChild = false;

        // Cari posisi node yang akan dihapus
        while (current != null) {
            if (current.mahasiswa.ipk == ipk) {
                break;
            } else if (ipk < current.mahasiswa.ipk) {
                parent = current;
                current = current.left;
                isLeftChild = true;
            } else if (ipk > current.mahasiswa.ipk) {
                parent = current;
                current = current.right;
                isLeftChild = false;
            }
        }

        if (current == null) {
            System.out.println("Data tidak ditemukan");
            return;
        } else {
            // Kasus 1: node tidak punya anak (leaf node)
            if (current.left == null && current.right == null) {
                if (current == root) {
                    root = null;
                } else {
                    if (isLeftChild) {
                        parent.left = null;
                    } else {
                        parent.right = null;
                    }
                }
            // Kasus 2: node hanya punya 1 anak kanan
            } else if (current.left == null) {
                if (current == root) {
                    root = current.right;
                } else {
                    if (isLeftChild) {
                        parent.left = current.right;
                    } else {
                        parent.right = current.right;
                    }
                }
            // Kasus 3: node hanya punya 1 anak kiri
            } else if (current.right == null) {
                if (current == root) {
                    root = current.left;
                } else {
                    if (isLeftChild) {
                        parent.left = current.left;
                    } else {
                        parent.right = current.left;
                    }
                }
            // Kasus 4: node punya 2 anak, gunakan getSuccessor()
            } else {
                Node17 successor = getSuccessor(current);
                System.out.println("Jika 2 anak, current = ");
                successor.mahasiswa.tampilInformasi();
                if (current == root) {
                    root = successor;
                } else {
                    if (isLeftChild) {
                        parent.left = successor;
                    } else {
                        parent.right = successor;
                    }
                }
                successor.left = current.left;
            }
        }
    }

    // TUGAS 2 - Method cariMinIPK() - IPK terkecil selalu di node paling kiri
    public void cariMinIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        Node17 current = root;
        while (current.left != null) {
            current = current.left;
        }
        System.out.println("Mahasiswa dengan IPK terkecil:");
        current.mahasiswa.tampilInformasi();
    }

    // TUGAS 2 - Method cariMaxIPK() - IPK terbesar selalu di node paling kanan
    public void cariMaxIPK() {
        if (isEmpty()) {
            System.out.println("Tree kosong");
            return;
        }
        Node17 current = root;
        while (current.right != null) {
            current = current.right;
        }
        System.out.println("Mahasiswa dengan IPK terbesar:");
        current.mahasiswa.tampilInformasi();
    }

    // TUGAS 3 - Method tampilMahasiswaIPKdiAtas() - menampilkan mahasiswa dengan IPK di atas batas
    public void tampilMahasiswaIPKdiAtas(double ipkBatas) {
        System.out.println("Mahasiswa dengan IPK di atas " + ipkBatas + ":");
        tampilIPKdiAtasHelper(root, ipkBatas);
    }

    // Helper rekursif untuk tampilMahasiswaIPKdiAtas menggunakan inOrder
    // agar hasil tampil sudah terurut dari kecil ke besar
    private void tampilIPKdiAtasHelper(Node17 node, double ipkBatas) {
        if (node != null) {
            tampilIPKdiAtasHelper(node.left, ipkBatas);
            if (node.mahasiswa.ipk > ipkBatas) {
                node.mahasiswa.tampilInformasi();
            }
            tampilIPKdiAtasHelper(node.right, ipkBatas);
        }
    }
}