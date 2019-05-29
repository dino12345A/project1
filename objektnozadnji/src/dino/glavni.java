/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dino;

/**
 *
 * @author Fzs
 */
public class glavni extends javax.swing.JFrame  {
     
 

    public  glavni() {  
      initComponents();  
    }  
      
 
    @SuppressWarnings("unchecked")  
    // <editor-fold defaultstate="collapsed" desc="Generated Code">               
    private void initComponents() {  
    
     jLabel1 = new javax.swing.JLabel();  
     prikazBtn = new javax.swing.JButton();  
     izmenaBtn = new javax.swing.JButton();  
     brisanjeBtn = new javax.swing.JButton();  
     unosBtn = new javax.swing.JButton();  
     jLabel3 = new javax.swing.JLabel();  
    
      setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);  
      setBackground(javax.swing.UIManager.getDefaults().getColor("Nb.ScrollPane.Border.color"));  
      setPreferredSize(new java.awt.Dimension(650, 400));  
      setSize(new java.awt.Dimension(650, 400));  
    
      jLabel1.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N  
      jLabel1.setForeground(new java.awt.Color(0, 80, 80));  
      jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);  
      jLabel1.setText("Zaposleni");  
    
      prikazBtn.setBackground(new java.awt.Color(0, 92, 92));  
      prikazBtn.setForeground(new java.awt.Color(255, 0, 0));  
      prikazBtn.setText("Prikaz zaposlenih");  
      prikazBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
            
        }  
      });  
    
      izmenaBtn.setBackground(new java.awt.Color(0, 92, 92));  
      izmenaBtn.setForeground(new java.awt.Color(255, 0, 0));  
      izmenaBtn.setText("Izmjena podataka");  
      izmenaBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
           
        }  
      });  
    
      brisanjeBtn.setBackground(new java.awt.Color(0, 92, 92));  
      brisanjeBtn.setForeground(new java.awt.Color(255, 0, 0));  
      brisanjeBtn.setText("Brisanje zaposlenih");  
      brisanjeBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
          
        }  
      });  
    
      unosBtn.setBackground(new java.awt.Color(0, 92, 92));  
      unosBtn.setForeground(new java.awt.Color(255, 0, 0));  
      unosBtn.setText("Unos novih zaposlenih");  
      unosBtn.addActionListener(new java.awt.event.ActionListener() {  
        public void actionPerformed(java.awt.event.ActionEvent evt) {  
           
        }  
      });  
    
       
    
      javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());  
      getContentPane().setLayout(layout);  
      layout.setHorizontalGroup(  
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
        .addGroup(layout.createSequentialGroup()  
          .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
            .addGroup(layout.createSequentialGroup()  
              .addGap(278, 278, 278)  
              .addComponent(jLabel1))  
            .addGroup(layout.createSequentialGroup()  
              .addGap(202, 202, 202)  
              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
                .addComponent(jLabel3)  
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)  
                  .addComponent(prikazBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
                  .addComponent(brisanjeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)  
                  .addComponent(unosBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)  
                  .addComponent(izmenaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))  
          .addContainerGap(207, Short.MAX_VALUE))  
      );  
      layout.setVerticalGroup(  
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)  
        .addGroup(layout.createSequentialGroup()  
          .addGap(34, 34, 34)  
          .addComponent(jLabel1)  
          .addGap(56, 56, 56)  
          .addComponent(prikazBtn)  
          .addGap(18, 18, 18)  
          .addComponent(izmenaBtn)  
          .addGap(18, 18, 18)  
          .addComponent(brisanjeBtn)  
          .addGap(18, 18, 18)  
          .addComponent(unosBtn)  
          .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)  
          .addComponent(jLabel3)  
          .addGap(45, 45, 45))  
      );  
    
      pack();  
    }// </editor-fold>              
    
                
    

    public static void main(String args[]) {  
    
      try {  
        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {  
          if ("Nimbus".equals(info.getName())) {  
            javax.swing.UIManager.setLookAndFeel(info.getClassName());  
            break;  
          }  
        }  
      } catch (ClassNotFoundException ex) {  
        java.util.logging.Logger.getLogger(glavni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
      } catch (InstantiationException ex) {  
        java.util.logging.Logger.getLogger(glavni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
      } catch (IllegalAccessException ex) {  
        java.util.logging.Logger.getLogger(glavni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
      } catch (javax.swing.UnsupportedLookAndFeelException ex) {  
        java.util.logging.Logger.getLogger(glavni.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);  
      }  
   
      java.awt.EventQueue.invokeLater(new Runnable() {  
        public void run() {  
          new glavni().setVisible(true);  
        }  
      });  
    }  
               
    private javax.swing.JButton brisanjeBtn;  
    private javax.swing.JButton izmenaBtn;  
    private javax.swing.JLabel jLabel1;  
    private javax.swing.JLabel jLabel3;  
    private javax.swing.JButton prikazBtn;  
    private javax.swing.JButton unosBtn;  
    // End of variables declaration            
  }  
