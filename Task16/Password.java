import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Password extends JFrame {
    JLabel lbl1 = new JLabel("     Service:");
    JLabel lbl2 = new JLabel("User name:");
    JLabel lbl3 = new JLabel("  Password:");
    JTextField jtf1 = new JTextField(30);
    JTextField jtf2 = new JTextField(30);
    JPasswordField jpf = new JPasswordField(30);

    public Password() {
        super("Password Application");
        setSize(400,250);
        setLayout(new FlowLayout());
        add(lbl1); add(jtf1);
        add(lbl2); add(jtf2);
        add(lbl3); add(jpf);
    }

    public static void main(String[]args) {
        Password task = new Password();
        task.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        task.setVisible(true);
    }
}