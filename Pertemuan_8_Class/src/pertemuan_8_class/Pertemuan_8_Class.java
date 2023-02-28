package pertemuan_8_class;
import java.util.Scanner;



//class utama
public class Pertemuan_8_Class {
    
    public static void main(String[] args) {
        
       /** 
        dua panggil2 = new dua();
        char [][] jawabanUjian = panggil2.soal();
        char [] kunciJawabanUjian = panggil2.KunciJawaban();
        panggil2.hitungJawabanSiswa(jawabanUjian);
        
        System.out.println("Hasil Jawaban Mahasiswa " + java.util.Arrays.deepToString(jawabanUjian));
        for (int i = 0; i < jawabanUjian.length; i ++)
        {
            System.out.println("Mahasiswa ke -" + (i+1));
            for (int j = 0; j < jawabanUjian[i].length; j++)
            {
                System.out.println(jawabanUjian[i][j]);
            }
        }
        System.out.println("\n");
        System.out.println("Jawaban Yang Benar "  + java.util.Arrays.toString(kunciJawabanUjian));
        **/
        
        mobil panggil = new mobil();
        panggil.toyota();
        
        motor panggil2 = new motor();
        panggil2.honda();
        
        System.out.println("");
        
        toko panggil3 = new toko();
        panggil3.auto2000();
        
        toko2 panggil4 = new toko2();
        panggil4.tunasjaya();
    }
}
