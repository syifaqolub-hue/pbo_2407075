package lat1.lat1ku.Polymorphism;

class Persegi extends BangunDatar {

    public Persegi(double varA) {
        super(varA);
    }

    @Override
    public double hitungLuas() {
        return getVarA() * getVarA();
    }

    @Override
    public void tampilkan() {
        System.out.println("=== Persegi ===");
        System.out.println("Sisi: " + getVarA());
        System.out.println("Luas: " + hitungLuas());
    }
}