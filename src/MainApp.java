/**
 * Kelas utama yang menjalankan program manajemen item.
 */
public class MainApp {
    /**
     * Titik masuk program untuk menguji fungsionalitas kelas Item.
     */
    public static void main(String[] args) {
        Item item1 = new Item(1, "Mouse", 250000, 30);
        item1.displayDetails();
        System.out.println();

        item1.setStok(80);
        item1.displayDetails();
    }
}