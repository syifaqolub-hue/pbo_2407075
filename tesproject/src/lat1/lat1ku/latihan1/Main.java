// package lat1.lat1ku.latihan1;

// class cafe {
//     String nama;
//     String alamat;
// }
// public class Main {
//     public static void main(String[] args) {    
//     cafe cafe1 =new cafe();
//     cafe1.nama = "kopi kenangan";
//     cafe1.alamat = "indramayu";

//     System.out.println("nama cafe :" + cafe1.nama);
//     System.out.println("alamat di :" + cafe1.alamat);
//     System.out.println("xxxxxxxxxx");
//     }
// }

package lat1.lat1ku.latihan1;

class Cafe {
    private String nama;
    private String alamat;

    // Constructor
    public Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
        System.out.println("Nama Cafenya adalah : " + nama);
        System.out.println("Alamatnya di : " + alamat);
        System.out.println("===============================");
    }

    // Method buka
    public void buka() {
        System.out.println("===============================");
        System.out.println("Cafe buka setiap hari");
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}

public class Main {
    public static void main(String[] args) {
        Cafe cafe1 = new Cafe("Kenangan", "Indramayu");
        Cafe cafe2 = new Cafe("Kopi Tuku", "Bandung");
        Cafe cafe3 = new Cafe("Kopi Klotok", "Yogyakarta");

        // Panggil method buka
        cafe1.buka();
    }
}