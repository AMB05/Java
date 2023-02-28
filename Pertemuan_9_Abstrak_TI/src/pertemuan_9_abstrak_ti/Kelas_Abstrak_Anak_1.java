package pertemuan_9_abstrak_ti;

public class Kelas_Abstrak_Anak_1 extends Kelas_Abstrak_Induk
{

    @Override
    public void setLuas() {
        System.out.println("ini adalah method abstrak setluas");
    }

    @Override
    public void setKeliling() {
        System.out.println("ini adalah method abstrak setkeliling");
    }
    
}
