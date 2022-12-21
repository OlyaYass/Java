import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Task1 extends JFrame{
    JTextField jta1 = new JTextField(15);
    JTextField jta2 = new JTextField(15);
    JButton btn1 = new JButton("Сложить");
    JButton btn2 = new JButton("Вычесть");
    JButton btn3 = new JButton("Умножить");
    JButton btn4 = new JButton("Разделить");

    Task1(){
        super("Калькулятор");
        setLayout(new FlowLayout());
        setSize(250,180);
        add(new JLabel("число 1:"));
        add(jta1);
        add(new JLabel("число 2:"));
        add(jta2);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btn4);

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+(x1+x2),"Результат",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception exception) {
                    JOptionPane.showMessageDialog( null, "Ошибка в числе!","Внимание" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+(x1-x2),"Результат",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception exception) {
                    JOptionPane.showMessageDialog( null, "Ошибка в числе!","Внимание" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    JOptionPane.showMessageDialog(null, "Результат = "+(x1*x2),"Результат",JOptionPane.INFORMATION_MESSAGE);
                }catch(Exception exception) {
                    JOptionPane.showMessageDialog( null, "Ошибка в числе!","Внимание" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(jta1.getText().trim());
                    double x2 = Double.parseDouble(jta2.getText().trim());
                    if (x2 != 0) JOptionPane.showMessageDialog(null, "Результат = "+(x1/x2),"Результат",JOptionPane.INFORMATION_MESSAGE);
                    else JOptionPane.showMessageDialog( null, "На ноль делить нельзя!","Ошибка" , JOptionPane.ERROR_MESSAGE);
                }catch(Exception exception) {
                    JOptionPane.showMessageDialog( null, "Ошибка в числе!","Внимание" , JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    public static void main(String[]args){
        Task1 task = new Task1();
        task.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        task.setVisible(true);
    }
}
