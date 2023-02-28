package pertemuan_1_ti;

import java.util.Scanner;

public class Pertemuan_1_TI 
{
  
    public static void main(String[] args) 
    {
        
       Tanpa_Scanner panggil = new Tanpa_Scanner(); //penulisan variable untuk pemanggilan Class
        
        
       Scanner input = new Scanner(System.in); //penjabaran input scanner
       
       String nama;
       
       System.out.print("Nama : "); 
       nama = input.nextLine();
       
       panggil.method_baru(); //pemanggilan method didalam class
        
    }
    
}
