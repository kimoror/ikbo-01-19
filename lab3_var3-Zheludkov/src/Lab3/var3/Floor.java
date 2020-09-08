package Lab3.var3;

class Floor extends Furniture{
    private String material;

    public Floor(String name, String color, String material){
        super(name, color);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public String toString() {
        return  "The name of furniure is " + super.getName() +
        "\nColor of " + super.getName() + " is " + super.getColor() + "\nMatetial of " + super.getName() +
                " is " + getMaterial();
    }
}
