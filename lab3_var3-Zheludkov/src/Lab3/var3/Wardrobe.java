package Lab3.var3;

class Wardrobe extends Furniture{
    private double heigh;
    private double width;

    public Wardrobe(String name, String color, double heigh, double width) {
        super(name, color);
        this.heigh = heigh;
        this.width = width;
    }

    public double getHeigh() {
        return heigh;
    }

    public double getWidth(){
        return width;
    }

    public String toString() {
        return "The furniture name is " + super.getName() + "\nThe " + super.getName() + " color is " + getColor() +
                "\nThe " + super.getName() + " heigh is " + getHeigh() + "\nThe " + super.getName() +
                " width is " + getWidth();
    }
}
