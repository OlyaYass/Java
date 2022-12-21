import java.awt.*;

public class Triangle extends Shape{
    @Override
    public void paint(Graphics2D graphics2D) {
        graphics2D.setColor(new Color((int) (Math.random() * 0x1000000)));
        int x = (int)(Math.random()*500+1);
        int y = (int)(Math.random()*500+1);
        int y1 = (int)(Math.random()*500+1);
        int[] xPoints = {x,x+100,x+200};
        int[] yPoints = {y,y1,y};
        graphics2D.fillPolygon(xPoints, yPoints, 3);
    }
}
