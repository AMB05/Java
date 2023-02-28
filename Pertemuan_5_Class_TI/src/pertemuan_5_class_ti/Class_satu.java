package pertemuan_5_class_ti;


public class Class_satu {
    
        String nama;
        String prodi;
        
    public Class_satu(String a, String b) {
        nama = a;
        prodi= b;
    }

   
    void Class_satu()
    {
        int a = 2;
        int b = 3;
        System.out.println("hasil a * b " + a*b);
        System.out.println("hasil a + b " + a+b);
    }
    
    void Clas_dua()
    {
        System.out.println("Nama Yang di Inputkan " + nama);
        System.out.println("Prodi Yang di Inputkan " + prodi);
    }
    
}
