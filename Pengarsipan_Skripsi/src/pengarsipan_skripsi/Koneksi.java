/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pengarsipan_skripsi;

    import java.sql.*;
    import javax.swing.JOptionPane;
/*
 *
 * @author  3411201085 Adhani Mulianti
            3411201089 Rayi Syifa Adriana Firmansyah
            3411201090 Adisti Dwi Susanti
            3411201094 Alfin Gerliandeva
 */
public class Koneksi {
    public Connection conn;
    public Koneksi(){}

    public Connection openkoneksi() throws ClassNotFoundException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String connURL = "jdbc:mysql://localhost:3306/pengarsipan_skripsi?autoReconnect=true&useSSL=false"
                    + "&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            String user = "root";
            String password = "";
            conn = DriverManager.getConnection(connURL, user, password);
            return conn;
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Tidak ada koneksi yang terbuka atau salah konfigurasi database.");
            return null;
        }
    }
    
    public void closekoneksi() throws SQLException{
        try{
            if(conn != null){
                System.out.print("Tutup Koneksi\n");
            }
        }catch(Exception ex){
        }
    }  
}
