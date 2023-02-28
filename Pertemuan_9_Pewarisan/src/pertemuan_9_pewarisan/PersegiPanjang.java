package pertemuan_9_pewarisan;

public class PersegiPanjang extends BangunDatar
{
    double panjang;
    double lebar;
    
    @Override
    double luas(){
        double luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang:" + luas+"\n");
        return luas;
    }
    
    @Override
    double keliling(){
        double kll = 2*panjang + 2*lebar;
        System.out.println("Keliling Persegi Panjang: " + kll+"\n");
        return kll;
    }
}
