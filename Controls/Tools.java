package Controls;

import java.awt.Component;
import java.awt.Container;
import java.text.MessageFormat;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Tools {

    public static void clearText(Container form) {
        for (Component c : form.getComponents()) {
            if (c instanceof JTextField) {
                JTextField txt = (JTextField) c;
                txt.setText("");
            } else if (c instanceof Container) {
                clearText((Container) c);
            }
        }
    }

    public static void setReport(JTable table) {
        table.getTableHeader().setBackground(new java.awt.Color(0, 0, 90));
        table.getTableHeader().setForeground(java.awt.Color.WHITE);
    }

    public static void printReport(JTable table, String titel) {
        try {
            MessageFormat header = new MessageFormat(titel + " Report");
            MessageFormat footer = new MessageFormat("Page - {0}");
            table.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        } catch (Exception ex) {
            ex.getMessage();
        }
    }

}
