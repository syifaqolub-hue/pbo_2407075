// package lat1.lat1ku.latihan2;

// // ENCAPSULATION - Persegi Panjang

// class PersegiPanjang{
//     private int luas;
//     private int keliling;

//     void tampil() {
//     }

//     public int getLuas() {
//         return luas;
//     }

//     public void setLuas(int luas) {
//         this.luas = luas;
//     }

//     public int getKeliling() {
//         return keliling;
//     }

//     public void setKeliling(int keliling) {
//         this.keliling = keliling;
//     }

// }


// public class Main {
//     public static void main(String[] args) {
//         PersegiPanjang p = new PersegiPanjang();
//         p.setLuas(20);
//         p.setKeliling(25);
//         System.out.println(p.getLuas());
//         System.out.println(p.getKeliling());

//     }
// }

package lat1.lat1ku.latihan2;

// ENCAPSULATION - Persegi Panjang

class PersegiPanjang {

    // atribut (dibuat private)
    private int panjang;
    private int lebar;

    // setter panjang
    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    // getter panjang
    public int getPanjang() {
        return panjang;
    }

    // setter lebar
    public void setLebar(int lebar) {
        this.lebar = lebar;
    }

    // getter lebar
    public int getLebar() {
        return lebar;
    }

    // method tambahan (biar lebih lengkap)
    public int hitungLuas() {
        return panjang * lebar;
    }

    // method menghitung keliling
    public int hitungKeliling() {
        return 2 * (panjang + lebar);
    }
}

public class Main {

    public static void main(String[] args) {

        PersegiPanjang pp = new PersegiPanjang();

        pp.setPanjang(10);
        pp.setLebar(5);

        System.out.println("Panjang : " + pp.getPanjang());
        System.out.println("Lebar   : " + pp.getLebar());
        System.out.println("Luas    : " + pp.hitungLuas());
        System.out.println("Keliling  : " + pp.hitungKeliling());
    }
}

