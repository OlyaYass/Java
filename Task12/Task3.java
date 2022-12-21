import javax.swing.*;

public class Task3 extends JFrame {
    private JLabel label;
    private int imgNum = 1;

    private Task3(){
        setSize(650, 550);
        label = new JLabel("", new ImageIcon(getClass().getResource("1.jpg")), SwingConstants.CENTER);

        getContentPane().add(label);

        Timer timer = new Timer(1300, e -> nextImg());
        timer.start();
    }
    private void nextImg(){
        label.setIcon(new ImageIcon(getClass().getResource((++imgNum)+".jpg")));
        if(imgNum == 5) imgNum = 0;

    }

    public static void main(String[] args) {
        Task3 task = new Task3();
        task.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        task.setVisible(true);
    }
}