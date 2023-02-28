package pertemuan_10_interface_ti;

public class Kelas_anak_interface implements Kelas_Interface
{
    double BIL1, BIL2;

    public double getBIL1() {
        return BIL1;
    }

    public void setBIL1(double BIL1) {
        this.BIL1 = BIL1;
    }

    public double getBIL2() {
        return BIL2;
    }

    public void setBIL2(double BIL2) {
        this.BIL2 = BIL2;
    }
    

    @Override
    public void Jumlah() {
        System.out.println("Hasil Jumlah dari Bil1 dan Bil2 = " + ( BIL1+BIL2 ));
    }

    @Override
    public void Kurang() {
        System.out.println("Hasil Jumlah dari Bil1 dan Bil2 = " + ( BIL1-BIL2 ));
    }

    @Override
    public void Kali() {
        System.out.println("Hasil Jumlah dari Bil1 dan Bil2 = " + ( BIL1*BIL2 ));
    }

    @Override
    public void Bagi() {
        System.out.println("Hasil Jumlah dari Bil1 dan Bil2 = " + ( BIL1/BIL2 ));
    }

    @Override
    public void salah() {
        throw new UnsupportedOperationException("ANDA SALAH INPUT!!!"); //To change body of generated methods, choose Tools | Templates.
    }

    
}
