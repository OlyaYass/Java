public class MovableRectangle extends MovablePoint {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        super(x1,y1,xSpeed,ySpeed);
        topLeft = new MovablePoint(x1,y1,xSpeed,ySpeed);
        bottomRight = new MovablePoint(x2,y2,xSpeed,ySpeed);
    }
    public String toString() {
        return "Top left: x = "+topLeft.x+", y = "+topLeft.y+", bottom right: x = "+bottomRight.x+", y = "+bottomRight.y;
    }
    @Override
    public void moveUp() {
        if (isSame()) {
            topLeft.moveUp();
            bottomRight.moveUp();
        }
        else System.out.println("Different speeds");
    }
    @Override
    public void moveDown() {
        if (isSame()) {
            topLeft.moveDown();
            bottomRight.moveDown();
        }
        else System.out.println("Different speeds");
    }
    @Override
    public void moveLeft() {
        if (isSame()) {
            topLeft.moveLeft();
            bottomRight.moveLeft();
        }
        else System.out.println("Different speeds");
    }
    @Override
    public void moveRight() {
        if (isSame()) {
            topLeft.moveRight();
            bottomRight.moveRight();
        }
        else System.out.println("Different speeds");
    }
    public boolean isSame() {
        if (topLeft.xSpeed == bottomRight.xSpeed && topLeft.ySpeed == bottomRight.ySpeed) return true;
        else return false;
    }

    public static void main(String[] args) {
        MovablePoint rectangle = new MovableRectangle(5,10,10,5, 10,10);
        System.out.println(rectangle);
        rectangle.moveDown();
        System.out.println("Move down: "+rectangle);
        rectangle.moveUp();
        System.out.println("Move up: "+rectangle);
        rectangle.moveLeft();
        System.out.println("Move left: "+rectangle);
        rectangle.moveRight();
        System.out.println("Move right: "+rectangle);
    }
}