// // package lat1.lat1ku;

// // public class Main {

// //     public static void main(String[] args) {
// //         System.out.println("cek");
// //     }
// // } 

// package lat1.lat1ku;

// class Cafe{
//     String nama;
//     String alamat;

//     // constructor
//     Cafe (String nama, String alamat){
//         this.nama = nama;
//         this.alamat = alamat;
//         System.out.println("nama cafenya adalah : " + nama);
//         System.out.println("alamatnya di : " + alamat);
//     }

//     // method
//     void buka(){
//         System.out.println("===================");
//         System.out.println("Cafe" + nama + "Sudah Buka");
//     }

//     public String getNama() {
//         return nama;
//     }

//     public void setNama(String nama) {
//         this.nama = nama;
//     }

//     public String getAlamat() {
//         return alamat;
//     }

//     public void setAlamat(String alamat) {
//         this.alamat = alamat;
//     }

  
// }
// public class Main {
//     public static void main(String[] args) {


//         // System.out.println("=======CAFE 1=======");
//         Cafe cafe1 = new Cafe("Kenangan", "Indramayu");
//         // cafe1.nama = "Kopi Kenangan";
//         // cafe1.alamat = "Indramayu";
//         // System.out.println("Nama Cafe :" + cafe1.nama);
//         // System.out.println("Nama Cafe :" + cafe1.alamat);

       
//         // System.out.println("=======CAFE 2=======");
//         Cafe cafe2 = new Cafe("Tomoro", "Indramayu");
//         // cafe2.nama = "Kopi Tomoro";
//         // cafe2.alamat = "Indramayu";
//         // System.out.println("Nama Cafe :" + cafe2.nama);
//         // System.out.println("Nama Cafe :" + cafe2.alamat);

       

//         // System.out.println("=======CAFE 3=======");
//         Cafe cafe3 = new Cafe("Fore", "Indramayu");
//         // cafe3.nama = "Kopi Fore";
//         // cafe3.alamat = "Indramayu";
//         // System.out.println("Nama Cafe :" + cafe3.nama);
//         // System.out.println("Nama Cafe :" + cafe3.alamat);


//         Cafe Cafe2 = new Cafe("Tomoro", "Indramayu");
//         cafe3.setNama("Janji Jiwa");
//         cafe2.buka();
//     }
// }

// package lat1.lat1ku;

// import java.util.Scanner;

// class Cafe {

//     private String nama;
//     private String alamat;

//     // bahan minuman
//     private int espresso;
//     private int susu;
//     private int coklat;

//     // constructor
//     Cafe(String nama, String alamat) {
//         this.nama = nama;
//         this.alamat = alamat;
//     }

//     // setter bahan
//     public void setBahan(int espresso, int susu, int coklat) {
//         this.espresso = espresso;
//         this.susu = susu;
//         this.coklat = coklat;
//     }

//     // getter hasil minuman (pakai kondisi if else)
//     public String getMenu() {

//         if (espresso == 1 && susu == 2 && coklat == 0) {
//             return "Latte";
//         } 
//         else if (espresso == 1 && susu == 1 && coklat == 1) {
//             return "Mochaccino";
//         } 
//         else if (espresso == 1 && susu == 0 && coklat == 0) {
//             return "Espresso";
//         } 
//         else {
//             return "Menu tidak tersedia";
//         }
//     }

//     public void tampilCafe() {
//         System.out.println("Nama Cafe : " + nama);
//         System.out.println("Alamat    : " + alamat);
//     }
// }

// public class Main {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);

//         Cafe cafe1 = new Cafe("Kenangan", "Indramayu");
//         cafe1.tampilCafe();

//         System.out.println("\nMasukkan jumlah bahan:");
//         System.out.print("Jumlah Espresso : ");
//         int espresso = input.nextInt();

//         System.out.print("Jumlah Susu     : ");
//         int susu = input.nextInt();

//         System.out.print("Jumlah Coklat   : ");
//         int coklat = input.nextInt();

//         // set bahan
//         cafe1.setBahan(espresso, susu, coklat);

//         // tampil hasil menu
//         System.out.println("\nMenu yang dihasilkan: " + cafe1.getMenu());

//         input.close();
//     }
// }

package lat1.lat1ku;

import java.util.Scanner;

class Cafe {
    private String nama;
    private String alamat;
    
    // bahan minuman
    private String bahan1;
    private String bahan2;
    private String bahan3;
    
    // constructor
    Cafe(String nama, String alamat) {
        this.nama = nama;
        this.alamat = alamat;
    }
    
    // setter bahan
    public void setBahan(String bahan1, String bahan2, String bahan3) {
        this.bahan1 = bahan1;
        this.bahan2 = bahan2;
        this.bahan3 = bahan3;
    }
    
    // method untuk menentukan menu berdasarkan bahan
    public void tentukanMenu() {
        String minuman = "";
        String takaran = "";
        
        // Cek untuk Cappuccino
        if (bahan1.equalsIgnoreCase("espresso") && 
            bahan2.equalsIgnoreCase("susu") && 
            bahan3.equalsIgnoreCase("foam")) {
            minuman = "Cappuccino";
            takaran = "1 shot espresso, 2 shot susu, foam";
        }
        // Cek untuk Mocaccino
        else if (bahan1.equalsIgnoreCase("espresso") && 
                 bahan2.equalsIgnoreCase("susu") && 
                 bahan3.equalsIgnoreCase("coklat")) {
            minuman = "Mocaccino";
            takaran = "1 shot espresso, 1 shot susu, 1 shot coklat";
        }
        // Cek untuk Latte
        else if (bahan1.equalsIgnoreCase("espresso") && 
                 bahan2.equalsIgnoreCase("susu") && 
                 bahan3.equalsIgnoreCase("")) {
            minuman = "Latte";
            takaran = "1 shot espresso, 2 shot susu";
        }
        // Cek untuk Espresso
        else if (bahan1.equalsIgnoreCase("espresso") && 
                 bahan2.equalsIgnoreCase("") && 
                 bahan3.equalsIgnoreCase("")) {
            minuman = "Espresso";
            takaran = "1 shot espresso";
        }
        else {
            minuman = "Tidak tersedia";
            takaran = "Bahan tidak sesuai dengan menu apapun";
        }
        
        // Tampilkan hasil
        System.out.println("\n=== HASIL MINUMAN ===");
        System.out.println("Minuman: " + minuman);
        if (!minuman.equals("Tidak tersedia")) {
            System.out.println("Takaran: " + takaran);
        }
    }
    
    public void tampilCafe() {
        System.out.println("=== INFORMASI CAFE ===");
        System.out.println("Nama Cafe : " + nama);
        System.out.println("Alamat    : " + alamat);
    }
}

public class Main {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        // Membuat objek Cafe
        Cafe cafe1 = new Cafe("Kenangan", "Indramayu");
        cafe1.tampilCafe();
        
        System.out.println("\n=== INPUT BAHAN MINUMAN ===");
        System.out.println("(Kosongkan jika tidak menggunakan bahan tersebut)");
        
        System.out.print("Masukkan bahan 1 (contoh: espresso): ");
        String bahan1 = input.nextLine();
        
        System.out.print("Masukkan bahan 2 (contoh: susu): ");
        String bahan2 = input.nextLine();
        
        System.out.print("Masukkan bahan 3 (contoh: coklat/foam): ");
        String bahan3 = input.nextLine();
        
        // set bahan
        cafe1.setBahan(bahan1, bahan2, bahan3);
        
        // tentukan dan tampilkan menu
        cafe1.tentukanMenu();
        
        input.close();
    }
}