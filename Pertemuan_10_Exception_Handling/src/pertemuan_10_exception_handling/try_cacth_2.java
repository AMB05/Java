package pertemuan_10_exception_handling;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class try_cacth_2 extends Pertemuan_10_Exception_Handling
{
    
    private static int ambilData(int[] array, int index) throws Exception 
    {
        int hasil = array[index];
        return hasil;
    }
     
    private static int ambilDataDariArray(int[] array, int index)
    {
        int hasil = 0;

        try 
        {
            hasil = array[index];
        } 
        catch (Exception e)
        {
            System.err.println(e);
        }

        return hasil;
    }
    
    void eksepsi2()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.print("data ke-:");
        int indexInput = userInput.nextInt();

        // Exception biasa
        System.out.println("Exception biasa");
        try 
        {
            System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, arrayData[indexInput]);
        } 
        catch (Exception e){
            System.err.println(e);
        }

        // Exception didalam fungsi
        System.out.println("\nException dalam fungsi");
        int data = ambilDataDariArray(arrayData, indexInput);
        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data);

        // Exception throws by method
        System.out.println("Exception throws by method");
        int data2 = 0;

        try
        {
            data2 = ambilData(arrayData, indexInput);
        } 
        catch (Exception e) {
            System.err.println(e);
        }

        System.out.printf("data dari array ke-%d adalah %d\n\n", indexInput, data2);
        System.out.println("\n\nakhir dari program");
    }
}

