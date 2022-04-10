/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import DB.ConectionDB;

import java.awt.Color;
import java.sql.Connection;
import java.util.jar.Attributes;
import javax.swing.JOptionPane;
import Forms.MainForm;
import static Forms.MainForm.Name1;
import static Forms.MainFormE.Name2;
import java.awt.event.MouseEvent;

/**
 *
 * @author Ahmed Kassem
 */
public class Login extends javax.swing.JFrame {

    int mousex;
    int mousey;

    public Login() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pass = new javax.swing.JPasswordField();
        jTextField2 = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        X = new javax.swing.JLabel();
        _ = new javax.swing.JLabel();
        Login = new javax.swing.JLabel();
        icon = new javax.swing.JLabel();
        Draged = new javax.swing.JLabel();
        Backgroud = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setOpacity(0.0F);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        pass.setForeground(new java.awt.Color(0, 2, 75));
        pass.setBorder(null);
        pass.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pass.setOpaque(false);
        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });
        pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                passKeyTyped(evt);
            }
        });
        getContentPane().add(pass);
        pass.setBounds(100, 390, 260, 30);

        jTextField2.setForeground(new java.awt.Color(0, 2, 75));
        jTextField2.setText("Password");
        jTextField2.setBorder(null);
        jTextField2.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextField2.setEnabled(false);
        jTextField2.setOpaque(false);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(100, 390, 260, 30);

        user.setForeground(new java.awt.Color(0, 2, 75));
        user.setToolTipText("");
        user.setBorder(null);
        user.setOpaque(false);
        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userKeyTyped(evt);
            }
        });
        getContentPane().add(user);
        user.setBounds(100, 330, 260, 30);

        jTextField1.setForeground(new java.awt.Color(0, 2, 75));
        jTextField1.setText("UserName");
        jTextField1.setBorder(null);
        jTextField1.setCaretPosition(0);
        jTextField1.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        jTextField1.setEnabled(false);
        jTextField1.setOpaque(false);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(100, 330, 260, 30);

        X.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        X.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                XMouseMoved(evt);
            }
        });
        X.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                XMousePressed(evt);
            }
        });
        getContentPane().add(X);
        X.setBounds(388, 12, 15, 20);

        _.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                _MouseMoved(evt);
            }
        });
        _.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                _MousePressed(evt);
            }
        });
        getContentPane().add(_);
        _.setBounds(363, 12, 15, 20);

        Login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Login.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LoginMousePressed(evt);
            }
        });
        getContentPane().add(Login);
        Login.setBounds(54, 461, 310, 32);

        icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clinic-icon-17_1.png"))); // NOI18N
        getContentPane().add(icon);
        icon.setBounds(13, 14, 22, 20);

        Draged.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                DragedMouseDragged(evt);
            }
        });
        Draged.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                DragedMousePressed(evt);
            }
        });
        getContentPane().add(Draged);
        Draged.setBounds(10, 10, 350, 30);

        Backgroud.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.png"))); // NOI18N
        getContentPane().add(Backgroud);
        Backgroud.setBounds(0, 0, 418, 590);

        setSize(new java.awt.Dimension(422, 596));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void XMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMousePressed
        if (evt.getButton() == MouseEvent.BUTTON1) {
            System.exit(0);
        }
    }//GEN-LAST:event_XMousePressed

    private void XMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_XMouseMoved

    private void LoginMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoginMousePressed
        if (evt.getButton() == MouseEvent.BUTTON1) {
            String User = user.getText();
            String Pass = pass.getText();

            boolean a = DB.GO.checkUsers(User, Pass, Name1, Name2);
            if (a) {

                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "User Or Password Incorrict !");
                Controls.Tools.clearText(this);
                user.requestFocus();
            }
        }
    }//GEN-LAST:event_LoginMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        for (double i = 0.0; i <= 1.0; i = i + 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            System.out.println(val);
            this.setOpacity(f);

            try {
                Thread.sleep(50);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
        DB.GO.icon(this);
    }//GEN-LAST:event_formWindowOpened

    private void DragedMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragedMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - mousex, y - mousey);
    }//GEN-LAST:event_DragedMouseDragged

    private void DragedMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DragedMousePressed
        mousex = evt.getX();
        mousey = evt.getY();
    }//GEN-LAST:event_DragedMousePressed

    private void userKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyTyped
        if ("".equals(user.getText())) {
            jTextField1.setVisible(true);
            jTextField1.setEnabled(false);
        } else {
            jTextField1.setVisible(false);
            jTextField1.setEnabled(false);
        }
    }//GEN-LAST:event_userKeyTyped

    private void passKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_passKeyTyped
        if ("".equals(pass.getText())) {
            jTextField2.setVisible(true);
            jTextField2.setEnabled(false);
        } else {
            jTextField2.setVisible(false);
            jTextField2.setEnabled(false);
        }
    }//GEN-LAST:event_passKeyTyped

    private void _MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__MouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event__MouseMoved

    private void _MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__MousePressed
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.setState(MainForm.ICONIFIED);
        }
    }//GEN-LAST:event__MousePressed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
        String User = user.getText();
            String Pass = pass.getText();

            boolean a = DB.GO.checkUsers(User, Pass, Name1, Name2);
            if (a) {

                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "User Or Password Incorrict !");
                Controls.Tools.clearText(this);
                user.requestFocus();
            }
    }//GEN-LAST:event_passActionPerformed

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
                if ("windos".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Backgroud;
    private javax.swing.JLabel Draged;
    private javax.swing.JLabel Login;
    private javax.swing.JLabel X;
    private javax.swing.JLabel _;
    private javax.swing.JLabel icon;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}