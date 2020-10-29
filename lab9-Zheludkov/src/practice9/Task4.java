package practice9;

import java.util.Scanner;

public class Task4 {
    public static void exceptionDemo(){
        try {
            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch(NumberFormatException e){
            System.out.println("It is not number");
        }finally {
            System.out.print("Finally");
        }
    }
}
