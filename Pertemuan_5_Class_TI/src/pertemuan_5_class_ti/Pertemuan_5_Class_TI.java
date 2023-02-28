package pertemuan_5_class_ti;
import java.util.Scanner;


public class Pertemuan_5_Class_TI {

       
    public static void main(String[] args) {
        
        Scanner Input = new Scanner(System.in);
        
        for (int i = 0; i < 2; i++) 
        {
            
            String x, y;
            System.out.println("Input Nama");
            x=Input.nextLine();
            System.out.println("Input Prodi");
            y=Input.nextLine();
        
            
            Class_satu panggil = new Class_satu(x, y);
            
        
            System.out.println("");
            panggil.Class_satu();
            System.out.println("");
            panggil.Clas_dua();
            
            System.out.println("");
        }
    }
    
}
