package pertemuan_2_contoh_method_2;


import java.io.*;
import java.util.Scanner;

class handphone
{
    String merk;
    int angka;
    double hasil;
    
}

class pertama 
{
    int a;
    double hasil;
    
    void persegi (int sisi)
    {
        this.a = sisi*sisi;
        System.out.println("Hasil = " + a);
    }
    
    void persegi_panjang()
    {
        int p,l,t;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Persegi Panjang");
        System.out.println("---------------");
        System.out.println("Input Panjang : ");
        p=input.nextInt();
        System.out.println("Input Lebar : ");
        l=input.nextInt();
        System.out.println("Input Tinggi : ");
        t=input.nextInt();
        System.out.println("----------------");
        System.out.println("Diketahui Panjang = " + p + " lebar = " + l + " tinggi = " + t );
        int hasil = p*l*t;
        System.out.println("Hasil = " + hasil + "\n" );
    }
    
    void lingkaran (double jari_jari)
    {
        this.hasil = (22/7*(jari_jari*jari_jari));
        System.out.println("Hasil = " + hasil);
    }
}

public class Pertemuan_2_contoh_method_2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        pertama panggil = new pertama();
        int a,b;
        
        System.out.println("Program Hitung Bangun");
        System.out.println("---***************---\n");
        panggil.persegi_panjang();
        
        System.out.println("Persegi");
        System.out.println("-------");
        System.out.println("Input Sisi : ");
        a=input.nextInt();
        panggil.persegi(a);
        System.out.println("---***************---\n");
        
        System.out.println("Lingkarang");
        System.out.println("----------");
        System.out.println("Input Jari-jari : ");
        b=input.nextInt();
        panggil.lingkaran(b);
    }
    
}
