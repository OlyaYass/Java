import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Task1 extends JFrame {
    JLabel lbl_north = new JLabel("NORTH", SwingConstants.CENTER);
    JLabel lbl_west = new JLabel("WEST");
    JLabel lbl_center = new JLabel("CENTER", SwingConstants.CENTER);
    JLabel lbl_east = new JLabel("EAST");
    JLabel lbl_south = new JLabel("SOUTH", SwingConstants.CENTER);
    public Task1() {
        super("Application");
        setSize(400,250);
        setLayout(new BorderLayout());
        add(lbl_north,BorderLayout.NORTH);
        add(lbl_west,BorderLayout.WEST);
        add(lbl_center,BorderLayout.CENTER);
        add(lbl_east,BorderLayout.EAST);
        add(lbl_south,BorderLayout.SOUTH);

        lbl_center.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в ЦАО");
            }
        });
        lbl_west.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в ЗАО");
            }
        });
        lbl_south.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в ЮАО");
            }
        });
        lbl_north.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в САО");
            }
        });
        lbl_east.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                JOptionPane.showMessageDialog(null,"Добро пожаловать в ВАО");
            }
        });
    }
    public static void main(String[]args)
    {
        Task1 task = new Task1();
        task.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        task.setVisible(true);
    }
}