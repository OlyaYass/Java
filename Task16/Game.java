import java.awt.event.*;
import javax.swing.*;

class Game extends JFrame {
    int a = 16, b;
    int k = 0;
    JButton btn = new JButton("Проверить");
    JLabel lbl1 = new JLabel("Введите число: ");
    JLabel lbl2 = new JLabel("Угадайте число от 1 до 20");
    JTextField tf = new JTextField(5);
    public Game() {
        super("Game");
        setSize(300,250);
        setLayout(null);
        lbl2.setBounds(20,30,200,20);
        lbl1.setBounds(20,80,100,20);
        tf.setBounds(140,80,50,20);
        btn.setBounds(60,140,150,40);
        add(lbl2);
        add(lbl1);
        add(tf);
        add(btn);

        btn.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent event) {
                k++;
                if (k<=3) {
                    b = Integer.valueOf(tf.getText());
                    if (b == a) {
                        JOptionPane.showMessageDialog(null, "Вы выиграли!");
                        k = 0;
                    }
                    else if (b < a)
                        JOptionPane.showMessageDialog(null, "Введённое число меньше задуманного");
                    else JOptionPane.showMessageDialog(null, "Введённое число больше задуманного");
                }
                if (k == 3 && b != a)  {
                    JOptionPane.showMessageDialog(null, "Вы проиграли(");
                    k =0;
                }
            }
        });

    }
    public static void main(String[]args) {
        Game task = new Game();
        task.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        task.setVisible(true);
    }
}