package pertemuan_11_abstract_2;
import java.util.Scanner;

public class Pertemuan_11_Abstract_2 {

    public static void main(String[] args) {
        
        int a,b,c;
        Scanner input = new Scanner(System.in);
        
        System.out.println("hitung bangun datar");
        System.out.println("input Alas : ");
        a=input.nextInt();
        System.out.println("input Tinggi " );
        b=input.nextInt();
        shape segitiga = new segitiga(a, b);
        System.out.println("\n");

        // membuat objek dari class Circle
        System.out.println("Input jari-jari");
        c=input.nextInt();
        shape lingkaran = new lingkaran(c);
        
        
        System.out.println("Luas Segitiga: " + segitiga.getArea());
        System.out.println("Luas Lingkaran: " + lingkaran.getArea());
   
    }
    
}
