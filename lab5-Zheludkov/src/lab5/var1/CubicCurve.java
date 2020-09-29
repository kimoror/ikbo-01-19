package lab5.var1;

import java.awt.geom.CubicCurve2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class CubicCurve extends CubicCurve2D {

    private Point p1;
    private Point p2;
    private Point ctrlP1;
    private Point ctrlP2;

    public CubicCurve(double x1, double y1, double ct2rlx1, double ctrly1, double ctrlx2, double ctrly2, double x2, double y2){
        p1 = new Point(x1, y1);
        p2 = new Point(x2,y2);
        ctrlP1 = new Point(ct2rlx1, ctrly1);
        ctrlP2 = new Point(ctrlx2, ctrly2);
    }

    @Override
    public double getX1() {
        return p1.getX();
    }

    @Override
    public double getY1() {
        return p2.getY();
    }

    @Override
    public Point2D getP1() {
        return null;
    }

    @Override
    public double getCtrlX1() {
        return ctrlP1.getX();
    }

    @Override
    public double getCtrlY1() {
        return ctrlP1.getY();
    }

    @Override
    public Point2D getCtrlP1() {
        return ctrlP1;
    }

    @Override
    public double getCtrlX2() {
        return ctrlP2.getX();
    }

    @Override
    public double getCtrlY2() {
        return ctrlP2.getY();
    }

    @Override
    public Point2D getCtrlP2() {
        return p2;
    }

    @Override
    public double getX2() {
        return ctrlP2.getX();
    }

    @Override
    public double getY2() {
        return ctrlP2.getY();
    }

    @Override
    public Point2D getP2() {
        return p2;
    }

    @Override
    public void setCurve(double x1, double y1, double ct2rlx1, double ctrly1, double ctrlx2, double ctrly2, double x2, double y2) {
        p1.setLocation(x1,y1);
        p2.setLocation(x2,y2);
        ctrlP1.setLocation(ct2rlx1, ctrly1);
        ctrlP2.setLocation(ctrlx2, ctrly2);
    }

    @Override
    public Rectangle2D getBounds2D() {
        return null;
    }
}
