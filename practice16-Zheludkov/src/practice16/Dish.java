package practice16;

public final class Dish implements Item {
    private final String name;
    private final String descpription;
    private final int cost;

    public Dish(String name, String desctiption) {
        this.name = name;
        this.descpription = desctiption;
        cost = 0;
    }

    public Dish(String name, String desctiption, int cost) {
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
