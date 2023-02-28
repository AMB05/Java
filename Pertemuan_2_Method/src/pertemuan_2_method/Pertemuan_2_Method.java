//Method adalah tindakan atau aksi yang dapat dikerjakan oleh CLASS, 
//Method merupakan fungsi yang digunakan untuk memanipulasi nilai pada atribut
//untuk melakukan hal-hal yang dapat dilakukan objek itu sendiri.

//Method dalam C++, python, dan yang lain dikenal dengan prosedur fungsi, 
//namun dijava dikenal dengan method, Method dalam pemrograman Java adalah  
//sebuah blok program terpisah (diluar program utama) yang kita gunakan 
//untuk menyelesaikan masalah khusus, yang bertujuan agar mempermudah program 
//ketika ingin dipanggil kembali atau berulang.


// BENTUK UMUM
// modifier returnType namaMethod (Parameter List) 
//  {
//      method body
//  }

//KETERANGAN :
//modifier - Untuk menentukan hak akses terhadap method (public or private).
//returnType - jenis method (method void dan method return).
//namaMethod - Sesuai keinginan anda.
//Parameter - Bersifat opsional.


package pertemuan_2_method;
import java.io.*;
import java.util.Scanner;
        
public class Pertemuan_2_Method {
    
    //dengan return
    public static double segitiga(int alas, int tinggi)
    {
        double hasil =  (0.5*alas*tinggi);
        System.out.println("hasil = " + hasil);
        return hasil;
    }
            
    //tanpa return
    public static void input_nama(String nama)
    {
        System.out.println("Nama Kamu Adalah : " + nama);
    }
    
    
    //class utama
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int a =0 ,b=0, c=0;
        
        System.out.println("Perhitungan Segitiga");
        System.out.println("--------------------");
        System.out.println("Input Alas   = " );
        a = input.nextInt();
        System.out.println("Input Tinggi = ");
        b = input.nextInt();
         //memanggil method
        segitiga(a, b);
        
        System.out.println("-------------------\n");
        
        Scanner input2 = new Scanner(System.in);
        String nama;
        
        System.out.println("Program Input Data");
        System.out.println("------------------");
        System.out.println("Input Nama : ");
        nama=input2.nextLine();
        //memanggil method
        input_nama(nama);
       
    }
    
}
