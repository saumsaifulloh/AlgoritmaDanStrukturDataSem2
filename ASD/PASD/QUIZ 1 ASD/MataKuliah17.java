public class MataKuliah17{
    String kodeMK;
    String namaMK;
    int SKS;

    public MataKuliah17(String kodeMK, String namaMK, int SKS) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.SKS = SKS;
    }

    public void tampilkanInfo() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama MK: " + namaMK);
        System.out.println("SKS: " + SKS);
        System.out.println("--------------------------------");
    }

    public void ubahnamaMK(MataKuliah17 mk, String namaBaru) {
        mk.namaMK = namaBaru;
    }

    public void ubahSKS(int SKSBaru) {
        if (SKSBaru >= 2) {
            this.SKS = SKSBaru;
        } else {
            System.out.println("SKS tidak boleh kurang dari 2!");
        }
    }
}