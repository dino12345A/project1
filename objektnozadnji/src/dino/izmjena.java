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
public class izmjena extends zaposleni {
    static void izmjenaimena(String id, String ime) throws ClassNotFoundException {  
    Class.forName("com.mysql.jdbc.Driver");   
        
     try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/zaposleniDB","root","");) {  
        PreparedStatement st = conn.prepareStatement("update zaposleni set ime=? where zaposleni_id=?");  
        st.setString(1, ime);  
        st.setString(2, id);  
        st.execute();   
              
      } catch (SQLException e) {  
        
      }  
        
    }  
      
    static void izmenagodina(String id, String godina) throws ClassNotFoundException {  
      Class.forName("com.mysql.jdbc.Driver");   
        
      try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/zaposleniDB","root","");) {  
        PreparedStatement st = conn.prepareStatement("update zaposleni set godina=? where zaposleni_id=?");  
        st.setString(1, godina);  
        st.setString(2, id);  
        st.execute();   
              
      } catch (SQLException e) {  
        
      }  
        
    }  
      
    static void izmenaAdrese(String id, String adresa) throws ClassNotFoundException {  
      Class.forName("com.mysql.jdbc.Driver");   
        
      try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/zaposleniDB","root","");) {  
        PreparedStatement st = conn.prepareStatement("update zaposleni set adresa=? where zaposleni_id=?");  
        st.setString(1, adresa);  
        st.setString(2, id);  
        st.execute();   
              
      } catch (SQLException e) {  
          
      }  
       
    }  
      
    static void izmjenaprimanja(String id, String primanja) throws ClassNotFoundException {  
      Class.forName("com.mysql.jdbc.Driver");   
        
      try( Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/zaposleniDB","root","");) {  
        PreparedStatement st = conn.prepareStatement("update zaposleni set primanja=? where zaposleni_id=?");  
        st.setString(1, primanja);  
        st.setString(2, id);  
        st.execute();   
              
      } catch (SQLException e) {  
        System.out.println("greska " + e.getMessage());  
      }  
        
    }  
      
    
}
