package task45;

public class TestFigure {
    public static void main(String[] args) {
        MovablePoint dot = new MovablePoint(0,0, 5,5);
        dot.moveUp();
        dot.moveLeft();
        System.out.println(dot.toString());

        MovableCircle circle = new MovableCircle(0,0,3,3,5);
        circle.moveDown();
        circle.moveRight();
        System.out.println(circle.toString());

        MovableRectangle rectangle = new MovableRectangle(4,4,8,-8, 5,5);
        rectangle.moveDown();
        rectangle.moveRight();
        System.out.println(rectangle.toString());
    }
}
