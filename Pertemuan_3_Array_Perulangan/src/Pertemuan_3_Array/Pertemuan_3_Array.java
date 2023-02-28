
package Pertemuan_3_Array;

import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;



public class Pertemuan_3_Array {
    
    // Array 
    // Bentuk Umum ada beberapa cara penulisan
    // Bentuk 1
    String [] bentuk_1;
    // Bentuk 2
    int bentuk_2 [];
    // Bentuk 3
    double[] bentuk_3 = new double[5];
    // Bentuk 4
    int [] bentuk_4 ={1,2,3,4,5};
    private Object ArrayUtils;

    void Array ()
    {
        int contoh []  = {1,2,3,4,5};
        System.out.println(contoh[3]);
        System.out.println(contoh[1]);
        
        String objek [] ={} ;
        objek[0] = "Meja";
        objek[1] = "buku";
        objek[2] = "Kertas";
        objek[3] = "Pulpen";
        objek[4] = "handphone";
    }
    
    void Array_2 ()
    {
        Scanner input =  new Scanner(System.in);
        
        String [] contoh_2 = new String[3];
        System.out.println("Input nama");
        contoh_2[0]=input.nextLine();
        System.out.println("Input prodi");
        contoh_2[1]=input.nextLine();
        System.out.println("Input stambuk");
        contoh_2[2]=input.nextLine();
        System.out.println("nama saya " + contoh_2[0]);
        System.out.println("prodi " + contoh_2[1]);
        System.out.println("stambuk " + contoh_2[2]);
    }
    
    //array 2 dimensi
    //bentuk umum
    int [][] bentuk_5 ;
    
    void Array_3 ()
    {
        String[][]huruf = {
            {"A","B","C"},
            {"D","E","F"},
            {"G","H","I"} 
        };
        //Memanggil array
        System.out.println(huruf[0][1]);
        System.out.println(huruf[2][0]);
        System.out.println(huruf[1][0]);
    }
    
    public static void Array_4(int angaka1, int angka2)
    {
        int [][] angka = {
            {angaka1, angka2},
            {4,5}
        };
    }
    
    public void Array_5()
    {
        int[][] matrix_a = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
        };
        
        int[][] matrix_b = {
                {11,12,13},
                {14,15,16},
                {17,18,19},
        };
        
    }
    
    //array 2 dimensi
    //bentuk umum
    int [][][] bentuk_6 ;
    
    void Array_6 ()
    {
        int [][][] matrix_a = {
            {
                {1,2,3},{4,5,6},{7,8,9}
            },
            {
                {11,12,13},{14,15,16},{17,18,19},{20,21,22}
            },
            {
                {31,32,33},{34,35,36}
            }
            
        };
    }
    
    void array_list()
    {
        //contoh penggunaan array dengan list
        ArrayList contoh_ = new ArrayList();
        contoh_.add("Burger");
        contoh_.add(5000);
        contoh_.add(3.12);
        contoh_.add(false);
        
        //menampilkan list
        System.out.println(contoh_);
        //menghapus isi dalam list
        contoh_.remove(false);
        //menambahkan
        contoh_.add("kentang");
        //menampilkan jumlah isi
        System.out.println(contoh_.size());
        //mengambil nilai dalam list
        System.out.println(contoh_.get(3));
    }
    
    
     
    
    
    public static void main(String[] args) {
        Pertemuan_3_Array panggil =  new Pertemuan_3_Array();
        
        panggil.array_list();
        
    }
    
}
