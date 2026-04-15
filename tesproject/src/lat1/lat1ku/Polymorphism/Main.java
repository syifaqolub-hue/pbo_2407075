// package lat1.lat1ku.Polymorphism;

// public class Main {
//     public static void main(String[] args) {

//         BangunDatar bd;

//         bd = new Persegi(4);
//         bd.tampilkan();

//         System.out.println();

//         bd = new PersegiPanjang(6, 3);
//         bd.tampilkan();

//         System.out.println();

//         bd = new Segitiga(5, 4);
//         bd.tampilkan();
//     }
// }

package lat1.lat1ku.Polymorphism;

public class Main {
    public static void main(String[] args) {

        BangunDatar bd;

        // Bangun Datar
        bd = new BangunDatar(3, 4);
        bd.tampilkan();

        System.out.println();

        // Persegi
        bd = new Persegi(4);
        bd.tampilkan();

        System.out.println();

        // Persegi Panjang
        bd = new PersegiPanjang(6, 3);
        bd.tampilkan();

        System.out.println();

        // Segitiga
        bd = new Segitiga(5, 4);
        bd.tampilkan();
    }
}
