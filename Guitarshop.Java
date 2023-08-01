//RENDY PRAMESTA SYAH
//227064516024
package ProgramUAS;

// Kelas abstrak untuk merepresentasikan produk pada Toko Gitar
abstract class Produk {
    String nama;
    int harga;

    public Produk(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    // Method abstrak untuk menghitung harga setelah diskon
    public abstract int hitungHargaSetelahDiskon();

    // Untuk menampilkan informasi produk
    public void tampilkanInfoProduk() {
        System.out.println("Produk: " + nama);
        System.out.println("Harga: Rp " + harga);
    }
}

// Kelas Gitar sebagai turunan dari Produk
class Gitar extends Produk {
    String jenis;

    public Gitar(String nama, int harga, String jenis) {
        super(nama, harga);
        this.jenis = jenis;
    }

    // Untuk menghitung harga setelah diskon
    @Override
    public int hitungHargaSetelahDiskon() {
        // Misalnya, berlaku diskon 15% untuk semua gitar
        double diskon = 0.20;
        int hargaSetelahDiskon = (int) (harga - (harga * diskon));
        return hargaSetelahDiskon;
    }

    @Override
    public void tampilkanInfoProduk() {
        super.tampilkanInfoProduk();
        System.out.println("Jenis: " + jenis);
    }
}

public class Guitarshop {
    public static void main(String[] args) {
        // Membuat objek gitar
        Gitar gitar1 = new Gitar("Martin D-18 ", 60000000, "Akustik");
        Gitar gitar2 = new Gitar("Fender Jagstang", 17000000, "Elektrik");

        // Menampilkan informasi produk
        System.out.println("=== Menu Gitar ===");
        gitar1.tampilkanInfoProduk();
        System.out.println("Harga Setelah Diskon: Rp " + gitar1.hitungHargaSetelahDiskon());
        System.out.println();

        gitar2.tampilkanInfoProduk();
        System.out.println("Harga Setelah Diskon: Rp " + gitar2.hitungHargaSetelahDiskon());
    }
}

