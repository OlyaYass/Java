import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Task2 extends JFrame {
    String[] city = {"Австралия", "Китай", "Англия", "Россия"};
    JComboBox cb = new JComboBox(city);
    public Task2() {
        super("Страны");
        setSize(300,250);
        setLayout(new FlowLayout());
        add(cb);

        cb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (cb.getSelectedItem().equals("Австралия")) {
                    JOptionPane.showMessageDialog(null, "Это Австралия");
                }
                if (cb.getSelectedItem().equals("Китай")) {
                    JOptionPane.showMessageDialog(null, "Это Китай");
                }
                if (cb.getSelectedItem().equals("Англия")) {
                    JOptionPane.showMessageDialog(null, "Это Англия");
                }
                if (cb.getSelectedItem().equals("Россия")) {
                    JOptionPane.showMessageDialog(null, "Это Россия");
                }
            }
        });

    }
    public static void main(String[]args) {
        Task2 task = new Task2();
        task.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        task.setVisible(true);
    }
}