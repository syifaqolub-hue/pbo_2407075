// package lat1.lat1ku.latihan_6;

// public class Menu {
//     protected String nama;
//     protected double harga;

//     // Constructor
//     public Menu(String nama, double harga) {
//         this.nama = nama;
//         this.harga = harga;
//     }

//     // Method hitung total (default)
//     public double hitungTotal() {
//         return 0;
//     }

//     // Method tampilkan
//     public void tampilkan() {
//         System.out.println("Nama Menu : " + nama);
//         System.out.println("Harga     : " + harga);
//     }
// }

package lat1.lat1ku.latihan_6;

class Menu {
    protected String nama;
    protected double harga;

    public Menu(String nama, double harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public double hitungTotal() {
        return harga; // default
    }

    public void tampilkan() {
        System.out.println(nama + " : " + harga + " total : " + hitungTotal());
    }
}