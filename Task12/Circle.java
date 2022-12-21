import java.awt.*;

public class Circle extends Shape {
    @Override
    public void paint(Graphics2D graphics2D) {
        graphics2D.setColor(new Color((int) (Math.random() * 0x1000000)));
        int radius = (int)(Math.random()*200) + 1;
        graphics2D.fillOval((int)(Math.random()*500), (int)(Math.random()*500), radius, radius);
    }
}
