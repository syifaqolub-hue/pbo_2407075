// package lat1.lat1ku.latihan4;

// public class persegipanjang extends BangunDatarApp {

//     public double luaspersegipanjang()(
//         return getpanjang
//     )
    
// }

package lat1.lat1ku.latihan4;

class PersegiPanjang extends BangunDatar {

    private double panjang;
    private double lebar;

    public void setData(double panjang, double lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void hitung() {
        luas = panjang * lebar;
        keliling = 2 * (panjang + lebar);
    }
}