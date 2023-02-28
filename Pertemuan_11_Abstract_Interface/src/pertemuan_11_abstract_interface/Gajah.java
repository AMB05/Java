package pertemuan_11_abstract_interface;

public class Gajah extends hewan implements Herbivora
{
    public Gajah (String nama, int Kaki, String suara, String warna)
    {
        super(nama, Kaki);
        this.Suara=suara;
        this.Warna=warna;
    }
    
    @Override
    public void display2()
    {
        System.out.println("Jenis       : " + Jenis);
        System.out.println("Makanan     : "+ Makan);
    }
    
    @Override
    public void display1()
    {
        System.out.println("Nama        : " + getNama());
        System.out.println("Jumlah Kaki : " + getKaki());
    }
    
    public void displayData()
    {
        display1();
        display2();
        System.out.println("Suara       : " + Suara);
        System.out.println("Warna Bulu  : " + Warna);
    }
}
