package pertemuan_3_percabangan_ti;
import java.util.Scanner;

public class Pertemuan_3_Percabangan_TI {
    Scanner A = new Scanner(System.in);
    
    void Percabangan_IF()
    {
        int a = 2;
        int b = 5;
        
        if (a==2) 
        {
            System.out.println("Nilai A = 2 Adalah Benar!");
        }
    }
    
    void Percabangan_IF_Else()
    {
        int a = 2;
        int b = 5;
        
        if (a==5) 
        {
            System.out.println("Nilai A = 2 Adalah Benar!");
        }
        else
        {
            System.err.println("Nilai A = 2 Adalah Salah");
        }
    }
    
    void Percabangan_IF_Else_Nested()
    {
        String Member, Jenis_Member;
        
        System.out.println("Apakah Anda Punya Member ?");
        Member=A.nextLine();
        
        if (Member.equalsIgnoreCase("ya")) 
        {
            System.out.println("Apakah Jenis Member Anda ?");
            Jenis_Member=A.nextLine();
            
            if (Jenis_Member.equalsIgnoreCase("platinum")) 
            {
                System.out.println("Anda Mendapatkan Diskon Ongkir 100%");
            } 
            else 
                if(Jenis_Member.equalsIgnoreCase("gold"))
            {
                System.out.println("Anda Mendapatkan Diskon Ongkir 75%");
            }
            else 
                if(Jenis_Member.equalsIgnoreCase("silver"))
            {
                System.out.println("Anda Mendapatkan Diskon Ongkir 50%");
            }
            else
            {
                System.err.println("Anda SALAH INPUT!");
            }
            
        } 
        else 
        {
            System.out.println("Anda Tidak Mendapatkan Diskon");
        }
    }

    
    public static void main(String[] args) {
        
        Pertemuan_3_Percabangan_TI Y = new Pertemuan_3_Percabangan_TI();
        
        Percabangan_Switch_Case Z = new Percabangan_Switch_Case();
        
//        Y.Percabangan_IF();
//        
//        Y.Percabangan_IF_Else();

//          Y.Percabangan_IF_Else_Nested();
        
        Z.Percabangan_Switch_Case();
        
    }
    
}
