package lat1.lat1ku.latihan4;

class Persegi extends BangunDatar {

    private double sisi;

    public void setSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public void hitung() {
        luas = sisi * sisi;       // ambil dari parent (protected)
        keliling = 4 * sisi;      // ambil dari parent
    }
}