/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clink;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import javax.swing.UIManager;

/**
 *
 * @author ANSELMO
 */
public class Splash extends javax.swing.JFrame {

    private Timer timer;    
    private static int counter = 0;
    
    public Splash() {
        super("Clink");
       
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                int result = JOptionPane.showConfirmDialog(null, "Do you want to Exit ?", "Exit Confirmation : ",
                        JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else if (result == JOptionPane.NO_OPTION) {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
        setUndecorated(true);
       
        pack();
        java.awt.Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        setSize(width / 3, height / 4);
        

        // here's the part where i center the jframe on screen
        setLocationRelativeTo(null);
        setVisible(true);
        initComponents();
        try {
            load();
        } catch (IOException ex) {
            Logger.getLogger(Splash.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
            // function to increase progress 
    public void load() throws IOException 
    { 
        final String message=null;
        //String message2=null;
        //File file = new File("/home/alvo/Desktop/clink.txt");
        File filterFile = new File("sare_hizo.txt");
        File file = new File("clink.txt");
        
                    if (file.createNewFile() || filterFile.createNewFile()) {
                        try {
                            FileWriter myWriter = new FileWriter("clink.txt");
                            
                            myWriter.write("None, 30, All");
                             myWriter.close();
                             
                             FileWriter myWriter1 = new FileWriter("sare_hizo.txt");
                             myWriter1.write("None");
                             myWriter1.close();
                             
                             loadingProgress.setMinimum(0);
                             loadingProgress.setMaximum(30);
       
        
                             timer = new Timer(30, (e) -> {
                             loadingProgress.setValue(counter);
                             counter++;
                                 if(counter == 10){
                                    loadingText.setText("checking files");
                                 }else if(counter == 15){
                                    loadingText.setText("writing config files...");
                                 }else if(counter == 25){
                                    loadingText.setText("Starting Program...");
                                 }else if(counter > 30){
                                     timer.stop();
                                     this.dispose();
                                     new clinkLogin().setVisible(true);
                                 }
                            });
                            timer.start();
                            
                         } catch (IOException ioe) {
                             JOptionPane.showMessageDialog(null, "ERROR! config file error 101,contact support");
                            this.dispose();
                        }
                        
                        //message="";
                    } else {
                        loadingProgress.setMinimum(0);
                        loadingProgress.setMaximum(30);
       
        
                        timer = new Timer(30, (e) -> {
                        loadingProgress.setValue(counter);
                        counter++;
                        if(counter == 10){
                            loadingText.setText("checking files");
                        }else if(counter == 15){
                            loadingText.setText("all files set...");
                        }else if(counter == 25){
                            loadingText.setText("Starting Program...");
                        }else if(counter > 30){
                            timer.stop();
                            this.dispose();
                            new clinkLogin().setVisible(true);
                        }
                        });
                            timer.start();
                        
                    }      
                
        
    } 


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loadingText = new javax.swing.JLabel();
        loadingProgress = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(45, 45, 45));
        setMaximumSize(new java.awt.Dimension(2147483, 2147483));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(19, 28, 59));
        jPanel1.setForeground(new java.awt.Color(19, 28, 59));

        loadingText.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        loadingText.setForeground(new java.awt.Color(244, 244, 244));
        loadingText.setText("Loading...");

        loadingProgress.setForeground(new java.awt.Color(60, 63, 65));
        loadingProgress.setBorder(null);
        loadingProgress.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(loadingText, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(loadingProgress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(loadingText, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loadingProgress, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        ImageIcon icon = new ImageIcon("icon.png");
        setIconImage(icon.getImage());
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
  try {
    for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
      if ("Nimbus".equals(info.getName())) {
          javax.swing.UIManager.setLookAndFeel(info.getClassName());
          break;
      }
    }
  } catch (ClassNotFoundException e) {
    e.printStackTrace();
  } catch (InstantiationException e) {
    e.printStackTrace();
  } catch (IllegalAccessException e) {
    e.printStackTrace();
  } catch (javax.swing.UnsupportedLookAndFeelException e) {
    e.printStackTrace();
  } catch (Exception e) {
    e.printStackTrace();
  }


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
        
        
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar loadingProgress;
    private javax.swing.JLabel loadingText;
    // End of variables declaration//GEN-END:variables
}
