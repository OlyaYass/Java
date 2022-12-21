import java.awt.*;

public class Rectangle extends Shape {

    @Override
    public void paint(Graphics2D graphics2D) {
        graphics2D.setColor(new Color((int) (Math.random() * 0x1000000)));
        graphics2D.fillRect((int)(Math.random()*400), (int)(Math.random()*400), (int)(Math.random()*400+1), (int)(Math.random()*400+1));
    }
}
