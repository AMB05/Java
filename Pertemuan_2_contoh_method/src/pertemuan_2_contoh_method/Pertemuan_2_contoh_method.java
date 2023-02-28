package pertemuan_2_contoh_method;

import java.util.Scanner;
import java.io.*;

public class Pertemuan_2_contoh_method {
    
    //method static tanpa parameter
    public static void header ()
    {
        System.out.println("Program Input Data Mahasiswa");
        System.out.println("----------------------------");
    }
    
    //method dengan static dengan parameter
    static void data (String nama, String t4_lahir, String tgl_lahir, String asal)
    {
        System.out.println("Nama kamu adalah " + nama );
        System.out.println("Tempat lahir kamu " + t4_lahir );
        System.out.println("Tanggal lahir kamu " + tgl_lahir );
        System.out.println("Asal Kamu dari " + asal );
    }
    
    //dengan nilai balik
    public static String prodi (String Prodi)
    {
        System.out.println("Prodi kamu adalah " + Prodi);
        return Prodi;
    }
    
    //dengan nilai balik
    public static double ipk (double ipk)
    {
        System.out.println("Ipk kamu adalah = " + ipk);
        return ipk;
    }
        
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String a,b,c,d,e;
        double f;
        
        //memanggil method
        header();
        System.out.println("Input nama : ");
        a=input.nextLine();
        System.out.println("Input tempat lahir : ");
        b=input.nextLine();
        System.out.println("Input Tanggal lahir :" );
        c=input.nextLine();
        System.out.println("Input Asal : ");
        d=input.nextLine();
        System.out.println("Input Prodi : ");
        e=input.nextLine();
        System.out.println("Input IPK : ");
        f=input.nextDouble();
        
        //memanggil method
        data(a, b, c, d);
        //memanggil method
        prodi(e);
        //memanggil method
        ipk(f);
    }
    
}
