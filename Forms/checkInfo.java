/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import javax.swing.JOptionPane;

/**
 *
 * @author Ahmed Kassem
 */
public class checkInfo extends javax.swing.JFrame {

    int mousex;
    int mousey;

    /**
     * Creates new form checkInfo
     */
    public checkInfo() {
        initComponents();
        x1.setVisible(false);
        x1.setEnabled(false);
        _1.setVisible(false);
        _1.setEnabled(false);
        exit1.setVisible(false);
        exit1.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane3 = new javax.swing.JScrollPane();
        jScrollPane4 = new javax.swing.JScrollPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        exit = new javax.swing.JLabel();
        exit1 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        _ = new javax.swing.JLabel();
        _1 = new javax.swing.JLabel();
        Bar = new javax.swing.JLabel();
        main = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        ChNumI.setEditable(false);
        ChNumI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ChNumI.setForeground(new java.awt.Color(255, 255, 255));
        ChNumI.setBorder(null);
        ChNumI.setCaretColor(new java.awt.Color(255, 255, 255));
        ChNumI.setOpaque(false);
        getContentPane().add(ChNumI);
        ChNumI.setBounds(652, 51, 146, 29);

        ReNumI.setEditable(false);
        ReNumI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        ReNumI.setForeground(new java.awt.Color(255, 255, 255));
        ReNumI.setBorder(null);
        ReNumI.setCaretColor(new java.awt.Color(255, 255, 255));
        ReNumI.setOpaque(false);
        getContentPane().add(ReNumI);
        ReNumI.setBounds(652, 110, 146, 29);

        DoNumI.setEditable(false);
        DoNumI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        DoNumI.setForeground(new java.awt.Color(255, 255, 255));
        DoNumI.setBorder(null);
        DoNumI.setCaretColor(new java.awt.Color(255, 255, 255));
        DoNumI.setOpaque(false);
        getContentPane().add(DoNumI);
        DoNumI.setBounds(340, 50, 150, 30);

        PeNumI.setEditable(false);
        PeNumI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        PeNumI.setForeground(new java.awt.Color(255, 255, 255));
        PeNumI.setBorder(null);
        PeNumI.setCaretColor(new java.awt.Color(255, 255, 255));
        PeNumI.setOpaque(false);
        getContentPane().add(PeNumI);
        PeNumI.setBounds(340, 110, 150, 30);

        PeNameI.setEditable(false);
        PeNameI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        PeNameI.setForeground(new java.awt.Color(255, 255, 255));
        PeNameI.setBorder(null);
        PeNameI.setCaretColor(new java.awt.Color(255, 255, 255));
        PeNameI.setOpaque(false);
        getContentPane().add(PeNameI);
        PeNameI.setBounds(672, 202, 144, 30);

        PeAgeI.setEditable(false);
        PeAgeI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        PeAgeI.setForeground(new java.awt.Color(255, 255, 255));
        PeAgeI.setBorder(null);
        PeAgeI.setCaretColor(new java.awt.Color(255, 255, 255));
        PeAgeI.setOpaque(false);
        getContentPane().add(PeAgeI);
        PeAgeI.setBounds(494, 202, 83, 30);

        heightI.setEditable(false);
        heightI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        heightI.setForeground(new java.awt.Color(255, 255, 255));
        heightI.setBorder(null);
        heightI.setCaretColor(new java.awt.Color(255, 255, 255));
        heightI.setOpaque(false);
        getContentPane().add(heightI);
        heightI.setBounds(827, 330, 80, 30);

        widthI.setEditable(false);
        widthI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        widthI.setForeground(new java.awt.Color(255, 255, 255));
        widthI.setBorder(null);
        widthI.setCaretColor(new java.awt.Color(255, 255, 255));
        widthI.setOpaque(false);
        getContentPane().add(widthI);
        widthI.setBounds(710, 330, 80, 30);

        pressI.setEditable(false);
        pressI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pressI.setForeground(new java.awt.Color(255, 255, 255));
        pressI.setBorder(null);
        pressI.setCaretColor(new java.awt.Color(255, 255, 255));
        pressI.setOpaque(false);
        getContentPane().add(pressI);
        pressI.setBounds(592, 330, 80, 30);

        sugarI.setEditable(false);
        sugarI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        sugarI.setForeground(new java.awt.Color(255, 255, 255));
        sugarI.setBorder(null);
        sugarI.setCaretColor(new java.awt.Color(255, 255, 255));
        sugarI.setOpaque(false);
        getContentPane().add(sugarI);
        sugarI.setBounds(475, 330, 80, 30);

        tempI.setEditable(false);
        tempI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tempI.setForeground(new java.awt.Color(255, 255, 255));
        tempI.setBorder(null);
        tempI.setCaretColor(new java.awt.Color(255, 255, 255));
        tempI.setOpaque(false);
        getContentPane().add(tempI);
        tempI.setBounds(359, 330, 80, 30);

        jScrollPane1.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane1.setBorder(null);

        tybeI.setEditable(false);
        tybeI.setBackground(new java.awt.Color(23, 39, 90));
        tybeI.setColumns(20);
        tybeI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        tybeI.setForeground(new java.awt.Color(255, 255, 255));
        tybeI.setLineWrap(true);
        tybeI.setRows(5);
        tybeI.setBorder(null);
        tybeI.setCaretColor(new java.awt.Color(255, 255, 255));
        tybeI.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane1.setViewportView(tybeI);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(773, 490, 145, 65);

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane2.setBorder(null);

        thalelI.setEditable(false);
        thalelI.setBackground(new java.awt.Color(23, 39, 90));
        thalelI.setColumns(20);
        thalelI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        thalelI.setForeground(new java.awt.Color(255, 255, 255));
        thalelI.setLineWrap(true);
        thalelI.setRows(5);
        thalelI.setBorder(null);
        thalelI.setCaretColor(new java.awt.Color(255, 255, 255));
        thalelI.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane2.setViewportView(thalelI);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(605, 490, 145, 65);

        jScrollPane3.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane3.setBorder(null);

        eshaatI.setEditable(false);
        eshaatI.setBackground(new java.awt.Color(23, 39, 90));
        eshaatI.setColumns(20);
        eshaatI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        eshaatI.setForeground(new java.awt.Color(255, 255, 255));
        eshaatI.setLineWrap(true);
        eshaatI.setRows(5);
        eshaatI.setBorder(null);
        eshaatI.setCaretColor(new java.awt.Color(255, 255, 255));
        eshaatI.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane3.setViewportView(eshaatI);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(435, 490, 145, 65);

        jScrollPane4.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane4.setBorder(null);

        dwaaI.setEditable(false);
        dwaaI.setBackground(new java.awt.Color(23, 39, 90));
        dwaaI.setColumns(20);
        dwaaI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        dwaaI.setForeground(new java.awt.Color(255, 255, 255));
        dwaaI.setLineWrap(true);
        dwaaI.setRows(5);
        dwaaI.setBorder(null);
        dwaaI.setCaretColor(new java.awt.Color(255, 255, 255));
        dwaaI.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane4.setViewportView(dwaaI);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(245, 466, 145, 120);

        jScrollPane6.setBackground(new java.awt.Color(0, 0, 102));
        jScrollPane6.setBorder(null);

        notesI.setEditable(false);
        notesI.setBackground(new java.awt.Color(23, 39, 90));
        notesI.setColumns(20);
        notesI.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        notesI.setForeground(new java.awt.Color(255, 255, 255));
        notesI.setLineWrap(true);
        notesI.setRows(5);
        notesI.setBorder(null);
        notesI.setCaretColor(new java.awt.Color(255, 255, 255));
        notesI.setSelectionColor(new java.awt.Color(102, 102, 102));
        jScrollPane6.setViewportView(notesI);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(62, 466, 145, 120);

        Cdate.setEditable(false);
        Cdate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Cdate.setForeground(new java.awt.Color(255, 255, 255));
        Cdate.setBorder(null);
        Cdate.setCaretColor(new java.awt.Color(255, 255, 255));
        Cdate.setOpaque(false);
        getContentPane().add(Cdate);
        Cdate.setBounds(34, 115, 145, 27);

        Rdate.setEditable(false);
        Rdate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Rdate.setForeground(new java.awt.Color(255, 255, 255));
        Rdate.setBorder(null);
        Rdate.setCaretColor(new java.awt.Color(255, 255, 255));
        Rdate.setOpaque(false);
        getContentPane().add(Rdate);
        Rdate.setBounds(34, 200, 145, 27);

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
        exit.setBounds(37, 336, 108, 36);

        exit1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/????????info.png"))); // NOI18N
        getContentPane().add(exit1);
        exit1.setBounds(37, 336, 108, 36);

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
        x.setBounds(928, 0, 23, 20);

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RX.png"))); // NOI18N
        getContentPane().add(x1);
        x1.setBounds(928, 0, 23, 20);

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
        _.setBounds(909, 0, 20, 20);

        _1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R_.png"))); // NOI18N
        getContentPane().add(_1);
        _1.setBounds(909, 0, 20, 20);

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
        Bar.setBounds(0, 0, 905, 21);

        main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Check Up Info.png"))); // NOI18N
        getContentPane().add(main);
        main.setBounds(0, 0, 950, 633);

        setSize(new java.awt.Dimension(950, 633));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitMouseClicked

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
        exit1.setVisible(true);
        exit1.setEnabled(true);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit1.setVisible(false);
        exit1.setEnabled(false);
    }//GEN-LAST:event_exitMouseExited

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        this.dispose();
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
        this.setState(Reservations.ICONIFIED);
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

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DB.GO.icon(this);
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
            java.util.logging.Logger.getLogger(checkInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(checkInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(checkInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(checkInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new checkInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bar;
    public static final javax.swing.JTextField Cdate = new javax.swing.JTextField();
    public static final javax.swing.JTextField ChNumI = new javax.swing.JTextField();
    public static final javax.swing.JTextField DoNumI = new javax.swing.JTextField();
    public static final javax.swing.JTextField PeAgeI = new javax.swing.JTextField();
    public static final javax.swing.JTextField PeNameI = new javax.swing.JTextField();
    public static final javax.swing.JTextField PeNumI = new javax.swing.JTextField();
    public static final javax.swing.JTextField Rdate = new javax.swing.JTextField();
    public static final javax.swing.JTextField ReNumI = new javax.swing.JTextField();
    private javax.swing.JLabel _;
    private javax.swing.JLabel _1;
    public static final javax.swing.JTextArea dwaaI = new javax.swing.JTextArea();
    public static final javax.swing.JTextArea eshaatI = new javax.swing.JTextArea();
    private javax.swing.JLabel exit;
    private javax.swing.JLabel exit1;
    public static final javax.swing.JTextField heightI = new javax.swing.JTextField();
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JLabel main;
    public static final javax.swing.JTextArea notesI = new javax.swing.JTextArea();
    public static final javax.swing.JTextField pressI = new javax.swing.JTextField();
    public static final javax.swing.JTextField sugarI = new javax.swing.JTextField();
    public static final javax.swing.JTextField tempI = new javax.swing.JTextField();
    public static final javax.swing.JTextArea thalelI = new javax.swing.JTextArea();
    public static final javax.swing.JTextArea tybeI = new javax.swing.JTextArea();
    public static final javax.swing.JTextField widthI = new javax.swing.JTextField();
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables
}
