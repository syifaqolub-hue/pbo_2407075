package lat1.lat1ku.latihan4;

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
        keliling = alas + tinggi + Math.sqrt(alas*alas + tinggi*tinggi);
    }
}
