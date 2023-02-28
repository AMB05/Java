package pertemuan_2_perualangan_TI;
import java.util.Scanner;

public class Pertemuan_2_Perualangan_TI {
    
    //for
    void ulang ()
    {
        int i;
        for (i=0; i<=10; i++)
        {
            System.out.println("ulang ke-" + i);
        }
        
    }
    
    //for
    void perulangan_for()
    {
        int i;
        for (i=17; i>=12; i--)
        {
            System.out.println("Ulang ke-" + i);
        }
    }
    
    //while
    void ulang_2 ()
    {
        
        int i =0;
        while ( i <= 10 )
        {
            System.out.println("ulang ke-" + i);

            i++;
        }

    }
    
    //do-while
    void ulang_3 ()
    {
        int i=11;
        do {
            System.out.println("ulang ke-" + i);
            i++;
        } while ( i <= 10);

    }

 
    public static void main(String[] args) {
        
        Pertemuan_2_Perualangan_TI panggil = new Pertemuan_2_Perualangan_TI();
        Perulangan_Nested panggil2 = new Perulangan_Nested();
        
//        panggil.ulang();
//        System.out.println("");
//        
//        panggil.perulangan_for();
//        System.out.println("");
//        
        panggil2.perulangan_Nested();
        
//        panggil.ulang_2();
//        System.out.println("");
//        
//        panggil.ulang_3();
    }
    
}
