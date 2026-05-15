public class Pesanan17 {
    int kodePesanan;
    String namaPesanan;
    int harga;
    String namaPembeli;

    Pesanan17 prev, next;

    public Pesanan17(int kodePesanan, String namaPesanan, int harga, String namaPembeli) {
        this.kodePesanan = kodePesanan;
        this.namaPesanan = namaPesanan;
        this.harga = harga;
        this.namaPembeli = namaPembeli;
    }
}