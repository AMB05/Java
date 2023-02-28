package pertemuan_10_exception_handling;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Throw extends Pertemuan_10_Exception_Handling
{
    void trow()
    {
        try
        {
            throw new Exception("kesalahan terjadi");
        }
        catch(Exception e)
        {
            System.err.println(e);
        }
    }
}

class A
{
    void A()
    {
        try
        {
            throw new B(); 
             //cobalah hilangkan “throw” ganti dengan “new B();” saja
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}

class B extends Exception
{
    B()
    {
        System.err.println("tipe kelas B");
    }
    public String toString()
    {
        return "object dengan tipe kelas B";
    }
}

class C
{
    C()
    {
        try
        {
            lemparkanException();
        }
        catch (Exception ex)
        {
            System.err.println("Exception yang terlempar "
            + "dari blok catch ditangani di method main");
        }
    }
    
    public static void lemparkanException() throws Exception
    {
        try
        {
            System.out.println("Pernyataan try dieksekusi");
            int status = 0;
   
            System.exit(status);//Method ini akan menghentikan thread
            throw new Exception();
        }
        catch (Exception ex)
        {
            System.err.println("Exception terjadi");
            throw ex;//exception ini ditangani di method main
        }
        finally
        {
            System.err.println("Pernyataan finally dieksekusi");
        }
    }
}