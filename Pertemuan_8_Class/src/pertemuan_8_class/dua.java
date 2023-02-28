package pertemuan_8_class;
import java.util.Scanner;



public class dua {
    static int jumlahSoalKu;
    static char [] kunciJawabanKu;

    public static char [][] soal()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Jumlah Mahasiswa Yang Mengikuti Ujian ? ");
        int jumlahSiswa = input.nextInt();
    
        if(jumlahSiswa<=0)
        {
            System.out.print("Skip LIBUR\n");
            System.exit(0);
        } 
        
        System.out.print("Berapa soal yang diberikan ? ");
        int jumlahSoal = input.nextInt();
        if(jumlahSoal<=0)
        {
            System.out.print("Skip Libur\n");
            System.exit(0);
        }

        jumlahSoalKu = jumlahSoal;
        char [][] jawabanSiswa  = new char [jumlahSiswa][jumlahSoal];
        System.out.println("Masukkan jawaban Mahasiswa: ");

        for (int i = 0; i < jawabanSiswa.length; i ++)
        {
            System.out.println("Mahasiswa ke -" + (i+1));
            for (int j = 0; j < jawabanSiswa[i].length; j++)
            {
                jawabanSiswa[i][j] = input.next().charAt(0);
            }
        }
        System.out.println("------------------------------------------\n");
        return jawabanSiswa;
    }
    
    public static char [] KunciJawaban()
    {
        char [] kunciJawaban = new char [jumlahSoalKu];
        kunciJawabanKu = kunciJawaban;
  
        int jumlahSoalAwal = 1;
        int i = 0;
  
        while((jumlahSoalAwal <= jumlahSoalKu) && (i < kunciJawaban.length))
        {
            Scanner input = new Scanner (System.in);
            System.out.print( "Input Jawaban yang benar No. " + (jumlahSoalAwal) + ": " );
            char jawaban = input.next().charAt(0);
            jumlahSoalAwal+=1;
            kunciJawaban[i] = jawaban;
            i+=1;
        }
        System.out.println("\n");
        return kunciJawaban;
    }
    
    public static void hitungJawabanSiswa (char [][]jawabanSiswa)
    {
        for (int i = 0; i < jawabanSiswa.length; i++)
        {
            int jumlahJawabanBenar = 0;
            for (int j = 0; j < jawabanSiswa[i].length; j++)
            {
                if(jawabanSiswa[i][j] == kunciJawabanKu[j])
                {
                    jumlahJawabanBenar++;
                }
            }
        System.out.println("Mahasiswa ke-" + (i+1) + " Jawaban Yang Benar Sebanyak " + jumlahJawabanBenar +" soal");
        }
        System.out.println("\n");
    }
}


