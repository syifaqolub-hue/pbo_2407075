// package lat1.lat1ku.latihan_6;

// public class Main {
//     public static void main(String[] args) {

//         Menu menu;

//         menu = new MenuItem("Nasi Goreng", 15000, 2);
//         menu.tampilkan();

//         menu = new MenuItem("Mie Ayam", 12000, 3);
//         menu.tampilkan();

//         menu = new MenuItem("Es Teh", 5000, 4);
//         menu.tampilkan();
//     }
// }

package lat1.lat1ku.latihan_6;

public class Main {
    public static void main(String[] args) {

        Menu m1 = new MenuItem("nasi goreng", 12000, 4);
        Menu m2 = new MenuItem("ketoprak", 12000, 1);
        Menu m3 = new MenuItem("Soda Gembira", 8000, 6);

        double totalBayar = 0;

        m1.tampilkan();
        totalBayar += m1.hitungTotal();

        m2.tampilkan();
        totalBayar += m2.hitungTotal();

        m3.tampilkan();
        totalBayar += m3.hitungTotal();

        System.out.println("Total Bayar : " + totalBayar);
    }
}