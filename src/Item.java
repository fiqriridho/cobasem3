
/**
 * Kelas Item merepresentasikan sebuah barang yang dijual.
 * Kelas ini mengimplementasikan interface Dijual.
 */
public class Item implements Dijual {

    /** Besaran diskon tetap yang berlaku untuk semua item (contoh: 10%). */
    public static final double DISCOUNT_RATE = 0.1;

    /** Batas minimum stok sebelum muncul peringatan. */
    public static final int MINIMUM_STOK = 50;

    private int id;
    private String nama;
    private double harga;
    private int stok;

    /**
     * Konstruktor untuk membuat objek Item baru.
     * @param id ID unik item
     * @param nama Nama item
     * @param harga Harga dasar item
     * @param stok Jumlah stok item
     */
    public Item(int id, String nama, double harga, int stok) {
        this.id = id;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    /** @return ID item */
    public int getId() { return id; }

    /** @param id Mengatur ID item */
    public void setId(int id) { this.id = id; }

    /** @return Nama item */
    public String getNama() { return nama; }

    /** @param nama Mengatur nama item */
    public void setNama(String nama) { this.nama = nama; }

    /** @return Harga dasar item */
    public double getHarga() { return harga; }

    /** @param harga Mengatur harga dasar item */
    public void setHarga(double harga) { this.harga = harga; }

    /** @return Jumlah stok item */
    public int getStok() { return stok; }

    /** @param stok Mengatur jumlah stok item */
    public void setStok(int stok) { this.stok = stok; }

    /**
     * Menghitung harga item setelah diskon.
     * Implementasi dari interface Dijual.
     * @return Harga final setelah potongan DISCOUNT_RATE
     */
    @Override
    public double hitungHargaFinal() {
        return harga - (harga * DISCOUNT_RATE);
    }

    /**
     * Mengecek apakah stok berada di bawah batas minimum.
     * Menampilkan pesan status stok ke konsol.
     */
    public void checkStockStatus() {
        if (stok < MINIMUM_STOK)
            System.out.println("Peringatan: Stok rendah!");
        else
            System.out.println("Stok aman.");
    }

    /**
     * Menampilkan detail lengkap item, termasuk harga final dan status stok.
     */
    public void displayDetails() {
        System.out.println("=== Detail Item ===");
        System.out.println("ID: " + id);
        System.out.println("Nama: " + nama);
        System.out.println("Harga: " + harga);
        System.out.println("Stok: " + stok);
        System.out.println("Harga Final: " + hitungHargaFinal());
        checkStockStatus();
    }
}
