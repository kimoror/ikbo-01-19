package Lab3.var3;

public class FurnitureShop {
    public static void main(String[] args) {
        Floor floor = new Floor("Parket", "Brown", "Tree");
        System.out.println(floor.toString());
        System.out.println("---------------------------------------------------------");
        Wardrobe wardrobe = new Wardrobe("Bookcase", "Black", 123.12,90.3);
        System.out.print(wardrobe.toString());
    }
}
