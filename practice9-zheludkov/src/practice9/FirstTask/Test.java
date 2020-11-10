package practice10.task1;



public class Test {
    public static void main(String[] args) {
        Complex number = new ConcreteFactory().createComplex(3,5);
        System.out.println("Number1:");
        System.out.println(number);
        Complex number2 = new ConcreteFactory().createComplex();
        System.out.println("Number2:");
        System.out.print(number2);
    }
}
