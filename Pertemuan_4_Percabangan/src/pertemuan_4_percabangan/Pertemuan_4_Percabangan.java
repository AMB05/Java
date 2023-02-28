package pertemuan_4_percabangan;
import java.util.Scanner;

public class Pertemuan_4_Percabangan {

    void percabangan_1()
    {
        int a=2;
        if (a==2)
        {
            System.out.println(true);
                    
        }
    }
    
    void percabangan_2()
    {
        int a=2;
        if (a==5)
        {
            System.out.println(true);
                    
        }
        else
        {
            System.out.println(false);
        }
    }
    
    void percabangan_3()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Nilai : ");
        double nilai=input.nextDouble();
        
        if(nilai>=80 && nilai<=100)
        {
            System.out.println("A"); 
        }
        else if (nilai>=70 && nilai<=79)
        {
             System.out.println("B"); 
        }
        else if (nilai>=60 && nilai<=69)
        {
             System.out.println("C"); 
        }
        else if (nilai>=50 && nilai<=59)
        {
             System.out.println("D"); 
        }
        else if (nilai>=40 && nilai<=49)
        {
            System.out.println("E"); 
        }  
        else
        {
            System.out.println("NGULANG!!!");
        }
    }
    
    void percabangan_4()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("input nilai : ");
        String nilai = input.nextLine();

        switch (nilai) 
        {
            case "A":
              System.out.println("nilai anda antara 80-100");
              break;
            case "B":
              System.out.println("nilai anda antara 70-79");
              break;
            case "C":
              System.out.println("nilai anda antara 60-69");
              break;
            case "D":
              System.out.println("nilai anda antara 50-59");
              break;
            case "E":
              System.out.println("nilai anda antara 40-49");
              break;
            default:
              System.out.println("salah input");
        }
    }
    
    public static void percabangan_5(String operator, double a, double b)
    {
        double hasil;
        switch(operator)
        {
            case "+":
                //penjumlahan
                hasil = a + b;
                System.out.println("Hasil = " + hasil);
                break;
            case "-":
                //pengurangan
                hasil = a - b;
                System.out.println("Hasil = " + hasil);
                break;
            case "*":
                //perkalian
                hasil = a * b;
                System.out.println("Hasil = " + hasil);
                break;
            case "/":
                //pembagian
                hasil = a / b;
                System.out.println("Hasil = " + hasil);
                break;
            default:
                System.out.println("operator " + operator + " tidak ditemukan");
        }
    }
    
    public static void percabangan_6(int a, int b)
    {
        if((a+b) >= (b-a))
        {
            a+= 2;
            b+= a;
            if(a % 2 == 0)
            {
                a=b;
                System.out.println("hasil = " + a);
            }
            else
            {
                b+=a+1;
                System.out.println("hasil = " + b);
            }
        }
        a = -b - a;
        System.out.println("hasil akhir = " + a);
    }
    
    void percabangan_7()
    {
        Scanner input = new Scanner(System.in);
        System.out.println("punya member ? ");
        String jawab=input.nextLine();
        if(jawab.equalsIgnoreCase("ya"))
        {
            System.out.println("Jenis member ?");
            String jawab2 = input.nextLine();
            if(jawab2.equalsIgnoreCase("gold"))
            {
                System.out.println("diskon 10%");
            }
            else if (jawab2.equalsIgnoreCase("platinum"))
            {
                System.out.println("diskon 10%");
            }
            else
            {
                System.out.println("salah input");
            }
        }
        else if (jawab.equalsIgnoreCase("tidak"))
        {
            System.out.println("Anda tidak dapat diskon");
        }
        else
        {
            System.out.println("Anda salah input");
        }
    }
    
    void percabangan_8()
    {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        int hari;
        String bln ;
        String sign="9";
        int a = 0;
        System.out.println("input tanggal lahir ");
        hari=input.nextInt();
        
        System.out.println("input bulan lahir anda : ");
        bln=input2.nextLine();
        
        System.out.println("input nama :");
        String nama =input.next();
        
        if (bln.equalsIgnoreCase("januari") ) 
        {
           if (hari < 20)
              sign = "Capricorn";
           else
              sign = "Aquarius";
        }
        else if (bln.equalsIgnoreCase("Februari")) 
        {
           if (hari < 19)
              sign = "Aquarius";
           else
              sign = "Pisces";
        }
        else if(bln.equalsIgnoreCase("Maret"))
        {
           if (hari < 21)
              sign = "Pisces";
           else
              sign = "Aries";
        }
        else if (bln.equalsIgnoreCase("April"))
        {
           if (hari < 20)
              sign = "Aries";
           else
              sign = "Taurus";
        }
        else if (bln.equalsIgnoreCase("Mei"))
        {
           if (hari < 21)
              sign = "Taurus";
           else
              sign = "Gemini";
        }
        else if(bln.equalsIgnoreCase("Juni"))
        {
           if (hari < 21)
              sign = "Gemini";
           else
              sign = "Cancer";
        }
        else if (bln.equalsIgnoreCase("Juli"))
        {
           if (hari < 23)
              sign = "Cancer";
           else
              sign = "Leo";
        }
        else if(bln.equalsIgnoreCase("Agustus"))
        {
           if (hari < 23)
              sign = "Leo";
           else
              sign = "Virgo";
        }
        else if (bln.equalsIgnoreCase("September"))
        {
           if (hari < 23)
              sign = "Virgo";
           else
              sign = "Libra";
        }
        else if (bln.equalsIgnoreCase("oktober"))
        {
           if (hari < 23)
              sign = "Libra";
           else
              sign = "Scorpio";
        }
        else if (bln.equalsIgnoreCase("November"))
        {
           if (hari < 22)
              sign = "scorpio";
           else
              sign = "Sagittarius";
        }
        else if (bln.equalsIgnoreCase("Desember"))
        {
           if (hari < 22)
              sign = "Sagittarius";
           else
              sign ="Capricorn";
        }
        System.out.println("Zodiac kamu adalah : " + sign );
    }
    
    
    public static void main(String[] args) {
        Pertemuan_4_Percabangan panggil = new Pertemuan_4_Percabangan();
        
        Scanner input = new Scanner(System.in); //objek scanner
        
        panggil.percabangan_8();
}
}
