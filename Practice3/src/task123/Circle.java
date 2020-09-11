package task123;

import java.lang.Math;

class Circle extends Shape{
    protected double radius;

    public Circle(){};
    public Circle(double radius){
        this.radius = radius;
    }
    public Circle(double radius, String color, Boolean filled ){
        this.color = color;
        this.filled = filled;
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
     return 2 * Math.PI * radius;
    }

    @Override
    public String toString() {
        return "This is circle. Color is " + color + ". Radius is " + radius + ".\nArea: " + getArea() +
                ".\nPerimetr: " + getPerimeter();
    }
}
