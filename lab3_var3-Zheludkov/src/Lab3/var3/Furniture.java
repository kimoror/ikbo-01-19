package Lab3.var3;

import java.lang.String;
public abstract class Furniture {
    private String name;
    private String color;

    public Furniture(String name, String color){
        this.name = name;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public abstract String toString ();

}
