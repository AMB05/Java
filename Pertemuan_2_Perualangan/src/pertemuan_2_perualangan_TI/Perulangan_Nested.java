package pertemuan_2_perualangan_TI;
import java.util.Scanner;


public class Perulangan_Nested {
    
    void perulangan_Nested()
    {
        Scanner x = new Scanner(System.in);
        
        int i,j;
        long nim;
        String nama,alamat;
        
        for( i=0; i<=2; i++)
        {
            System.out.println("i ke-" + i);
                                   
            for( j=0; j<=i; j++)
            {
                System.out.println("Nim : ");
                nim=x.nextLong();
                
                System.out.println("Nama : ");
                x.next();
                nama=x.nextLine();
                
                System.out.println("Alamat : ");
                alamat=x.nextLine();
            }
        }

    }
}
