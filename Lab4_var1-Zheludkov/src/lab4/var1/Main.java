package lab4.var1;


public class Main {
    public static void main(String[] args) {
        Planet saturn = new Planet("Saturn");
        Car car = new Car("Honda");
        System.out.println("Name of planet: " + saturn.getName());
        System.out.println("Name of car: " + car.getName());

        Nameable obj = new Planet("Earth"); //Мы можем использовать только поля класса Planet,но не его методы.
        //Методы, мы можем использовать только те, которые прописаны в интерфейсе.
        System.out.println("Name of planet: " + obj.getName());
        obj = new Car("Ford");
        System.out.println("Name of car: " + obj.getName());

    }
}
