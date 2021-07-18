/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
    import com.mysql.jdbc.Driver;
    import java.sql.DriverManager;
    import java.sql.Connection;
    import java.sql.SQLException;
    import javax.swing.JOptionPane;
/**
 *
 * @author syil
 */
public class connect {
    private static Connection koneksi;
    
    public static Connection GetConnection() throws SQLException{
        try{
        if (koneksi==null){
            new Driver();
      
        koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/cahaya_permata_optical","root","");
        }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Gagal menghubungkan ke Database");
            
        }
        return koneksi;
    }
}
