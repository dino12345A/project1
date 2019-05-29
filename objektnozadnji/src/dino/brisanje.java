/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dino;
import java.sql.DriverManager;    
import java.sql.PreparedStatement; 
import java.sql.Connection; 
import java.sql.SQLException; 
/**
 *
 * @author Fzs
 */
public class brisanje extends zaposleni {
    static void brisanjeId(String id) throws ClassNotFoundException {  
 Class.forName("com.mysql.jdbc.Driver");   
        
      try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/zaposleniDB","root","");) {  
        PreparedStatement st = conn.prepareStatement("delete from zaposleni where zaposleni_id=?");  
      
        st.setString(1, id);  
        st.execute();   
              
      } catch (SQLException e) {  
          
      }  
        
    }  
      
    static void brisanjeIme(String ime) throws ClassNotFoundException {  
      Class.forName("com.mysql.jdbc.Driver");   
        
      try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/zaposleniDB","root","");) {  
        PreparedStatement st = conn.prepareStatement("delete from zaposleni where ime=?");  
      
        st.setString(1, ime);  
        st.execute();   
              
      } catch (SQLException e) {  
        System.out.println("GRESKA! " + e.getMessage());  
      }  
        
    }  
      
    static void brisanjegodine(String godina) throws ClassNotFoundException {  
      Class.forName("com.mysql.jdbc.Driver");   
        
      try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/zaposleniDB","root","");) {  
        PreparedStatement st = conn.prepareStatement("delete from zaposleni where godine=?");  
      
        st.setString(1, godina);  
        st.execute();   
              
      } catch (SQLException e) {  
        System.out.println("GRESKA! " + e.getMessage());  
      }  
        
    }  
      
    static void brisanjeadresa(String adresa) throws ClassNotFoundException {  
      Class.forName("com.mysql.jdbc.Driver");   
        
      try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/zaposleniDB","root","");) {  
        PreparedStatement st = conn.prepareStatement("delete from zaposleni where adresa=?");  
      
       st.setString(1, adresa);  
        st.execute();   
              
      } catch (SQLException e) {  
        System.out.println("GRESKA! " + e.getMessage());  
      }  
        
    }  
      
    static void brisanjeprimanja(String primanja) throws ClassNotFoundException {  
      Class.forName("com.mysql.jdbc.Driver");   
        
      try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/zaposleniDB","root","");) {  
        PreparedStatement st = conn.prepareStatement("delete from zaposleni where dohodak=?");  
      
        st.setString(1, primanja);  
        st.execute();   
              
      } catch (SQLException e) {  
        System.out.println("GRESKA! " + e.getMessage());  
      }  
    
    }
}
