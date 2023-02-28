package pertemuan_11_abstract_interface;
import java.util.Scanner;

public class Pertemuan_11_Abstract_Interface {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input1 = new Scanner(System.in);
        String a,b,c;
        int d;
        
        System.out.println("input nama hewan ");
        a=input.nextLine();
        System.out.println("input jumlah kaki hewan ");
        d=input.nextInt();
        System.out.println("input suara hewan ");
        b=input1.nextLine();
        System.out.println("Input warna hewan ");
        c=input1.nextLine();
        System.out.println("\n");
        
        Kucing panggil = new Kucing(a, d, b, c);
        panggil.displayData();
        
        System.out.println("\n");
        
        Gajah panggil2 = new Gajah("Gajah", 4, "Toreet toreet", "Abu-abu");
        panggil2.displayData();
        
        System.out.println("\n");
        
        Beruang panggil3 = new Beruang("Beruang", 4, "Arghhh arghhh", "Coklat");
        panggil3.displayData();
        
        System.out.println("\n");
    }
}
