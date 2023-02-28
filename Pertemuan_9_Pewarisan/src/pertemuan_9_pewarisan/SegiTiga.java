package pertemuan_9_pewarisan;

public class SegiTiga extends BangunDatar
{
    

    @Override
    double luas() {
        double luas = 0.5 * (alas * tinggi);
        System.out.println("Luas Segitiga: " + luas+"\n");
        return luas;
    }   
    
    @Override
    double keliling() {
        double keliling = sisia + sisib + sisic;
        System.out.println("Luas Segitiga: " + keliling+"\n");
        return keliling;
    }
}
