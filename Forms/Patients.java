/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ahmed Kassem
 */
public class Patients extends javax.swing.JFrame {

    int mousex;
    int mousey;

    /**
     * Creates new form Patients
     */
    public Patients() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
        PShow.setEnabled(false);
        PShow.setVisible(false);
        Add1.setEnabled(false);
        Add1.setVisible(false);
        Show1.setEnabled(false);
        Show1.setVisible(false);
        Show2.setEnabled(false);
        Show2.setVisible(false);
        Home1.setEnabled(false);
        Home1.setVisible(false);
        x1.setEnabled(false);
        x1.setVisible(false);
        _1.setEnabled(false);
        _1.setVisible(false);
        Back1.setEnabled(false);
        Back1.setVisible(false);
        Update1.setEnabled(false);
        Update1.setVisible(false);
        Delete1.setEnabled(false);
        Delete1.setVisible(false);
        Resr1.setVisible(false);
        Resr1.setEnabled(false);
        LestPat.getTableHeader().setReorderingAllowed(false);
        LestPat.getTableHeader().setBackground(new Color(102, 102, 102));
        LestPat.getTableHeader().setForeground(Color.BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        _ = new javax.swing.JLabel();
        _1 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        Show = new javax.swing.JLabel();
        Show1 = new javax.swing.JLabel();
        Show2 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Home1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        P = new javax.swing.JPanel();
        Add = new javax.swing.JLabel();
        Add1 = new javax.swing.JLabel();
        Resr = new javax.swing.JLabel();
        Resr1 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        FName = new javax.swing.JTextField();
        LName = new javax.swing.JTextField();
        Phone = new javax.swing.JTextField();
        Gendar = new javax.swing.JComboBox<>();
        Birth = new com.toedter.calendar.JDateChooser();
        Main1 = new javax.swing.JLabel();
        PShow = new javax.swing.JPanel();
        Back = new javax.swing.JLabel();
        Back1 = new javax.swing.JLabel();
        Update = new javax.swing.JLabel();
        Update1 = new javax.swing.JLabel();
        Delete = new javax.swing.JLabel();
        Delete1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LestPat = new javax.swing.JTable();
        Main2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

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
        _.setBounds(896, -1, 22, 22);

        _1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/15.png"))); // NOI18N
        getContentPane().add(_1);
        _1.setBounds(896, -1, 22, 22);

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
        x.setBounds(919, 1, 22, 18);

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/13.png"))); // NOI18N
        x1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(x1);
        x1.setBounds(917, -1, 24, 22);

        Show.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Show.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ShowMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ShowMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ShowMouseExited(evt);
            }
        });
        getContentPane().add(Show);
        Show.setBounds(52, 201, 195, 33);

        Show1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/عرض المرضى.png"))); // NOI18N
        getContentPane().add(Show1);
        Show1.setBounds(52, 201, 195, 33);

        Show2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/عرض المرضى.png"))); // NOI18N
        getContentPane().add(Show2);
        Show2.setBounds(52, 201, 195, 33);

        Home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HomeMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HomeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HomeMouseExited(evt);
            }
        });
        getContentPane().add(Home);
        Home.setBounds(52, 409, 195, 33);

        Home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/خروج.png"))); // NOI18N
        getContentPane().add(Home1);
        Home1.setBounds(52, 409, 195, 33);

        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jLabel2MouseDragged(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 900, 20);

        P.setLayout(null);

        Add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddMouseExited(evt);
            }
        });
        P.add(Add);
        Add.setBounds(52, 132, 195, 33);

        Add1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/تسجيل.png"))); // NOI18N
        P.add(Add1);
        Add1.setBounds(52, 132, 195, 33);

        Resr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Resr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ResrMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ResrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ResrMouseExited(evt);
            }
        });
        P.add(Resr);
        Resr.setBounds(52, 269, 195, 33);

        Resr1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/حجز جديد.png"))); // NOI18N
        P.add(Resr1);
        Resr1.setBounds(52, 269, 195, 33);

        ID.setEditable(false);
        ID.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ID.setBorder(null);
        ID.setOpaque(false);
        P.add(ID);
        ID.setBounds(622, 133, 151, 29);

        FName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        FName.setBorder(null);
        FName.setOpaque(false);
        P.add(FName);
        FName.setBounds(622, 187, 151, 29);

        LName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        LName.setBorder(null);
        LName.setOpaque(false);
        P.add(LName);
        LName.setBounds(622, 239, 151, 29);

        Phone.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Phone.setBorder(null);
        Phone.setOpaque(false);
        P.add(Phone);
        Phone.setBounds(622, 291, 151, 29);

        Gendar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Gendar.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "ذكر", "أنثى" }));
        Gendar.setBorder(null);
        Gendar.setOpaque(false);
        P.add(Gendar);
        Gendar.setBounds(617, 343, 161, 29);

        Birth.setDateFormatString("yyyy-MM-dd");
        Birth.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Birth.setOpaque(false);
        P.add(Birth);
        Birth.setBounds(619, 397, 160, 31);

        Main1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Patients.png"))); // NOI18N
        P.add(Main1);
        Main1.setBounds(0, 0, 940, 506);

        getContentPane().add(P);
        P.setBounds(0, 0, 940, 506);

        PShow.setLayout(null);

        Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BackMouseExited(evt);
            }
        });
        PShow.add(Back);
        Back.setBounds(52, 132, 195, 33);

        Back1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/رجوع.png"))); // NOI18N
        PShow.add(Back1);
        Back1.setBounds(52, 132, 195, 33);

        Update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UpdateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UpdateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UpdateMouseExited(evt);
            }
        });
        PShow.add(Update);
        Update.setBounds(52, 270, 195, 33);

        Update1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/تعديل.png"))); // NOI18N
        PShow.add(Update1);
        Update1.setBounds(52, 270, 195, 33);

        Delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeleteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DeleteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DeleteMouseExited(evt);
            }
        });
        PShow.add(Delete);
        Delete.setBounds(50, 340, 195, 33);

        Delete1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/حذف.png"))); // NOI18N
        PShow.add(Delete1);
        Delete1.setBounds(50, 340, 195, 33);

        LestPat.setBackground(new java.awt.Color(184, 197, 251));
        LestPat.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LestPat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "رقم المريض", "اسم المريض", "التليفون", "النوع", "تاريخ الميلاد", "العمر"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LestPat.setGridColor(new java.awt.Color(51, 51, 51));
        LestPat.setOpaque(false);
        LestPat.setSelectionBackground(new java.awt.Color(102, 102, 102));
        LestPat.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jScrollPane1.setViewportView(LestPat);

        PShow.add(jScrollPane1);
        jScrollPane1.setBounds(310, 120, 600, 350);

        Main2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Patients Show.png"))); // NOI18N
        PShow.add(Main2);
        Main2.setBounds(0, 0, 940, 506);

        getContentPane().add(PShow);
        PShow.setBounds(0, 0, 940, 506);

        setBounds(0, 0, 940, 506);
    }// </editor-fold>//GEN-END:initComponents
public void Lested() {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("رقم المريض");
        table.addColumn("الإسم");
        table.addColumn("التليفون");
        table.addColumn("النوع");
        table.addColumn("تاريخ الميلاد");
        table.addColumn("العمر");

        try {
            Connection con = DB.ConectionDB.setconn();
            Statement st = con.createStatement();
            String strs = "SELECT * FROM PATIENTS";
            ResultSet r = st.executeQuery(strs);

            while (r.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(5),
                    r.getString(6),});
            }
            LestPat.setModel(table);

        } catch (Exception ex) {

        }
    }
    private void ShowMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseClicked
        PShow.setEnabled(true);
        PShow.setVisible(true);
        P.setEnabled(false);
        P.setVisible(false);
        Show2.setEnabled(true);
        Show2.setVisible(true);
        Lested();
    }//GEN-LAST:event_ShowMouseClicked

    private void ShowMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseEntered
        Show1.setEnabled(true);
        Show1.setVisible(true);
    }//GEN-LAST:event_ShowMouseEntered

    private void ShowMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ShowMouseExited
        Show1.setEnabled(false);
        Show1.setVisible(false);
    }//GEN-LAST:event_ShowMouseExited

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        int q = JOptionPane.showConfirmDialog(this, "اضغط موافق لتأكيد الخروج", "خروج", JOptionPane.OK_CANCEL_OPTION);
        if (q == JOptionPane.OK_OPTION) {
            this.dispose();
        } else {

        }
    }//GEN-LAST:event_HomeMouseClicked

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        Home1.setEnabled(true);
        Home1.setVisible(true);
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Home1.setEnabled(false);
        Home1.setVisible(false);
    }//GEN-LAST:event_HomeMouseExited

    private void jLabel2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mousex, y - mousey);
    }//GEN-LAST:event_jLabel2MouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        mousex = evt.getX();
        mousey = evt.getY();
    }//GEN-LAST:event_jLabel2MousePressed

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

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        int q = JOptionPane.showConfirmDialog(this, "اضغط موافق لتأكيد الخروج", "خروج", JOptionPane.OK_CANCEL_OPTION);
        if (q == JOptionPane.OK_OPTION) {
            this.dispose();
        } else {

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
    public void lestNR() {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("رقم المريض");
        table.addColumn("اسم المريض");
        table.addColumn("التليفون");
        table.addColumn("النوع");
        table.addColumn("العمر");

        try {
            Connection con = DB.ConectionDB.setconn();
            String strs = "SELECT * FROM PATIENTS";
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(strs);

            while (r.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(6),});
                MainForm.LestPE.setModel(table);
                MainFormE.LestPE.setModel(table);
            }
        } catch (Exception ex) {
        }
    }
    private void AddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseClicked
        if ("".equals(ID.getText()) || "".equals(FName.getText()) || "".equals(LName.getText()) || "".equals(Phone.getText()) || "".equals(Birth.getCalendar()) || "".equals(Gendar.getSelectedItem())) {
            JOptionPane.showMessageDialog(this, "رجاء ادخال جميع البيانات ", "خطأ", JOptionPane.ERROR_MESSAGE);
        } else {

            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String birth = f.format(Birth.getDate());
            Date date = new Date();
            SimpleDateFormat fn = new SimpleDateFormat("yyyy");
            int b = Integer.parseInt(fn.format(Birth.getDate()));
            int bn = Integer.parseInt(fn.format(date));
            int age = bn - b;
            String stra = "INSERT INTO PATIENTS VALUES (" + ID.getText() + ", '" + FName.getText() + " " + LName.getText() + "', '" + Phone.getText() + "', '" + Gendar.getSelectedItem() + "', '" + birth + "', " + age + ")";
            boolean ifadd = DB.GO.runNunQuery(stra);
            if (ifadd) {
                JOptionPane.showMessageDialog(this, "تم تسجيل البيانات", "نجح", JOptionPane.WARNING_MESSAGE);
                Controls.Tools.clearText(this);
                Gendar.setSelectedItem("");
                ID.setText(DB.GO.autoNumber("patients", "number"));
                lestNR();
            } else {
                JOptionPane.showMessageDialog(this, "لم يتم تسجيل البيانات", "خطأ", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_AddMouseClicked

    private void AddMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseEntered
        Add1.setEnabled(true);
        Add1.setVisible(true);
    }//GEN-LAST:event_AddMouseEntered

    private void AddMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddMouseExited
        Add1.setEnabled(false);
        Add1.setVisible(false);
    }//GEN-LAST:event_AddMouseExited

    private void BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseClicked
        PShow.setEnabled(false);
        PShow.setVisible(false);
        P.setEnabled(true);
        P.setVisible(true);
        Show2.setEnabled(false);
        Show2.setVisible(false);
    }//GEN-LAST:event_BackMouseClicked

    private void BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseEntered
        Back1.setEnabled(true);
        Back1.setVisible(true);
    }//GEN-LAST:event_BackMouseEntered

    private void BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BackMouseExited
        Back1.setEnabled(false);
        Back1.setVisible(false);
    }//GEN-LAST:event_BackMouseExited

    private void UpdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseClicked
        int row = LestPat.getSelectedRow();
        String id = LestPat.getValueAt(row, 0).toString();
        String name = LestPat.getValueAt(row, 1).toString();
        String phone = LestPat.getValueAt(row, 2).toString();
        String gender = LestPat.getValueAt(row, 3).toString();
        String age = LestPat.getValueAt(row, 4).toString();

        String stru = "UPDATE PATIENTS SET NAME='" + name + "', PHONE='" + phone + "', SEX='" + gender + "', Age=" + age + " WHERE NUMBER=" + id;
        boolean ifu = DB.GO.runNunQuery(stru);
        if (ifu) {
            JOptionPane.showMessageDialog(this, "تم تعديل البيانات", "نجح", JOptionPane.WARNING_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this, "لم يتم تعديل البيانات", "خطأ", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_UpdateMouseClicked

    private void UpdateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseEntered
        Update1.setEnabled(true);
        Update1.setVisible(true);
    }//GEN-LAST:event_UpdateMouseEntered

    private void UpdateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UpdateMouseExited
        Update1.setEnabled(false);
        Update1.setVisible(false);
    }//GEN-LAST:event_UpdateMouseExited

    private void DeleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseClicked
        int d = JOptionPane.showConfirmDialog(this, "هل تريد حذف المحدد ؟");
        if (d == JOptionPane.YES_OPTION) {
            int row = LestPat.getSelectedRow();
            String id = LestPat.getValueAt(row, 0).toString();
            String strD = "DELETE FROM PATIENTS WHERE NUMBER =" + id;
            boolean ifD = DB.GO.runNunQuery(strD);
            if (ifD) {
                JOptionPane.showMessageDialog(this, "تم حذف البيانات", "نجح", JOptionPane.WARNING_MESSAGE);
                Lested();
            }
        } else {
            JOptionPane.showMessageDialog(this, "لم يتم حذف شيئ", "خطأ", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_DeleteMouseClicked

    private void DeleteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseEntered
        Delete1.setEnabled(true);
        Delete1.setVisible(true);
    }//GEN-LAST:event_DeleteMouseEntered

    private void DeleteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeleteMouseExited
        Delete1.setEnabled(false);
        Delete1.setVisible(false);
    }//GEN-LAST:event_DeleteMouseExited

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DB.GO.icon(this);
        ID.setText(DB.GO.autoNumber("patients", "number"));
    }//GEN-LAST:event_formWindowOpened

    private void ResrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResrMouseEntered
        Resr1.setVisible(true);
        Resr1.setEnabled(true);
    }//GEN-LAST:event_ResrMouseEntered

    private void ResrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResrMouseExited
        Resr1.setVisible(false);
        Resr1.setEnabled(false);
    }//GEN-LAST:event_ResrMouseExited

    private void ResrMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ResrMouseClicked
        int q = JOptionPane.showConfirmDialog(this, "اضغط موافق اذا تأكدت من تسجيل المريض قبل الحجز", "تنبيه", JOptionPane.OK_CANCEL_OPTION);
        if (q == JOptionPane.OK_OPTION) {
            new Reservations().setVisible(true);
            this.dispose();
            Reservations.Pnum.setText(DB.GO.auto("patients", "Number"));
            try {
                Connection con = DB.ConectionDB.setconn();
                String strs = "SELECT * FROM PATIENTS WHERE NUMBER like '%" + Reservations.Pnum.getText() + "%'";
                Statement st = con.createStatement();
                ResultSet r = st.executeQuery(strs);

                while (r.next()) {

                    String num = r.getString(1);
                    String nam = r.getString(2);

                    Reservations.Pname.setText(nam);
                    Reservations.patientDate.setDate(r.getDate(5));
                }
            } catch (Exception ex) {
                ex.getMessage();
            }
        } else {

        }

    }//GEN-LAST:event_ResrMouseClicked

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
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Patients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Patients().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add;
    private javax.swing.JLabel Add1;
    private javax.swing.JLabel Back;
    private javax.swing.JLabel Back1;
    private com.toedter.calendar.JDateChooser Birth;
    private javax.swing.JLabel Delete;
    private javax.swing.JLabel Delete1;
    private javax.swing.JTextField FName;
    private javax.swing.JComboBox<String> Gendar;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home1;
    private javax.swing.JTextField ID;
    private javax.swing.JTextField LName;
    private javax.swing.JTable LestPat;
    private javax.swing.JLabel Main1;
    private javax.swing.JLabel Main2;
    private javax.swing.JPanel P;
    private javax.swing.JPanel PShow;
    private javax.swing.JTextField Phone;
    private javax.swing.JLabel Resr;
    private javax.swing.JLabel Resr1;
    private javax.swing.JLabel Show;
    private javax.swing.JLabel Show1;
    private javax.swing.JLabel Show2;
    private javax.swing.JLabel Update;
    private javax.swing.JLabel Update1;
    private javax.swing.JLabel _;
    private javax.swing.JLabel _1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables

}
