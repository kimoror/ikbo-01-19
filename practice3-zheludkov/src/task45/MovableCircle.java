package task45;

public class MovableCircle implements Movable{
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius)
    {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }

    @Override
    public void moveUp() {
        center.y += radius * center.ySpeed;
    }
    public void moveDown() {
        center.y -= radius * center.ySpeed;
    }
    public void moveLeft() {center.x -= radius * center.xSpeed ; }
    public void moveRight() { center.x += radius * center.ySpeed; }
}
