
package pertemuan_3_contoh_array;

import java.util.Arrays;
import java.util.Scanner;

public class Pertemuan_3_contoh_Array {

    void Array_perulangan ()
    {
        Scanner input = new Scanner(System.in);
        String[] obejct = new String[5];
        
        for( int i = 0; i < obejct.length; i++ )
        {
            System.out.print("input object ke-" + i + ": ");
            obejct[i] = input.nextLine();
        }
        System.out.println("---------------------------");

        // menampilkan semua isi array
        for( String b : obejct )
        {
            System.out.println(b);
        }
    }
    
    void array_perulangan_2()
    {
        int[] arrayAngka = {11,12,13,14,15,16,17,18,19,20};

        // looping standard
        System.out.println("looping standard");
        for(int i = 0; i < 10; i++)
        {
            System.out.println("index ke-"+i+" adalah = " + arrayAngka[i]);
        }
        System.out.println("-----------------------------------");
        
        // looping dengan properti array
        System.out.println("looping dengan properti length");
        for(int i = 0; i < arrayAngka.length; i++)
        {
            System.out.println("index ke-"+i+" adalah = " + arrayAngka[i]);
        }
        System.out.println("-----------------------------------");
        
        // looping khususon untuk collection <- array
        System.out.println("looping for each");
        for( int angka : arrayAngka)
        {
            System.out.println("angka pada looping ini = " + angka);
        }
    }
    
    
    
    void memanggil_array_2D ()
    {
        String[][]huruf = {
            {"A","B","C"},
            {"D","E","F"},
            {"G","H","I"},        
        };

        //Menampilkan isi array dengan perulangan
        for (int i=0;i<3;i++){
            for (int j=0;j<3;j++){
                System.out.print(huruf[i][j]+" ");
            }
            System.out.println();
        }
        
        System.out.println("--------------------------------");
        
        String[][] Chatime = {
            {"BrownSugar", "HazelnutMilkTea", "MilkTea"},
            {"TaroMilkTea", "ChocolateMouse", "RedvelvetMilktea"},
            {"TiramisuMilkTea", "Pearl", "CoffeeJely#"}
        };
        
        for(int k=0; k<Chatime.length; k++){
            for(int l=0; l<Chatime[k].length; l++){
                System.out.println(Chatime[k][l]);
            }
        }
    }
    
     private static void Array2D(int[][] dataArray){
        System.out.print("{\n");
        for (int[] baris: dataArray) {
            System.out.print("{");
            for(int angka: baris){
                System.out.print(angka + ",");
            }
            System.out.print("}\n");
        }
        System.out.print("}\n");
    }
    
     void Array3D()
     {
        int [][][]data = new int[0][0][0];        
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                for(int k=0;k<3;k++){
                    System.out.println(+i+" | "+j+" | "+k);
                }
            }            
        }   
     }
     
     void memanggil_array_3D()
     {
        int [][][] angka = {
            {
                {1,2,3},{4,5,6},{7,8,9}
            },   
            {
                {10,11,12},{13,14,15},{16,17,18}
            },   
            {
                {19,20,21},{22,23,24},{25,26,27}
            }
        };  
       
        int i,j,k;  
        for ( i=0;i<3; i++){        
            for ( j=0;j<3; j++){    
                for ( k=0;k<3; k++){  
                    System.out.print(angka[i][j][k]+" "); 
                }
                System.out.println("");         
            }
            System.out.println("");         
        }
     }
     
    public static void main(String[] args) {
        Pertemuan_3_contoh_Array panggil = new Pertemuan_3_contoh_Array();
        
        panggil.memanggil_array_3D();
        
        int[][] array_ragged = {
                {1,2,3},
                {4,5,6,7},
                {8}
        };

        Array2D(array_ragged);
        
    }
    
}
