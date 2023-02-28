package pertemuan_11_abstract_interface;

public abstract class hewan 
{
    protected String Nama;
    protected int Kaki;
    
    public String Suara;
    public String Warna;
    
    public hewan(String nama, int kaki)
    {
        this.Nama=nama;
        this.Kaki=kaki;
    }
    
    public void setNama(String nama)
    {
        this.Nama=nama;
    }
    public String getNama()
    {
        return Nama;
    }
    
    public void setKaki(int kaki)
    {
        this.Kaki=kaki;
    }
    public int getKaki()
    {
        return Kaki;
    }
    
    
    public void display1()
    {
        System.out.println("Nama: " + getNama());
        System.out.println("Jumlah Kaki: " + getKaki());
    }
}
