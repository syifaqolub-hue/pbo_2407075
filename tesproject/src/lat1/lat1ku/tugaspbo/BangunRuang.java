package lat1.lat1ku.tugaspbo;

public class BangunRuang extends BangunDatar {
    private int tinggi;

    public BangunRuang(int panjang, int lebar, int tinggi) {
        super(panjang, lebar);
        this.tinggi = tinggi;
    }

    public int hitungVolume() {
        return hitungLuas() * tinggi;
    }
}