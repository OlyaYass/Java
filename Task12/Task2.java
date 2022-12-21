import javax.swing.*;
import java.awt.*;

public class Task2 extends JFrame{
    Task2() {
        setSize(350, 235);
        setLayout(new FlowLayout());
        ImageIcon icon = new ImageIcon("src/image.jpg");
        getContentPane().add(new JLabel(icon));
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        Task2 task = new Task2();
        task.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        task.setVisible(true);
    }
}