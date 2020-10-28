package practice9;

public class Task5 {

    public static void printMessage(String key) {
        try{
        String message = getDetails(key);
        System.out.println( message );
        }catch (NullPointerException d){
            System.out.println("Null pointer exception");
        }
    }

    public static String getDetails(String key){
            if(key == null){
                throw new NullPointerException("null key in getDetails");
            }
        return key;
    }
}
