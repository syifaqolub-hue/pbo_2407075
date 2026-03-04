package lat1.lat1ku.latihan4;

import java.util.Scanner;

// ================= PARENT =================
abstract class BangunDatar {

    protected double luas;
    protected double keliling;

    public abstract void hitung();

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }
}

// ================= PERSEGI =================
class Persegi extends BangunDatar {

    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitung() {
        luas = sisi * sisi;
        keliling = 4 * sisi;
    }
}

// ================= PERSEGI PANJANG =================
class PersegiPanjang extends BangunDatar {

    private double panjang;
    private double lebar;

    public void setData(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void hitung() {
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
    }
}

// ================= SEGITIGA =================
class Segitiga extends BangunDatar {

    private double alas;
    private double tinggi;

    public void setData(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void hitung() {
        luas = 0.5 * alas * tinggi;
        keliling = alas + tinggi + Math.sqrt((alas * alas) + (tinggi * tinggi));
    }
}

// ================= LINGKARAN =================
class Lingkaran extends BangunDatar {

    private double jari;

    public void setJari(double jari) {
        this.jari = jari;
    }

    @Override
    public void hitung() {
        luas = Math.PI * jari * jari;
        keliling = 2 * Math.PI * jari;
    }
}

// ================= MAIN =================
public class BangunDatarApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        BangunDatar bd = null;

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
                bd = p;
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
                System.out.println("Pilihan tidak ada");
        }

        if (bd != null) {
            bd.hitung();
            System.out.println("Luas = " + bd.getLuas());
            System.out.println("Keliling = " + bd.getKeliling());
        }

        input.close();
    }
}