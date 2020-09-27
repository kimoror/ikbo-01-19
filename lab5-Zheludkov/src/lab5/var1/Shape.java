package lab5.var1;

import java.awt.Color;
public abstract class Shape {
    private java.awt.Color color;
    private Double x;
    private Double y;

    public Color getColor(){
        return color;
    }

    public void setX(Double x){this.x = x;}

    public Double getX(){return x;}

    public void setY(Double y){this.y = y;}

    public Double getY(){return y;}
}
