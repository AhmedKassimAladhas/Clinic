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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahmed Kassem
 */
public class ReportDoctors extends javax.swing.JFrame {

    int mousex;
    int mousey;

    /**
     * Creates new form ReportDoctors
     */
    public ReportDoctors() {
        initComponents();
        x1.setEnabled(false);
        x1.setVisible(false);
        _1.setEnabled(false);
        _1.setVisible(false);
        printDit.setEnabled(false);
        printDit.setVisible(false);
        printTim.setEnabled(false);
        printTim.setVisible(false);
        prinTim1.setEnabled(false);
        prinTim1.setVisible(false);
        prinDit1.setEnabled(false);
        prinDit1.setVisible(false);
        exit1.setEnabled(false);
        exit1.setVisible(false);
        Details1.setEnabled(false);
        Details1.setVisible(false);
        Details2.setEnabled(false);
        Details2.setVisible(false);
        Times1.setEnabled(false);
        Times1.setVisible(false);
        Times2.setEnabled(false);
        Times2.setVisible(false);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setVisible(false);
        jScrollPane2.setEnabled(false);
        jScrollPane2.setVisible(false);
        Controls.Tools.setReport(TimesLest);
        Controls.Tools.setReport(detailsLest);
        TimesLest.getTableHeader().setReorderingAllowed(false);
        detailsLest.getTableHeader().setReorderingAllowed(false);
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
        Details = new javax.swing.JLabel();
        Details1 = new javax.swing.JLabel();
        Details2 = new javax.swing.JLabel();
        Times = new javax.swing.JLabel();
        Times1 = new javax.swing.JLabel();
        Times2 = new javax.swing.JLabel();
        printDit = new javax.swing.JPanel();
        prinDit1 = new javax.swing.JLabel();
        prinDit = new javax.swing.JLabel();
        printTim = new javax.swing.JPanel();
        prinTim1 = new javax.swing.JLabel();
        prinTim = new javax.swing.JLabel();
        exit = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TimesLest = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        detailsLest = new javax.swing.JTable();
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

        Details.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Details.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DetailsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DetailsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DetailsMouseExited(evt);
            }
        });
        getContentPane().add(Details);
        Details.setBounds(724, 128, 202, 30);

        Details1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ReportDoctorsdit.png"))); // NOI18N
        getContentPane().add(Details1);
        Details1.setBounds(724, 128, 202, 30);

        Details2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ReportDoctorsdit.png"))); // NOI18N
        getContentPane().add(Details2);
        Details2.setBounds(724, 128, 202, 30);

        Times.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Times.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TimesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TimesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                TimesMouseExited(evt);
            }
        });
        getContentPane().add(Times);
        Times.setBounds(522, 128, 202, 30);

        Times1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ReportDoctorstim.png"))); // NOI18N
        getContentPane().add(Times1);
        Times1.setBounds(522, 128, 202, 30);

        Times2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ReportDoctorstim.png"))); // NOI18N
        getContentPane().add(Times2);
        Times2.setBounds(522, 128, 202, 30);

        printDit.setLayout(null);

        prinDit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????????.png"))); // NOI18N
        prinDit1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        printDit.add(prinDit1);
        prinDit1.setBounds(0, 0, 195, 33);

        prinDit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????????2.png"))); // NOI18N
        prinDit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prinDit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prinDitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prinDitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prinDitMouseExited(evt);
            }
        });
        printDit.add(prinDit);
        prinDit.setBounds(0, 0, 195, 33);

        getContentPane().add(printDit);
        printDit.setBounds(20, 380, 195, 33);

        printTim.setLayout(null);

        prinTim1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????????.png"))); // NOI18N
        printTim.add(prinTim1);
        prinTim1.setBounds(0, 0, 195, 33);

        prinTim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????????2.png"))); // NOI18N
        prinTim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        prinTim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                prinTimMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                prinTimMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                prinTimMouseExited(evt);
            }
        });
        printTim.add(prinTim);
        prinTim.setBounds(0, 0, 195, 33);

        getContentPane().add(printTim);
        printTim.setBounds(20, 380, 195, 33);

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

        Doname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Doname.setForeground(new java.awt.Color(56, 148, 233));
        Doname.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                DonameItemStateChanged(evt);
            }
        });
        getContentPane().add(Doname);
        Doname.setBounds(250, 129, 150, 24);

        Dname.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Dname.setForeground(new java.awt.Color(56, 148, 233));
        getContentPane().add(Dname);
        Dname.setBounds(250, 129, 150, 24);

        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        TimesLest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TimesLest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????? ????????????", "?????? ????????????", "??????????", "???? ????????????", "?????? ????????????", "???????????? ??????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TimesLest.setSelectionBackground(new java.awt.Color(0, 102, 215));
        jScrollPane2.setViewportView(TimesLest);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(250, 166, 670, 320);

        jScrollPane1.setBorder(null);
        jScrollPane1.setOpaque(false);

        detailsLest.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        detailsLest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????? ????????????", "?????? ????????????", "???????????? ??????????", "?????? ??????????", "?????? ????????????????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        detailsLest.setSelectionBackground(new java.awt.Color(0, 102, 215));
        jScrollPane1.setViewportView(detailsLest);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(250, 166, 670, 320);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ReportDoctors.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 940, 506);

        setBounds(0, 0, 940, 506);
    }// </editor-fold>//GEN-END:initComponents
public void ListeTimes() {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("?????? ????????????");
        table.addColumn("?????? ????????????");
        table.addColumn("??????????");
        table.addColumn("???? ????????????");
        table.addColumn("?????? ????????????");
        table.addColumn("???????????? ??????");

        try {
            Connection con = DB.ConectionDB.setconn();
            String strs = "SELECT * FROM doc_times_data where DOCTORS_NAME like '%" + Dname.getText() + "%' OR DOCTORS_NAME like '%" + Doname.getSelectedItem() + "%'";
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(strs);

            while (r.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),});
                TimesLest.setModel(table);
            }

        } catch (Exception ex) {

        }
    }

    public void ListeDetails() {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("?????? ????????????");
        table.addColumn("?????? ????????????");
        table.addColumn("???????????? ??????????");
        table.addColumn("?????? ??????????");
        table.addColumn("?????? ????????????????");

        try {
            Connection con = DB.ConectionDB.setconn();
            String strs = "SELECT * FROM Doctors where Name like '%" + Dname.getText() + "%'";
            String strc = "SELECT count(CHNUMBER) FROM patients_data_2 WHERE patients_data_2.DOCNAME LIKE '%" + Dname.getText() + "%'";
            Statement st = con.createStatement();
            Statement stc = con.createStatement();
            ResultSet r = st.executeQuery(strs);
            ResultSet rc = stc.executeQuery(strc);

            while (r.next() && rc.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    rc.getString(1)});
                detailsLest.setModel(table);
            }

        } catch (Exception ex) {

        }
    }

    public void ListeTimesE() {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("?????? ????????????");
        table.addColumn("?????? ????????????");
        table.addColumn("??????????");
        table.addColumn("???? ????????????");
        table.addColumn("?????? ????????????");
        table.addColumn("???????????? ??????");

        try {
            Connection con = DB.ConectionDB.setconn();
            String strs = "SELECT * FROM doc_times_data where DOCTORS_NAME like '%" + Doname.getSelectedItem() + "%'";
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(strs);

            while (r.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),});
                TimesLest.setModel(table);
            }

        } catch (Exception ex) {

        }
    }

    public void ListeDetailsE() {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("?????? ????????????");
        table.addColumn("?????? ????????????");
        table.addColumn("???????????? ??????????");
        table.addColumn("?????? ??????????");
        table.addColumn("?????? ????????????????");

        try {
            Connection con = DB.ConectionDB.setconn();
            String strs = "SELECT * FROM Doctors where Name like '%" + Doname.getSelectedItem() + "%'";
            String strc = "SELECT count(CHNUMBER) FROM patients_data_2 WHERE patients_data_2.DOCNAME LIKE '%" + Doname.getSelectedItem() + "%'";
            Statement st = con.createStatement();
            Statement stc = con.createStatement();
            ResultSet r = st.executeQuery(strs);
            ResultSet rc = stc.executeQuery(strc);

            while (r.next() && rc.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    rc.getString(1)});
                detailsLest.setModel(table);
            }

        } catch (Exception ex) {

        }
    }
    private void prinDitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prinDitMouseClicked
        Controls.Tools.printReport(detailsLest, "Doctors");
    }//GEN-LAST:event_prinDitMouseClicked

    private void prinDitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prinDitMouseEntered
        prinDit1.setVisible(true);
        prinDit1.setEnabled(true);
    }//GEN-LAST:event_prinDitMouseEntered

    private void prinDitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prinDitMouseExited
        prinDit1.setVisible(false);
        prinDit1.setEnabled(false);
    }//GEN-LAST:event_prinDitMouseExited

    private void prinTimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prinTimMouseClicked
        Controls.Tools.printReport(TimesLest, "Doctors Time");
    }//GEN-LAST:event_prinTimMouseClicked

    private void prinTimMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prinTimMouseEntered
        prinTim1.setVisible(true);
        prinTim1.setEnabled(true);
    }//GEN-LAST:event_prinTimMouseEntered

    private void prinTimMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_prinTimMouseExited
        prinTim1.setVisible(false);
        prinTim1.setEnabled(false);
    }//GEN-LAST:event_prinTimMouseExited

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

    private void DetailsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailsMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            Details2.setVisible(true);
            Details2.setEnabled(true);
            Times2.setEnabled(false);
            Times2.setVisible(false);
            jScrollPane1.setEnabled(true);
            jScrollPane1.setVisible(true);
            jScrollPane2.setEnabled(false);
            jScrollPane2.setVisible(false);
            printDit.setEnabled(true);
            printDit.setVisible(true);
            printTim.setEnabled(false);
            printTim.setVisible(false);
            Doname.setSelectedItem(null);
            if (Doname.isVisible()) {
                DefaultTableModel table = (DefaultTableModel) detailsLest.getModel();
                table.setNumRows(0);
            }

        }
    }//GEN-LAST:event_DetailsMouseClicked

    private void DetailsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailsMouseEntered
        Details1.setVisible(true);
        Details1.setEnabled(true);
    }//GEN-LAST:event_DetailsMouseEntered

    private void DetailsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DetailsMouseExited
        Details1.setVisible(false);
        Details1.setEnabled(false);
    }//GEN-LAST:event_DetailsMouseExited

    private void TimesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimesMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            Details2.setVisible(false);
            Details2.setEnabled(false);
            Times2.setEnabled(true);
            Times2.setVisible(true);
            jScrollPane1.setEnabled(false);
            jScrollPane1.setVisible(false);
            jScrollPane2.setEnabled(true);
            jScrollPane2.setVisible(true);
            printDit.setEnabled(false);
            printDit.setVisible(false);
            printTim.setEnabled(true);
            printTim.setVisible(true);
            Doname.setSelectedItem(null);
            if (Doname.isVisible()) {
                DefaultTableModel mod = (DefaultTableModel) TimesLest.getModel();
                mod.setNumRows(0);
            }

        }
    }//GEN-LAST:event_TimesMouseClicked

    private void TimesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimesMouseEntered
        Times1.setVisible(true);
        Times1.setEnabled(true);
    }//GEN-LAST:event_TimesMouseEntered

    private void TimesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TimesMouseExited
        Times1.setVisible(false);
        Times1.setEnabled(false);
    }//GEN-LAST:event_TimesMouseExited

    private void DonameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_DonameItemStateChanged
        ListeDetailsE();
        ListeTimesE();
    }//GEN-LAST:event_DonameItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DB.GO.icon(this);
        Doname.setSelectedItem(null);
        if(Dname.isVisible()){
            ListeDetails();
            ListeTimes();
        }
            
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
            java.util.logging.Logger.getLogger(ReportDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReportDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReportDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReportDoctors.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReportDoctors().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bar;
    private javax.swing.JLabel Details;
    private javax.swing.JLabel Details1;
    private javax.swing.JLabel Details2;
    public static final javax.swing.JLabel Dname = new javax.swing.JLabel();
    public static final javax.swing.JComboBox<String> Doname = new javax.swing.JComboBox<>();
    private javax.swing.JLabel Times;
    private javax.swing.JLabel Times1;
    private javax.swing.JLabel Times2;
    private javax.swing.JTable TimesLest;
    private javax.swing.JLabel _;
    private javax.swing.JLabel _1;
    private javax.swing.JTable detailsLest;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel prinDit;
    private javax.swing.JLabel prinDit1;
    private javax.swing.JLabel prinTim;
    private javax.swing.JLabel prinTim1;
    private javax.swing.JPanel printDit;
    private javax.swing.JPanel printTim;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables
}
