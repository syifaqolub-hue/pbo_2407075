// // package lat1.lat1ku.latihan4;

// // public class Main {
    
// // }

// package lat1.lat1ku.latihan4;

// import java.util.Scanner;

// public class Main {

//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);

//         PersegiPanjang pp = new PersegiPanjang();

//         System.out.println("=== Hitung Persegi Panjang ===");

//         System.out.print("Masukkan panjang: ");
//         double pj = input.nextDouble();

//         System.out.print("Masukkan lebar: ");
//         double lb = input.nextDouble();

//         pp.setData(pj, lb);
//         pp.hitung();

//         System.out.println("Luas = " + pp.getLuas());
//         System.out.println("Keliling = " + pp.getKeliling());

//         input.close();
//     }
// }

package lat1.lat1ku.latihan4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunDatar bd = null; // polymorphism (parent reference)

        System.out.println("=== Kalkulator Bangun Datar ===");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");
        System.out.println("4. Lingkaran");
        System.out.print("Pilih: ");
        int pilih = input.nextInt();

        switch (pilih) {

            case 1:
                Persegi p = new Persegi();
                System.out.print("Masukkan sisi: ");
                p.setSisi(input.nextDouble());
                bd = p; // child masuk ke parent
                break;

            case 2:
                PersegiPanjang pp = new PersegiPanjang();
                System.out.print("Masukkan panjang: ");
                double pj = input.nextDouble();
                System.out.print("Masukkan lebar: ");
                double lb = input.nextDouble();
                pp.setData(pj, lb);
                bd = pp;
                break;

            case 3:
                Segitiga s = new Segitiga();
                System.out.print("Masukkan alas: ");
                double alas = input.nextDouble();
                System.out.print("Masukkan tinggi: ");
                double tinggi = input.nextDouble();
                s.setData(alas, tinggi);
                bd = s;
                break;

            case 4:
                Lingkaran l = new Lingkaran();
                System.out.print("Masukkan jari-jari: ");
                l.setJari(input.nextDouble());
                bd = l;
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }

        if (bd != null) {
            bd.hitung(); // polymorphism jalan di sini
            System.out.println("Luas = " + bd.getLuas());
            System.out.println("Keliling = " + bd.getKeliling());
        }

        input.close();
    }
}