package pertemuan_9_pewarisan;

public class Persegi extends BangunDatar
{
    double sisi;

    @Override
    double luas(){
        double luas = sisi * sisi;
        System.out.println("Luas Persegi: " + luas +"\n");
        return luas;
    }

    @Override
    double keliling(){
        double keliling = 4 * sisi;
        System.out.println("Keliling Persegi: " + keliling+"\n");
        return keliling;
    }
}
