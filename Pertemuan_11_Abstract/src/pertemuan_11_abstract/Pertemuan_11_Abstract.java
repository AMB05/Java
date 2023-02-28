package pertemuan_11_abstract;
import java.util.Scanner;

public class Pertemuan_11_Abstract {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        int a = 0;
        int b;
        double tinggi;
        String gender;
        Manusia[] m = new Manusia[a];
        
        System.out.println("Berapa kali program ingin berjalan ?");
        b=input.nextInt();
        
        for (int i=0; i<=b; i++) 
        {            
            System.out.println("User " + (a+1));
            System.out.println("Input Tinggi Badan (cm) = ");
            tinggi=input.nextDouble();
            System.out.println("Input Jenis Kelamin (L/P) = ");
            gender=input.nextLine();
            
            if(gender.equalsIgnoreCase("L"))
            {
                m[a]=new LK(tinggi);
                System.out.println("Berat Badan Ideal Anda Seharusnya ialah = "
                        + m[a].hitung() + "\n");
            }
            else if (gender.equalsIgnoreCase("P"))
            {
                m[a]=new PR(tinggi);
                System.out.println("Berat Badan Ideal Anda Seharusnya ialah = "
                        + m[a].hitung() + "\n");
            }
            else
            {
                System.out.println("Salah Input");
            }
            a++;
        } 
        while (a<b);
    }
    
}
