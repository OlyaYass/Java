import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Task3 extends JFrame {

    JMenuBar menuBar = new JMenuBar();
    JMenu file = new JMenu("Файл");
    JMenu edit = new JMenu("Правка");
    JMenu help = new JMenu("Справка");
    JMenuItem file1 = new JMenuItem("Сохранить");
    JMenuItem file2 = new JMenuItem("Выйти");
    JMenuItem edit1 = new JMenuItem("Копировать");
    JMenuItem edit2 = new JMenuItem("Вырезать");
    JMenuItem edit3 = new JMenuItem("Вставить");
    JButton btn1 = new JButton("Кнопка 1");
    JButton btn2 = new JButton("Кнопка 2");
    JTextField jtf = new JTextField(20);
    JPanel[] pnl = new JPanel[2];

    public Task3() {
        super("Menu");
        setSize(250,150);
        setLayout(new GridLayout(2,1));
        setJMenuBar(menuBar);
        menuBar.add(file);
        menuBar.add(edit);
        menuBar.add(help);
        file.add(file1);
        file.add(file2);
        edit.add(edit1);
        edit.add(edit2);
        edit.add(edit3);
        for (int i=0; i<pnl.length; i++) {
            pnl[i] = new JPanel();
            add(pnl[i]);
        }
        pnl[0].setLayout(new FlowLayout());
        pnl[0].add(btn1);
        pnl[0].add(btn2);
        pnl[1].setLayout(new FlowLayout());
        pnl[1].add(jtf);
    }

    public static void main(String[]args)
    {
        Task3 task = new Task3();
        task.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        task.setVisible(true);
    }
}