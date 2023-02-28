package pertemuan_5_;
import java.util.Scanner;
import java.util.Arrays;


public class Pertemuan_5_ {
    
    void KFC()
    {
        Scanner masuk=new Scanner (System.in);
        
        System.out.print("Jumlah Menu yang dipesan : ");
        int n=masuk.nextInt();
        
        String menu [][] = new String[n][3];

        for(int i= 0; i<n; i++)
        {
            System.out.println("");
            System.out.println("Pesanan KFC ke-"+(i+1));

            for(int j=0; j<3; j++) 
            {
                if(j==0)
                {
                    System.out.println("No\t");
                }
                else if(j==1)
                {
                    System.out.println("Makanan\t\t");
                }
                else
                {
                    System.out.println("Minum\t");
                }
                
                System.out.print("");
                menu[i][j] = masuk.next();
            }
            
        }
        System.out.println("");

        System.out.println("Daftar Menu KFC yang dipesan");
        System.out.println("-----------------------------------------------");
        System.out.println("No\t\t" + "Makan\t\t" + "Minum\t");
        System.out.println("-----------------------------------------------");
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(menu[i][j]+"\t\t");
            }
        System.out.println();
        }
    }
    

    
    public static void atm()
    {
        //ambil uang, setor tunai, transfer, cek saldo, bayar tagihan
        Scanner masuk=new Scanner (System.in);
        double ATM [] = {1000000};
        
        System.out.println("Program ATM");
        System.out.println("-----------");
        System.out.println("Masukan Data Diri");
        System.out.println("Input Pin");
        int pin = masuk.nextInt();
        System.out.println("==--**menu**--==");
        System.out.println("1. Cek Saldo");
        System.out.println("2. Transfer");
        System.out.println("3. Setor Tunai");
        System.out.println("4. Pembayaran");
        System.out.println("5. Tarik Tunai");
        int pilih = masuk.nextInt();
        
        if(pilih == 1)
        {
            System.out.println(ATM);
        }
        if (pilih == 2) 
        {
            System.out.println("Transfer Kemana?");
            System.out.println("masukan no rekening");
            int norek = masuk.nextInt();
            System.out.println("Jumlah yang ditrasnfer");
            int jml = masuk.nextInt();
        }
        
        
        
        
    }
    
    public static void main(String[] args) {
        Pertemuan_5_ panggil = new Pertemuan_5_();
        
        panggil.KFC();
               
    }
   
}
