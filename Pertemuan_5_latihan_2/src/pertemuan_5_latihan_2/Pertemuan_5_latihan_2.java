package pertemuan_5_latihan_2;

import java.util.Scanner;
import java.util.Arrays;

public class Pertemuan_5_latihan_2 {
    
    void latihan()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Program Mencari Bilangan");
        System.out.println("------------------------\n");
        System.out.println("Input banyak Bilangan yang mau dimasukan :" );
        int a=input.nextInt();
        for(int i=0; i<a; i++)
        {
            System.out.println("Input Bilangan : ");
            a=input.nextInt();
            if(a%2==0)
            {
                if(a>=0)
                {
                    int genap_positif[]=new int[a];
                }
                else
                {
                    int genap_negatif[]=new int[a];
                }
            }
            else if(a%2!=0)
            {
                if(a>=0)
                {
                    int ganjil_positif[]=new int[a];
                }
                else
                {
                    int ganjil_negatif[]=new int[a];
                }
            }
        }
        System.out.println("");
        System.out.println("Daftar Bilangan");
        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("Genap Positif\t" + "Genap Negatif\t" + "Ganjil Positif\t" + "Ganjil Negatif\t");
        System.out.println("-----------------------------------------------------------------------------");
        for(int i=0;i<a;i++)
        {
            System.out.println(a);
        }
    }
    
    void latihan_2 ()
    {
        Scanner input=new Scanner(System.in);

        System.out.print("Masukan Jumlah Mahasiswa : ");
        int n=input.nextInt();

        String nama[]=new String[n];
        String status[]=new String[n];
        int nilai[]=new int[n];

        for (int i=0;i<n;i++){
             System.out.println("Mahasiswa Ke : "+(i+1));
            System.out.print("Nama : ");
            nama[i]=input.next();

            System.out.print("Nilai : ");
            nilai[i]=input.nextInt();

            if (nilai[i]<=50) {
                    status[i]="Tidak Lulus";
                } else {
                    status[i]="Lulus";
                }
        }
        System.out.println("DAFTAR NILAI MAHASISWA");
        System.out.println("======================");
        System.out.println("No   Nama   Nilai   Status  ");

        for (int i=0; i<n;i++) {
            System.out.println((i+1)+"    "+nama[i]+"     "+nilai[i]+"       "+status[i]);
        }
    }
    
    public static void main(String[] args) {
        Pertemuan_5_latihan_2 panggil = new Pertemuan_5_latihan_2();
        
        panggil.latihan();
    }
    
}
