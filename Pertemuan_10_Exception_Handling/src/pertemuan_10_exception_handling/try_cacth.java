package pertemuan_10_exception_handling;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class try_cacth extends Pertemuan_10_Exception_Handling
{
    void exsepsi()
    {
        Scanner userInput = new Scanner(System.in);
        FileInputStream fileInput = null;
        System.out.println("nilai array ke: ");
        int index = userInput.nextInt();
        
        // exception handling (try,catch)
        System.out.println("Handling out of bound");
        try 
        {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println(e);
        }
        System.out.println("\n");
   
        
        // runtime error jika file tidak ada
        System.out.println("Handling IO not found");
        try 
        {
            fileInput = new FileInputStream("input.txt");
        } 
        catch (IOException e)
        {
            System.err.println(e);
        }
        System.out.println("\n");
        

        // menggabungkan dua exception
        System.out.println("menggabungkan dua buah exception");
        try 
        {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
            fileInput = new FileInputStream("input.txt");
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Index tidak sesuai");
        } 
        catch (IOException e)
        {
            System.err.println("file tidak ditemukan");
        }
        System.out.println("\n");
        
        //dua exsepsi
        try
        {
            int a = 1/0;
            // berpotensi untuk menimbulkan kesalahan 
            // yaitu pembagian dengan bilangan 0
            System.out.println("perintah selanjutnya");
        }
        catch(NullPointerException e)
        {
            System.err.println("error");
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.err.println("tidak sesuai");
        }
        catch(Exception e)
        {
            System.err.println("salah");
        }


        // finally

        System.out.println("Menambahkan Finally");

        try 
        {
            System.out.printf("index ke-%d, adalah %d\n", index, array[index]);
        } 
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.err.println("Index yang anda masukan tidak sesuai dengan jumlah array");
        } 
        finally 
        {
            System.out.println("finally");
        }

        //finalyy
        try
        {
            int a = 1/0;
        }
        catch (Exception e)
        {
            System.out.println("ada kesalahan yang muncul");
        }
        finally
        {
            System.out.println("terima kasih telah menjalankan program");
        }
        
        System.out.println("\nakhir dari program");
    }
}

class try_return_finally 
{
    public static String myMethod()
    {
       try 
       {
         return "Ini adalah pernyataan return dalam blok try";
         
       }
       finally 
       {
         System.err.println("Ini adalah pernyataan dalam blok finally");
         System.err.println("Pernyataan ini dieksekusi walaupun blok try "
                 + "memiliki pernyataan return");
       }
    }
    
    void try_finaly()
    {
        try 
        {
            System.out.println("Ini pernyataan di dalam blok try");          
        } 
        finally
        {
           System.err.println("Ini pernyataan di dalam blok finally");
        }
    }
}


 

