package lab16;

public enum DrinkTypeEnum {

    BEER("alcohol"),
    WINE("alcohol"),
    VODKA("alcohol"),
    BRANDY("alcohol"),
    CHAMPAGNE("alcohol"),
    WHISKY("alcohol"),
    TEQUILA("alcohol"),
    RUM("alcohol"),
    VERMTH("alcohol"),
    LIQUOR("alcohol"),
    JAGERMEISTER("alcohol"),
    JUICE("non-alcohol"),
    COFFE("non-alcohol"),
    GREEN_TEA("non-alcohol"),
    MILK("non-alcohol"),
    WATER("non-alcohol"),
    SODA("non-alcohol");



    private final String drink;
    DrinkTypeEnum(String drink) {
        this.drink = drink;
    }

    public String getDrink() {
        return drink;
    }

    public boolean isAlcohol(){
        return drink.equals("alcohol");
    }
}
