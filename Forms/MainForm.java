/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Forms;

import com.sun.corba.se.impl.protocol.giopmsgheaders.CancelRequestMessage;
import com.sun.javafx.scene.control.skin.TableColumnHeader;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ButtonBar;
import javafx.scene.input.KeyCode;
import javax.imageio.ImageIO;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import sun.java2d.pipe.SpanShapeRenderer;
import sun.util.ResourceBundleEnumeration;

/**
 *
 * @author Ahmed Kassem
 */
public class MainForm extends javax.swing.JFrame {

    int mousex;
    int mousey;

    public MainForm() {
        initComponents();
        this.setBackground(new Color(0, 0, 0, 0));
        R1.setEnabled(false);
        R1.setVisible(false);
        R2.setEnabled(false);
        R2.setVisible(false);
        Home1.setEnabled(false);
        Home1.setVisible(false);
        User1.setEnabled(false);
        User1.setVisible(false);
        logout1.setEnabled(false);
        logout1.setVisible(false);
        Reprt1.setEnabled(false);
        Reprt1.setVisible(false);
        Reprt2.setEnabled(false);
        Reprt2.setVisible(false);
        Account1.setEnabled(false);
        Account1.setVisible(false);
        Account2.setEnabled(false);
        Account2.setVisible(false);
        Date1.setEnabled(false);
        Date1.setVisible(false);
        Date2.setEnabled(false);
        Date2.setVisible(false);
        AddD1.setEnabled(false);
        AddD1.setVisible(false);
        AddE1.setEnabled(false);
        AddE1.setVisible(false);
        x1.setEnabled(false);
        x1.setVisible(false);
        _1.setEnabled(false);
        _1.setVisible(false);
        SH1.setEnabled(false);
        SH1.setVisible(false);
        BK1.setEnabled(false);
        BK1.setVisible(false);
        BM1.setEnabled(false);
        BM1.setVisible(false);
        HG1.setEnabled(false);
        HG1.setVisible(false);
        KG1.setEnabled(false);
        KG1.setVisible(false);
        MH1.setEnabled(false);
        MH1.setVisible(false);
        refresh1.setVisible(false);
        refresh1.setEnabled(false);
        refreshR1.setVisible(false);
        refreshR1.setEnabled(false);
        report.setEnabled(false);
        report.setVisible(false);
        NewR.setEnabled(false);
        NewR.setVisible(false);
        Times.setVisible(false);
        Times.setEnabled(false);
        Chek.setVisible(false);
        Chek.setEnabled(false);
        RChek.setVisible(false);
        RChek.setEnabled(false);
        Resrv.setVisible(false);
        Resrv.setEnabled(false);
        NewRes.setVisible(false);
        NewRes.setEnabled(false);
        SearchCH.setVisible(false);
        SearchCH.setEnabled(false);
        SearchPE.setVisible(false);
        SearchPE.setEnabled(false);
        Acc.setVisible(false);
        Acc.setEnabled(false);
        SearchRes1.setVisible(false);
        SearchRes1.setEnabled(false);
        AddPR1.setVisible(false);
        AddPR1.setEnabled(false);
        re.setVisible(false);
        re.setEnabled(false);
        pe.setVisible(false);
        pe.setEnabled(false);
        Hgs1.setVisible(false);
        Hgs1.setEnabled(false);
        Hgs2.setVisible(false);
        Hgs2.setEnabled(false);
        MR1.setVisible(false);
        MR1.setEnabled(false);
        MR2.setVisible(false);
        MR2.setEnabled(false);
        serch3.setVisible(false);
        serch3.setEnabled(false);
        serch1.setVisible(false);
        serch1.setEnabled(false);
        serch5.setVisible(false);
        serch5.setEnabled(false);
        SePE1.setVisible(false);
        SePE1.setEnabled(false);
        accL1.setVisible(false);
        accL1.setEnabled(false);
        exp1.setVisible(false);
        exp1.setEnabled(false);
        accD1.setVisible(false);
        accD1.setEnabled(false);

        petien1.setVisible(false);
        petien1.setEnabled(false);
        checkup1.setVisible(false);
        checkup1.setEnabled(false);
        accun1.setVisible(false);
        accun1.setEnabled(false);
        doctors1.setVisible(false);
        doctors1.setEnabled(false);
        employees1.setVisible(false);
        employees1.setEnabled(false);
        expens1.setVisible(false);
        expens1.setEnabled(false);
        r.setVisible(false);
        r.setEnabled(false);

        LestCh.getTableHeader().setReorderingAllowed(false);
        LestCh.getTableHeader().setResizingAllowed(true);
        LestPE.getTableHeader().setReorderingAllowed(false);
        LestPE.getTableHeader().setResizingAllowed(true);
        Lestre.getTableHeader().setReorderingAllowed(false);
        Lestre.getTableHeader().setResizingAllowed(true);
        LPE.getTableHeader().setReorderingAllowed(false);
        LCH.getTableHeader().setReorderingAllowed(false);
        LRE.getTableHeader().setReorderingAllowed(false);
        LestRCh.getTableHeader().setReorderingAllowed(false);
        LestRCh.getTableHeader().setResizingAllowed(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSearchPe = new javax.swing.ButtonGroup();
        PopupMenu = new javax.swing.JPopupMenu();
        cost = new javax.swing.JMenuItem();
        delete = new javax.swing.JMenuItem();
        R = new javax.swing.JLabel();
        R1 = new javax.swing.JLabel();
        R2 = new javax.swing.JLabel();
        R3 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        LestRCh = new javax.swing.JTable();
        refreshR = new javax.swing.JLabel();
        refreshR1 = new javax.swing.JLabel();
        RCHdate = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        KG = new javax.swing.JLabel();
        KG1 = new javax.swing.JLabel();
        BK = new javax.swing.JLabel();
        BK1 = new javax.swing.JLabel();
        BM = new javax.swing.JLabel();
        BM1 = new javax.swing.JLabel();
        HG1 = new javax.swing.JLabel();
        MH = new javax.swing.JLabel();
        MH1 = new javax.swing.JLabel();
        SH = new javax.swing.JLabel();
        SH1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Chek = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        LestCh = new javax.swing.JTable();
        refresh = new javax.swing.JLabel();
        refresh1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SePE = new javax.swing.JLabel();
        SePE1 = new javax.swing.JLabel();
        PESearch = new javax.swing.JTextField();
        PESearch1 = new javax.swing.JLabel();
        btnpho = new javax.swing.JRadioButton();
        btnnam = new javax.swing.JRadioButton();
        btnnum = new javax.swing.JRadioButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        LCH = new javax.swing.JTable();
        serCH = new javax.swing.JLabel();
        serch5 = new javax.swing.JLabel();
        CHdate = new com.toedter.calendar.JDateChooser();
        jLabel11 = new javax.swing.JLabel();
        NewRes = new javax.swing.JPanel();
        pe = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        SearchRes = new javax.swing.JLabel();
        SearchRes1 = new javax.swing.JLabel();
        LSearch = new javax.swing.JLabel();
        Search = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        re = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        serch2 = new javax.swing.JLabel();
        serch3 = new javax.swing.JLabel();
        PRdate = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        AddPR = new javax.swing.JLabel();
        AddPR1 = new javax.swing.JLabel();
        Hgs = new javax.swing.JLabel();
        Hgs1 = new javax.swing.JLabel();
        Hgs2 = new javax.swing.JLabel();
        MR = new javax.swing.JLabel();
        MR1 = new javax.swing.JLabel();
        MR2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        LRE = new javax.swing.JTable();
        ser = new javax.swing.JLabel();
        serch1 = new javax.swing.JLabel();
        Rdate3 = new com.toedter.calendar.JDateChooser();
        jLabel8 = new javax.swing.JLabel();
        report = new javax.swing.JPanel();
        petien = new javax.swing.JLabel();
        petien1 = new javax.swing.JLabel();
        checkup = new javax.swing.JLabel();
        checkup1 = new javax.swing.JLabel();
        accun = new javax.swing.JLabel();
        accun1 = new javax.swing.JLabel();
        doctors = new javax.swing.JLabel();
        doctors1 = new javax.swing.JLabel();
        employees = new javax.swing.JLabel();
        employees1 = new javax.swing.JLabel();
        expens = new javax.swing.JLabel();
        expens1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        NewR = new javax.swing.JPanel();
        User = new javax.swing.JLabel();
        User1 = new javax.swing.JLabel();
        AddE = new javax.swing.JLabel();
        AddE1 = new javax.swing.JLabel();
        AddD = new javax.swing.JLabel();
        AddD1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Acc = new javax.swing.JPanel();
        accL = new javax.swing.JLabel();
        accL1 = new javax.swing.JLabel();
        exp = new javax.swing.JLabel();
        exp1 = new javax.swing.JLabel();
        accD = new javax.swing.JLabel();
        accD1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        Times = new javax.swing.JPanel();
        name = new javax.swing.JComboBox<>();
        SSfrom = new javax.swing.JTextField();
        SSto = new javax.swing.JTextField();
        SSUfrom = new javax.swing.JTextField();
        SSUto = new javax.swing.JTextField();
        MMfrom = new javax.swing.JTextField();
        MMto = new javax.swing.JTextField();
        TTfrom = new javax.swing.JTextField();
        TTto = new javax.swing.JTextField();
        WWto = new javax.swing.JTextField();
        WWfrom = new javax.swing.JTextField();
        TTHfrom = new javax.swing.JTextField();
        TTHto = new javax.swing.JTextField();
        FFto = new javax.swing.JTextField();
        FFfrom = new javax.swing.JTextField();
        Sfrom = new javax.swing.JTextField();
        Sto = new javax.swing.JTextField();
        SUfrom = new javax.swing.JTextField();
        SUto = new javax.swing.JTextField();
        Mfrom = new javax.swing.JTextField();
        Mto = new javax.swing.JTextField();
        Tfrom = new javax.swing.JTextField();
        Tto = new javax.swing.JTextField();
        Wfrom = new javax.swing.JTextField();
        Wto = new javax.swing.JTextField();
        THfrom = new javax.swing.JTextField();
        THto = new javax.swing.JTextField();
        Ffrom = new javax.swing.JTextField();
        Fto = new javax.swing.JTextField();
        MMfrom1 = new javax.swing.JLabel();
        MMto1 = new javax.swing.JLabel();
        Mfrom1 = new javax.swing.JLabel();
        Mto1 = new javax.swing.JLabel();
        SSUfrom1 = new javax.swing.JLabel();
        Sfrom1 = new javax.swing.JLabel();
        SUfrom1 = new javax.swing.JLabel();
        SSfrom1 = new javax.swing.JLabel();
        SUto1 = new javax.swing.JLabel();
        SSUto1 = new javax.swing.JLabel();
        Sto1 = new javax.swing.JLabel();
        SSto1 = new javax.swing.JLabel();
        TTfrom1 = new javax.swing.JLabel();
        TTto1 = new javax.swing.JLabel();
        Tfrom1 = new javax.swing.JLabel();
        Tto1 = new javax.swing.JLabel();
        WWfrom1 = new javax.swing.JLabel();
        WWto1 = new javax.swing.JLabel();
        Wfrom1 = new javax.swing.JLabel();
        Wto1 = new javax.swing.JLabel();
        TTHfrom1 = new javax.swing.JLabel();
        TTHto1 = new javax.swing.JLabel();
        THfrom1 = new javax.swing.JLabel();
        THto1 = new javax.swing.JLabel();
        FFfrom1 = new javax.swing.JLabel();
        FFto1 = new javax.swing.JLabel();
        Ffrom1 = new javax.swing.JLabel();
        Fto1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        _ = new javax.swing.JLabel();
        _1 = new javax.swing.JLabel();
        x = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        Home = new javax.swing.JLabel();
        Home1 = new javax.swing.JLabel();
        logout = new javax.swing.JLabel();
        logout1 = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Date1 = new javax.swing.JLabel();
        Date2 = new javax.swing.JLabel();
        Account = new javax.swing.JLabel();
        Account1 = new javax.swing.JLabel();
        Account2 = new javax.swing.JLabel();
        Reprt = new javax.swing.JLabel();
        Reprt1 = new javax.swing.JLabel();
        Reprt2 = new javax.swing.JLabel();
        Bar = new javax.swing.JLabel();
        Main = new javax.swing.JLabel();

        cost.setText("?????????? ???????? ??????????");
        cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                costActionPerformed(evt);
            }
        });
        PopupMenu.add(cost);

        delete.setText("?????? ??????????");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        PopupMenu.add(delete);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(939, 506));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        r.setLayout(null);

        R.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        R.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RMouseExited(evt);
            }
        });
        r.add(R);
        R.setBounds(0, 0, 200, 30);

        R1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/11.png"))); // NOI18N
        R1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r.add(R1);
        R1.setBounds(0, 0, 200, 30);

        R2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/11.png"))); // NOI18N
        R2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r.add(R2);
        R2.setBounds(0, 0, 200, 30);

        R3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/11a.png"))); // NOI18N
        R3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        r.add(R3);
        R3.setBounds(0, 0, 200, 30);

        getContentPane().add(r);
        r.setBounds(6, 390, 200, 30);

        RChek.setLayout(null);

        jScrollPane5.setBorder(null);
        jScrollPane5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        LestRCh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LestRCh.setForeground(new java.awt.Color(51, 51, 51));
        LestRCh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????? ????????????", "??????????", "?????? ?????????? ", "??????????", "?????????? ??????????", "?????????? ??????????????????", "??????????????????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LestRCh.setGridColor(new java.awt.Color(0, 0, 0));
        LestRCh.setRowHeight(20);
        LestRCh.setRowMargin(3);
        LestRCh.setSelectionBackground(new java.awt.Color(0, 102, 204));
        LestRCh.setSelectionForeground(new java.awt.Color(0, 0, 0));
        LestRCh.getTableHeader().setResizingAllowed(false);
        LestRCh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LestRChMouseReleased(evt);
            }
        });
        jScrollPane5.setViewportView(LestRCh);
        if (LestRCh.getColumnModel().getColumnCount() > 0) {
            LestRCh.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        RChek.add(jScrollPane5);
        jScrollPane5.setBounds(19, 190, 630, 271);

        refreshR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refreshR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshRMouseExited(evt);
            }
        });
        RChek.add(refreshR);
        refreshR.setBounds(258, 128, 150, 45);

        refreshR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????????.png"))); // NOI18N
        RChek.add(refreshR1);
        refreshR1.setBounds(258, 128, 150, 45);

        DNameR.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        RChek.add(DNameR);
        DNameR.setBounds(440, 67, 193, 30);

        RCHdate.setDateFormatString("yyyy-MM-dd");
        RChek.add(RCHdate);
        RCHdate.setBounds(31, 66, 192, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RCheckup.png"))); // NOI18N
        RChek.add(jLabel7);
        jLabel7.setBounds(0, 0, 663, 482);

        getContentPane().add(RChek);
        RChek.setBounds(284, 25, 662, 483);

        HMain.setLayout(null);

        KG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        KG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                KGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                KGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                KGMouseExited(evt);
            }
        });
        HMain.add(KG);
        KG.setBounds(444, 254, 194, 157);

        KG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/6.png"))); // NOI18N
        HMain.add(KG1);
        KG1.setBounds(444, 254, 194, 157);

        BK.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BK.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BKMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BKMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BKMouseExited(evt);
            }
        });
        HMain.add(BK);
        BK.setBounds(245, 251, 194, 161);

        BK1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/5.png"))); // NOI18N
        HMain.add(BK1);
        BK1.setBounds(245, 251, 194, 161);

        BM.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BMMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                BMMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                BMMouseExited(evt);
            }
        });
        HMain.add(BM);
        BM.setBounds(42, 254, 196, 157);

        BM1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/4.png"))); // NOI18N
        HMain.add(BM1);
        BM1.setBounds(42, 254, 196, 157);

        HG.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        HG.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HGMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HGMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HGMouseExited(evt);
            }
        });
        HMain.add(HG);
        HG.setBounds(444, 63, 189, 154);

        HG1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/3.png"))); // NOI18N
        HMain.add(HG1);
        HG1.setBounds(444, 63, 189, 154);

        MH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MHMouseExited(evt);
            }
        });
        HMain.add(MH);
        MH.setBounds(247, 58, 192, 159);

        MH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/2.png"))); // NOI18N
        HMain.add(MH1);
        MH1.setBounds(247, 58, 192, 159);

        SH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SHMouseExited(evt);
            }
        });
        HMain.add(SH);
        SH.setBounds(44, 61, 194, 159);

        SH1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/1.png"))); // NOI18N
        HMain.add(SH1);
        SH1.setBounds(44, 61, 194, 159);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/HomeMain.png"))); // NOI18N
        HMain.add(jLabel5);
        jLabel5.setBounds(0, 0, 663, 494);

        getContentPane().add(HMain);
        HMain.setBounds(284, 25, 662, 483);

        Chek.setLayout(null);

        jScrollPane2.setBorder(null);
        jScrollPane2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        LestCh.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LestCh.setForeground(new java.awt.Color(51, 51, 51));
        LestCh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????? ??????????", "?????? ????????????", "?????? ????????????", "?????? ????????????", "?????????? ??????????", "?????? ????????????", "??????????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LestCh.setGridColor(new java.awt.Color(0, 0, 0));
        LestCh.setRowHeight(20);
        LestCh.setRowMargin(3);
        LestCh.setSelectionBackground(new java.awt.Color(0, 102, 204));
        LestCh.setSelectionForeground(new java.awt.Color(0, 0, 0));
        LestCh.getTableHeader().setResizingAllowed(false);
        LestCh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LestChMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(LestCh);
        if (LestCh.getColumnModel().getColumnCount() > 0) {
            LestCh.getColumnModel().getColumn(4).setPreferredWidth(100);
        }

        Chek.add(jScrollPane2);
        jScrollPane2.setBounds(19, 190, 630, 272);

        refresh.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        refresh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                refreshMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                refreshMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                refreshMouseExited(evt);
            }
        });
        Chek.add(refresh);
        refresh.setBounds(258, 128, 150, 45);

        refresh1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????????.png"))); // NOI18N
        Chek.add(refresh1);
        refresh1.setBounds(258, 128, 150, 45);

        Ddate.setEditable(false);
        Ddate.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ddate.setBorder(null);
        Ddate.setOpaque(false);
        Chek.add(Ddate);
        Ddate.setBounds(33, 69, 193, 30);

        DName.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Chek.add(DName);
        DName.setBounds(440, 70, 190, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Chickup.png"))); // NOI18N
        Chek.add(jLabel3);
        jLabel3.setBounds(0, 0, 663, 482);

        getContentPane().add(Chek);
        Chek.setBounds(284, 25, 662, 483);

        SearchPE.setLayout(null);

        jScrollPane6.setBorder(null);

        LPE.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LPE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????? ????????????", "??????????", "????????????????", "??????????", "?????????? ??????????????", "??????????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LPE.setGridColor(new java.awt.Color(0, 0, 0));
        LPE.setSelectionBackground(new java.awt.Color(0, 102, 204));
        LPE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LPEMouseReleased(evt);
            }
        });
        jScrollPane6.setViewportView(LPE);

        SearchPE.add(jScrollPane6);
        jScrollPane6.setBounds(18, 152, 628, 310);

        SePE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SePE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SePEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SePEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SePEMouseExited(evt);
            }
        });
        SearchPE.add(SePE);
        SePE.setBounds(598, 90, 34, 32);

        SePE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainResSe.png"))); // NOI18N
        SearchPE.add(SePE1);
        SePE1.setBounds(598, 90, 34, 32);

        PESearch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        PESearch.setForeground(new java.awt.Color(16, 24, 32));
        PESearch.setToolTipText("");
        PESearch.setBorder(null);
        PESearch.setOpaque(false);
        PESearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PESearchKeyTyped(evt);
            }
        });
        SearchPE.add(PESearch);
        PESearch.setBounds(30, 94, 562, 25);

        PESearch1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        PESearch1.setForeground(new java.awt.Color(102, 102, 102));
        PESearch1.setText("Search");
        SearchPE.add(PESearch1);
        PESearch1.setBounds(31, 97, 90, 20);

        btnpho.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnpho.setText("????????????????");
        btnpho.setOpaque(false);
        SearchPE.add(btnpho);
        btnpho.setBounds(365, 50, 72, 23);

        btnnam.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnnam.setSelected(true);
        btnnam.setText("??????????");
        btnnam.setOpaque(false);
        SearchPE.add(btnnam);
        btnnam.setBounds(570, 50, 70, 23);

        btnnum.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnnum.setText("?????? ????????????");
        btnnum.setOpaque(false);
        SearchPE.add(btnnum);
        btnnum.setBounds(455, 50, 95, 23);

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SearchPe.png"))); // NOI18N
        SearchPE.add(jLabel10);
        jLabel10.setBounds(0, 0, 663, 482);

        getContentPane().add(SearchPE);
        SearchPE.setBounds(284, 25, 662, 483);

        SearchCH.setLayout(null);

        jScrollPane7.setBorder(null);

        LCH.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LCH.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????? ????????????", "??????????", "?????? ??????????", "?????????? ??????????", "??????????????????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LCH.setGridColor(new java.awt.Color(0, 0, 0));
        LCH.setSelectionBackground(new java.awt.Color(0, 102, 204));
        LCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LCHMouseReleased(evt);
            }
        });
        jScrollPane7.setViewportView(LCH);

        SearchCH.add(jScrollPane7);
        jScrollPane7.setBounds(18, 192, 628, 270);

        serCH.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serCH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serCHMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                serCHMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                serCHMouseExited(evt);
            }
        });
        SearchCH.add(serCH);
        serCH.setBounds(257, 135, 150, 45);

        serch5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????.png"))); // NOI18N
        SearchCH.add(serch5);
        serch5.setBounds(257, 135, 150, 45);

        DNameCH.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SearchCH.add(DNameCH);
        DNameCH.setBounds(440, 75, 193, 29);

        CHdate.setDateFormatString("yyyy-MM-dd");
        SearchCH.add(CHdate);
        CHdate.setBounds(29, 75, 197, 30);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/SearchCH.png"))); // NOI18N
        SearchCH.add(jLabel11);
        jLabel11.setBounds(0, 0, 663, 484);

        getContentPane().add(SearchCH);
        SearchCH.setBounds(284, 25, 662, 483);

        NewRes.setLayout(null);

        pe.setOpaque(false);
        pe.setLayout(null);

        jScrollPane3.setBorder(null);
        jScrollPane3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        LestPE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LestPE.setForeground(new java.awt.Color(51, 51, 51));
        LestPE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????? ????????????", "?????? ????????????", "????????????????", "??????????", "?????????? ??????????????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LestPE.setGridColor(new java.awt.Color(0, 0, 0));
        LestPE.setSelectionBackground(new java.awt.Color(0, 102, 204));
        LestPE.setSelectionForeground(new java.awt.Color(0, 0, 0));
        LestPE.getTableHeader().setResizingAllowed(false);
        LestPE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LestPEMouseReleased(evt);
            }
        });
        jScrollPane3.setViewportView(LestPE);

        pe.add(jScrollPane3);
        jScrollPane3.setBounds(17, 80, 630, 279);

        SearchRes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SearchRes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchResMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SearchResMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SearchResMouseExited(evt);
            }
        });
        pe.add(SearchRes);
        SearchRes.setBounds(593, 19, 34, 32);

        SearchRes1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainResSe.png"))); // NOI18N
        pe.add(SearchRes1);
        SearchRes1.setBounds(593, 19, 34, 32);

        LSearch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LSearch.setForeground(new java.awt.Color(102, 102, 102));
        LSearch.setText("Search");
        pe.add(LSearch);
        LSearch.setBounds(32, 26, 90, 20);

        Search.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Search.setForeground(new java.awt.Color(16, 24, 32));
        Search.setToolTipText("");
        Search.setBorder(null);
        Search.setOpaque(false);
        Search.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                SearchFocusLost(evt);
            }
        });
        Search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                SearchKeyTyped(evt);
            }
        });
        pe.add(Search);
        Search.setBounds(30, 22, 562, 25);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RE.png"))); // NOI18N
        pe.add(jLabel6);
        jLabel6.setBounds(0, 0, 663, 386);

        NewRes.add(pe);
        pe.setBounds(0, 100, 663, 386);

        re.setOpaque(false);
        re.setLayout(null);

        jScrollPane4.setBorder(null);

        Lestre.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Lestre.setForeground(new java.awt.Color(51, 51, 51));
        Lestre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????? ??????????", "?????????? ??????????", "?????? ????????????", "?????? ??????????????", "??????????", "?????? ??????????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Lestre.setGridColor(new java.awt.Color(0, 0, 0));
        Lestre.setSelectionBackground(new java.awt.Color(0, 102, 204));
        Lestre.setSelectionForeground(new java.awt.Color(0, 0, 0));
        Lestre.getTableHeader().setResizingAllowed(false);
        Lestre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                LestreMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(Lestre);

        re.add(jScrollPane4);
        jScrollPane4.setBounds(17, 89, 630, 270);

        DNameR2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        re.add(DNameR2);
        DNameR2.setBounds(463, 42, 170, 26);

        serch2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        serch2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serch2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                serch2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                serch2MouseExited(evt);
            }
        });
        re.add(serch2);
        serch2.setBounds(258, 29, 150, 45);

        serch3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????.png"))); // NOI18N
        re.add(serch3);
        serch3.setBounds(258, 29, 150, 45);

        PRdate.setDateFormatString("yyyy-MM-dd");
        re.add(PRdate);
        PRdate.setBounds(28, 42, 171, 26);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RE2.png"))); // NOI18N
        re.add(jLabel9);
        jLabel9.setBounds(0, 0, 663, 386);

        NewRes.add(re);
        re.setBounds(0, 100, 663, 386);

        AddPR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddPR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddPRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddPRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddPRMouseExited(evt);
            }
        });
        NewRes.add(AddPR);
        AddPR.setBounds(31, 41, 170, 34);

        AddPR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/?????????? ???????? ???????? ????????.png"))); // NOI18N
        NewRes.add(AddPR1);
        AddPR1.setBounds(31, 41, 170, 34);

        Hgs.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Hgs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HgsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                HgsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                HgsMouseExited(evt);
            }
        });
        NewRes.add(Hgs);
        Hgs.setBounds(550, 68, 100, 34);

        Hgs1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/????????????????.png"))); // NOI18N
        NewRes.add(Hgs1);
        Hgs1.setBounds(550, 68, 100, 34);

        Hgs2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/????????????????.png"))); // NOI18N
        NewRes.add(Hgs2);
        Hgs2.setBounds(550, 68, 100, 34);

        MR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MRMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                MRMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                MRMouseExited(evt);
            }
        });
        NewRes.add(MR);
        MR.setBounds(448, 68, 100, 34);

        MR1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/????????????.png"))); // NOI18N
        NewRes.add(MR1);
        MR1.setBounds(448, 68, 100, 34);

        MR2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/????????????.png"))); // NOI18N
        NewRes.add(MR2);
        MR2.setBounds(448, 68, 100, 34);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainRes.png"))); // NOI18N
        NewRes.add(jLabel4);
        jLabel4.setBounds(0, 0, 663, 483);

        getContentPane().add(NewRes);
        NewRes.setBounds(284, 25, 662, 483);

        Resrv.setLayout(null);

        jScrollPane1.setBorder(null);

        LRE.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        LRE.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "?????? ??????????", "?????????? ??????????", "??????????", "????????????", "??????????"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        LRE.setGridColor(new java.awt.Color(0, 0, 0));
        LRE.setSelectionBackground(new java.awt.Color(0, 102, 204));
        jScrollPane1.setViewportView(LRE);

        Resrv.add(jScrollPane1);
        jScrollPane1.setBounds(18, 192, 628, 270);

        ser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                serMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                serMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                serMouseExited(evt);
            }
        });
        Resrv.add(ser);
        ser.setBounds(257, 130, 150, 45);

        serch1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????.png"))); // NOI18N
        Resrv.add(serch1);
        serch1.setBounds(257, 130, 150, 45);

        Rdate3.setDateFormatString("yyyy-MM-dd");
        Resrv.add(Rdate3);
        Rdate3.setBounds(31, 70, 190, 30);
        Resrv.add(DNamRE);
        DNamRE.setBounds(440, 70, 190, 30);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Mainresrv.png"))); // NOI18N
        Resrv.add(jLabel8);
        jLabel8.setBounds(0, 0, 663, 482);

        getContentPane().add(Resrv);
        Resrv.setBounds(284, 25, 662, 483);

        report.setLayout(null);

        petien.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        petien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                petienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                petienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                petienMouseExited(evt);
            }
        });
        report.add(petien);
        petien.setBounds(454, 70, 172, 140);

        petien1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/????????????R.png"))); // NOI18N
        report.add(petien1);
        petien1.setBounds(454, 70, 172, 140);

        checkup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        checkup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                checkupMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                checkupMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                checkupMouseExited(evt);
            }
        });
        report.add(checkup);
        checkup.setBounds(258, 70, 172, 140);

        checkup1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/????????????????.png"))); // NOI18N
        report.add(checkup1);
        checkup1.setBounds(258, 70, 172, 140);

        accun.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accun.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accunMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accunMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accunMouseExited(evt);
            }
        });
        report.add(accun);
        accun.setBounds(56, 69, 172, 141);

        accun1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/????????????????.png"))); // NOI18N
        report.add(accun1);
        accun1.setBounds(56, 69, 172, 141);

        doctors.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        doctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                doctorsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                doctorsMouseExited(evt);
            }
        });
        report.add(doctors);
        doctors.setBounds(454, 261, 172, 141);

        doctors1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????????????.png"))); // NOI18N
        report.add(doctors1);
        doctors1.setBounds(454, 261, 172, 141);

        employees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        employees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                employeesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                employeesMouseExited(evt);
            }
        });
        report.add(employees);
        employees.setBounds(258, 261, 172, 141);

        employees1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/????????????????.png"))); // NOI18N
        report.add(employees1);
        employees1.setBounds(258, 261, 172, 141);

        expens.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        expens.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expensMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                expensMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                expensMouseExited(evt);
            }
        });
        report.add(expens);
        expens.setBounds(56, 261, 172, 141);

        expens1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/??????????????????.png"))); // NOI18N
        report.add(expens1);
        expens1.setBounds(56, 261, 172, 141);

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/MainReport.png"))); // NOI18N
        report.add(jLabel13);
        jLabel13.setBounds(0, 0, 663, 484);

        getContentPane().add(report);
        report.setBounds(284, 25, 662, 483);

        NewR.setLayout(null);

        User.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        User.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                UserMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                UserMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                UserMouseExited(evt);
            }
        });
        NewR.add(User);
        User.setBounds(27, 149, 187, 156);

        User1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/22.png"))); // NOI18N
        User1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewR.add(User1);
        User1.setBounds(27, 149, 187, 156);

        AddE.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddEMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddEMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddEMouseExited(evt);
            }
        });
        NewR.add(AddE);
        AddE.setBounds(248, 149, 187, 158);

        AddE1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/21.png"))); // NOI18N
        AddE1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewR.add(AddE1);
        AddE1.setBounds(248, 149, 187, 158);

        AddD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AddDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AddDMouseExited(evt);
            }
        });
        NewR.add(AddD);
        AddD.setBounds(463, 149, 191, 158);

        AddD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/20.png"))); // NOI18N
        AddD1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        NewR.add(AddD1);
        AddD1.setBounds(463, 149, 191, 158);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/R.png"))); // NOI18N
        NewR.add(jLabel2);
        jLabel2.setBounds(0, 0, 663, 496);

        getContentPane().add(NewR);
        NewR.setBounds(283, 26, 663, 483);

        Acc.setLayout(null);

        accL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accLMouseExited(evt);
            }
        });
        Acc.add(accL);
        accL.setBounds(27, 157, 181, 148);

        accL1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/acclest.png"))); // NOI18N
        accL1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Acc.add(accL1);
        accL1.setBounds(27, 157, 181, 148);

        exp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                expMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                expMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                expMouseExited(evt);
            }
        });
        Acc.add(exp);
        exp.setBounds(251, 157, 180, 148);

        exp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/expens.png"))); // NOI18N
        exp1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Acc.add(exp1);
        exp1.setBounds(251, 157, 180, 148);

        accD.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        accD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                accDMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                accDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                accDMouseExited(evt);
            }
        });
        Acc.add(accD);
        accD.setBounds(467, 157, 182, 148);

        accD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/AccDay.png"))); // NOI18N
        accD1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Acc.add(accD1);
        accD1.setBounds(467, 157, 182, 148);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/accounts.png"))); // NOI18N
        Acc.add(jLabel12);
        jLabel12.setBounds(0, 0, 663, 482);

        getContentPane().add(Acc);
        Acc.setBounds(284, 25, 662, 483);

        Times.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        name.setBackground(new java.awt.Color(56, 148, 233));
        name.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        name.setForeground(new java.awt.Color(16, 24, 32));
        name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "" }));
        name.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        name.setOpaque(false);
        name.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nameItemStateChanged(evt);
            }
        });
        Times.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 23, 160, 30));

        SSfrom.setEditable(false);
        SSfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SSfrom.setForeground(new java.awt.Color(16, 24, 32));
        SSfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SSfrom.setBorder(null);
        SSfrom.setOpaque(false);
        Times.add(SSfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 138, 90, 29));

        SSto.setEditable(false);
        SSto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SSto.setForeground(new java.awt.Color(16, 24, 32));
        SSto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SSto.setBorder(null);
        SSto.setOpaque(false);
        Times.add(SSto, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 138, 90, 29));

        SSUfrom.setEditable(false);
        SSUfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SSUfrom.setForeground(new java.awt.Color(16, 24, 32));
        SSUfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SSUfrom.setBorder(null);
        SSUfrom.setOpaque(false);
        Times.add(SSUfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 186, 90, 29));

        SSUto.setEditable(false);
        SSUto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SSUto.setForeground(new java.awt.Color(16, 24, 32));
        SSUto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SSUto.setBorder(null);
        SSUto.setOpaque(false);
        Times.add(SSUto, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 186, 90, 29));

        MMfrom.setEditable(false);
        MMfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        MMfrom.setForeground(new java.awt.Color(16, 24, 32));
        MMfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MMfrom.setBorder(null);
        MMfrom.setOpaque(false);
        Times.add(MMfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 235, 90, 29));

        MMto.setEditable(false);
        MMto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        MMto.setForeground(new java.awt.Color(16, 24, 32));
        MMto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        MMto.setBorder(null);
        MMto.setOpaque(false);
        Times.add(MMto, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 235, 90, 29));

        TTfrom.setEditable(false);
        TTfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TTfrom.setForeground(new java.awt.Color(16, 24, 32));
        TTfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TTfrom.setBorder(null);
        TTfrom.setOpaque(false);
        Times.add(TTfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 283, 90, 29));

        TTto.setEditable(false);
        TTto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TTto.setForeground(new java.awt.Color(16, 24, 32));
        TTto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TTto.setBorder(null);
        TTto.setOpaque(false);
        Times.add(TTto, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 283, 90, 29));

        WWto.setEditable(false);
        WWto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        WWto.setForeground(new java.awt.Color(16, 24, 32));
        WWto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WWto.setBorder(null);
        WWto.setOpaque(false);
        Times.add(WWto, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 331, 90, 29));

        WWfrom.setEditable(false);
        WWfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        WWfrom.setForeground(new java.awt.Color(16, 24, 32));
        WWfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        WWfrom.setBorder(null);
        WWfrom.setOpaque(false);
        Times.add(WWfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 331, 90, 29));

        TTHfrom.setEditable(false);
        TTHfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TTHfrom.setForeground(new java.awt.Color(16, 24, 32));
        TTHfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TTHfrom.setBorder(null);
        TTHfrom.setOpaque(false);
        Times.add(TTHfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 379, 90, 29));

        TTHto.setEditable(false);
        TTHto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TTHto.setForeground(new java.awt.Color(16, 24, 32));
        TTHto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        TTHto.setBorder(null);
        TTHto.setOpaque(false);
        Times.add(TTHto, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 379, 90, 29));

        FFto.setEditable(false);
        FFto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        FFto.setForeground(new java.awt.Color(16, 24, 32));
        FFto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FFto.setBorder(null);
        FFto.setOpaque(false);
        Times.add(FFto, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 427, 90, 29));

        FFfrom.setEditable(false);
        FFfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        FFfrom.setForeground(new java.awt.Color(16, 24, 32));
        FFfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        FFfrom.setBorder(null);
        FFfrom.setOpaque(false);
        Times.add(FFfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 427, 90, 29));

        Sfrom.setEditable(false);
        Sfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Sfrom.setForeground(new java.awt.Color(16, 24, 32));
        Sfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sfrom.setBorder(null);
        Sfrom.setOpaque(false);
        Times.add(Sfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 140, 90, 29));

        Sto.setEditable(false);
        Sto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Sto.setForeground(new java.awt.Color(16, 24, 32));
        Sto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Sto.setBorder(null);
        Sto.setOpaque(false);
        Times.add(Sto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 29));

        SUfrom.setEditable(false);
        SUfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SUfrom.setForeground(new java.awt.Color(16, 24, 32));
        SUfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SUfrom.setBorder(null);
        SUfrom.setOpaque(false);
        Times.add(SUfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 188, 90, 29));

        SUto.setEditable(false);
        SUto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SUto.setForeground(new java.awt.Color(16, 24, 32));
        SUto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        SUto.setBorder(null);
        SUto.setOpaque(false);
        Times.add(SUto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 188, 90, 29));

        Mfrom.setEditable(false);
        Mfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Mfrom.setForeground(new java.awt.Color(16, 24, 32));
        Mfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Mfrom.setBorder(null);
        Mfrom.setOpaque(false);
        Times.add(Mfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 237, 90, 29));

        Mto.setEditable(false);
        Mto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Mto.setForeground(new java.awt.Color(16, 24, 32));
        Mto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Mto.setBorder(null);
        Mto.setOpaque(false);
        Times.add(Mto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 237, 90, 29));

        Tfrom.setEditable(false);
        Tfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Tfrom.setForeground(new java.awt.Color(16, 24, 32));
        Tfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tfrom.setBorder(null);
        Tfrom.setOpaque(false);
        Times.add(Tfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 285, 90, 29));

        Tto.setEditable(false);
        Tto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Tto.setForeground(new java.awt.Color(16, 24, 32));
        Tto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Tto.setBorder(null);
        Tto.setOpaque(false);
        Times.add(Tto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 285, 90, 29));

        Wfrom.setEditable(false);
        Wfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Wfrom.setForeground(new java.awt.Color(16, 24, 32));
        Wfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Wfrom.setBorder(null);
        Wfrom.setOpaque(false);
        Times.add(Wfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 333, 90, 29));

        Wto.setEditable(false);
        Wto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Wto.setForeground(new java.awt.Color(16, 24, 32));
        Wto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Wto.setBorder(null);
        Wto.setOpaque(false);
        Times.add(Wto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 333, 90, 29));

        THfrom.setEditable(false);
        THfrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        THfrom.setForeground(new java.awt.Color(16, 24, 32));
        THfrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        THfrom.setBorder(null);
        THfrom.setOpaque(false);
        Times.add(THfrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 381, 90, 29));

        THto.setEditable(false);
        THto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        THto.setForeground(new java.awt.Color(16, 24, 32));
        THto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        THto.setBorder(null);
        THto.setOpaque(false);
        Times.add(THto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 381, 90, 29));

        Ffrom.setEditable(false);
        Ffrom.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Ffrom.setForeground(new java.awt.Color(16, 24, 32));
        Ffrom.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Ffrom.setBorder(null);
        Ffrom.setOpaque(false);
        Times.add(Ffrom, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 429, 90, 29));

        Fto.setEditable(false);
        Fto.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Fto.setForeground(new java.awt.Color(16, 24, 32));
        Fto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Fto.setBorder(null);
        Fto.setOpaque(false);
        Times.add(Fto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 429, 90, 29));

        MMfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        MMfrom1.setForeground(new java.awt.Color(102, 102, 102));
        MMfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MMfrom1.setText("???? ???????? ????????????");
        Times.add(MMfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 235, 90, 29));

        MMto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        MMto1.setForeground(new java.awt.Color(102, 102, 102));
        MMto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        MMto1.setText("???? ???????? ????????????");
        Times.add(MMto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 235, 90, 29));

        Mfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Mfrom1.setForeground(new java.awt.Color(102, 102, 102));
        Mfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mfrom1.setText("???? ???????? ????????????");
        Times.add(Mfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 237, 90, 29));

        Mto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Mto1.setForeground(new java.awt.Color(102, 102, 102));
        Mto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mto1.setText("???? ???????? ????????????");
        Times.add(Mto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 237, 90, 29));

        SSUfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SSUfrom1.setForeground(new java.awt.Color(102, 102, 102));
        SSUfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SSUfrom1.setText("???? ???????? ????????????");
        Times.add(SSUfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 186, 90, 29));

        Sfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Sfrom1.setForeground(new java.awt.Color(102, 102, 102));
        Sfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sfrom1.setText("???? ???????? ????????????");
        Times.add(Sfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 140, 90, 29));

        SUfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SUfrom1.setForeground(new java.awt.Color(102, 102, 102));
        SUfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUfrom1.setText("???? ???????? ????????????");
        Times.add(SUfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 188, 90, 29));

        SSfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SSfrom1.setForeground(new java.awt.Color(102, 102, 102));
        SSfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SSfrom1.setText("???? ???????? ????????????");
        Times.add(SSfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 138, 90, 29));

        SUto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SUto1.setForeground(new java.awt.Color(102, 102, 102));
        SUto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SUto1.setText("???? ???????? ????????????");
        Times.add(SUto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 188, 90, 29));

        SSUto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SSUto1.setForeground(new java.awt.Color(102, 102, 102));
        SSUto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SSUto1.setText("???? ???????? ????????????");
        Times.add(SSUto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 186, 90, 29));

        Sto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Sto1.setForeground(new java.awt.Color(102, 102, 102));
        Sto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Sto1.setText("???? ???????? ????????????");
        Times.add(Sto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 90, 29));

        SSto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        SSto1.setForeground(new java.awt.Color(102, 102, 102));
        SSto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SSto1.setText("???? ???????? ????????????");
        Times.add(SSto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 138, 90, 29));

        TTfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TTfrom1.setForeground(new java.awt.Color(102, 102, 102));
        TTfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TTfrom1.setText("???? ???????? ????????????");
        Times.add(TTfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 283, 90, 29));

        TTto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TTto1.setForeground(new java.awt.Color(102, 102, 102));
        TTto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TTto1.setText("???? ???????? ????????????");
        Times.add(TTto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 283, 90, 29));

        Tfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Tfrom1.setForeground(new java.awt.Color(102, 102, 102));
        Tfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tfrom1.setText("???? ???????? ????????????");
        Times.add(Tfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 285, 90, 29));

        Tto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Tto1.setForeground(new java.awt.Color(102, 102, 102));
        Tto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Tto1.setText("???? ???????? ????????????");
        Times.add(Tto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 285, 90, 29));

        WWfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        WWfrom1.setForeground(new java.awt.Color(102, 102, 102));
        WWfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WWfrom1.setText("???? ???????? ????????????");
        Times.add(WWfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 331, 90, 29));

        WWto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        WWto1.setForeground(new java.awt.Color(102, 102, 102));
        WWto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        WWto1.setText("???? ???????? ????????????");
        Times.add(WWto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 331, 90, 29));

        Wfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Wfrom1.setForeground(new java.awt.Color(102, 102, 102));
        Wfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Wfrom1.setText("???? ???????? ????????????");
        Times.add(Wfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 333, 90, 29));

        Wto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Wto1.setForeground(new java.awt.Color(102, 102, 102));
        Wto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Wto1.setText("???? ???????? ????????????");
        Times.add(Wto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 333, 90, 29));

        TTHfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TTHfrom1.setForeground(new java.awt.Color(102, 102, 102));
        TTHfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TTHfrom1.setText("???? ???????? ????????????");
        Times.add(TTHfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 379, 90, 29));

        TTHto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        TTHto1.setForeground(new java.awt.Color(102, 102, 102));
        TTHto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TTHto1.setText("???? ???????? ????????????");
        Times.add(TTHto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 379, 90, 29));

        THfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        THfrom1.setForeground(new java.awt.Color(102, 102, 102));
        THfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        THfrom1.setText("???? ???????? ????????????");
        Times.add(THfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 381, 90, 29));

        THto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        THto1.setForeground(new java.awt.Color(102, 102, 102));
        THto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        THto1.setText("???? ???????? ????????????");
        Times.add(THto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 381, 90, 29));

        FFfrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        FFfrom1.setForeground(new java.awt.Color(102, 102, 102));
        FFfrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FFfrom1.setText("???? ???????? ????????????");
        Times.add(FFfrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(446, 427, 90, 29));

        FFto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        FFto1.setForeground(new java.awt.Color(102, 102, 102));
        FFto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        FFto1.setText("???? ???????? ????????????");
        Times.add(FFto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(331, 427, 90, 29));

        Ffrom1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Ffrom1.setForeground(new java.awt.Color(102, 102, 102));
        Ffrom1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Ffrom1.setText("???? ???????? ????????????");
        Times.add(Ffrom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(165, 429, 90, 29));

        Fto1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Fto1.setForeground(new java.awt.Color(102, 102, 102));
        Fto1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fto1.setText("???? ???????? ????????????");
        Times.add(Fto1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 429, 90, 29));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Times Doc.png"))); // NOI18N
        Times.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 663, 484));

        getContentPane().add(Times);
        Times.setBounds(283, 26, 662, 483);

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
        _.setBounds(905, 3, 19, 20);

        _1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/15_.png"))); // NOI18N
        getContentPane().add(_1);
        _1.setBounds(905, 3, 19, 20);

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
        x.setBounds(925, 3, 22, 22);

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/13X.png"))); // NOI18N
        x1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(x1);
        x1.setBounds(925, 3, 22, 22);

        Name1.setFont(new java.awt.Font("Simplified Arabic", 1, 18)); // NOI18N
        Name1.setForeground(new java.awt.Color(56, 148, 233));
        Name1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Name1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(Name1);
        Name1.setBounds(20, 160, 230, 30);

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
        Home.setBounds(6, 222, 200, 30);

        Home1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/7.png"))); // NOI18N
        Home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(Home1);
        Home1.setBounds(6, 222, 200, 30);

        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutMouseExited(evt);
            }
        });
        getContentPane().add(logout);
        logout.setBounds(6, 435, 200, 30);

        logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/12.png"))); // NOI18N
        logout1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logout1MousePressed(evt);
            }
        });
        getContentPane().add(logout1);
        logout1.setBounds(6, 435, 200, 30);

        Date.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Date.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DateMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                DateMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                DateMouseExited(evt);
            }
        });
        getContentPane().add(Date);
        Date.setBounds(6, 263, 203, 34);

        Date1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/8.png"))); // NOI18N
        getContentPane().add(Date1);
        Date1.setBounds(6, 263, 203, 34);

        Date2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/8.png"))); // NOI18N
        getContentPane().add(Date2);
        Date2.setBounds(6, 263, 203, 34);

        Account.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Account.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AccountMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                AccountMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                AccountMouseExited(evt);
            }
        });
        getContentPane().add(Account);
        Account.setBounds(6, 305, 202, 34);

        Account1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/9.png"))); // NOI18N
        getContentPane().add(Account1);
        Account1.setBounds(6, 305, 202, 34);

        Account2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/9.png"))); // NOI18N
        getContentPane().add(Account2);
        Account2.setBounds(6, 305, 202, 34);

        Reprt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Reprt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReprtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ReprtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ReprtMouseExited(evt);
            }
        });
        getContentPane().add(Reprt);
        Reprt.setBounds(6, 346, 202, 35);

        Reprt1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/10.png"))); // NOI18N
        getContentPane().add(Reprt1);
        Reprt1.setBounds(6, 346, 202, 35);

        Reprt2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/10.png"))); // NOI18N
        getContentPane().add(Reprt2);
        Reprt2.setBounds(6, 346, 202, 35);

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
        Bar.setBounds(9, 3, 888, 20);

        Main.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Main.png"))); // NOI18N
        Main.setLabelFor(Main);
        Main.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));
        Main.setMinimumSize(new java.awt.Dimension(0, 0));
        Main.setNextFocusableComponent(Main);
        Main.setPreferredSize(new java.awt.Dimension(1366, 768));
        getContentPane().add(Main);
        Main.setBounds(0, 0, 953, 519);

        setSize(new java.awt.Dimension(958, 519));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - mousex, y - mousey);
    }//GEN-LAST:event_BarMouseDragged

    private void BarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BarMousePressed
        mousex = evt.getX();
        mousey = evt.getY();
    }//GEN-LAST:event_BarMousePressed

    private void xMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            int a = JOptionPane.showConfirmDialog(this, "Do you want exit ?", "Exit", JOptionPane.WARNING_MESSAGE);

            if (a == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else {

            }
        }
    }//GEN-LAST:event_xMouseClicked
    public void lestNR() {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("?????? ????????????");
        table.addColumn("?????? ????????????");
        table.addColumn("????????????????");
        table.addColumn("??????????");
        table.addColumn("?????????? ??????????????");

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
                    r.getString(5),});
                LestPE.setModel(table);
            }
        } catch (Exception ex) {
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        DB.GO.icon(this);
        name.setSelectedItem(null);

        Date data = new Date();
        SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");

        Ddate.setText(s.format(data));
        RCHdate.setDate(data);
        PRdate.setDate(data);
        Rdate3.setDate(data);
        CHdate.setDate(data);

        btnSearchPe.add(btnpho);
        btnSearchPe.add(btnnam);
        btnSearchPe.add(btnnum);

    }//GEN-LAST:event_formWindowOpened

    private void RMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseEntered
        R1.setEnabled(true);
        R1.setVisible(true);
    }//GEN-LAST:event_RMouseEntered

    private void RMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseExited
        R1.setEnabled(false);
        R1.setVisible(false);
    }//GEN-LAST:event_RMouseExited

    private void RMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            NewR.setEnabled(true);
            NewR.setVisible(true);
            R2.setEnabled(true);
            R2.setVisible(true);
            report.setEnabled(false);
            report.setVisible(false);
            Reprt2.setEnabled(false);
            Reprt2.setVisible(false);
            Times.setVisible(false);
            Times.setEnabled(false);
            Date2.setVisible(false);
            Date2.setEnabled(false);
            Account2.setEnabled(false);
            Account2.setVisible(false);
            Chek.setVisible(false);
            Chek.setEnabled(false);
            RChek.setVisible(false);
            RChek.setEnabled(false);
            HMain.setEnabled(false);
            HMain.setVisible(false);
            NewRes.setVisible(false);
            NewRes.setEnabled(false);
            re.setVisible(false);
            re.setEnabled(false);
            Hgs2.setVisible(false);
            Hgs2.setEnabled(false);
            MR2.setVisible(false);
            MR2.setEnabled(false);
            pe.setVisible(false);
            pe.setEnabled(false);
            Resrv.setVisible(false);
            Resrv.setEnabled(false);
            SearchCH.setVisible(false);
            SearchCH.setEnabled(false);
            SearchPE.setVisible(false);
            SearchPE.setEnabled(false);
            Acc.setVisible(false);
            Acc.setEnabled(false);
        }
    }//GEN-LAST:event_RMouseClicked

    private void HomeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseEntered
        Home1.setEnabled(true);
        Home1.setVisible(true);
    }//GEN-LAST:event_HomeMouseEntered

    private void HomeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseExited
        Home1.setEnabled(false);
        Home1.setVisible(false);
    }//GEN-LAST:event_HomeMouseExited

    private void HomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HomeMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            HMain.setEnabled(true);
            HMain.setVisible(true);
            report.setEnabled(false);
            report.setVisible(false);
            NewR.setEnabled(false);
            NewR.setVisible(false);
            Times.setVisible(false);
            Times.setEnabled(false);
            R2.setEnabled(false);
            R2.setVisible(false);
            Date2.setVisible(false);
            Date2.setEnabled(false);
            Account2.setEnabled(false);
            Account2.setVisible(false);
            Reprt2.setEnabled(false);
            Reprt2.setVisible(false);
            Chek.setVisible(false);
            Chek.setEnabled(false);
            RChek.setVisible(false);
            RChek.setEnabled(false);
            NewRes.setVisible(false);
            NewRes.setEnabled(false);
            re.setVisible(false);
            re.setEnabled(false);
            Hgs2.setVisible(false);
            Hgs2.setEnabled(false);
            MR2.setVisible(false);
            MR2.setEnabled(false);
            pe.setVisible(false);
            pe.setEnabled(false);
            Resrv.setVisible(false);
            Resrv.setEnabled(false);
            SearchCH.setVisible(false);
            SearchCH.setEnabled(false);
            SearchPE.setVisible(false);
            SearchPE.setEnabled(false);
            Acc.setVisible(false);
            Acc.setEnabled(false);
        }
    }//GEN-LAST:event_HomeMouseClicked

    private void UserMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseEntered
        User1.setEnabled(true);
        User1.setVisible(true);
    }//GEN-LAST:event_UserMouseEntered

    private void UserMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseExited
        User1.setEnabled(false);
        User1.setVisible(false);
    }//GEN-LAST:event_UserMouseExited

    private void UserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_UserMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new UserRegister().setVisible(true);
        }
    }//GEN-LAST:event_UserMouseClicked

    private void logout1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logout1MousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_logout1MousePressed

    private void logoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseEntered
        logout1.setEnabled(true);
        logout1.setVisible(true);
    }//GEN-LAST:event_logoutMouseEntered

    private void logoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseExited
        logout1.setEnabled(false);
        logout1.setVisible(false);
    }//GEN-LAST:event_logoutMouseExited

    private void ReprtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReprtMouseEntered
        Reprt1.setEnabled(true);
        Reprt1.setVisible(true);
    }//GEN-LAST:event_ReprtMouseEntered

    private void ReprtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReprtMouseExited
        Reprt1.setEnabled(false);
        Reprt1.setVisible(false);
    }//GEN-LAST:event_ReprtMouseExited

    private void AccountMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountMouseEntered
        Account1.setEnabled(true);
        Account1.setVisible(true);
    }//GEN-LAST:event_AccountMouseEntered

    private void AccountMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountMouseExited
        Account1.setEnabled(false);
        Account1.setVisible(false);
    }//GEN-LAST:event_AccountMouseExited

    private void DateMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateMouseEntered
        Date1.setEnabled(true);
        Date1.setVisible(true);
    }//GEN-LAST:event_DateMouseEntered

    private void DateMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateMouseExited
        Date1.setEnabled(false);
        Date1.setVisible(false);
    }//GEN-LAST:event_DateMouseExited

    private void AddEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddEMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new Employee().setVisible(true);
        }
    }//GEN-LAST:event_AddEMouseClicked

    private void AddEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddEMouseEntered
        AddE1.setEnabled(true);
        AddE1.setVisible(true);
    }//GEN-LAST:event_AddEMouseEntered

    private void AddEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddEMouseExited
        AddE1.setEnabled(false);
        AddE1.setVisible(false);
    }//GEN-LAST:event_AddEMouseExited

    private void AddDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddDMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new Doctors().setVisible(true);
        }
    }//GEN-LAST:event_AddDMouseClicked

    private void AddDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddDMouseEntered
        AddD1.setEnabled(true);
        AddD1.setVisible(true);
    }//GEN-LAST:event_AddDMouseEntered

    private void AddDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddDMouseExited
        AddD1.setEnabled(false);
        AddD1.setVisible(false);
    }//GEN-LAST:event_AddDMouseExited

    private void xMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseEntered
        x1.setEnabled(true);
        x1.setVisible(true);
    }//GEN-LAST:event_xMouseEntered

    private void xMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_xMouseExited
        x1.setEnabled(false);
        x1.setVisible(false);
    }//GEN-LAST:event_xMouseExited

    private void _MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__MouseEntered
        _1.setEnabled(true);
        _1.setVisible(true);
    }//GEN-LAST:event__MouseEntered

    private void _MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__MouseExited
        _1.setEnabled(false);
        _1.setVisible(false);
    }//GEN-LAST:event__MouseExited

    private void SHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHMouseEntered
        SH1.setEnabled(true);
        SH1.setVisible(true);
    }//GEN-LAST:event_SHMouseEntered

    private void SHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHMouseExited
        SH1.setEnabled(false);
        SH1.setVisible(false);
    }//GEN-LAST:event_SHMouseExited

    private void MHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MHMouseEntered
        MH1.setEnabled(true);
        MH1.setVisible(true);
    }//GEN-LAST:event_MHMouseEntered

    private void MHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MHMouseExited
        MH1.setEnabled(false);
        MH1.setVisible(false);
    }//GEN-LAST:event_MHMouseExited

    private void HGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HGMouseEntered
        HG1.setEnabled(true);
        HG1.setVisible(true);
    }//GEN-LAST:event_HGMouseEntered

    private void HGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HGMouseExited
        HG1.setEnabled(false);
        HG1.setVisible(false);
    }//GEN-LAST:event_HGMouseExited

    private void BMMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMMouseEntered
        BM1.setEnabled(true);
        BM1.setVisible(true);
    }//GEN-LAST:event_BMMouseEntered

    private void BMMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMMouseExited
        BM1.setEnabled(false);
        BM1.setVisible(false);
    }//GEN-LAST:event_BMMouseExited

    private void BKMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BKMouseEntered
        BK1.setEnabled(true);
        BK1.setVisible(true);
    }//GEN-LAST:event_BKMouseEntered

    private void BKMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BKMouseExited
        BK1.setEnabled(false);
        BK1.setVisible(false);
    }//GEN-LAST:event_BKMouseExited

    private void KGMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KGMouseEntered
        KG1.setEnabled(true);
        KG1.setVisible(true);
    }//GEN-LAST:event_KGMouseEntered

    private void KGMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KGMouseExited
        KG1.setEnabled(false);
        KG1.setVisible(false);
    }//GEN-LAST:event_KGMouseExited

    private void _MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event__MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            this.setState(MainForm.ICONIFIED);
        }
    }//GEN-LAST:event__MouseClicked

    private void DateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DateMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            Times.setVisible(true);
            Times.setEnabled(true);
            Date2.setVisible(true);
            Date2.setEnabled(true);
            Account2.setEnabled(false);
            Account2.setVisible(false);
            Reprt2.setEnabled(false);
            Reprt2.setVisible(false);
            report.setEnabled(false);
            report.setVisible(false);
            NewR.setEnabled(false);
            NewR.setVisible(false);
            R2.setEnabled(false);
            R2.setVisible(false);
            Chek.setVisible(false);
            Chek.setEnabled(false);
            RChek.setVisible(false);
            RChek.setEnabled(false);
            HMain.setEnabled(false);
            HMain.setVisible(false);
            NewRes.setVisible(false);
            NewRes.setEnabled(false);
            re.setVisible(false);
            re.setEnabled(false);
            Hgs2.setVisible(false);
            Hgs2.setEnabled(false);
            MR2.setVisible(false);
            MR2.setEnabled(false);
            pe.setVisible(false);
            pe.setEnabled(false);
            Resrv.setVisible(false);
            Resrv.setEnabled(false);
            SearchCH.setVisible(false);
            SearchCH.setEnabled(false);
            SearchPE.setVisible(false);
            SearchPE.setEnabled(false);
            Acc.setVisible(false);
            Acc.setEnabled(false);
            DB.GO.fillCompo("DOCTORS", "NAME", name);
            name.setSelectedItem(null);
        }
    }//GEN-LAST:event_DateMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            int a = JOptionPane.showConfirmDialog(this, "???? ???????? ?????????? ???????? ??", "Log Out", JOptionPane.WARNING_MESSAGE);

            if (a == JOptionPane.YES_OPTION) {
                System.exit(0);
            } else {

            }
        }
    }//GEN-LAST:event_logoutMouseClicked

    private void refreshMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseEntered
        refresh1.setVisible(true);
        refresh1.setEnabled(true);
    }//GEN-LAST:event_refreshMouseEntered

    private void refreshMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseExited
        refresh1.setVisible(false);
        refresh1.setEnabled(false);
    }//GEN-LAST:event_refreshMouseExited

    private void KGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_KGMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            NewRes.setVisible(false);
            NewRes.setEnabled(false);
            Chek.setVisible(true);
            Chek.setEnabled(true);
            RChek.setVisible(false);
            RChek.setEnabled(false);
            Times.setVisible(false);
            Times.setEnabled(false);
            Date2.setVisible(false);
            Date2.setEnabled(false);
            Account2.setEnabled(false);
            Account2.setVisible(false);
            NewR.setEnabled(false);
            NewR.setVisible(false);
            R2.setEnabled(false);
            R2.setVisible(false);
            HMain.setEnabled(false);
            HMain.setVisible(false);
            Hgs2.setVisible(false);
            Hgs2.setEnabled(false);
            re.setVisible(false);
            re.setEnabled(false);
            Resrv.setVisible(false);
            Resrv.setEnabled(false);
            SearchCH.setVisible(false);
            SearchCH.setEnabled(false);
            SearchPE.setVisible(false);
            SearchPE.setEnabled(false);
            Acc.setVisible(false);
            Acc.setEnabled(false);
        }
    }//GEN-LAST:event_KGMouseClicked

    private void nameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nameItemStateChanged
        Controls.Tools.clearText(this);
        SSfrom1.setVisible(true);
        SSto1.setVisible(true);
        Sfrom1.setVisible(true);
        Sto1.setVisible(true);
        SSUfrom1.setVisible(true);
        SSUto1.setVisible(true);
        SUfrom1.setVisible(true);
        SUto1.setVisible(true);
        MMfrom1.setVisible(true);
        MMto1.setVisible(true);
        Mfrom1.setVisible(true);
        Mto1.setVisible(true);
        TTfrom1.setVisible(true);
        TTto1.setVisible(true);
        Tfrom1.setVisible(true);
        Tto1.setVisible(true);
        WWfrom1.setVisible(true);
        WWto1.setVisible(true);
        Wfrom1.setVisible(true);
        Wto1.setVisible(true);
        TTHfrom1.setVisible(true);
        TTHto1.setVisible(true);
        THfrom1.setVisible(true);
        THto1.setVisible(true);
        FFfrom1.setVisible(true);
        FFto1.setVisible(true);
        Ffrom1.setVisible(true);
        Fto1.setVisible(true);
        try {
            Connection con = DB.ConectionDB.setconn();
            String strs = "SELECT * FROM doc_times_data WHERE Doctors_name like '%" + name.getSelectedItem() + "%'";
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(strs);

            while (r.next()) {

                String num = r.getString(1);
                String nam = r.getString(2);
                String day = r.getString(3);
                String from = r.getString(4);
                String to = r.getString(5);
                String shift = r.getString(6);

                if ("??????????".equals(day) & "1".equals(shift)) {
                    SSfrom1.setVisible(false);
                    SSto1.setVisible(false);
                    SSfrom.setText(from);
                    SSto.setText(to);
                } else if ("??????????".equals(day) & "2".equals(shift)) {
                    Sfrom1.setVisible(false);
                    Sto1.setVisible(false);
                    Sfrom.setText(from);
                    Sto.setText(to);
                } else if ("??????????".equals(day) & "1".equals(shift)) {
                    SSUfrom1.setVisible(false);
                    SSUto1.setVisible(false);
                    SSUfrom.setText(from);
                    SSUto.setText(to);
                } else if ("??????????".equals(day) & "2".equals(shift)) {
                    SUfrom1.setVisible(false);
                    SUto1.setVisible(false);
                    SUfrom.setText(from);
                    SUto.setText(to);
                } else if ("??????????????".equals(day) & "1".equals(shift)) {
                    MMfrom1.setVisible(false);
                    MMto1.setVisible(false);
                    MMfrom.setText(from);
                    MMto.setText(to);
                } else if ("??????????????".equals(day) & "2".equals(shift)) {
                    Mfrom1.setVisible(false);
                    Mto1.setVisible(false);
                    Mfrom.setText(from);
                    Mto.setText(to);
                } else if ("????????????????".equals(day) & "1".equals(shift)) {
                    TTfrom1.setVisible(false);
                    TTto1.setVisible(false);
                    TTfrom.setText(from);
                    TTto.setText(to);
                } else if ("????????????????".equals(day) & "2".equals(shift)) {
                    Tfrom1.setVisible(false);
                    Tto1.setVisible(false);
                    Tfrom.setText(from);
                    Tto.setText(to);
                } else if ("????????????????".equals(day) & "1".equals(shift)) {
                    WWfrom1.setVisible(false);
                    WWto1.setVisible(false);
                    WWfrom.setText(from);
                    WWto.setText(to);
                } else if ("????????????????".equals(day) & "2".equals(shift)) {
                    Wfrom1.setVisible(false);
                    Wto1.setVisible(false);
                    Wfrom.setText(from);
                    Wto.setText(to);
                } else if ("????????????".equals(day) & "1".equals(shift)) {
                    TTHfrom1.setVisible(false);
                    TTHto1.setVisible(false);
                    TTHfrom.setText(from);
                    TTHto.setText(to);
                } else if ("????????????".equals(day) & "2".equals(shift)) {
                    THfrom1.setVisible(false);
                    THto1.setVisible(false);
                    THfrom.setText(from);
                    THto.setText(to);
                } else if ("????????????".equals(day) & "1".equals(shift)) {
                    FFfrom1.setVisible(false);
                    FFto1.setVisible(false);
                    FFfrom.setText(from);
                    FFto.setText(to);
                } else if ("????????????".equals(day) & "2".equals(shift)) {
                    Ffrom1.setVisible(false);
                    Fto1.setVisible(false);
                    Ffrom.setText(from);
                    Fto.setText(to);
                }
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_nameItemStateChanged

    private void HGMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HGMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            NewRes.setVisible(true);
            NewRes.setEnabled(true);
            Chek.setVisible(false);
            Chek.setEnabled(false);
            RChek.setVisible(false);
            RChek.setEnabled(false);
            Times.setVisible(false);
            Times.setEnabled(false);
            Date2.setVisible(false);
            Date2.setEnabled(false);
            Account2.setEnabled(false);
            Account2.setVisible(false);
            NewR.setEnabled(false);
            NewR.setVisible(false);
            R2.setEnabled(false);
            R2.setVisible(false);
            HMain.setEnabled(false);
            HMain.setVisible(false);
            Hgs2.setVisible(true);
            Hgs2.setEnabled(true);
            re.setVisible(true);
            re.setEnabled(true);
            Resrv.setVisible(false);
            Resrv.setEnabled(false);
            SearchCH.setVisible(false);
            SearchCH.setEnabled(false);
            SearchPE.setVisible(false);
            SearchPE.setEnabled(false);
            Acc.setVisible(false);
            Acc.setEnabled(false);
        }
    }//GEN-LAST:event_HGMouseClicked

    private void refreshMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            DefaultTableModel table = new DefaultTableModel();
            table.addColumn("?????? ??????????");
            table.addColumn("?????? ????????????");
            table.addColumn("?????? ????????????");
            table.addColumn("?????? ????????????");
            table.addColumn("?????????? ??????????");
            table.addColumn("?????? ????????????");
            table.addColumn("??????????");

            try {
                Connection con = DB.ConectionDB.setconn();
                Statement st = con.createStatement();
                String strs = "SELECT * FROM reservations_data WHERE DOCNAM LIKE '%" + DName.getText() + "%' AND DATE_RESERVAT LIKE '%" + Ddate.getText() + "%'";
                ResultSet r = st.executeQuery(strs);

                while (r.next()) {
                    table.addRow(new Object[]{
                        r.getString(1),
                        r.getString(3),
                        r.getString(4),
                        r.getString(8),
                        r.getString(2),
                        r.getString(7),
                        r.getString(9),
                        r.getString(5),});
                    LestCh.setModel(table);
                }

            } catch (Exception ex) {

            }
        }
    }//GEN-LAST:event_refreshMouseClicked

    private void SearchResMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchResMouseEntered
        SearchRes1.setVisible(true);
        SearchRes1.setEnabled(true);
    }//GEN-LAST:event_SearchResMouseEntered

    private void SearchResMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchResMouseExited
        SearchRes1.setVisible(false);
        SearchRes1.setEnabled(false);
    }//GEN-LAST:event_SearchResMouseExited

    private void SearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_SearchKeyTyped
        if (Search.getText().equals("")) {
            LSearch.setVisible(true);
            LSearch.setEnabled(true);
        } else {
            LSearch.setVisible(false);
            LSearch.setEnabled(false);
        }
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("?????? ????????????");
        table.addColumn("?????? ????????????");
        table.addColumn("????????????????");
        table.addColumn("??????????");
        table.addColumn("??????????");

        try {
            Connection con = DB.ConectionDB.setconn();
            String strs = "SELECT * FROM PATIENTS WHERE NAME LIKE '%" + Search.getText() + "%' OR PHONE LIKE '%" + Search.getText() + "%'";
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(strs);

            while (r.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(6),});
                LestPE.setModel(table);
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_SearchKeyTyped

    private void AddPRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPRMouseEntered
        AddPR1.setVisible(true);
        AddPR1.setEnabled(true);
    }//GEN-LAST:event_AddPRMouseEntered

    private void AddPRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPRMouseExited
        AddPR1.setVisible(false);
        AddPR1.setEnabled(false);
    }//GEN-LAST:event_AddPRMouseExited

    private void AddPRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddPRMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new Patients().setVisible(true);
        }
    }//GEN-LAST:event_AddPRMouseClicked

    private void LestPEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LestPEMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON1 && evt.getClickCount() == 2) {

            try {
                int row = LestPE.getSelectedRow();
                String id = LestPE.getValueAt(row, 0).toString();
                String n = LestPE.getValueAt(row, 1).toString();
                
                Reservations.Pnum.setText(id);
                Reservations.Pname.setText(n);

                Connection con = DB.ConectionDB.setconn();
                Statement str = con.createStatement();
                String strss = "SELECT * FROM patients WHERE NUMBER LIKE '%" + id + "%'";
                ResultSet rt = str.executeQuery(strss);
                while (rt.next()) {
                    Reservations.patientDate.setDate(rt.getDate(5));
                }
                
            } catch (Exception ex) {

            }

            new Reservations().setVisible(true);
        }
    }//GEN-LAST:event_LestPEMouseReleased

    private void SearchResMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchResMouseClicked
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("?????? ????????????");
        table.addColumn("?????? ????????????");
        table.addColumn("????????????????");
        table.addColumn("??????????");
        table.addColumn("??????????");

        try {
            Connection con = DB.ConectionDB.setconn();
            String strs = "SELECT * FROM PATIENTS WHERE NAME LIKE '%" + Search.getText() + "%' OR PHONE LIKE '%" + Search.getText() + "%'";
            Statement st = con.createStatement();
            ResultSet r = st.executeQuery(strs);

            while (r.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(4),
                    r.getString(6),});
                LestPE.setModel(table);
            }
        } catch (Exception ex) {
        }
    }//GEN-LAST:event_SearchResMouseClicked

    private void SearchFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_SearchFocusLost
        if ("".equals(Search.getText())) {
            LSearch.setVisible(true);
            LSearch.setEnabled(true);
        } else {
            LSearch.setVisible(false);
            LSearch.setEnabled(false);
        }
    }//GEN-LAST:event_SearchFocusLost

    private void LestChMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LestChMouseReleased
        int row = LestCh.getSelectedRow();
        String reId = LestCh.getValueAt(row, 0).toString();
        String pId = LestCh.getValueAt(row, 1).toString();
        String pName = LestCh.getValueAt(row, 2).toString();
        String page = LestCh.getValueAt(row, 3).toString();
        String k = LestCh.getValueAt(row, 6).toString();
        if (evt.getButton() == MouseEvent.BUTTON1 && evt.getClickCount() == 2 && " ".equals(k)) {

            CheckUp.ReNum.setText(reId);
            CheckUp.PeNum.setText(pId);
            CheckUp.PeName.setText(pName);
            CheckUp.PeAge.setText(page);
            try {
                Connection con = DB.ConectionDB.setconn();
                Statement st = con.createStatement();
                String strs = "SELECT * FROM DOCTORS WHERE NAME LIKE '%" + DName.getText() + "%'";
                ResultSet r = st.executeQuery(strs);
                while (r.next()) {
                    r.getString(1);

                    CheckUp.DoNum.setText(r.getString(1));

                }

            } catch (Exception ex) {
                ex.getMessage();
            }
            new CheckUp().setVisible(true);
        }
    }//GEN-LAST:event_LestChMouseReleased

    private void LestreMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LestreMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON3) {
            if (evt.isPopupTrigger() && Lestre.getSelectedRowCount() != 0) {
                PopupMenu.show(evt.getComponent(), evt.getX(), evt.getY());
            }
        }
    }//GEN-LAST:event_LestreMouseReleased

    private void HgsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HgsMouseEntered
        Hgs1.setVisible(true);
        Hgs1.setEnabled(true);
    }//GEN-LAST:event_HgsMouseEntered

    private void HgsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HgsMouseExited
        Hgs1.setVisible(false);
        Hgs1.setEnabled(false);
    }//GEN-LAST:event_HgsMouseExited

    private void HgsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HgsMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            Hgs2.setVisible(true);
            Hgs2.setEnabled(true);
            re.setVisible(true);
            re.setEnabled(true);
            MR2.setVisible(false);
            MR2.setEnabled(false);
            pe.setVisible(false);
            pe.setEnabled(false);

        }
    }//GEN-LAST:event_HgsMouseClicked

    private void MRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MRMouseEntered
        MR1.setVisible(true);
        MR1.setEnabled(true);
    }//GEN-LAST:event_MRMouseEntered

    private void MRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MRMouseExited
        MR1.setVisible(false);
        MR1.setEnabled(false);
    }//GEN-LAST:event_MRMouseExited

    private void MRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MRMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            MR2.setVisible(true);
            MR2.setEnabled(true);
            pe.setVisible(true);
            pe.setEnabled(true);
            Hgs2.setVisible(false);
            Hgs2.setEnabled(false);
            re.setVisible(false);
            re.setEnabled(false);
            lestNR();
        }
    }//GEN-LAST:event_MRMouseClicked

    private void LestRChMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LestRChMouseReleased
        int row = LestRCh.getSelectedRow();
                String pn = LestRCh.getValueAt(row, 0).toString();
                String n = LestRCh.getValueAt(row, 1).toString();
                String cn = LestRCh.getValueAt(row, 2).toString();
                String rcd = LestRCh.getValueAt(row, 5).toString();
                String rch = LestRCh.getValueAt(row, 6).toString();
        if (evt.getButton() == MouseEvent.BUTTON1 && evt.getClickCount() == 2 && " ".equals(rch)) {
            try {
                
                Date d = new Date();

                RCheckUp.PeNumR.setText(pn);
                RCheckUp.PeNameR.setText(n);
                RCheckUp.ChNumR.setText(cn);
                RCheckUp.dateRC.setDate(d);

                Connection con = DB.ConectionDB.setconn();
                Statement st = con.createStatement();
                String strs = "SELECT * FROM check_up WHERE NUMBER LIKE '%" + cn + "%'";
                ResultSet r = st.executeQuery(strs);
                while (r.next()) {

                    RCheckUp.tybeR.setText(r.getString(3));
                    RCheckUp.DoNumR.setText(r.getString(14));
                    RCheckUp.heightR.setText(r.getString(4));
                    RCheckUp.widthR.setText(r.getString(5));
                    RCheckUp.ReNumR.setText(r.getString(16));

                }

                Statement str = con.createStatement();
                String strss = "SELECT * FROM patients WHERE NUMBER LIKE '%" + pn + "%'";
                ResultSet rs = str.executeQuery(strss);
                while (rs.next()) {
                    RCheckUp.PeAgeR.setText(rs.getString(6));
                }

            } catch (Exception ex) {

            }

            new RCheckUp().setVisible(true);

        }
    }//GEN-LAST:event_LestRChMouseReleased

    private void refreshRMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshRMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            LestRch();
        }
    }//GEN-LAST:event_refreshRMouseClicked

    private void refreshRMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshRMouseEntered
        refreshR1.setVisible(true);
        refreshR1.setEnabled(true);
    }//GEN-LAST:event_refreshRMouseEntered

    private void refreshRMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_refreshRMouseExited
        refreshR1.setVisible(false);
        refreshR1.setEnabled(false);
    }//GEN-LAST:event_refreshRMouseExited
    public void LestRch() {
        try {
            DefaultTableModel table = new DefaultTableModel();
            table.addColumn("?????? ????????????");
            table.addColumn("??????????   ");
            table.addColumn("?????? ??????????");
            table.addColumn("??????????");
            table.addColumn("?????????? ??????????   ");
            table.addColumn("?????????? ??????????????????   ");
            table.addColumn("??????????????????");

            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String dater = f.format(RCHdate.getDate());

            Connection con = DB.ConectionDB.setconn();
            Statement st = con.createStatement();
            String strs = "SELECT * FROM patients_data_r WHERE DOCNAME LIKE '%" + MainForm.DNameR.getText() + "%' AND Re_CheakUp LIKE '%" + dater + "%'";
            ResultSet r = st.executeQuery(strs);

            while (r.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(5),
                    r.getString(6),
                    r.getString(7),
                    r.getString(8),});

                LestRCh.setModel(table);
            }
            LestRCh.setModel(table);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void Lestre(Object d, Object n, JTable t) {
        DefaultTableModel table = new DefaultTableModel();
        table.addColumn("?????? ??????????");
        table.addColumn("?????????? ??????????");
        table.addColumn("?????? ????????????");
        table.addColumn("?????? ??????????????");
        table.addColumn("??????????");
        table.addColumn("?????? ??????????");

        try {
            Connection con = DB.ConectionDB.setconn();
            Statement st = con.createStatement();
            String strs = "SELECT * FROM reservations_data WHERE DOCNAM LIKE '%" + n + "%' AND DATE_RESERVAT LIKE '%" + d + "%'";
            ResultSet r = st.executeQuery(strs);

            while (r.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(4),
                    r.getString(5),
                    r.getString(9),
                    r.getString(10),});
                t.setModel(table);
            }
            t.setModel(table);
        } catch (Exception ex) {

        }
    }
    private void SHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SHMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            Chek.setVisible(false);
            Chek.setEnabled(false);
            RChek.setVisible(true);
            RChek.setEnabled(true);
            Times.setVisible(false);
            Times.setEnabled(false);
            Date2.setVisible(false);
            Date2.setEnabled(false);
            Account2.setEnabled(false);
            Account2.setVisible(false);
            NewR.setEnabled(false);
            NewR.setVisible(false);
            R2.setEnabled(false);
            R2.setVisible(false);
            HMain.setEnabled(false);
            HMain.setVisible(false);
            NewRes.setVisible(false);
            NewRes.setEnabled(false);
            Resrv.setVisible(false);
            Resrv.setEnabled(false);
            SearchCH.setVisible(false);
            SearchCH.setEnabled(false);
            SearchPE.setVisible(false);
            SearchPE.setEnabled(false);
            Acc.setVisible(false);
            Acc.setEnabled(false);
            LestRch();
        }
    }//GEN-LAST:event_SHMouseClicked

    private void serch2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serch2MouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String dater = f.format(PRdate.getDate());
            Lestre(dater, DNameR2.getText(), Lestre);
        }
    }//GEN-LAST:event_serch2MouseClicked

    private void serch2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serch2MouseEntered
        serch3.setVisible(true);
        serch3.setEnabled(true);
    }//GEN-LAST:event_serch2MouseEntered

    private void serch2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serch2MouseExited
        serch3.setVisible(false);
        serch3.setEnabled(false);
    }//GEN-LAST:event_serch2MouseExited

    private void MHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MHMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            NewRes.setVisible(false);
            NewRes.setEnabled(false);
            Chek.setVisible(false);
            Chek.setEnabled(false);
            RChek.setVisible(false);
            RChek.setEnabled(false);
            Times.setVisible(false);
            Times.setEnabled(false);
            Date2.setVisible(false);
            Date2.setEnabled(false);
            Account2.setEnabled(false);
            Account2.setVisible(false);
            NewR.setEnabled(false);
            NewR.setVisible(false);
            R2.setEnabled(false);
            R2.setVisible(false);
            HMain.setEnabled(false);
            HMain.setVisible(false);
            Hgs2.setVisible(false);
            Hgs2.setEnabled(false);
            re.setVisible(false);
            re.setEnabled(false);
            Resrv.setVisible(true);
            Resrv.setEnabled(true);
            SearchCH.setVisible(false);
            SearchCH.setEnabled(false);
            SearchPE.setVisible(false);
            SearchPE.setEnabled(false);
            Acc.setVisible(false);
            Acc.setEnabled(false);

            /*SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String dater = f.format(Rdate.getDate());
            Lestre(dater, DNamRE.getText(), LRE);*/
        }
    }//GEN-LAST:event_MHMouseClicked

    private void serMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String dater = f.format(Rdate3.getDate());
            Lestre(dater, DNamRE.getText(), LRE);
        }
    }//GEN-LAST:event_serMouseClicked

    private void serMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serMouseEntered
        serch1.setVisible(true);
        serch1.setEnabled(true);
    }//GEN-LAST:event_serMouseEntered

    private void serMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serMouseExited
        serch1.setVisible(false);
        serch1.setEnabled(false);
    }//GEN-LAST:event_serMouseExited

    public void LestPetie2() {
        try {
            DefaultTableModel table = new DefaultTableModel();
            table.addColumn("?????? ????????????");
            table.addColumn("??????????   ");
            table.addColumn("????????????????   ");
            table.addColumn("??????????");
            table.addColumn("?????????? ??????????????   ");
            table.addColumn("??????????");

            String strs = "SELECT * FROM patients ";

            Connection con = DB.ConectionDB.setconn();
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
                LPE.setModel(table);
            }
            LPE.setModel(table);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

    public void LestRech() {
        try {
            DefaultTableModel table = new DefaultTableModel();
            table.addColumn("?????? ????????????");
            table.addColumn("??????????   ");
            table.addColumn("?????? ??????????");
            table.addColumn("?????????? ??????????   ");
            table.addColumn("??????????????????");

            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String datec = f.format(CHdate.getDate());

            Connection con = DB.ConectionDB.setconn();
            Statement st = con.createStatement();
            String strs = "SELECT * FROM patients_data_r WHERE DATE_CHECK LIKE '%" + datec + "%' AND DOCNAME LIKE '%" + DNameCH.getText() + "%'";
            ResultSet r = st.executeQuery(strs);

            while (r.next()) {
                table.addRow(new Object[]{
                    r.getString(1),
                    r.getString(2),
                    r.getString(3),
                    r.getString(6),
                    r.getString(8),});

                LCH.setModel(table);
            }
            LCH.setModel(table);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }
    private void serCHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serCHMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            LestRech();
        }
    }//GEN-LAST:event_serCHMouseClicked

    private void serCHMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serCHMouseEntered
        serch5.setVisible(true);
        serch5.setEnabled(true);
    }//GEN-LAST:event_serCHMouseEntered

    private void serCHMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_serCHMouseExited
        serch5.setVisible(false);
        serch5.setEnabled(false);
    }//GEN-LAST:event_serCHMouseExited

    private void SePEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SePEMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            try {
                DefaultTableModel table = new DefaultTableModel();
                table.addColumn("?????? ????????????");
                table.addColumn("??????????   ");
                table.addColumn("????????????????   ");
                table.addColumn("??????????");
                table.addColumn("?????????? ??????????????   ");
                table.addColumn("??????????");

                String strs = "SELECT * FROM patients WHERE ";
                if (btnnum.isSelected()) {
                    strs += " Number ";
                } else if (btnnam.isSelected()) {
                    strs += " Name ";
                } else {
                    strs += " Phone ";
                }
                strs += " LIKE '%" + PESearch.getText() + "%'";

                Connection con = DB.ConectionDB.setconn();
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
                    LPE.setModel(table);
                }
                LPE.setModel(table);
            } catch (Exception ex) {
                ex.getMessage();
            }
        }
    }//GEN-LAST:event_SePEMouseClicked

    private void SePEMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SePEMouseEntered
        SePE1.setVisible(true);
        SePE1.setEnabled(true);
    }//GEN-LAST:event_SePEMouseEntered

    private void SePEMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SePEMouseExited
        SePE1.setVisible(false);
        SePE1.setEnabled(false);
    }//GEN-LAST:event_SePEMouseExited

    private void PESearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PESearchKeyTyped
        if ("".equals(PESearch.getText())) {
            PESearch1.setVisible(true);
            PESearch1.setEnabled(true);
        } else {
            PESearch1.setVisible(false);
            PESearch1.setEnabled(false);
        }
        try {
            DefaultTableModel table = new DefaultTableModel();
            table.addColumn("?????? ????????????");
            table.addColumn("??????????   ");
            table.addColumn("????????????????   ");
            table.addColumn("??????????");
            table.addColumn("?????????? ??????????????   ");
            table.addColumn("??????????");

            String strs = "SELECT * FROM patients WHERE ";
            if (btnnum.isSelected()) {
                strs += " Number ";
            } else if (btnnam.isSelected()) {
                strs += " Name ";
            } else {
                strs += " Phone ";
            }
            strs += " LIKE '%" + PESearch.getText() + "%'";

            Connection con = DB.ConectionDB.setconn();
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
                LPE.setModel(table);
            }
            LPE.setModel(table);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }//GEN-LAST:event_PESearchKeyTyped

    private void BMMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BMMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            Chek.setVisible(false);
            Chek.setEnabled(false);
            RChek.setVisible(false);
            RChek.setEnabled(false);
            Times.setVisible(false);
            Times.setEnabled(false);
            Date2.setVisible(false);
            Date2.setEnabled(false);
            Account2.setEnabled(false);
            Account2.setVisible(false);
            NewR.setEnabled(false);
            NewR.setVisible(false);
            R2.setEnabled(false);
            R2.setVisible(false);
            HMain.setEnabled(false);
            HMain.setVisible(false);
            NewRes.setVisible(false);
            NewRes.setEnabled(false);
            Resrv.setVisible(false);
            Resrv.setEnabled(false);
            SearchCH.setVisible(false);
            SearchCH.setEnabled(false);
            Acc.setVisible(false);
            Acc.setEnabled(false);
            SearchPE.setVisible(true);
            SearchPE.setEnabled(true);
            LestPetie2();
        }
    }//GEN-LAST:event_BMMouseClicked

    private void BKMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BKMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            Chek.setVisible(false);
            Chek.setEnabled(false);
            RChek.setVisible(false);
            RChek.setEnabled(false);
            Times.setVisible(false);
            Times.setEnabled(false);
            Date2.setVisible(false);
            Date2.setEnabled(false);
            Account2.setEnabled(false);
            Account2.setVisible(false);
            NewR.setEnabled(false);
            NewR.setVisible(false);
            R2.setEnabled(false);
            R2.setVisible(false);
            HMain.setEnabled(false);
            HMain.setVisible(false);
            NewRes.setVisible(false);
            NewRes.setEnabled(false);
            Resrv.setVisible(false);
            Resrv.setEnabled(false);
            SearchCH.setVisible(true);
            SearchCH.setEnabled(true);
            SearchPE.setVisible(false);
            SearchPE.setEnabled(false);
            Acc.setVisible(false);
            Acc.setEnabled(false);
        }
    }//GEN-LAST:event_BKMouseClicked

    private void LCHMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LCHMouseReleased
        try {
            int row = LCH.getSelectedRow();

            String nu = LCH.getValueAt(row, 0).toString();
            String na = LCH.getValueAt(row, 1).toString();

            if (evt.getButton() == MouseEvent.BUTTON1 && evt.getClickCount() == 2) {
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

    }//GEN-LAST:event_LCHMouseReleased

    private void LPEMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LPEMouseReleased
        if (evt.getButton() == MouseEvent.BUTTON1 && evt.getClickCount() == 2) {
            new PPInfo().setVisible(true);
        }
    }//GEN-LAST:event_LPEMouseReleased

    private void accLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accLMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new acc_lest().setVisible(true);
        }
    }//GEN-LAST:event_accLMouseClicked

    private void accLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accLMouseEntered
        accL1.setVisible(true);
        accL1.setEnabled(true);
    }//GEN-LAST:event_accLMouseEntered

    private void accLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accLMouseExited
        accL1.setVisible(false);
        accL1.setEnabled(false);
    }//GEN-LAST:event_accLMouseExited

    private void expMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new Expenses().setVisible(true);
        }
    }//GEN-LAST:event_expMouseClicked

    private void expMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expMouseEntered
        exp1.setVisible(true);
        exp1.setEnabled(true);
    }//GEN-LAST:event_expMouseEntered

    private void expMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expMouseExited
        exp1.setVisible(false);
        exp1.setEnabled(false);
    }//GEN-LAST:event_expMouseExited

    private void accDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accDMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new acc_day().setVisible(true);
        }
    }//GEN-LAST:event_accDMouseClicked

    private void accDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accDMouseEntered
        accD1.setVisible(true);
        accD1.setEnabled(true);
    }//GEN-LAST:event_accDMouseEntered

    private void accDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accDMouseExited
        accD1.setVisible(false);
        accD1.setEnabled(false);
    }//GEN-LAST:event_accDMouseExited

    private void AccountMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AccountMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            NewR.setEnabled(false);
            NewR.setVisible(false);
            R2.setEnabled(false);
            R2.setVisible(false);
            report.setEnabled(false);
            report.setVisible(false);
            Reprt2.setEnabled(false);
            Reprt2.setVisible(false);
            Times.setVisible(false);
            Times.setEnabled(false);
            Date2.setVisible(false);
            Date2.setEnabled(false);
            Chek.setVisible(false);
            Chek.setEnabled(false);
            RChek.setVisible(false);
            RChek.setEnabled(false);
            HMain.setEnabled(false);
            HMain.setVisible(false);
            NewRes.setVisible(false);
            NewRes.setEnabled(false);
            re.setVisible(false);
            re.setEnabled(false);
            Hgs2.setVisible(false);
            Hgs2.setEnabled(false);
            MR2.setVisible(false);
            MR2.setEnabled(false);
            pe.setVisible(false);
            pe.setEnabled(false);
            Resrv.setVisible(false);
            Resrv.setEnabled(false);
            SearchCH.setVisible(false);
            SearchCH.setEnabled(false);
            SearchPE.setVisible(false);
            SearchPE.setEnabled(false);
            Account2.setEnabled(true);
            Account2.setVisible(true);
            Acc.setVisible(true);
            Acc.setEnabled(true);
        }
    }//GEN-LAST:event_AccountMouseClicked

    private void ReprtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReprtMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            NewR.setEnabled(false);
            NewR.setVisible(false);
            R2.setEnabled(false);
            R2.setVisible(false);
            report.setEnabled(true);
            report.setVisible(true);
            Reprt2.setEnabled(true);
            Reprt2.setVisible(true);
            Times.setVisible(false);
            Times.setEnabled(false);
            Date2.setVisible(false);
            Date2.setEnabled(false);
            Account2.setEnabled(false);
            Account2.setVisible(false);
            Chek.setVisible(false);
            Chek.setEnabled(false);
            RChek.setVisible(false);
            RChek.setEnabled(false);
            HMain.setEnabled(false);
            HMain.setVisible(false);
            NewRes.setVisible(false);
            NewRes.setEnabled(false);
            re.setVisible(false);
            re.setEnabled(false);
            Hgs2.setVisible(false);
            Hgs2.setEnabled(false);
            MR2.setVisible(false);
            MR2.setEnabled(false);
            pe.setVisible(false);
            pe.setEnabled(false);
            Resrv.setVisible(false);
            Resrv.setEnabled(false);
            SearchCH.setVisible(false);
            SearchCH.setEnabled(false);
            SearchPE.setVisible(false);
            SearchPE.setEnabled(false);
            Acc.setVisible(false);
            Acc.setEnabled(false);
        }
    }//GEN-LAST:event_ReprtMouseClicked

    private void petienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petienMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new ReportPatients().setVisible(true);
        }
    }//GEN-LAST:event_petienMouseClicked

    private void petienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petienMouseEntered
        petien1.setVisible(true);
        petien1.setEnabled(true);
    }//GEN-LAST:event_petienMouseEntered

    private void petienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_petienMouseExited
        petien1.setVisible(false);
        petien1.setEnabled(false);
    }//GEN-LAST:event_petienMouseExited

    private void checkupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkupMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new ReportCheckup().setVisible(true);
        }
    }//GEN-LAST:event_checkupMouseClicked

    private void checkupMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkupMouseEntered
        checkup1.setVisible(true);
        checkup1.setEnabled(true);
    }//GEN-LAST:event_checkupMouseEntered

    private void checkupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_checkupMouseExited
        checkup1.setVisible(false);
        checkup1.setEnabled(false);
    }//GEN-LAST:event_checkupMouseExited

    private void accunMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accunMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new ReportAccu().setVisible(true);
        }
    }//GEN-LAST:event_accunMouseClicked

    private void accunMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accunMouseEntered
        accun1.setVisible(true);
        accun1.setEnabled(true);
    }//GEN-LAST:event_accunMouseEntered

    private void accunMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_accunMouseExited
        accun1.setVisible(false);
        accun1.setEnabled(false);
    }//GEN-LAST:event_accunMouseExited

    private void doctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorsMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new ReportDoctors().setVisible(true);
        }
    }//GEN-LAST:event_doctorsMouseClicked

    private void doctorsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorsMouseEntered
        doctors1.setVisible(true);
        doctors1.setEnabled(true);
    }//GEN-LAST:event_doctorsMouseEntered

    private void doctorsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorsMouseExited
        doctors1.setVisible(false);
        doctors1.setEnabled(false);
    }//GEN-LAST:event_doctorsMouseExited

    private void employeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeesMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new ReportEmployees().setVisible(true);
        }
    }//GEN-LAST:event_employeesMouseClicked

    private void employeesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeesMouseEntered
        employees1.setVisible(true);
        employees1.setEnabled(true);
    }//GEN-LAST:event_employeesMouseEntered

    private void employeesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeesMouseExited
        employees1.setVisible(false);
        employees1.setEnabled(false);
    }//GEN-LAST:event_employeesMouseExited

    private void expensMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expensMouseClicked
        if (evt.getButton() == MouseEvent.BUTTON1) {
            new Reportexpenses().setVisible(true);
        }
    }//GEN-LAST:event_expensMouseClicked

    private void expensMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expensMouseEntered
        expens1.setVisible(true);
        expens1.setEnabled(true);
    }//GEN-LAST:event_expensMouseEntered

    private void expensMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_expensMouseExited
        expens1.setVisible(false);
        expens1.setEnabled(false);
    }//GEN-LAST:event_expensMouseExited

    private void costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_costActionPerformed
        int row = Lestre.getSelectedRow();
        String num = Lestre.getValueAt(row, 0).toString();
        String cos = Lestre.getValueAt(row, 4).toString();

        Object incos = JOptionPane.showInputDialog("???????? ???????? ??????????");
        String stru = "UPDATE RESERVATIONS SET COST='" + incos + "' where Number=" + num;
        boolean ifu = DB.GO.runNunQuery(stru);
        if (ifu) {
            JOptionPane.showMessageDialog(this, "???? ?????????? ????????????", "Success", JOptionPane.WARNING_MESSAGE);
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String dater = f.format(PRdate.getDate());
            Lestre(dater, DNameR2.getText(), Lestre);
        } else {
            JOptionPane.showMessageDialog(this, "???? ?????? ?????????? ????????????", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_costActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        int row = Lestre.getSelectedRow();
        String num = Lestre.getValueAt(row, 0).toString();

        int d = JOptionPane.showConfirmDialog(this, "???? ???????? ?????????? ?????????? ??");
        if (d == JOptionPane.YES_OPTION) {
            String strd = "DELETE FROM RESERVATIONS where Number=" + num;
            boolean ifu = DB.GO.runNunQuery(strd);
            if (ifu) {
                JOptionPane.showMessageDialog(this, "???? ?????????? ??????????", "Success", JOptionPane.WARNING_MESSAGE);
                SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
                String dater = f.format(PRdate.getDate());
                Lestre(dater, DNameR2.getText(), Lestre);
            } else {
                JOptionPane.showMessageDialog(this, "???? ?????? ?????????? ??????????", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "???? ?????? ?????????? ??????????", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Acc;
    private javax.swing.JLabel Account;
    private javax.swing.JLabel Account1;
    private javax.swing.JLabel Account2;
    private javax.swing.JLabel AddD;
    private javax.swing.JLabel AddD1;
    private javax.swing.JLabel AddE;
    private javax.swing.JLabel AddE1;
    private javax.swing.JLabel AddPR;
    private javax.swing.JLabel AddPR1;
    private javax.swing.JLabel BK;
    private javax.swing.JLabel BK1;
    private javax.swing.JLabel BM;
    private javax.swing.JLabel BM1;
    private javax.swing.JLabel Bar;
    private com.toedter.calendar.JDateChooser CHdate;
    private javax.swing.JPanel Chek;
    public static final javax.swing.JLabel DNamRE = new javax.swing.JLabel();
    public static final javax.swing.JLabel DName = new javax.swing.JLabel();
    public static final javax.swing.JLabel DNameCH = new javax.swing.JLabel();
    public static final javax.swing.JLabel DNameR = new javax.swing.JLabel();
    public static final javax.swing.JLabel DNameR2 = new javax.swing.JLabel();
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Date1;
    private javax.swing.JLabel Date2;
    public static final javax.swing.JTextField Ddate = new javax.swing.JTextField();
    private javax.swing.JTextField FFfrom;
    private javax.swing.JLabel FFfrom1;
    private javax.swing.JTextField FFto;
    private javax.swing.JLabel FFto1;
    private javax.swing.JTextField Ffrom;
    private javax.swing.JLabel Ffrom1;
    private javax.swing.JTextField Fto;
    private javax.swing.JLabel Fto1;
    public static final javax.swing.JLabel HG = new javax.swing.JLabel();
    private javax.swing.JLabel HG1;
    public static final javax.swing.JPanel HMain = new javax.swing.JPanel();
    private javax.swing.JLabel Hgs;
    private javax.swing.JLabel Hgs1;
    private javax.swing.JLabel Hgs2;
    private javax.swing.JLabel Home;
    private javax.swing.JLabel Home1;
    private javax.swing.JLabel KG;
    private javax.swing.JLabel KG1;
    private javax.swing.JTable LCH;
    public static final javax.swing.JTable LPE = new javax.swing.JTable();
    private javax.swing.JTable LRE;
    private javax.swing.JLabel LSearch;
    private javax.swing.JTable LestCh;
    public static final javax.swing.JTable LestPE = new javax.swing.JTable();
    private javax.swing.JTable LestRCh;
    public static final javax.swing.JTable Lestre = new javax.swing.JTable();
    private javax.swing.JLabel MH;
    private javax.swing.JLabel MH1;
    private javax.swing.JTextField MMfrom;
    private javax.swing.JLabel MMfrom1;
    private javax.swing.JTextField MMto;
    private javax.swing.JLabel MMto1;
    private javax.swing.JLabel MR;
    private javax.swing.JLabel MR1;
    private javax.swing.JLabel MR2;
    private javax.swing.JLabel Main;
    private javax.swing.JTextField Mfrom;
    private javax.swing.JLabel Mfrom1;
    private javax.swing.JTextField Mto;
    private javax.swing.JLabel Mto1;
    public static final javax.swing.JLabel Name1 = new javax.swing.JLabel();
    private javax.swing.JPanel NewR;
    private javax.swing.JPanel NewRes;
    private javax.swing.JTextField PESearch;
    private javax.swing.JLabel PESearch1;
    private com.toedter.calendar.JDateChooser PRdate;
    private javax.swing.JPopupMenu PopupMenu;
    private javax.swing.JLabel R;
    private javax.swing.JLabel R1;
    private javax.swing.JLabel R2;
    private javax.swing.JLabel R3;
    private com.toedter.calendar.JDateChooser RCHdate;
    public static final javax.swing.JPanel RChek = new javax.swing.JPanel();
    private com.toedter.calendar.JDateChooser Rdate3;
    private javax.swing.JLabel Reprt;
    private javax.swing.JLabel Reprt1;
    private javax.swing.JLabel Reprt2;
    public static final javax.swing.JPanel Resrv = new javax.swing.JPanel();
    private javax.swing.JLabel SH;
    private javax.swing.JLabel SH1;
    private javax.swing.JTextField SSUfrom;
    private javax.swing.JLabel SSUfrom1;
    private javax.swing.JTextField SSUto;
    private javax.swing.JLabel SSUto1;
    private javax.swing.JTextField SSfrom;
    private javax.swing.JLabel SSfrom1;
    private javax.swing.JTextField SSto;
    private javax.swing.JLabel SSto1;
    private javax.swing.JTextField SUfrom;
    private javax.swing.JLabel SUfrom1;
    private javax.swing.JTextField SUto;
    private javax.swing.JLabel SUto1;
    private javax.swing.JLabel SePE;
    private javax.swing.JLabel SePE1;
    private javax.swing.JTextField Search;
    public static final javax.swing.JPanel SearchCH = new javax.swing.JPanel();
    public static final javax.swing.JPanel SearchPE = new javax.swing.JPanel();
    private javax.swing.JLabel SearchRes;
    private javax.swing.JLabel SearchRes1;
    private javax.swing.JTextField Sfrom;
    private javax.swing.JLabel Sfrom1;
    private javax.swing.JTextField Sto;
    private javax.swing.JLabel Sto1;
    private javax.swing.JTextField THfrom;
    private javax.swing.JLabel THfrom1;
    private javax.swing.JTextField THto;
    private javax.swing.JLabel THto1;
    private javax.swing.JTextField TTHfrom;
    private javax.swing.JLabel TTHfrom1;
    private javax.swing.JTextField TTHto;
    private javax.swing.JLabel TTHto1;
    private javax.swing.JTextField TTfrom;
    private javax.swing.JLabel TTfrom1;
    private javax.swing.JTextField TTto;
    private javax.swing.JLabel TTto1;
    private javax.swing.JTextField Tfrom;
    private javax.swing.JLabel Tfrom1;
    private javax.swing.JPanel Times;
    private javax.swing.JTextField Tto;
    private javax.swing.JLabel Tto1;
    private javax.swing.JLabel User;
    private javax.swing.JLabel User1;
    private javax.swing.JTextField WWfrom;
    private javax.swing.JLabel WWfrom1;
    private javax.swing.JTextField WWto;
    private javax.swing.JLabel WWto1;
    private javax.swing.JTextField Wfrom;
    private javax.swing.JLabel Wfrom1;
    private javax.swing.JTextField Wto;
    private javax.swing.JLabel Wto1;
    private javax.swing.JLabel _;
    private javax.swing.JLabel _1;
    private javax.swing.JLabel accD;
    private javax.swing.JLabel accD1;
    private javax.swing.JLabel accL;
    private javax.swing.JLabel accL1;
    private javax.swing.JLabel accun;
    private javax.swing.JLabel accun1;
    private javax.swing.ButtonGroup btnSearchPe;
    private javax.swing.JRadioButton btnnam;
    private javax.swing.JRadioButton btnnum;
    private javax.swing.JRadioButton btnpho;
    private javax.swing.JLabel checkup;
    private javax.swing.JLabel checkup1;
    private javax.swing.JMenuItem cost;
    private javax.swing.JMenuItem delete;
    private javax.swing.JLabel doctors;
    private javax.swing.JLabel doctors1;
    private javax.swing.JLabel employees;
    private javax.swing.JLabel employees1;
    private javax.swing.JLabel exp;
    private javax.swing.JLabel exp1;
    private javax.swing.JLabel expens;
    private javax.swing.JLabel expens1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    public static final javax.swing.JScrollPane jScrollPane6 = new javax.swing.JScrollPane();
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JLabel logout;
    private javax.swing.JLabel logout1;
    private javax.swing.JComboBox<String> name;
    private javax.swing.JPanel pe;
    private javax.swing.JLabel petien;
    private javax.swing.JLabel petien1;
    public static final javax.swing.JPanel r = new javax.swing.JPanel();
    private javax.swing.JPanel re;
    private javax.swing.JLabel refresh;
    private javax.swing.JLabel refresh1;
    private javax.swing.JLabel refreshR;
    private javax.swing.JLabel refreshR1;
    private javax.swing.JPanel report;
    private javax.swing.JLabel ser;
    private javax.swing.JLabel serCH;
    private javax.swing.JLabel serch1;
    private javax.swing.JLabel serch2;
    private javax.swing.JLabel serch3;
    private javax.swing.JLabel serch5;
    private javax.swing.JLabel x;
    private javax.swing.JLabel x1;
    // End of variables declaration//GEN-END:variables

    private void setIconImage(String png) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setIconImages(String png) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void HgsMouseClicked() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
