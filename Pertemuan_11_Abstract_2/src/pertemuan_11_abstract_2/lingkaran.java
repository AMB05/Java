package pertemuan_11_abstract_2;

public class lingkaran extends shape
{
    private float radius;

    public lingkaran(float radius) {
        this.radius = radius;
    }
    
    
    @Override
    float getArea() {
        return (float) (Math.PI * radius * radius);
    }
}
