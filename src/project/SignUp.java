/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project;
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author IK
 */

public class SignUp extends javax.swing.JDialog {

    Connection con;
    PreparedStatement stat, stat2;
    ResultSet rs, rs2;
    String staff_id;
    /**
     * Creates new form SignUp
     */
    public SignUp(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        
//          try {
//                         
//                        Class.forName("com.mysql.jdbc.Driver");
//                        con = DriverManager.getConnection("jdbc:mysql:///logger", "root", "");
//                       
//                        
//                        stat2 = con.prepareStatement("SELECT MAX(staff_id = staff_id +2) AS 'id' FROM users");
//                        rs2 = stat2.executeQuery();
//                        staff_id = rs2.getString("id");   
//          }
//          catch(ClassNotFoundException e){
//                        System.out.println("Oh Shit!" + e);  
//                }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(500, 200));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 0, 81));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sign Up Form");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 270, 60));

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/project/imgs/secrecy-icon.png"))); // NOI18N
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -30, 150, 150));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 80));

        jPanel5.setBackground(new java.awt.Color(0, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 50, 260, 40));

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jPanel5.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 260, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setText("Confirm Password:");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 260, 180, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Password:");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 160, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("Staff Name:");
        jPanel5.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 160, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("Username:");
        jPanel5.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 160, 30));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 250, 260, 40));

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel5.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 260, 40));

        jLabel2.setText(staff_id);
        jPanel5.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, -1, -1));

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 900, 350));

        jPanel4.setBackground(new java.awt.Color(0, 0, 81));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 20, 140, 40));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 900, 80));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//        String staff_id = jTextField1.getText();
        String staff_name = jTextField2.getText();
        String username = jTextField8.getText();
        char[] pwd1 = jPasswordField2.getPassword();
        char[] pwd2 = jPasswordField1.getPassword();
        String password =  String.copyValueOf(pwd1);
        String confirm_password =  String.copyValueOf(pwd2);
        
                
        if(!username.equals("") && !password.equals("") && !staff_name.equals(""))
            {
                if(password.equals(confirm_password)){
                    try {
                         
                        Class.forName("com.mysql.jdbc.Driver");
                        con = DriverManager.getConnection("jdbc:mysql:///logger", "root", "");
                       
                        
//                         stat2 = con.prepareStatement("SELECT MAX(staff_id = staff_id) AS 'id' FROM users");
//                        rs2 = stat2.executeQuery();
//                        staff_id = rs2.getString("id");                    
                        
                        
                        stat = con.prepareStatement("INSERT INTO users VALUE(?,?,?,?)");
                        stat.setString(1, staff_id);
                        stat.setString(2, staff_name);
                        stat.setString(3, username);
                        stat.setString(4, password );
                        stat.executeUpdate();
                        
                       

                       
                        
//                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField8.setText("");
                        jPasswordField2.setText("");
                        jPasswordField1.setText("");
                        
                        JOptionPane.showMessageDialog(this,"SignUp Successful","SignUp Notification", JOptionPane.INFORMATION_MESSAGE);
                        this.dispose();
                        new Login().setVisible(true);                                
                    }
                    
                    catch(SQLException e){
                        String msg = e.getMessage();
                        
                        JOptionPane.showMessageDialog(this, "SQL DATABASE ERROR:  " + msg, "Warning Message", JOptionPane.WARNING_MESSAGE);
//                        jTextField1.setText("");
                        jTextField2.setText("");
                        jTextField8.setText("");
                        jPasswordField2.setText("");
                        jPasswordField1.setText("");          
                    
                }
                
                catch(ClassNotFoundException e){
                        System.out.println("Error r" + e);  
                }
                                      
                }  
                else{
                      JOptionPane.showMessageDialog(this, "Passwords do not match", "Error Message", JOptionPane.ERROR_MESSAGE );
                       }
            }
                 
        else{
                JOptionPane.showMessageDialog(this, "Fields cannot be empty", "Error Message", JOptionPane.ERROR_MESSAGE);
                }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SignUp dialog = new SignUp(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
                dialog.setLocation(500, 200);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}