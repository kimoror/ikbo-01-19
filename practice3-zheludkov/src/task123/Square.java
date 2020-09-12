package task123;

class Square extends Rectangle {
    protected double side;

    public Square() {};
    public Square(double side) {
        this.side = side;
    }
    public Square(double side, String Color, Boolean filled) {
        this.color = color;
        this.filled = filled;
        this.side = side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    @Override
    public void setWidth(double side){
        side = width;
    }
    @Override
    public void setLength(double side){
        side = length;
    }

    @Override
    public String toString() {
        return "Square side is " + side;
    }
}
