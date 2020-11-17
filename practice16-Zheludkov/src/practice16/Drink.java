package practice16;

public final class Drink implements Item {

    final String name;
    final String descpription;
    final int cost;

    public Drink(String name, String desctiption) {
        this.name = name;
        this.descpription = desctiption;
        this.cost = 0;
        if(name.equals(""))
            throw new IllegalArgumentException();
        if(desctiption.equals(""))
            throw new IllegalArgumentException();
    }

    public Drink(String name, String desctiption, int cost) {
        this.name = name;
        this.descpription = desctiption;
        this.cost = cost;
        if(cost < 0)
            throw new IllegalArgumentException();
        if(name.equals(""))
            throw new IllegalArgumentException();
        if(desctiption.equals(""))
            throw new IllegalArgumentException();
    }

    public int getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public String getDescpription() {
        return descpription;
    }
}
