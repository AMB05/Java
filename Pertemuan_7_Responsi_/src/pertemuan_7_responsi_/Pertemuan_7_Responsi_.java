package pertemuan_7_responsi_;
import java.util.Scanner;
import java.util.Arrays;

public class Pertemuan_7_Responsi_ {
        

    public static void responsi(int a)
    {
        Class_dua panggil = new Class_dua();
        
//        int a = panggil.getPesanan();
        
        String NamaPemesan[] = new String[a];
        for( int i=0; i<NamaPemesan.length; i++)
        {
            Scanner input2 = new Scanner(System.in);
            
            System.out.println("Silahkan Dengan Nama Pemesan Siapa? ");
            System.out.println("Pemesan ke " + (i+1) + " :");
            NamaPemesan[i] = input2.nextLine(); 
            System.out.println("------------------------------\n");
        
            String[] Menu = {"Huzelnut Coco ", "Chatime MilkTea", "Brown Sugar", "Hojica MilkTea"};
            double[] Harga = new double [5];
            Harga [0] = 25000; 
            Harga [1] = 23000;
            Harga [2] = 24000;
            Harga [3] = 25000;
            
            String [] ukuran = {"Large", "Reguler" };
                        
            System.out.print("Hai " + NamaPemesan[i] + " Silahkan Pilih Menu Yang Tersedia : \n");
            System.out.println("1. " + Menu [0] + "\t = \t" + Harga [0]);
            System.out.println("2. " + Menu [1] + "\t = \t" +  Harga [1]);
            System.out.println("3. " + Menu [2] + "\t\t = \t" +  Harga [2]);
            System.out.println("4. " + Menu [3] + "\t = \t" +  Harga [3]);
            System.out.println("Pilih ");
            int pilih = input2.nextInt();
            
            System.out.println("Silahkan Pilih Ukuran : ");
            System.out.println("1." + ukuran[0] + "\t\t + 5000");
            System.out.println("2." + ukuran[1] + "\t + 0");
            System.out.println("Pilih ");
            int pilih2 = input2.nextInt();
            
            panggil.setPesanan(pilih2);
            
            double harga = 0;
            if (pilih == 1)
            {
                if(panggil.getPesanan() == 1)
                {   harga = Harga[0] + 5000; }
                else if (panggil.getPesanan() == 2) 
                {   harga = Harga[0];   }
                else
                {   System.out.println("Salah Input!!!");   }
            }
            if (pilih == 2)
            {
                if(panggil.getPesanan() == 1)
                {   harga = Harga[1] + 5000;    }
                else if (panggil.getPesanan() == 2) 
                {   harga = Harga[1];   }
                else
                {   System.out.println("Salah Input!!!");   }
            }
            if (pilih == 3)
            {
                if(panggil.getPesanan() == 1)
                {   harga = Harga[2] + 5000;    }
                else if (panggil.getPesanan() == 2) 
                {   harga = Harga[2];   }
                else
                {   System.out.println("Salah Input!!!");   }
            }
            if (pilih == 4)
            {
                if(panggil.getPesanan() == 1)
                {   harga = Harga[3] + 5000;    }
                else if (panggil.getPesanan() == 2) 
                {   harga = Harga[3];   }
                else
                {   System.out.println("Salah Input!!!");   }
            }
                                 
            System.out.println("Thank you, " + NamaPemesan[i]);
            //System.out.println(Menu[pilih] + " Ukuran " + ukuran[pilih2]); 
            System.out.println("Total Pesanan Kamu : " + harga);
            System.out.println("-----------------------------------------------\n");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Class_dua panggil = new Class_dua();
        Pertemuan_7_Responsi_ panggil2 = new Pertemuan_7_Responsi_();
        int a;
         
        System.out.println("==__** Chatime **__==");
        System.out.println("---------------------------------\n");
        System.out.println("Selamat Datang di Chatime JCM : ");
        System.out.println("Berapa Orang Yang Ingin Memesan ?");
        a = input.nextInt();

//        panggil.setPesanan(a);
        panggil2.responsi(a); //panggil method        
        
    }
}
