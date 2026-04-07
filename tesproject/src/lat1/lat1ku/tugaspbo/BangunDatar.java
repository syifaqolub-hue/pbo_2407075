package lat1.lat1ku.tugaspbo;

public class BangunDatar {
    private int panjang;
    private int lebar;

    // Constructor
    public BangunDatar(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    // Getter
    public int getPanjang() {
        return panjang;
    }

    public int getLebar() {
        return lebar;
    }

    // Method hitung luas
    public int hitungLuas() {
        return panjang * lebar;
    }
}