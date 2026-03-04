package lat1.lat1ku.latihan4;

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
