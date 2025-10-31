/**
 * Interface Dijual mendefinisikan kontrak untuk objek yang bisa dijual.
 * Setiap kelas yang mengimplementasikan interface ini harus
 * mengimplementasikan method hitungHargaFinal().
 */
public interface Dijual {
    /**
     * Menghitung harga jual final dari item.
     * @return harga akhir setelah diskon
     */
    double hitungHargaFinal();
}