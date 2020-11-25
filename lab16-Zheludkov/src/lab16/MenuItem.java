package lab16;

import java.security.spec.NamedParameterSpec;

public class MenuItem {

    private int cost;
    private String name;
    private String description;

//    public MenuItem(int cost, String name, String description){
//        this.cost = cost;
//        this.name = name;
//        this.description = description;
//    }

    public int getCost(){
        return cost;
    }

    public String getName(){
        return name;
    };

    public String getDescpription(){
        return description;
    };
}
