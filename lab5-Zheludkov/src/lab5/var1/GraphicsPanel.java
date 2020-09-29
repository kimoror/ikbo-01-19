package lab5.var1;

import javax.swing.*;
import java.awt.*;

public class GraphicsPanel extends JPanel {
    private Line line;
    private RoundRect rect;
    private Ellips ellips;
    private CubicCurve cubicCurve;

    public GraphicsPanel(){
        line = new Line(23, 150, 280, 0);
        rect = new RoundRect(640, 360, 100, 100);
        ellips = new Ellips(100,300,433, 333);
        cubicCurve = new CubicCurve(500,320,433,211,553,222,112,445);
    }

    @Override
    public void paintComponent(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        //draw lines
        g2.setPaint(Shape.setColor());
        g2.draw(line);

        line.setLine(240, 120,450,700);
        g2.setPaint(Shape.setColor());
        g2.draw(line);

        line.setLine(740, 420,250,800);
        g2.setPaint(Shape.setColor());
        g2.draw(line);

        line.setLine(920, 576,100,212);
        g2.setPaint(Shape.setColor());
        g2.draw(line);

        //draw rectangle;
        g2.setPaint(Shape.setColor());
        g2.draw(rect);

        rect.setRect(320, 450,500,200);
        g2.setPaint(Shape.setColor());
        g2.draw(rect);

        rect.setRect(220, 650,300,500);
        g2.setPaint(Shape.setColor());
        g2.draw(rect);

        rect.setRect(420, 30,700,300);
        g2.setPaint(Shape.setColor());
        g2.draw(rect);

        //draw ellips;
        g2.setPaint(Shape.setColor());
        g2.draw(ellips);

        ellips.setFrame(200, 143,100,100);
        g2.setPaint(Shape.setColor());
        g2.draw(ellips);

        ellips.setFrame(450, 143,130,400);
        g2.setPaint(Shape.setColor());
        g2.draw(ellips);

        ellips.setFrame(250, 143,400,400);
        g2.setPaint(Shape.setColor());
        g2.draw(ellips);

        ellips.setFrame(644, 343,333,234);
        g2.setPaint(Shape.setColor());
        g2.draw(ellips);

        //draw CubicCurve
        g2.setPaint(Shape.setColor());
        g2.draw(cubicCurve);
        cubicCurve.setCurve(45,321,144,222,111,44,556,234);
        g2.setPaint(Shape.setColor());
        g2.draw(cubicCurve);
    }

}
