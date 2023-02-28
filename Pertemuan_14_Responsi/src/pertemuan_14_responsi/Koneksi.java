package pertemuan_14_responsi;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class Koneksi {
    private static  Connection coneksi;
    private DefaultTableModel model; 
    
    public static Connection getkoneksi ()
    {
        if (coneksi == null)
        {
            try
            {
                String url = "jdbc:mysql://localhost:3306/Tugas_Koneksi";
                String username = "root";
                String password = "";
                
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                
                coneksi = DriverManager.getConnection(url, username, password);
            }
            catch (SQLException e)
            {
                System.out.println("Koneksi Gagal");
            }
        }
        return coneksi;
    }
    

    public void loadData()
    {
        try
        {
            //membuat koneksi
            Connection conn = Koneksi.getkoneksi();
            Statement s = conn.createStatement();
            
            //membuat query SELECT
            String sql = "SELECT * FROM PENJUALAN";
            ResultSet r = s.executeQuery(sql);
            
            //pembacaan data didalam database baris perbaris
            while(r.next())
            {
                Object [] obj = new Object[8]; //object untuk menampung data
                obj[0] = r.getString("Barang");
                obj[1] = r.getInt("Harga");
                obj[2] = r.getInt("Jumlah");
                obj[3] = r.getString("Packing");
                obj[4] = r.getString("Alamat");
                obj[5] = r.getString("Jarak");
                obj[6] = r.getInt("Ongkir");
                obj[7] = r.getInt("Total_Pesanan");
                
                
            model.addRow(obj);    // object menampilkan data
            
            
            }
            //menutup hasil penelusuran dan koneksi database
            r.close();
            s.close();
        }
        catch (SQLException e)
        {
            System.out.println("Lagi Error");
        }
    }
}