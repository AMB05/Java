package pertemuan_9_pewarisan;
import java.util.Scanner;

public class Pertemuan_9_Pewarisan {
    

    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        double x;
        System.out.println("input sisi");
        x=a.nextDouble();
        
        //persegi
        Persegi panggil = new Persegi();
        panggil.sisi = x;
        panggil.luas();
        panggil.keliling();
        
        
        //lingkaran
        Lingkaran panggil1 = new Lingkaran();
        panggil1.r = 22;
        panggil1.luas();
        panggil1.keliling();
        
        //persegi panjang
        PersegiPanjang panggil2 = new PersegiPanjang();
        panggil2.panjang = 8;
        panggil2.lebar = 4;
        panggil2.luas();
        panggil2.keliling();
        
        //segitiga
        SegiTiga panggil3 = new SegiTiga();
        panggil3.alas = 12;
        panggil3.tinggi = 8;
        panggil3.sisia=2;
        panggil3.sisib=4;
        panggil3.sisic=6;
        panggil3.luas();
        panggil3.keliling();
    }
}
