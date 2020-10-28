package practice9;

public class Exception1 {
    public static void exeptionDemo(){
        try{
            System.out.println(2 / 0);
        }catch (ArithmeticException e){
            System.out.print("Attempted division by zero");
        }
    }
}
