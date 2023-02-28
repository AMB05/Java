
package pertemuan_3_contoh;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class Pertemuan_3_contoh {

    void contoh ()
    {
        int contoh []  = {1,2,3,4,5};
        
        String [] bentuk_1;
        // Bentuk 2
        int bentuk_2 [];
        // Bentuk 3
        double[] bentuk_3 = new double[5];
        
        System.out.println(contoh[0]);
        System.out.println(contoh[4]);
    }
    
    void Array_2 ()
    {
        Scanner input =  new Scanner(System.in);
        String [] contoh_2 = new String[3];
        int [] contoh_3 = new int[4];
        System.out.println("Input nama");
        contoh_2[0]=input.nextLine();
        System.out.println("Input prodi");
        contoh_2[1]=input.nextLine();
        System.out.println("Input stambuk");
        contoh_2[2]=input.nextLine();
        System.out.println("-------------------\n");
        System.out.println("Input nilai ");
        contoh_3[3]=input.nextInt();
        System.out.println("input nilai");
        contoh_3[0]=input.nextInt();
        System.out.println("input nilai");
        contoh_3[2]=input.nextInt();
        System.out.println("input nilai");
        contoh_3[1]=input.nextInt();
        System.out.println("nama saya \t" + contoh_2[1]);
        System.out.println("prodi \t\t" + contoh_2[0]);
        System.out.println("stambuk \t" + contoh_2[2]);
        System.out.println("-------------------\n");
        System.out.println("ini adalah nilai array " + contoh_3[2]);
        System.out.println("ini adalah nilai array " + contoh_3[0]);
        System.out.println("ini adalah nilai array " + contoh_3[1]);
        System.out.println("ini adalah nilai array " + contoh_3[3]);
    }
    
    void Array_2D()
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
        System.out.println(huruf[2][2]);
        System.out.println(huruf[1][1]);
    }
    
    public static void Array_4(int angaka1, int angka2, int angka3, int angka4)
    {
        int [][] angka = {
            {angaka1, angka2},
            {angka3,angka4}
        };
        
        System.out.println("ini adalah nilai dari [1][1]" + angka[1][1]);
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
        
        System.out.println(contoh_);
        //menambahkan
        contoh_.add("kentang");
        
        System.out.println(contoh_);
        //menampilkan jumlah isi
        System.out.println(contoh_.size());
        //mengambil nilai dalam list
        System.out.println(contoh_.get(3));
    }
    
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
            {"TiramisuMilkTea", "Pearl", "CoffeeJely"}
        };
        
        for(int k=0; k<Chatime.length; k++){
            for(int l=0; l<Chatime[k].length; l++){
                System.out.println(Chatime[k][l] + " ");
            }
        }
    }
    
    private static void Array2D(int[][] dataArray)
     {
        System.out.print(" \n");
        for (int[] baris: dataArray) {
            System.out.print(" ");
            for(int angka: baris){
                System.out.print(angka + ",");
            }
            System.out.print(" \n");
        }
        System.out.print(" \n");
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
    
    
    
    
    public static void main(String[] args) {
        
        Pertemuan_3_contoh panggil = new Pertemuan_3_contoh();
        Scanner input = new Scanner(System.in);
               
        panggil.Array3D();
        
        System.out.println("-------------------------");
        int[][] baru = {
                {1,2,3},
                {4,5,6,7},
                {8}
        };
        Array2D(baru);
    }
    
}
