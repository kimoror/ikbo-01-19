package lab4.var1;

public class Planet implements Nameable{
    private String name;
    private final double radius = 10;
    public Planet(String name){
        this.name = name;
    }
    public Planet(){};

    public String getName() {
        return name;
    }

    public double getRadius(){
        return radius;
    }
}
