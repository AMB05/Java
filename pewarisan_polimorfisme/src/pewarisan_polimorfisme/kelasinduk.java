package pewarisan_polimorfisme; //head program
import java.util.Scanner; //scanner

public class kelasinduk  //class induk sbg parent
{
    Scanner panggil = new Scanner(System.in); //scanner
    String  a; //tipe data string yang di dapat di wariskan
      
    String getnama() //string nama 
    {
        return "Nama Kamu " + a; //menyimpan dan menampilkan nama
    }
    
    public void setnama (String a) //mengeksekusi nama dengan setnama pada parameter dan menyimpannya
    {   
        this.a=a; //menyimpan nama yang telah di inputkan pada parameter
    }
    
    void virus () //method 
    {
        String asal, jwb; //tipe data string
        int hari; //tipe data integer
        
        System.out.println("Kamu Berasal Dari Mana?"); //tampilan menanyakan asal
        asal=panggil.nextLine(); //input dengan tipe data string
        System.out.println("Apakah Kamu Ada Keluar atau Berpergian? (y/t)"); //tampilan menanyakan pergi keman dan unutk percabangan
        panggil.next();
        jwb=panggil.nextLine(); //input dengan tipe data string
        if (jwb.equalsIgnoreCase("y")) //memulai percabangan jika jawab ya
        {
            System.out.println("Berapa Hari Kamu Keluar?"); //tampilan menanyakan hari 
            panggil.next();
            hari=panggil.nextInt(); //input dengan tipe data integer
            if (hari >= 3 && hari <=7) //memulai percabangan dengan logika and
            {
                System.out.println("Anda Berstatus ODP"); //tampilan percabangan
            } 
            if (hari >= 8 && hari <= 14) //percabangan dengan logika and
            {
                System.out.println("Anda Berstatus PDP"); //tampilan percabangan
            }
            if (hari >= 15) //percabangan jika lebih dari 15
            {
                System.out.println("Anda adalah Virus CORONA -_-"); //tampilan percabangan
            }
        }
        else if (jwb.equalsIgnoreCase("t"))  //memulai percabangan jika jawab tidak
        {
            System.out.println("Tetaplah Berada di Rumah!!!!!!!!!!"); //tampilan percabangan
        }
        
    }
    
    void saran () //method saran
    {
        System.out.println(""); //spasi
        System.out.println(""); //spasi
        System.out.println("Mohon Untuk Tidak Keluar Dari Rumah!!!!!!!!!!!!!!!!!!!!!");  //tampilan method
        System.out.println("Patuhilah Agar Kamu Tidak Menjadi dan Terkena Wabah Virus CORONA ");//tampilan method
        System.out.println("Setelah Kamu Kena Virus CORONA Lalu Kamu Akan Kena Virus CONGORNA TETANGGA"); //tampilan method
        System.out.println("Yang Akan Menceritakan Kamu Ketetangga Lain Bahwa Kamu kena Virus CORONA!!!!!!!!!!!!");//tampilan method
       
    }
}
