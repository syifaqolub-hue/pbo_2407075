package lat1.lat1ku.tugaspbo;

public class Main {
    public static void main(String[] args) {

        int panjang = 10;
        int lebar = 5;
        int tinggi = 4;

        BangunRuang br = new BangunRuang(panjang, lebar, tinggi);

        System.out.println("Luas Alas = " + br.hitungLuas());
        System.out.println("Volume = " + br.hitungVolume());
    }
}
