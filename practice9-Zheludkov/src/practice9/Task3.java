package practice9;

import java.util.Scanner;

public class Task3 {
    public static void exceptionDemo(){

            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
        try {
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        }catch(Exception e){
            System.out.print("It is not number");
        }
    }
}
