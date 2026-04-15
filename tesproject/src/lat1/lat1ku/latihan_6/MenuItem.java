// package lat1.lat1ku.latihan_6;

// public class MenuItem extends Menu {
//     protected int jumlah;

//     // Constructor
//     public MenuItem(String nama, double harga, int jumlah) {
//         super(nama, harga);
//         this.jumlah = jumlah;
//     }

//     // Override method hitungTotal
//     @Override
//     public double hitungTotal() {
//         return harga * jumlah;
//     }

//     // Override tampilkan
//     @Override
//     public void tampilkan() {
//         System.out.println("Nama Menu : " + nama);
//         System.out.println("Harga     : " + harga);
//         System.out.println("Jumlah    : " + jumlah);
//         System.out.println("Total     : " + hitungTotal());
//         System.out.println("========================");
//     }
// }


package lat1.lat1ku.latihan_6;

class MenuItem extends Menu {
    private int jumlah;

    public MenuItem(String nama, double harga, int jumlah) {
        super(nama, harga);
        this.jumlah = jumlah;
    }

    @Override
    public double hitungTotal() {
        return harga * jumlah;
    }

    @Override
    public void tampilkan() {
        System.out.println(nama + " : " + harga + " x " + jumlah + " = " + hitungTotal());
    }
}