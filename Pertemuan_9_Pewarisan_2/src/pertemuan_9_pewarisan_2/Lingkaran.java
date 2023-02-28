
package pertemuan_9_pewarisan_2;

public class Lingkaran 
{
    Lingkaran()
    {
        
    }
    Lingkaran(int a)
    {
        
    }
    // method menghitung luas dengan jari-jari
    float luas(float r){
        
        return (float) (Math.PI * r * r);
    }

    // method menghitung luas dengan diameter
    double luas(double d){
        return (double) (1/4 * Math.PI * d);
    }
}
