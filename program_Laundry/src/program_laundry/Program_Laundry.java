
package program_laundry;
import java.util.Scanner;

public class Program_Laundry {

void Baju ()
{
    Scanner Tampil1 = new Scanner(System.in);
    int a=5000, b, harga;
    System.out.println("Harga Laundry Baju Perkilo = Rp."+a );
    System.out.println("Berapa Kilogram Yang Ingin Kamu Laundry?");
    b=Tampil1.nextInt();
    harga=a*b;
    System.out.println("Total Yang Harus Kamu Bayar = Rp."+harga);
}

void Sepatu (String sepatu)
{
     Scanner Tampil2 = new Scanner(System.in);
     int A=25000, B=40000, C=60000;
     System.out.println("Harga Laundry Untuk Satu Pasang Sepatu = Rp."+A);
     System.out.println("Harga Laundry Untuk Dua Pasang Sepatu = Rp."+B);
     System.out.println("Harga Laundry Untuk Lebih Dari Dua Pasang Sepatu = Rp."+C);
     
}
    public static void main(String[] args) {
        
    }
    
}
