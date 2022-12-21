import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Task2 extends JFrame {
    JTextField jtf = new JTextField(10);
    JPanel[] pnl = new JPanel[6];
    String s = "", s2;
    JButton b1 = new JButton("7");
    JButton b2 = new JButton("8");
    JButton b3 = new JButton("9");
    JButton b4 = new JButton("/");
    JButton b5 = new JButton("4");
    JButton b6 = new JButton("5");
    JButton b7 = new JButton("6");
    JButton b8 = new JButton("*");
    JButton b9 = new JButton("1");
    JButton b10 = new JButton("2");
    JButton b11 = new JButton("3");
    JButton b12 = new JButton("-");
    JButton b13 = new JButton("0");
    JButton b14 = new JButton(".");
    JButton b15 = new JButton("=");
    JButton b16 = new JButton("+");
    JButton b17 = new JButton("пробел");

    public Task2() {
        super("Калькулятор");
        setSize(250,350);
        setLayout(new GridLayout(6,1));
        for (int i=0; i<pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[0].setLayout(null);
        pnl[0].add(jtf).setBounds(20,10,200,40);
        pnl[1].setLayout(new FlowLayout());
        pnl[1].add(b1);
        pnl[1].add(b2);
        pnl[1].add(b3);
        pnl[1].add(b4);
        pnl[2].add(b5);
        pnl[2].add(b6);
        pnl[2].add(b7);
        pnl[2].add(b8);
        pnl[3].add(b9);
        pnl[3].add(b10);
        pnl[3].add(b11);
        pnl[3].add(b12);
        pnl[4].add(b13);
        pnl[4].add(b14);
        pnl[4].add(b15);
        pnl[4].add(b16);
        pnl[5].add(b17);

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "7";
                jtf.setText(s);
            }
        });
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "8";
                jtf.setText(s);
            }
        });
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "9";
                jtf.setText(s);
            }
        });
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "4";
                jtf.setText(s);
            }
        });
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "5";
                jtf.setText(s);
            }
        });
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "6";
                jtf.setText(s);
            }
        });
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "1";
                jtf.setText(s);
            }
        });
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "2";
                jtf.setText(s);
            }
        });
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "3";
                jtf.setText(s);
            }
        });
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "0";
                jtf.setText(s);
            }
        });
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += ".";
                jtf.setText(s);
            }
        });
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "/";
                jtf.setText(s);
            }
        });
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "*";
                jtf.setText(s);
            }
        });
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "-";
                jtf.setText(s);
            }
        });
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += "+";
                jtf.setText(s);
            }
        });
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                s += " ";
                jtf.setText(s);
            }
        });
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Task1 t = new Task1();
                s2 = t.calculator(s);
                if (!s2.equals("error")) {
                    jtf.setText(s2);
                }
                else {
                    JOptionPane.showMessageDialog( null, "Ошибка в выражении!","Ошибка" , JOptionPane.ERROR_MESSAGE);
                    jtf.setText("");
                }
                s = "";
            }
        });
    }

    public static void main(String[]args)
    {
        Task2 task = new Task2();
        task.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        task.setVisible(true);
    }
}