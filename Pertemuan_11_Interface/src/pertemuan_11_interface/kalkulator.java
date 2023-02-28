package pertemuan_11_interface;

public  class kalkulator implements operasi
{
    private double bil1, bil2;

    public kalkulator() {
    }

    public kalkulator(double bil1, double bil2) {
        this.bil1 = bil1;
        this.bil2 = bil2;
    }

    public double getBil1() {
        return bil1;
    }

    public double getBil2() {
        return bil2;
    }
    
    @Override
    public void penjumlahan()
    {
        System.out.println("hasil = " + (bil1+bil2) );
    }
     
    @Override
     public void pengurangan()
     {
         System.out.println("hasil = " + (bil1-bil2));
     }
     
    @Override
     public void perkalian()
     {
         System.out.println("hasil = " + (bil1*bil2));
     }
     
    @Override
     public void pembagian()
     {
         System.out.println("hasil = " + (bil1/bil2));
     }

    @Override
    public int apa() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
