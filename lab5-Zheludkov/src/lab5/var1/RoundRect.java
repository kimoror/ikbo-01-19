package lab5.var1;

import java.awt.geom.Rectangle2D;

public class RoundRect extends Rectangle2D{
    private Point p1;
    private double width;
    private double heigh;

    public RoundRect(double x, double y, double w, double h){
        p1 = new Point(x, y);
        width = w;
        heigh = h;
    }
    @Override
    public void setRect(double x, double y, double w, double h) {
        p1 = new Point(x, y);
        width = w;
        heigh = h;
    }

    @Override
    public int outcode(double x, double y) {
        return 0;
    }

    @Override
    public Rectangle2D createIntersection(Rectangle2D r) {
        return null;
    }

    @Override
    public Rectangle2D createUnion(Rectangle2D r) {
        return null;
    }

    @Override
    public double getX() {
        return p1.getX();
    }

    @Override
    public double getY() {
        return p1.getY();
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return heigh;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
