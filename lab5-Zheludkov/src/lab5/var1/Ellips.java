package lab5.var1;

import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class Ellips extends Ellipse2D{
    private Point p1;
    private double height;
    private double widht;

    public Ellips(double x, double y, double w, double h){
        p1 = new Point(x,y);
        height = h;
        widht = w;
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
        return widht;
    }

    @Override
    public double getHeight() {
        return height;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public void setFrame(double x, double y, double w, double h) {
        p1.setLocation(x, y);
        widht = w;
        height = h;
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }
}
