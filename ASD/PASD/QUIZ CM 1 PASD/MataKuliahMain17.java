public class MataKuliahMain17 {
    public static void main(String[] args) {

        MataKuliah17 mk1 = new MataKuliah17("112233", "Dasar Pemrograman", 3);

        System.out.println("=== Data Awal Mata Kuliah ===");
        mk1.tampilkanInfo();

        System.out.println("\n=== Setelah Perubahan ===");
        mk1.ubahnamaMK(mk1, "Basis Data");
        mk1.ubahSKS(4);
        mk1.tampilkanInfo();

        System.out.println("\n=== SKS Tidak Valid ===");
        mk1.ubahSKS(4); 
    }
}
