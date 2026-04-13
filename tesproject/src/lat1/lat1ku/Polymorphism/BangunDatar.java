package lat1.lat1ku.Polymorphism;

class BangunDatar {
    private double varA;
    private double varB;

    // Constructor 2 parameter
    public BangunDatar(double varA, double varB) {
        this.varA = varA;
        this.varB = varB;
    }

    // Constructor 1 parameter
    public BangunDatar(double varA) {
        this.varA = varA;
        this.varB = 0;
    }

    // Getter
    public double getVarA() {
        return varA;
    }

    public double getVarB() {
        return varB;
    }

    // Method default
    public double hitungLuas() {
        return 0;
    }

    public void tampilkan() {
        System.out.println("Nilai A: " + varA);
        System.out.println("Nilai B: " + varB);
        System.out.println("Luas: " + hitungLuas());
    }
}