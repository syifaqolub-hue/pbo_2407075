package lat1.lat1ku.tugaspbo;

public class BangunRuang extends BangunDatar {
    private int tinggi;

    // Constructor
    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar); // ambil dari parent
        this.tinggi = tinggi;
    }

    // Method hitung volume
    public int hitungVolume() {
        return hitungLuas() * tinggi; // pakai method parent
    }
}
