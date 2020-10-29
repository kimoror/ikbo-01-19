package practice9;

import java.util.Scanner;

public class Task8 {
    public static void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        while (myScanner.hasNextLine()){
            String key = myScanner.nextLine();
            try {
                printDetails(key);
            }catch (Exception e){
                System.out.println("You key is wrong. Try again: ");
            }
        }
    }
    public static void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println( message );
    }

    private static String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new NullPointerException( "Key set to empty string" );
        }
        return "data for " + key;
    }
}
