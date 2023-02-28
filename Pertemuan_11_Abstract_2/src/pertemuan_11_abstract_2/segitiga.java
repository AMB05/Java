package pertemuan_11_abstract_2;

public class segitiga extends shape
{
    private float base;
    private float height;

    public segitiga(int base, int height) {
        this.base = base;
        this.height = height;
    }

    
    @Override
    float getArea()
    {
        return (float) (this.base*this.height/(0.5));
    }
}
