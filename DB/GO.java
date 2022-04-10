package DB;

import Forms.Expenses;
import Forms.MainForm;
import Forms.MainFormE;
import Forms.ReportAccu;
import Forms.ReportCheckup;
import static Forms.ReportCheckup.Doname;
import Forms.ReportDoctors;
import Forms.Reservations;
import static Forms.Reservations.Ename;
import Forms.acc_lest;
import com.sun.media.sound.DLSModulator;
import java.awt.Image;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import jdk.nashorn.internal.objects.NativeDebug;

public class GO {

    public static boolean checkUsers(String userName, String Pass, JLabel name, JLabel name2) {
        String sqls = "select * from users where UserName='" + userName + "' and Pass='" + Pass + "'";
        try {
            Connection con = ConectionDB.setconn();
            PreparedStatement st = con.prepareStatement(sqls);
            ResultSet rs = st.executeQuery();

            if (rs.next()) {
                System.out.println("ok");
                name.setText(rs.getString(3));

                Expenses.nam.setText(rs.getString(3));
                name2.setText(rs.getString(3));
                if ("DR".equals(rs.getString(2))) {
                    MainForm m = new MainForm();
                    m.setVisible(true);
                    //m.setDefaultCloseOperation(2);

                    MainForm.DName.setText(rs.getString(3));
                    MainForm.DNameR.setText(rs.getString(3));
                    MainForm.DNameR2.setText(rs.getString(3));
                    MainForm.DNamRE.setText(rs.getString(3));
                    MainForm.DNameCH.setText(rs.getString(3));

                    Reservations.Ename.setVisible(true);
                    Reservations.Ename.setEnabled(true);
                    Reservations.Ename2.setVisible(false);
                    Reservations.Ename2.setEnabled(false);
                    ReportCheckup.Dname.setVisible(true);
                    ReportCheckup.Dname.setEnabled(true);
                    ReportCheckup.Doname.setVisible(false);
                    ReportCheckup.Doname.setEnabled(false);
                    ReportCheckup.Dname.setText(rs.getString(3));
                    ReportAccu.Dname.setVisible(true);
                    ReportAccu.Dname.setEnabled(true);
                    ReportAccu.Doctname.setVisible(false);
                    ReportAccu.Doctname.setEnabled(false);
                    ReportAccu.Dname.setText(rs.getString(3));
                    acc_lest.Dname.setVisible(true);
                    acc_lest.Dname.setEnabled(true);
                    acc_lest.Doname.setVisible(false);
                    acc_lest.Doname.setEnabled(false);
                    acc_lest.Dname.setText(rs.getString(3));
                    ReportDoctors.Dname.setVisible(true);
                    ReportDoctors.Dname.setEnabled(true);
                    ReportDoctors.Doname.setVisible(false);
                    ReportDoctors.Doname.setEnabled(false);
                    ReportDoctors.Dname.setText(rs.getString(3));
                    DB.GO.fillCompo("Employees", "Name", Ename);
                } else if ("EMP".equals(rs.getString(2))) {
                    new MainFormE().setVisible(true);
                    Reservations.Ename2.setVisible(true);
                    Reservations.Ename2.setEnabled(true);
                    Reservations.Ename.setVisible(false);
                    Reservations.Ename.setEnabled(false);
                    Reservations.Ename2.setText(rs.getString(3));
                    ReportCheckup.Dname.setVisible(false);
                    ReportCheckup.Dname.setEnabled(false);
                    ReportCheckup.Doname.setVisible(true);
                    ReportCheckup.Doname.setEnabled(true);
                    ReportAccu.Dname.setVisible(false);
                    ReportAccu.Dname.setEnabled(false);
                    ReportAccu.Doctname.setVisible(true);
                    ReportAccu.Doctname.setEnabled(true);
                    acc_lest.Dname.setVisible(false);
                    acc_lest.Dname.setEnabled(false);
                    acc_lest.Doname.setVisible(true);
                    acc_lest.Doname.setEnabled(true);
                    ReportDoctors.Dname.setVisible(false);
                    ReportDoctors.Dname.setEnabled(false);
                    ReportDoctors.Doname.setVisible(true);
                    ReportDoctors.Doname.setEnabled(true);
                    DB.GO.fillCompo("Doctors", "Name", ReportCheckup.Doname);
                    DB.GO.fillCompo("Doctors", "Name", ReportAccu.Doctname);
                    DB.GO.fillCompo("Doctors", "Name", acc_lest.Doname);
                    DB.GO.fillCompo("Doctors", "Name", ReportDoctors.Doname);
                } else {
                    new MainForm().setVisible(true);
                    Reservations.Ename2.setVisible(true);
                    Reservations.Ename2.setEnabled(true);
                    Reservations.Ename.setVisible(false);
                    Reservations.Ename.setEnabled(false);
                    Reservations.Ename2.setText(rs.getString(3));
                    ReportCheckup.Dname.setVisible(false);
                    ReportCheckup.Dname.setEnabled(false);
                    ReportCheckup.Doname.setVisible(true);
                    ReportCheckup.Doname.setEnabled(true);
                    ReportAccu.Dname.setVisible(false);
                    ReportAccu.Dname.setEnabled(false);
                    ReportAccu.Doctname.setVisible(true);
                    ReportAccu.Doctname.setEnabled(true);
                    acc_lest.Dname.setVisible(false);
                    acc_lest.Dname.setEnabled(false);
                    acc_lest.Doname.setVisible(true);
                    acc_lest.Doname.setEnabled(true);
                    ReportDoctors.Dname.setVisible(false);
                    ReportDoctors.Dname.setEnabled(false);
                    ReportDoctors.Doname.setVisible(true);
                    ReportDoctors.Doname.setEnabled(true);
                    MainForm.r.setVisible(true);
                    MainForm.r.setEnabled(true);
                    DB.GO.fillCompo("Doctors", "Name", ReportCheckup.Doname);
                    DB.GO.fillCompo("Doctors", "Name", ReportAccu.Doctname);
                    DB.GO.fillCompo("Doctors", "Name", acc_lest.Doname);
                    DB.GO.fillCompo("Doctors", "Name", ReportDoctors.Doname);
                }
                con.close();
                return true;
            } else {
                System.out.println("error");
                con.close();
            }

        } catch (SQLException ex) {

        }
        return false;
    }

    public static boolean runNunQuery(String statement) {
        try {
            Connection con = ConectionDB.setconn();
            Statement st = con.createStatement();
            st.execute(statement);
            con.close();
            return true;
        } catch (SQLException ex) {
            if (ex.getErrorCode() == 2627) {
                JOptionPane.showMessageDialog(null, "تم التسجيل من قبل");
            }
            return false;
        }
    }

    public static String autoNumber(String tableName, String columnName) {
        try {
            Connection con = ConectionDB.setconn();
            Statement stm = con.createStatement();
            String sqls = "select max(" + columnName + ")+1 as autnum from " + tableName;
            ResultSet rs = stm.executeQuery(sqls);
            String num = "";
            while (rs.next()) {
                num = stm.getResultSet().getString("autnum");
            }
            con.close();
            if (num == null || "".equals(num)) {
                return "1";
            } else {
                return num;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return "0";
    }

    public static void fillCompo(String tableName, String ColumnName, JComboBox combo) {
        try {
            Connection con = DB.ConectionDB.setconn();
            String strs = "SELECT " + ColumnName + " FROM " + tableName;
            PreparedStatement st = con.prepareStatement(strs);

            ResultSet r = st.executeQuery();
            //r.last();
            //int c = r.getRow();
            //r.beforeFirst();
            //String values[] = new String[c];
            //int i = 0;
            while (r.next()) {
                //values[i] = r.getString(1);
                //i++;
                String name = r.getString(ColumnName);
                combo.addItem(name);
            }
            con.close();
            //combo.setModel(new DefaultComboBoxModel(values));
        } catch (SQLException ex) {

        }
    }

    public static String auto(String tableName, String columnName) {
        try {
            Connection con = ConectionDB.setconn();
            Statement stm = con.createStatement();
            String sqls = "select max(" + columnName + ") as autnum from " + tableName;
            ResultSet rs = stm.executeQuery(sqls);
            String num = "";
            while (rs.next()) {
                num = stm.getResultSet().getString("autnum");
            }
            con.close();
            if (num == null || "".equals(num)) {
                return "1";
            } else {
                return num;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        return "";
    }

    public static void fillCompo2(JComboBox combo) {
        try {
            Connection con = DB.ConectionDB.setconn();
            Statement st = con.createStatement();
            String strs = "select name from employees union select name from doctors";
            ResultSet r = st.executeQuery(strs);
            //r.last();
            //int c = r.getRow();
            //r.beforeFirst();
            //String values[] = new String[c];
            //int i = 0;
            while (r.next()) {
                //  values[i] = r.getString(1);
                //  i++;
                String name = r.getString("Name");
                combo.addItem(name);
            }
            //con.close();
            //combo.setModel(new DefaultComboBoxModel(values));
        } catch (SQLException ex) {

        }
    }

    public static void icon(JFrame form) {

        try {
            Image im = ImageIO.read(GO.class.getResource("icon.png"));
            form.setIconImage(im);

        } catch (IOException ex) {
            Logger.getLogger(GO.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
