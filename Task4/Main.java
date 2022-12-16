import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Main extends JFrame {
    int a = 0, b = 0;
    JButton b1 = new JButton("AC Milan");
    JButton b2 = new JButton("Real Madrid");
    JButton b3 = new JButton("The end of match");
    JLabel lbl1 = new JLabel("Result: "+a+" X "+b);
    JLabel lbl2 = new JLabel("Last Scorer: N/A");
    JLabel lbl3 = new JLabel("Winner:");
    public Main() {
        super("Football match!");
        setSize(380,230);
        setLayout(null);
        b1.setBounds(20,20,150,40);
        b2.setBounds(200,20,150,40);
        lbl1.setBounds(40, 80, 100, 20);
        lbl2.setBounds(200, 80, 200, 20);
        lbl3.setBounds(200, 130, 200,20);
        b3.setBounds(20, 120, 150, 40);
        add(b1);
        add(b2);
        add(lbl1);
        add(lbl2);
        add(lbl3);
        add(b3);

        b1.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                a++;
                lbl1.setText("Result: "+a+" X "+b);
                lbl2.setText("Last Scorer: AC Milan");
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });

        b2.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                b++;
                lbl1.setText("Result: "+a+" X "+b);
                lbl2.setText("Last Scorer: Real Madrid");
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });

        b3.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (a>b) lbl3.setText("Winner: AC Milan");
                else if (b>a) lbl3.setText("Winner: Real Madrid");
                else lbl3.setText("Winner: DRAW");
            }
            @Override
            public void mousePressed(MouseEvent e) {}
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
        });

    }
    public static void main(String[]args)
    {
        new Main().setVisible(true);
    }
}