package pertemuan_11_abstract;

public class LK extends Manusia
{
    public LK(double tb) 
    {
        super(tb);
    }

      
    @Override
    public double hitung()
    {
        return (super.getTB()-100)*0.9;
    }
}
