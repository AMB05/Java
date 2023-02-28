package pertemuan_11_abstract;

public class PR extends Manusia
{
    public PR(double tb)
    {
        super(tb);
    }
    
    @Override
    public final double hitung()
    {
        return (super.getTB()-100)*0.8;
    }
}
