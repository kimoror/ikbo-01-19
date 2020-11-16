package practice16;

public final class Drink {
    private final String name;
    private final String descpription;
    private final int cost;

    public Drink(String name, String desctiption) {
        this.name = name;
        this.descpription = desctiption;
        cost = 0;
    }

    public Drink(String name, String desctiption, int cost) {
        this.name = name;
        this.descpription = desctiption;
        this.cost = cost;
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
