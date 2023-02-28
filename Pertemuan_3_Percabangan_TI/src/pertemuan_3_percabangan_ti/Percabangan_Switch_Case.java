package pertemuan_3_percabangan_ti;
import java.util.Scanner;

public class Percabangan_Switch_Case 
{
    Scanner B = new Scanner(System.in);
    
    void Percabangan_Switch_Case()
    {
        float Hasil, bil1, bil2;
        String operator;
        System.out.println("Input Operator");
        operator = B.nextLine();
        
        System.out.print("Input Bilangan Pertama : ");
        bil1 = B.nextFloat();
        System.out.print("Input Bilangan Kedua : ");
        bil2 = B.nextFloat();
        
        switch (operator)
        {
            case "+" :
                Hasil = bil1 + bil2;
                System.out.println("Hasil Penjumlahan Bilangan Pertama dan Kedua adalah "
                                    + Hasil );
                break;
                
            case "-" :
                Hasil = bil1 - bil2;
                System.out.println("Hasil Pengurangan Bilangan Pertama dan Kedua adalah " 
                                    + Hasil);
                break;
                
            case "*" :
                Hasil = bil1 * bil2;
                System.out.println("Hasil Perkalian Bilangan Pertama dan Kedua adalah "
                                    + Hasil );
                break;
                
            case "/" :
                Hasil = bil1 / bil2;
                System.out.println("Hasil Pembagian Bilangan Pertama dan Kedua adalah " 
                                    + Hasil);
                break;
                
            case "%" :
                Hasil = bil1 % bil2;
                System.out.println("Hasil Sisa Pembagian Bilangan Pertama dan Kedua adalah " 
                                    + Hasil);
                break;
            
             default:
                System.err.println("Operator Yang di Inputkan Tidak Sesuai");
        }
        
        
            
                
        
    }
}
