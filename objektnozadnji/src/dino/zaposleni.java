/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dino; 
import java.sql.DriverManager;  
import java.sql.Statement;
import java.sql.ResultSet;  
import java.sql.PreparedStatement; 
import java.sql.Connection; 
import java.sql.SQLException;  


/**
 *
 * @author Fzs
 */
public class zaposleni {
    private int id;
    private int godina;
    private int primanja;
    private String ime;
    private String adresa;
    
    
     public int getId() {  
     return id;  
    }  
    public String getIme() {  
      return ime;  
    }  
    public int getGodina() {  
      return godina;  
    }  
    public String getAdresa() {  
      return adresa;  
    }  
    public int getPrimanja() {  
      return primanja;  
    }  
    public void setId( int id ) {  
      this.id = id;  
    }  
    public void setIme( String ime ) {  
      this.ime = ime;  
    }  
    public void setGodina( int godina ) {  
      this.godina = godina;  
   }  
    public void setAdresa( String adresa ) {  
      this.adresa = adresa;  
    }  
    public void setPrimanja( int primanja ) {  
      this.primanja = primanja;  
    }
    
public zaposleni(){}  
public zaposleni(int id, String ime, int godine, String adresa, int dohodak) {  
this.id = id;  
this.ime = ime;  
this.godina = godina;  
this.adresa = adresa;  
this.primanja = primanja;  
}  
}