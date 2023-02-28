package pertemuan_4_array_ti;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Pertemuan_4_Array_TI {
    
    void Array1()
    {
        int a [];   //array 1 dimensi
        int b [][]; //array 2 dimensi
        
        String c [] = {"Honda", "BMW", "Hyundai"}; //array yang memiliki nilai
        
        float [] arrayAngka = {11,12,13,14,15,16,17,18,19,20};
        
        double [] d = new double[5]; //array yang bernilai 5 tapi belum diiisi value
        
        char e [] ={}; //array kosong
    }
    
    void Array2 ()
    {
        Scanner input = new Scanner(System.in);
        
        String [] data1 = new String[100];
        //input array
        System.out.println("Input Data Array ke-1");
        data1[0]=input.nextLine();
        System.out.println("Input Data Array ke-2");
        data1[1]=input.nextLine();
        System.out.println("Input Data Array ke-100");
        data1[99]=input.nextLine();
        
        //output array
        System.out.println("Ini adalah data Array ke-1 " + data1[0]);
        System.out.println("Ini adalah data Array ke-2 " + data1[1]);
        System.out.println("Ini adalah data Array ke-100 " + data1[99]);
        
    }
    
    void Array_Perualangan()
    {
        Scanner input2 = new Scanner(System.in);
        
        int [] a = new int[2];
        
        for (int i = 0; i<a.length; i++ ) 
        {
            System.out.println("Input Data Array ke-" + i);
            a[i]=input2.nextInt();
        }
    }

    
    public static void main(String[] args) {
        Pertemuan_4_Array_TI panggil = new Pertemuan_4_Array_TI();
        
//        panggil.Array2();
        panggil.Array_Perualangan();
    }
    
}
