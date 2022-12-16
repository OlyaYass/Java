public class MovableCircle extends MovablePoint {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        super(x,y,xSpeed,ySpeed);
        this.radius = radius;
    }

    public String toString() {
        return "radius = "+this.radius+", center: x = "+this.x+", y = "+this.y;
    }

    @Override
    public void moveUp() {
        super.moveUp();
    }
    @Override
    public void moveDown() {
        super.moveDown();
    }
    @Override
    public void moveLeft() {
        super.moveLeft();
    }
    @Override
    public void moveRight() {
        super.moveRight();
    }

    public static void main(String[] args) {
        MovablePoint circle = new MovableCircle(5,10,10,10,10);
        System.out.println(circle);
        circle.moveRight();
        System.out.println("Move Right: "+circle);
        circle.moveLeft();
        System.out.println("Move Left: "+circle);
        circle.moveUp();
        System.out.println("Move Up: "+circle);
        circle.moveDown();
        System.out.println("Move Down: " +circle);
    }
}