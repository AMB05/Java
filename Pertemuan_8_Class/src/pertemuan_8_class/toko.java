/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan_8_class;

/**
 *
 * @author WINDOWS-10
 */

class toko2
{
    motor panggil = new motor();
    toko panggil1 = new toko();
    
    void tunasjaya ()
    {
        System.out.println("Tunas Jaya menjual motor");
        panggil.honda();
        panggil1.auto2000();
    }
}

public class toko {
    mobil panggil = new mobil();
    toko2 bari = new toko2();
    void auto2000()
    {
        System.out.println("Auto2000 menjual mobil");
        panggil.toyota();
        bari.tunasjaya();
    }
    
}


