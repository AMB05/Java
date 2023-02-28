package pertemuan_9_pewarisan;

public class Lingkaran extends BangunDatar
{
    double r;
    
    @Override
    double luas(){
        double luas = Math.PI * r * r;
        System.out.println("Luas lingkaran: " + luas+"\n");
        return luas;
    }
    
    @Override
    double keliling(){
        double keliling = 2 * Math.PI * r;
        System.out.println("Keliling Lingkaran: " + keliling+"\n");
        return keliling;
    }
}
