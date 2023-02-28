package pewarisan_polimorfisme; //head program
import java.util.Scanner; //scanner

public class Pewarisan_polimorfisme //class.java 
{

     public static void main(String[] args) //class utama
    {
        Scanner scan = new Scanner(System.in); //scan
        String a, jwb; //tipe data string
        int ulang; //tipe data integer
        
        kelasinduk panggil = new kelasinduk(); //memanggil class induk dengan objek baru
        kelasanak panggil2 = new kelasanak(); //memanggil class anak dengan objek baru
        
        System.out.println("---Program Virus CORONA ---"); //judul program
        System.out.println("---------------------------"); //spasi
        System.out.println(""); //spasi
        System.out.println("Apakah Anda Ingin Memulai Program Ini (y/t) ?"); //tampilan unutk pertanyaan perulangan
        jwb = scan.nextLine(); //input unutk menjawab dengan tipe data string
        
        if (jwb.equalsIgnoreCase("y")) //memulai percabangan jika jwab ya
        {
            System.out.println("Berapa Kali Anda Ingin Menjalankan Program Ini ?"); //tampilan untuk menanyakan perulangan
            ulang = scan.nextInt(); //input perulangan dengan tipe data integer
            
            for (int i = 1; i <= ulang; i++) //memulai perulangan
            {
                System.out.println("Input Nama Kamu"); //tampilan input nama
                scan.next(); //scan next agar terbaca
                    a = scan.nextLine(); //input nama dengan tipe data string

                    panggil.setnama(a); // menyimpan nama pada setnama dalam class induk dengan parameter
                    
                    panggil.getnama(); // menampilkan nama dan menyimpan data tersebut
                               
                    panggil.virus(); //memanggil method virus pada class induk dengan objek baru

                    panggil2.test(); //memanggil method test pada class anak dengan objek baru

                    panggil.saran(); //memanggil method saran pada class induk dengan objek baru

                    panggil2.saran(); //memanggil method saran pada class anak dengan objek baru
                    System.out.println(""); //spasi
                    System.out.println("--------------------------------------------------"); //spasi
            }
        }
        if (jwb.equalsIgnoreCase("t")) //memulai percabangan jika jwab tidak
        {
            System.out.println("Terimakasih Telah Datang Keprogram Ini"); //tampilan hasil percabangan
            System.out.println("JANGAN LUPA CUCI TANGAN"); //tampilan hasil percabangan
        }
        
        
    }
    
}
