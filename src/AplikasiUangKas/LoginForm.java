/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikasiUangKas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author iyans018
 */
public class LoginForm extends javax.swing.JFrame {
    
    private Connection con;
    private Statement st;
    private ResultSet res;

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        koneksi();
    }
    
    private void koneksi() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/apuk", "iyans018", "iyans018");
            st = con.createStatement();
        } catch(Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
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

        Oktavian_mainPanel = new javax.swing.JPanel();
        Oktavian_loginPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Oktavian_loginUsernameTextField = new javax.swing.JTextField();
        Oktavian_loginButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Oktavian_loginPasswordField = new javax.swing.JPasswordField();
        Oktavian_registerPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Oktavian_registerUsernameTextField = new javax.swing.JTextField();
        Oktavian_registerPasswordField = new javax.swing.JPasswordField();
        Oktavian_registerButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Oktavian_mainPanel.setLayout(new java.awt.CardLayout());

        Oktavian_loginPanel.setBackground(new java.awt.Color(41, 128, 185));

        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Don't have account? Sign Up");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("/home/iyans018/Projects/Netbeans/Aplikasi Uang Kas/src/img/keyA.png")); // NOI18N

        jLabel3.setIcon(new javax.swing.ImageIcon("/home/iyans018/Projects/Netbeans/Aplikasi Uang Kas/src/img/user2Icon.png")); // NOI18N

        Oktavian_loginButton.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        Oktavian_loginButton.setForeground(new java.awt.Color(41, 128, 185));
        Oktavian_loginButton.setText("LOGIN");
        Oktavian_loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Oktavian_loginButtonActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Fira Code", 1, 30)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/moneyLogo.png"))); // NOI18N
        jLabel4.setText("APUK");
        jLabel4.setIconTextGap(10);

        jSeparator1.setForeground(java.awt.Color.white);

        javax.swing.GroupLayout Oktavian_loginPanelLayout = new javax.swing.GroupLayout(Oktavian_loginPanel);
        Oktavian_loginPanel.setLayout(Oktavian_loginPanelLayout);
        Oktavian_loginPanelLayout.setHorizontalGroup(
            Oktavian_loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Oktavian_loginPanelLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addGroup(Oktavian_loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(Oktavian_loginPanelLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addContainerGap(289, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Oktavian_loginPanelLayout.createSequentialGroup()
                        .addGroup(Oktavian_loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Oktavian_loginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Oktavian_loginPanelLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(Oktavian_loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Oktavian_loginUsernameTextField)
                                    .addComponent(Oktavian_loginPasswordField)))
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(76, 76, 76))))
        );
        Oktavian_loginPanelLayout.setVerticalGroup(
            Oktavian_loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Oktavian_loginPanelLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addGroup(Oktavian_loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Oktavian_loginUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(Oktavian_loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(Oktavian_loginPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(Oktavian_loginButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(120, Short.MAX_VALUE))
        );

        Oktavian_mainPanel.add(Oktavian_loginPanel, "card2");

        Oktavian_registerPanel.setBackground(new java.awt.Color(44, 62, 80));

        jLabel5.setIcon(new javax.swing.ImageIcon("/home/iyans018/Projects/Netbeans/Aplikasi Uang Kas/src/img/user2Icon.png")); // NOI18N

        jLabel6.setIcon(new javax.swing.ImageIcon("/home/iyans018/Projects/Netbeans/Aplikasi Uang Kas/src/img/keyA.png")); // NOI18N

        jLabel7.setFont(new java.awt.Font("Fira Code", 1, 18)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("FORM REGISTRATION");

        Oktavian_registerButton.setBackground(java.awt.Color.white);
        Oktavian_registerButton.setFont(new java.awt.Font("Trebuchet MS", 1, 15)); // NOI18N
        Oktavian_registerButton.setForeground(new java.awt.Color(44, 62, 80));
        Oktavian_registerButton.setText("SIGN UP");
        Oktavian_registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Oktavian_registerButtonActionPerformed(evt);
            }
        });

        jLabel8.setForeground(java.awt.Color.white);
        jLabel8.setText("Already have account? Log in.");
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Oktavian_registerPanelLayout = new javax.swing.GroupLayout(Oktavian_registerPanel);
        Oktavian_registerPanel.setLayout(Oktavian_registerPanelLayout);
        Oktavian_registerPanelLayout.setHorizontalGroup(
            Oktavian_registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Oktavian_registerPanelLayout.createSequentialGroup()
                .addGroup(Oktavian_registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(Oktavian_registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(Oktavian_registerPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Oktavian_registerPanelLayout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addGroup(Oktavian_registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel5))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(Oktavian_registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Oktavian_registerPasswordField, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                .addComponent(Oktavian_registerUsernameTextField))))
                    .addComponent(Oktavian_registerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, Oktavian_registerPanelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel8)))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        Oktavian_registerPanelLayout.setVerticalGroup(
            Oktavian_registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Oktavian_registerPanelLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(jLabel7)
                .addGap(49, 49, 49)
                .addGroup(Oktavian_registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(Oktavian_registerUsernameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(Oktavian_registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(Oktavian_registerPasswordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(Oktavian_registerButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addContainerGap(121, Short.MAX_VALUE))
        );

        Oktavian_mainPanel.add(Oktavian_registerPanel, "card3");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Oktavian_mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Oktavian_mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        //remove panel
        Oktavian_mainPanel.removeAll();
        Oktavian_mainPanel.repaint();
        Oktavian_mainPanel.revalidate();
        
        //add panel
        Oktavian_mainPanel.add(Oktavian_registerPanel);
        Oktavian_mainPanel.repaint();
        Oktavian_mainPanel.revalidate();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        // TODO add your handling code here:
        //remove panel
        Oktavian_mainPanel.removeAll();
        Oktavian_mainPanel.repaint();
        Oktavian_mainPanel.revalidate();
        
        //add panel
        Oktavian_mainPanel.add(Oktavian_loginPanel);
        Oktavian_mainPanel.repaint();
        Oktavian_mainPanel.revalidate();
    }//GEN-LAST:event_jLabel8MouseClicked

    private void Oktavian_loginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Oktavian_loginButtonActionPerformed
        // TODO add your handling code here:
        String username = Oktavian_loginUsernameTextField.getText();
        String password = Oktavian_loginPasswordField.getText();
        
        try {
            res = st.executeQuery("SELECT * FROM user "
                    + "WHERE username = '" + username + "'"
                    + "AND password = '" + password + "'"
            );
            if (res.next()) {
                if(username.equals(res.getString("username")) && password.equals(res.getString("password"))){
                    JOptionPane.showMessageDialog(null, "Berhasil Login");
                    MainMenu mainMenu = new MainMenu();
        
                    mainMenu.setVisible(true);
                    mainMenu.pack();
                    mainMenu.setLocationRelativeTo(null);

                    this.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Username atau Password Salah!");
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }//GEN-LAST:event_Oktavian_loginButtonActionPerformed

    private void Oktavian_registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Oktavian_registerButtonActionPerformed
        // TODO add your handling code here:
        String username = Oktavian_registerUsernameTextField.getText();
        String password = Oktavian_registerPasswordField.getText();
        try {
            st.executeUpdate(
                    "INSERT INTO user VALUES"
                    + "("
                        + "null" + ","
                        + "'" + username + "',"
                        + "'" + password + "'"
                    + ")"
            );
            JOptionPane.showMessageDialog(rootPane, "Data dengan username " + username + " berhasil ditambah.");
            Oktavian_registerUsernameTextField.setText("");
            Oktavian_registerPasswordField.setText("");
            Oktavian_mainPanel.removeAll();
            Oktavian_mainPanel.repaint();
            Oktavian_mainPanel.revalidate();

            //add panel
            Oktavian_mainPanel.add(Oktavian_loginPanel);
            Oktavian_mainPanel.repaint();
            Oktavian_mainPanel.revalidate();
        } catch(SQLException e) {
            JOptionPane.showMessageDialog(rootPane, "Gagal menambahkan data! " + e);
        }
    }//GEN-LAST:event_Oktavian_registerButtonActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Oktavian_loginButton;
    private javax.swing.JPanel Oktavian_loginPanel;
    private javax.swing.JPasswordField Oktavian_loginPasswordField;
    private javax.swing.JTextField Oktavian_loginUsernameTextField;
    private javax.swing.JPanel Oktavian_mainPanel;
    private javax.swing.JButton Oktavian_registerButton;
    private javax.swing.JPanel Oktavian_registerPanel;
    private javax.swing.JPasswordField Oktavian_registerPasswordField;
    private javax.swing.JTextField Oktavian_registerUsernameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}