package pewarisan;
import java.util.Scanner;

public class Output extends enemy                               // class anak dari induk class enemy, berupa class output
{
    void hasil ()//method
    {
        Scanner cetak = new Scanner(System.in);                     //scanner
        
        System.out.println("Welcome To Game Player");           //tampilan judul program
        System.out.println("----------------------");           //spasi
        System.out.println("Input Nama / ID :");                //tampilan untuk menginputkan nama atau ID
        nama=cetak.nextLine();                                 //input dengan tipe data string untuk menampung banyak karakter
        System.out.println("Input PW");                         //tampilan untuk menginputkan PW/password
        PW=cetak.nextInt();                                     //input dengan tipe data integer untuk menampung angka
        System.out.println("Input AttackPoint (1/2/3)");        //tampilan untuk menginputkan pemilihan attack
        attackpoint=cetak.nextInt();                            //input dengan tipe data integer untuk menampung angka

        enemy A  = new enemy();                                 //pembuatan objek untuk pemanggilan class induk enemy dengan objek A
        zombie B = new zombie();                                //pembuatan objek untuk pemanggilan class anak dari induk enemy dengan objek B
        pocong C = new pocong();                                //pembuatan objek untuk pemanggilan class anak dari induk enemy dengan objek C
        Burung D = new Burung();                                //pembuatan objek untuk pemanggilan class anak dari induk enemy dengan objek D
        Merpati E = new Merpati();
        if (attackpoint==1)                                     //melakukan percabangan pada input attackpoint jika yang dipilih == 1
        {
            //tampilan yang dikeluarkan pada pilihan satu
            A.attack();                                         //pemanggilan class induk pada void attack dengan objek A
                B.walk();                                       //pemanggilan class anak zombie dari induk enemy pada void wallk dengan objek B
        }
        else if (attackpoint==2)                                    //melakukan percabangan pada input attackpoint jika yang dipilih == 2
        {
             //tampilan yang dikeluarkan pada pilihan dua
        A.attack();                                             //pemanggilan class induk pada void attack dengan objek A
        C.jump();                                               //pemanggilan class anak pocong dari induk enemy pada void jump dengan objek C
        }
        else if (attackpoint==3)                                    //melakukan percabangan pada input attackpoint jika yang dipilih == 3
        {
            System.out.println("Pilih Jenis Burung(1/2/3)");    //tampilan untuk pemilihan jenis burung untuk memilih attack
             a = cetak.nextInt();                               //input dengan tipe data integer untuk menampung angka
                if (a==1)                                       //melakukan percabangan pada input a jika yang dipilih == 1
                {
                    A.attack();                                 //pemanggilan class induk pada void attack dengan objek A
                    E.walk();                                   //pemanggilan class anak burung dari induk enemy pada void wallk dengan objek D
                }
                else if (a==2)                                  //melakukan percabangan pada input a jika yang dipilih == 2
                {
                    A.attack();                                 //pemanggilan class induk pada void attack dengan objek A
                    E.jump();                                   //pemanggilan class anak burung dari induk enemy pada void jump dengan objek D
                }
                else if(a==3)                                   //melakukan percabangan pada input a jika yang dipilih == 3
                {
                    A.attack();                                 //pemanggilan class induk pada void attack dengan objek A
                    D.fly();                                    //pemanggilan class anak burung dari induk enemy pada void fly dengan objek D
                }
                else                                            //jika percabangan tidak terdapat pilihan yang ditentukan
                {
                    System.out.println("Salah Input!");         //tampilan yang dikeluarkan jika input piliha tidak sesuai yang diminta
                }
        }
        else                                                    //jika percabangan tidak terdapat pilihan yang ditentukan
        {
            System.out.println("Salah Input!");                 //tampilan yang dikeluarkan jika input piliha tidak sesuai yang diminta
        }
    }
}
