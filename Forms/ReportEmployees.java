/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import static Forms.ReportDoctors.Dname;
import static Forms.ReportDoctors.Doname;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahmed Kassem
 */
public class ReportEmployees extends javax.swing.JFrame {

    int mousex;
    int mousey;

    /**
     * Creates new form ReportEmployees
     */
    public ReportEmployees() {
        initComponents();
        x1.setEnabled(false);
        x1.setVisible(false);
        _1.setEnabled(false);
        _1.setVisible(false);
        print1.setEnabled(false);
        print1.setVisible(false);
        exit1.setEnabled(false);
        exit1.setVisible(false);
        Controls.Tools.setReport(EmpLest);
        EmpLest.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        _ = new javax.swing.JLabel();
        _1 = new javax.swing.JLabel();
        Bar = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        EmpLest = new javax.swing.JTable();
        print = new javax.swing.JLabel();
        print1 = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        x.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        x.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                xMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                xMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                xMouseExited(evt);
            }
        });
        getContentPane().add(x);
        x.setBounds(921, 1, 17, 18);

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/13.png"))); // NOI18N
        x1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(x1);
        x1.setBounds(917, -1, 24, 22);

        _.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        _.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                _MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                _MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                _MouseExited(evt);
            }
        });
        getContentPane().add(_);
        _.setBounds(903, 1, 16, 18);

        _1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/15.png"))); // NOI18N
        getContentPane().add(_1);
        _1.setBounds(896, -1, 22, 22);

        Bar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                BarMouseDragged(evt);
            }
        });
        Bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BarMousePressed(evt);
            }
        });
        getContentPane().add(Bar);
        Bar.setBounds(0, 0, 900, 20);

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        EmpLest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        EmpLest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????? ????????????", "?????? ????????????", "???????? ????????????", "?????? ????????????????", "?????????? ??????????????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmpLest.setSelectionBackground(new java.awt.Color(0, 102, 215));
        jScrollPane2.setViewportView(EmpLest);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(250, 155, 670, 320);

        print.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                printMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                printMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                printMouseExited(evt);
            }
        });
        getContentPane().add(print);
        print.setBounds(20, 380, 195, 33);

        print1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????????.png"))); // NOI18N
        getContentPane().add(print1);
        print1.setBounds(20, 380, 195, 33);

        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });
        getContentPane().add(exit);
        exit.setBounds(20, 447, 195, 33);

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/????????.png"))); // NOI18N
        getContentPane().add(exit1);
        exit1.setBounds(20, 447, 195, 33);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ReportEmployees.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 506);

        setBounds(0, 0, 940, 506);
    }// </editor-fold>//GEN-END:initComponents
public void Liste() {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("?????? ????????????");
        table.addColumn("?????? ????????????");
        table.addColumn("???????? ????????????");
        table.addColumn("?????? ????????????????");
        table.addColumn("?????????? ??????????????");

        try {
            Connection con = DB.ConectionDB.setconn();
            String strs = "SELECT * FROM Employees";
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(strs);
            while (r.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),});
                EmpLest.setModel(table);
            }

        } catch (Exception ex) {

        }
    }
    private void printMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            Controls.Tools.printReport(EmpLest, "Employees");
        }
    }//GEN-LAST:event_printMouseClicked

    private void printMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseEntered
        print1.setVisible(true);
        print1.setEnabled(true);
    }//GEN-LAST:event_printMouseEntered

    private void printMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_printMouseExited
        print1.setVisible(false);
        print1.setEnabled(false);
    }//GEN-LAST:event_printMouseExited

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.dispose();
        }
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit1.setEnabled(true);
        exit1.setVisible(true);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit1.setEnabled(false);
        exit1.setVisible(false);
    }//GEN-LAST:event_exitMouseExited

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.dispose();
        }
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        x1.setEnabled(true);
        x1.setVisible(true);
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        x1.setEnabled(false);
        x1.setVisible(false);
    }//GEN-LAST:event_xMouseExited

    private void _MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__MouseClicked
        this.setState(MainFormE.ICONIFIED);
    }//GEN-LAST:event__MouseClicked

    private void _MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__MouseEntered
        _1.setEnabled(true);
        _1.setVisible(true);
    }//GEN-LAST:event__MouseEntered

    private void _MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__MouseExited
        _1.setEnabled(false);
        _1.setVisible(false);
    }//GEN-LAST:event__MouseExited

    private void BarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mousex, y - mousey);
    }//GEN-LAST:event_BarMouseDragged

    private void BarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarMousePressed
        mousex = evt.getX();
        mousey = evt.getY();
    }//GEN-LAST:event_BarMousePressed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DB.GO.icon(this);
        Liste();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(ReportEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportEmployees.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportEmployees().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bar;
    private javax.swing.JTable EmpLest;
    private javax.swing.JLabel _;
    private javax.swing.JLabel _1;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel print;
    private javax.swing.JLabel print1;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables
}
