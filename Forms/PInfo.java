/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahmed Kassem
 */
public class PInfo extends javax.swing.JFrame {

    int mousex;
    int mousey;

    /**
     * Creates new form PInfo
     */
    public PInfo() {
        initComponents();
        Rcheck.setVisible(false);
        Rcheck.setEnabled(false);
        x1.setEnabled(false);
        x1.setVisible(false);
        _1.setEnabled(false);
        _1.setVisible(false);
        hgz1.setEnabled(false);
        hgz1.setVisible(false);
        est1.setEnabled(false);
        est1.setVisible(false);
        est2.setEnabled(false);
        est2.setVisible(false);
        RchLest.getTableHeader().setReorderingAllowed(false);
        RrvLest.getTableHeader().setReorderingAllowed(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        resrv = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        RrvLest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Rcheck = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        RchLest = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        _ = new javax.swing.JLabel();
        _1 = new javax.swing.JLabel();
        Bar = new javax.swing.JLabel();
        hgz = new javax.swing.JLabel();
        hgz1 = new javax.swing.JLabel();
        hgz2 = new javax.swing.JLabel();
        est = new javax.swing.JLabel();
        est1 = new javax.swing.JLabel();
        est2 = new javax.swing.JLabel();
        maine = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        resrv.setLayout(null);

        jScrollPane1.setBorder(null);

        RrvLest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????? ????????????", "??????????", "????????????????", "??????????", "?????????? ??????????????", "??????????", "?????? ??????????", "????????????", "?????????? ??????????", "??????????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RrvLest.setGridColor(new java.awt.Color(0, 0, 0));
        RrvLest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RrvLestMouseReleased(evt);
            }
        });
        jScrollPane1.setViewportView(RrvLest);

        resrv.add(jScrollPane1);
        jScrollPane1.setBounds(0, 0, 718, 291);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PIFO.png"))); // NOI18N
        resrv.add(jLabel1);
        jLabel1.setBounds(0, 0, 718, 291);

        getContentPane().add(resrv);
        resrv.setBounds(16, 52, 718, 291);

        Rcheck.setLayout(null);

        jScrollPane2.setBorder(null);

        RchLest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????? ????????????", "??????????", "?????? ??????????", "????????????", "??????????", "?????????? ??????????", "?????????? ??????????????????", "??????????????????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        RchLest.setGridColor(new java.awt.Color(0, 0, 0));
        RchLest.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                RchLestMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(RchLest);

        Rcheck.add(jScrollPane2);
        jScrollPane2.setBounds(0, 0, 718, 291);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/PIFO.png"))); // NOI18N
        Rcheck.add(jLabel2);
        jLabel2.setBounds(0, 0, 718, 291);

        getContentPane().add(Rcheck);
        Rcheck.setBounds(16, 52, 718, 291);

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
        x.setBounds(719, -1, 22, 22);

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RX.png"))); // NOI18N
        getContentPane().add(x1);
        x1.setBounds(719, -1, 22, 22);

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
        _.setBounds(700, 0, 19, 20);

        _1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R_.png"))); // NOI18N
        getContentPane().add(_1);
        _1.setBounds(700, 0, 19, 20);

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
        Bar.setBounds(0, 0, 697, 20);

        hgz.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        hgz.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hgzMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hgzMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hgzMouseExited(evt);
            }
        });
        getContentPane().add(hgz);
        hgz.setBounds(644, 24, 90, 31);

        hgz1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????????.png"))); // NOI18N
        getContentPane().add(hgz1);
        hgz1.setBounds(644, 24, 90, 31);

        hgz2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????????.png"))); // NOI18N
        getContentPane().add(hgz2);
        hgz2.setBounds(644, 24, 90, 31);

        est.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        est.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                estMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                estMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                estMouseExited(evt);
            }
        });
        getContentPane().add(est);
        est.setBounds(554, 24, 89, 31);

        est1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/????????????????????.png"))); // NOI18N
        getContentPane().add(est1);
        est1.setBounds(554, 24, 89, 31);

        est2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/????????????????????.png"))); // NOI18N
        getContentPane().add(est2);
        est2.setBounds(554, 24, 89, 31);

        maine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/More info.png"))); // NOI18N
        getContentPane().add(maine);
        maine.setBounds(0, 0, 740, 350);

        setSize(new java.awt.Dimension(740, 350));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.dispose();
        }
    }//GEN-LAST:event_xMouseClicked

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        x1.setVisible(true);
        x1.setEnabled(true);
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        x1.setVisible(false);
        x1.setEnabled(false);
    }//GEN-LAST:event_xMouseExited

    private void _MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.setState(Reservations.ICONIFIED);
        }
    }//GEN-LAST:event__MouseClicked

    private void _MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__MouseEntered
        _1.setVisible(true);
        _1.setEnabled(true);
    }//GEN-LAST:event__MouseEntered

    private void _MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__MouseExited
        _1.setVisible(false);
        _1.setEnabled(false);
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

    private void hgzMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hgzMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            resrv.setVisible(true);
            resrv.setEnabled(true);
            est2.setEnabled(false);
            est2.setVisible(false);
            hgz2.setEnabled(true);
            hgz2.setVisible(true);
            Rcheck.setEnabled(false);
            Rcheck.setVisible(false);
            LestRESc();
        }
    }//GEN-LAST:event_hgzMouseClicked

    private void hgzMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hgzMouseEntered
        hgz1.setEnabled(true);
        hgz1.setVisible(true);
    }//GEN-LAST:event_hgzMouseEntered

    private void hgzMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hgzMouseExited
        hgz1.setEnabled(false);
        hgz1.setVisible(false);
    }//GEN-LAST:event_hgzMouseExited

    private void estMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            resrv.setVisible(false);
            resrv.setEnabled(false);
            est2.setEnabled(true);
            est2.setVisible(true);
            hgz2.setEnabled(false);
            hgz2.setVisible(false);
            Rcheck.setEnabled(true);
            Rcheck.setVisible(true);
            LestRechc();
        }
    }//GEN-LAST:event_estMouseClicked

    private void estMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estMouseEntered
        est1.setEnabled(true);
        est1.setVisible(true);
    }//GEN-LAST:event_estMouseEntered

    private void estMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_estMouseExited
        est1.setEnabled(false);
        est1.setVisible(false);
    }//GEN-LAST:event_estMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DB.GO.icon(this);
        LestRESc();
    }//GEN-LAST:event_formWindowOpened
    public void LestRESc() {
        try {
            DefaultTableModel table = new DefaultTableModel();
            table.addColumn("?????? ????????????");
            table.addColumn("??????????   ");
            table.addColumn("????????????????   ");
            table.addColumn("??????????");
            table.addColumn("?????????? ??????????????   ");
            table.addColumn("??????????");
            table.addColumn("?????? ??????????");
            table.addColumn("????????????    ");
            table.addColumn("?????????? ??????????   ");
            table.addColumn("??????????");

            Connection con = DB.ConectionDB.setconn();
            Statement st = con.createStatement();
            String strs = "SELECT * FROM patients_data WHERE NUMBER LIKE '%" + CheckUp.PeNum.getText() + "%'  AND DOCNAME LIKE '%" + MainForm.Name1.getText() + "%'";
            ResultSet r = st.executeQuery(strs);

            while (r.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),
                    r.getString(7),
                    r.getString(8),
                    r.getString(9),
                    r.getString(10),});

                RrvLest.setModel(table);
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void LestRechc() {
        try {
            DefaultTableModel table = new DefaultTableModel();
            table.addColumn("?????? ????????????");
            table.addColumn("??????????   ");
            table.addColumn("?????? ??????????");
            table.addColumn("????????????   ");
            table.addColumn("??????????");
            table.addColumn("?????????? ??????????   ");
            table.addColumn("?????????? ??????????????????   ");
            table.addColumn("??????????????????");

            Connection con = DB.ConectionDB.setconn();
            Statement st = con.createStatement();

            String strs = "SELECT * FROM patients_data_r WHERE NUMBER LIKE '%" + CheckUp.PeNum.getText() + "%' AND DOCNAME LIKE '%" + MainForm.Name1.getText() + "%'";

            ResultSet r = st.executeQuery(strs);

            while (r.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),
                    r.getString(7),
                    r.getString(8),});

                RchLest.setModel(table);
            }

        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    private void RrvLestMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RrvLestMouseReleased
        try {
            int row = RrvLest.getSelectedRow();
            String nu = RrvLest.getValueAt(row, 0).toString();
            String na = RrvLest.getValueAt(row, 1).toString();
            String k = RrvLest.getValueAt(row, 9).toString();
            if (evt.getButton() == MouseEvent.BUTTON1 && evt.getClickCount() == 2 && "????".equals(k)) {
                checkInfo.PeNumI.setText(nu);
                checkInfo.PeNameI.setText(na);

                Connection con = DB.ConectionDB.setconn();
                Statement st = con.createStatement();
                String strs = "SELECT * FROM check_up WHERE PNumber LIKE '%" + nu + "%'";
                ResultSet rs = st.executeQuery(strs);

                while (rs.next()) {
                    checkInfo.ChNumI.setText(rs.getString(1));
                    checkInfo.Cdate.setText(rs.getString(2));
                    checkInfo.tybeI.setText(rs.getString(3));
                    checkInfo.heightI.setText(rs.getString(4));
                    checkInfo.widthI.setText(rs.getString(5));
                    checkInfo.sugarI.setText(rs.getString(6));
                    checkInfo.pressI.setText(rs.getString(7));
                    checkInfo.tempI.setText(rs.getString(8));
                    checkInfo.notesI.setText(rs.getString(9));
                    checkInfo.eshaatI.setText(rs.getString(10));
                    checkInfo.thalelI.setText(rs.getString(11));
                    checkInfo.dwaaI.setText(rs.getString(12));
                    checkInfo.Rdate.setText(rs.getString(13));
                    checkInfo.DoNumI.setText(rs.getString(14));
                    checkInfo.ReNumI.setText(rs.getString(16));

                }

                Statement str = con.createStatement();
                String strss = "SELECT * FROM patients WHERE NUMBER LIKE '%" + nu + "%'";
                ResultSet rt = st.executeQuery(strss);
                while (rt.next()) {
                    checkInfo.PeAgeI.setText(rt.getString(6));

                }

                new checkInfo().setVisible(true);
            } else {

            }
        } catch (Exception ex) {

        }
    }//GEN-LAST:event_RrvLestMouseReleased

    private void RchLestMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RchLestMouseReleased
        int row = RchLest.getSelectedRow();
        String pn = RchLest.getValueAt(row, 0).toString();
        String n = RchLest.getValueAt(row, 1).toString();
        String cn = RchLest.getValueAt(row, 2).toString();
        String rcd = RchLest.getValueAt(row, 6).toString();
        String rc = RchLest.getValueAt(row, 7).toString();

        if (evt.getButton() == MouseEvent.BUTTON1 && evt.getClickCount() == 2 && "????".equals(rc)) {

            RCheckUpInfo.PeNumRI.setText(pn);
            RCheckUpInfo.PeNameRI.setText(n);
            RCheckUpInfo.ChNumRI.setText(cn);
            RCheckUpInfo.dateRCI.setText(rcd);

            try {
                Connection con = DB.ConectionDB.setconn();
                Statement st = con.createStatement();
                String strs = "SELECT * FROM recheck_up WHERE CNUM LIKE '%" + cn + "%'";
                ResultSet rt = st.executeQuery(strs);
                while (rt.next()) {

                    RCheckUpInfo.tybeI.setText(rt.getString(3));

                    RCheckUpInfo.widthRI.setText(rt.getString(4));
                    RCheckUpInfo.sugarRI.setText(rt.getString(5));
                    RCheckUpInfo.pressRI.setText(rt.getString(6));
                    RCheckUpInfo.tempRI.setText(rt.getString(7));
                    RCheckUpInfo.notesI.setText(rt.getString(8));
                    RCheckUpInfo.condRI.setText(rt.getString(9));
                    RCheckUpInfo.ReNumRI.setText(rt.getString(15));
                    RCheckUpInfo.eshaatI.setText(rt.getString(10));
                    RCheckUpInfo.thalelI.setText(rt.getString(11));
                    RCheckUpInfo.dwaaI.setText(rt.getString(12));
                    RCheckUpInfo.DoNumRI.setText(rt.getString(14));

                }

                Statement stt = con.createStatement();
                String strss = "SELECT * FROM patients WHERE NUMBER LIKE '%" + pn + "%'";
                ResultSet rs = stt.executeQuery(strss);
                while (rs.next()) {
                    RCheckUpInfo.PeAgeRI.setText(rs.getString(6));

                }

                Statement sst = con.createStatement();
                String strrs = "SELECT * FROM check_up WHERE NUMBER LIKE '%" + cn + "%'";
                ResultSet rrs = sst.executeQuery(strrs);
                while (rrs.next()) {

                    RCheckUpInfo.heightRI.setText(rrs.getString(4));
                }

            } catch (Exception ex) {
                ex.getMessage();
            }
            new RCheckUpInfo().setVisible(true);
        } else {

        }
    }//GEN-LAST:event_RchLestMouseReleased

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
            java.util.logging.Logger.getLogger(PInfo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PInfo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PInfo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PInfo.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bar;
    private javax.swing.JTable RchLest;
    private javax.swing.JPanel Rcheck;
    private javax.swing.JTable RrvLest;
    private javax.swing.JLabel _;
    private javax.swing.JLabel _1;
    private javax.swing.JLabel est;
    private javax.swing.JLabel est1;
    private javax.swing.JLabel est2;
    private javax.swing.JLabel hgz;
    private javax.swing.JLabel hgz1;
    private javax.swing.JLabel hgz2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel maine;
    private javax.swing.JPanel resrv;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables
}
