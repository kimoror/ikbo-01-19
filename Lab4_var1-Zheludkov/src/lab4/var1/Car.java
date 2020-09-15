package lab4.var1;

public class Car implements Nameable{
    private String name;
    private final double speed = 102;

    public Car(String name){
        this.name = name;
    }
    public Car(){};

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }
}
