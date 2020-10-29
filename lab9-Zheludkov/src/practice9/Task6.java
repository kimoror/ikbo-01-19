package practice9;

import java.util.Scanner;

public class Task6 {
    public static void getKey() throws Exception {
        Scanner myScanner = new Scanner( System.in );
        String key = myScanner.next();
        printDetails( key );
    }
    public static void printDetails(String key) throws Exception {
            String message = getDetails(key);
            try {
                System.out.println(message);
            }catch(Exception e) {
                throw e;
            }
    }
    private static String getDetails(String key) throws Exception {
        if(key == "") {
            throw new Exception( "Key set to empty string" );
        }
        return "data for " + key; }
}

