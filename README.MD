# Dokumentasi Program Manajemen Item

Dokumentasi ini menjelaskan struktur kelas, interface, dan method yang digunakan dalam program manajemen item.

---

## 1. Interface `Dijual`

Interface ini mendefinisikan kontrak atau perilaku untuk objek-objek yang dapat dijual. Setiap kelas yang mengimplementasikan interface ini wajib menyediakan logika untuk menghitung harga final.

### Method
* `double hitungHargaFinal()`
    * **Deskripsi:** Method abstrak yang bertujuan untuk menghitung dan mengembalikan harga jual final dari sebuah item.

---

## 2. Kelas `Item`

Kelas ini merepresentasikan sebuah barang (item) yang dijual dalam inventaris. Kelas ini mengimplementasikan interface `Dijual`.

### Constants (Konstanta)
* `public static final double DISCOUNT_RATE`
    * **Deskripsi:** Menetapkan besaran diskon tetap (misalnya, `0.1` untuk 10%) yang berlaku untuk semua item.
* `public static final int MINIMUM_STOK`
    * **Deskripsi:** Menetapkan batas minimum stok (misalnya, `50`) sebelum sistem memberikan peringatan.

### Constructor
* `public Item(int id, String nama, double harga, int stok)`
    * **Deskripsi:** Constructor untuk membuat objek `Item` baru dengan menginisialisasi semua atributnya (id, nama, harga, dan stok).

### Methods (Metode)

#### Getter dan Setter
* `public int getId()`: Mengembalikan ID item.
* `public void setId(int id)`: Mengatur ID item.
* `public String getNama()`: Mengembalikan nama item.
* `public void setNama(String nama)`: Mengatur nama item.
* `public double getHarga()`: Mengembalikan harga dasar item.
* `public void setHarga(double harga)`: Mengatur harga dasar item.
* `public int getStok()`: Mengembalikan jumlah stok item.
* `public void setStok(int stok)`: Mengatur jumlah stok item.

#### Metode Fungsional
* `public double hitungHargaFinal()`
    * **Deskripsi:** (Implementasi dari interface `Dijual`). Menghitung harga item setelah dikurangi diskon (`DISCOUNT_RATE`).
    * **Return:** `double` (harga final).
* `public void checkStockStatus()`
    * **Deskripsi:** Memeriksa apakah jumlah stok (`stok`) saat ini berada di bawah batas minimum (`MINIMUM_STOK`). Jika ya, akan mencetak peringatan ke konsol; jika tidak, akan mencetak status aman.
* `public void displayDetails()`
    * **Deskripsi:** Menampilkan semua detail item ke konsol, termasuk ID, nama, harga, stok, total nilai stok, harga jual final (memanggil `hitungHargaFinal()`), dan status stok (memanggil `checkStockStatus()`).

---

## 3. Kelas `MainApp`

Kelas ini adalah kelas utama (*driver class*) yang berisi method `main` untuk menjalankan dan menguji fungsionalitas program.

### Method
* `public static void main(String[] args)`
    * **Deskripsi:** Titik masuk (entry point) program. Method ini membuat sebuah instance `Item`, menampilkan detailnya, memperbarui stoknya menggunakan *setter*, dan menampilkannya kembali untuk menunjukkan perubahan.