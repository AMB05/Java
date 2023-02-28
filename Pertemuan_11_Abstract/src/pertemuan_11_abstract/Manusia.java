package pertemuan_11_abstract;


public abstract class Manusia 
{
    private double TB;
    
    public Manusia(double tb)
    {
        TB=tb;
    }
    public double getTB()
    {
        return TB;
    }
    
    public abstract double hitung(); 
    
}



 