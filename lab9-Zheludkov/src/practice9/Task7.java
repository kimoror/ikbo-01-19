package practice9;

import java.util.Scanner;

public class Task7 {
    public static void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter Key ");
        String key = myScanner.nextLine();
        printDetails( key );
    }
    public static void printDetails(String key) throws Exception {
        String message;
        try {
            message = getDetails(key);
        }
        catch (NullPointerException e){
            message = "String is empty";
        }
        System.out.println( message );
    }

    private static String getDetails(String key) throws Exception {
        if(key.equals("")) {
            throw new NullPointerException( "Key set to empty string" );
        }
        return "data for " + key;
    }
}
