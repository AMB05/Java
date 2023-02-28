package pertemuan_10_interface_ti;
import java.util.Scanner;

public class Pertemuan_10_Interface_TI {

    
    public static void main(String[] args) {
        double a,b; 
        Scanner input = new Scanner(System.in);
        
        Kelas_anak_interface panggil = new Kelas_anak_interface();
        
        System.out.println("Program Kalkulator");
        System.out.println("------------------\n");
        System.out.println("Input Bilangan ke-1 ");
        a=input.nextDouble();
        System.out.println("Input Bilangan ke-2 ");
        b=input.nextDouble();
        
        panggil.setBIL1(a);
        panggil.setBIL2(b);
        
        System.out.println("-------------------\n");
        panggil.Jumlah();
        System.out.println("\n");
        panggil.Kurang();
        System.out.println("\n");
        panggil.Kali();
        System.out.println("\n");
        panggil.Bagi();
        System.out.println("\n");
    }
    
}
