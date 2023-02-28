package pertemuan_10_exception_handling;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Throws
{
    Throws()
    {
        try
        {
            f();
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
    public static void f() throws
        NullPointerException,ArrayIndexOutOfBoundsException
    {
        //implementasi method
        throw new NullPointerException();
        //throw new ArrayIndexOutOfBoundsException();
    }

}
