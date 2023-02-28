package pertemuan_11_interface;
import java.util.Scanner;

public class Pertemuan_11_Interface {

    public static void main(String[] args) {
        
        double a,b; 
        Scanner input = new Scanner(System.in);
        
        kalkulator panggil = new kalkulator();
        
        System.out.println("Program Kalkulator");
        System.out.println("------------------\n");
        System.out.println("Input Bilangan ke-1 ");
        a=input.nextDouble();
        System.out.println("Input Bilangan ke-2 ");
        b=input.nextDouble();
        
        panggil = new kalkulator(a, b);
        
        System.out.println("-------------------\n");
        System.out.println("hasil penjumlahan " );
        panggil.penjumlahan();
        System.out.println("\n");
        System.out.println("hasil pengurangan" );
        panggil.pengurangan();
        System.out.println("\n");
        System.out.println("hasil perkalian" );
        panggil.perkalian();
        System.out.println("\n");
        System.out.println("hasil pembagian" );
        panggil.pembagian();
        System.out.println("\n");
    }
    
}
