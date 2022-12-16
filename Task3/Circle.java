import java.util.*;

public class Circle extends Point {
    protected Point center;
    protected int radius;

    public Circle() {
        this.center = new Point();
        this.radius = (int)(Math.random()*30);
    }
}
