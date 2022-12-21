import java.awt.*;
import javax.swing.*;

class Task1 extends JFrame {

    public static Shape shapeCreator(int i) {
        if (i == 0) return new Circle();
        else if (i == 1) return new Rectangle();
        else return new Triangle();
    }

    Task1() {
        super("Some shapes");
        setSize(600,600);
        setLocationRelativeTo(null);

    }

    public void paint(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        for (int i=0; i<20; i++) {
            Shape shape = shapeCreator((int)(Math.random()*3));
            shape.paint(g2D);
        }
    }


    public static void main(String[] args) {
        Task1 task = new Task1();
        task.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        task.setVisible(true);
    }
}