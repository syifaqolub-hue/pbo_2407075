// package lat1.latihan3;

// import java.util.Scanner;

// // Class Induk
// class BangunDatar {
//     protected double luas;
//     protected double keliling;

//     public double getLuas() {
//         return luas;
//     }

//     public double getKeliling() {
//         return keliling;
//     }
// }

// // Persegi
// class Persegi extends BangunDatar {
//     private double sisi;

//     public void setSisi(double sisi) {
//         this.sisi = sisi;
//     }

//     public void hitung() {
//         luas = sisi * sisi;
//         keliling = 4 * sisi;
//     }
// }

// // Persegi Panjang
// class PersegiPanjang extends BangunDatar {
//     private double panjang;
//     private double lebar;

//     public void setData(double panjang, double lebar) {
//         this.panjang = panjang;
//         this.lebar = lebar;
//     }

//     public void hitung() {
//         luas = panjang * lebar;
//         keliling = 2 * (panjang + lebar);
//     }
// }

// // Segitiga
// class Segitiga extends BangunDatar {
//     private double alas, tinggi;
//     private double a, b, c;

//     public void setData(double alas, double tinggi, double a, double b, double c) {
//         this.alas = alas;
//         this.tinggi = tinggi;
//         this.a = a;
//         this.b = b;
//         this.c = c;
//     }

//     public void hitung() {
//         luas = 0.5 * alas * tinggi;
//         keliling = a + b + c;
//     }
// }

// // Lingkaran
// class Lingkaran extends BangunDatar {
//     private double r;

//     public void setJari(double r) {
//         this.r = r;
//     }

//     public void hitung() {
//         luas = Math.PI * r * r;
//         keliling = 2 * Math.PI * r;
//     }
// }

// // Main Class (harus sama dengan nama file)
// public class tugas1_nim {
//     public static void main(String[] args) {
//         Scanner input = new Scanner(System.in);

//         System.out.println("=== Kalkulator Bangun Datar ===");
//         System.out.println("1. Persegi");
//         System.out.println("2. Persegi Panjang");
//         System.out.println("3. Segitiga");
//         System.out.println("4. Lingkaran");
//         System.out.print("Pilih: ");
//         int pilih = input.nextInt();

//         switch (pilih) {
//             case 1:
//                 Persegi p = new Persegi();
//                 System.out.print("Masukkan sisi: ");
//                 p.setSisi(input.nextDouble());
//                 p.hitung();
//                 System.out.println("Luas = " + p.getLuas());
//                 System.out.println("Keliling = " + p.getKeliling());
//                 break;

//             case 2:
//                 PersegiPanjang pp = new PersegiPanjang();
//                 System.out.print("Masukkan panjang: ");
//                 double pj = input.nextDouble();
//                 System.out.print("Masukkan lebar: ");
//                 double lb = input.nextDouble();
//                 pp.setData(pj, lb);
//                 pp.hitung();
//                 System.out.println("Luas = " + pp.getLuas());
//                 System.out.println("Keliling = " + pp.getKeliling());
//                 break;

//             case 3:
//                 Segitiga s = new Segitiga();
//                 System.out.print("Masukkan alas: ");
//                 double alas = input.nextDouble();
//                 System.out.print("Masukkan tinggi: ");
//                 double tinggi = input.nextDouble();
//                 System.out.print("Masukkan sisi A: ");
//                 double a = input.nextDouble();
//                 System.out.print("Masukkan sisi B: ");
//                 double b = input.nextDouble();
//                 System.out.print("Masukkan sisi C: ");
//                 double c = input.nextDouble();
//                 s.setData(alas, tinggi, a, b, c);
//                 s.hitung();
//                 System.out.println("Luas = " + s.getLuas());
//                 System.out.println("Keliling = " + s.getKeliling());
//                 break;

//             case 4:
//                 Lingkaran l = new Lingkaran();
//                 System.out.print("Masukkan jari-jari: ");
//                 l.setJari(input.nextDouble());
//                 l.hitung();
//                 System.out.println("Luas = " + l.getLuas());
//                 System.out.println("Keliling = " + l.getKeliling());
//                 break;

//             default:
//                 System.out.println("Pilihan tidak tersedia");
//         }

//         input.close();
//     }
// }

package lat1.latihan3;

import java.util.Scanner;

// Parent
class BangunDatar {
    protected double luas;
    protected double keliling;

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
}

// Persegi
class Persegi extends BangunDatar {
    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    public void hitung() {
        luas = sisi * sisi;
        keliling = 4 * sisi;
    }

    public void tampilDiagram() {
        System.out.println("\n+----------------------+");
        System.out.println("|        Persegi       |");
        System.out.println("+----------------------+");
        System.out.println("| - sisi : double      |");
        System.out.println("+----------------------+");
        System.out.println("| + setSisi()          |");
        System.out.println("| + hitung()           |");
        System.out.println("+----------------------+");
    }
}

// Persegi Panjang
class PersegiPanjang extends BangunDatar {
    private double panjang;
    private double lebar;

    public void setData(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    public void hitung() {
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
    }

    public void tampilDiagram() {
        System.out.println("\n+---------------------------+");
        System.out.println("|      PersegiPanjang       |");
        System.out.println("+---------------------------+");
        System.out.println("| - panjang : double        |");
        System.out.println("| - lebar   : double        |");
        System.out.println("+---------------------------+");
        System.out.println("| + setData()               |");
        System.out.println("| + hitung()                |");
        System.out.println("+---------------------------+");
    }
}

// Segitiga
class Segitiga extends BangunDatar {
    private double alas, tinggi;
    private double a, b, c;

    public void setData(double alas, double tinggi, double a, double b, double c) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void hitung() {
        luas = 0.5 * alas * tinggi;
        keliling = a + b + c;
    }

    public void tampilDiagram() {
        System.out.println("\n+---------------------------+");
        System.out.println("|         Segitiga          |");
        System.out.println("+---------------------------+");
        System.out.println("| - alas   : double         |");
        System.out.println("| - tinggi : double         |");
        System.out.println("| - a,b,c  : double         |");
        System.out.println("+---------------------------+");
        System.out.println("| + setData()               |");
        System.out.println("| + hitung()                |");
        System.out.println("+---------------------------+");
    }
}

// Lingkaran
class Lingkaran extends BangunDatar {
    private double r;

    public void setJari(double r) {
        this.r = r;
    }

    public void hitung() {
        luas = Math.PI * r * r;
        keliling = 2 * Math.PI * r;
    }

    public void tampilDiagram() {
        System.out.println("\n+----------------------+");
        System.out.println("|       Lingkaran      |");
        System.out.println("+----------------------+");
        System.out.println("| - r : double         |");
        System.out.println("+----------------------+");
        System.out.println("| + setJari()          |");
        System.out.println("| + hitung()           |");
        System.out.println("+----------------------+");
    }
}

// Main
public class tugas1_nim {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

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
                p.hitung();
                System.out.println("Luas = " + p.getLuas());
                System.out.println("Keliling = " + p.getKeliling());
                p.tampilDiagram();
                break;

            case 2:
                PersegiPanjang pp = new PersegiPanjang();
                System.out.print("Panjang: ");
                double pj = input.nextDouble();
                System.out.print("Lebar: ");
                double lb = input.nextDouble();
                pp.setData(pj, lb);
                pp.hitung();
                System.out.println("Luas = " + pp.getLuas());
                System.out.println("Keliling = " + pp.getKeliling());
                pp.tampilDiagram();
                break;

            case 3:
                Segitiga s = new Segitiga();
                System.out.print("Alas: ");
                double alas = input.nextDouble();
                System.out.print("Tinggi: ");
                double tinggi = input.nextDouble();
                System.out.print("Sisi A: ");
                double a = input.nextDouble();
                System.out.print("Sisi B: ");
                double b = input.nextDouble();
                System.out.print("Sisi C: ");
                double c = input.nextDouble();
                s.setData(alas, tinggi, a, b, c);
                s.hitung();
                System.out.println("Luas = " + s.getLuas());
                System.out.println("Keliling = " + s.getKeliling());
                s.tampilDiagram();
                break;

            case 4:
                Lingkaran l = new Lingkaran();
                System.out.print("Jari-jari: ");
                l.setJari(input.nextDouble());
                l.hitung();
                System.out.println("Luas = " + l.getLuas());
                System.out.println("Keliling = " + l.getKeliling());
                l.tampilDiagram();
                break;

            default:
                System.out.println("Pilihan tidak tersedia");
        }

        input.close();
    }
}