import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


public class veritabani_islemleri {

private String url = "jdbc:mysql://localhost:3306/"; 
private String veritabaniadi="kutuphane"; 
private String sunucu= "com.mysql.jdbc.Driver"; 
private String kullaniciadi="root"; 
private String sifre="";
   
  
    public com.mysql.jdbc.Connection baglanti=null; 
public com.mysql.jdbc.Statement komut=null;
public ResultSet gelenveri=null; 
public PreparedStatement psd= null;

    public veritabani_islemleri() {
        this.baglanti = null;
        this.komut = null;
        this.baglanti = null;
    }

public void baglantiac(){

  try {
       Class.forName(sunucu); 
      } catch (ClassNotFoundException ex) {
   JOptionPane.showMessageDialog(null, "Sunucu bağlanmıyor");
}
        try {
baglanti=(com.mysql.jdbc.Connection)DriverManager.getConnection(url+veritabaniadi,kullaniciadi,sifre);
} catch (SQLException ex) {
JOptionPane.showMessageDialog(null, "bağlantıda sorun var");
}

}
public void baglantikapat(){

    try {
        baglanti.close();
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "bağlantıyı kapatmada hata var");
    }
}
}

