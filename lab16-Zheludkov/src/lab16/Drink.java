package lab16;

public final class Drink extends MenuItem implements Alcoholable{

    private DrinkTypeEnum type;
    private double alcoholVol;

//    public Drink(int cost, String name, String description) {
//        super(cost, name, description);
//        if(name.equals(""))
//            throw new IllegalArgumentException();
//        if(description.equals(""))
//            throw new IllegalArgumentException();
//
//    }


    public Drink(DrinkTypeEnum type, Double alcoholVol) {
        this.type = type;
        this.alcoholVol = alcoholVol;
    }

    @Override
    public boolean isAlcoholDrink() {
        return type.isAlcohol();
    }

    @Override
    public double getAlcoholvol() {
        return alcoholVol;
    }
}
