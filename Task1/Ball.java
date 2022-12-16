import java.lang.*;

public class Ball {
    private String color;
    private float radius;
    private String variety;

    public Ball(String c, float r, String v) {
        color = c;
        radius = r;
        variety = v;
    }
    public Ball() {
        color = "red";
        radius = 4.5f;
        variety = "soccer ball";
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }
    public float getRadius() {
        return radius;
    }

    public void getArea() {
        System.out.println("The area of " + variety + " = " + radius*radius*Math.PI);
    }
    public void isGreen() {
        if (color == "green") {
            System.out.println("Yes, the " + variety + " is green!");
        }
        else {
            System.out.println("No, the " + variety + " is not green.");
        }
    }
}
