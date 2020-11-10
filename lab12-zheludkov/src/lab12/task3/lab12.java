package lab12.task3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lab12 {
    public static void main(String[] args) {
        //String regex = "([0-31]){2}/([1-12]){2}/([1900-9999])";
        Pattern mailPattern = Pattern.compile("([3][0-1]|[1-2][0-9]|[0][1-9])[/]([0][1-9]|[1][0-2])[/]([1][9][0-9][0-9]" +
                "|[2-9][0-9][0-9][0-9])");
        String date = new String("01/10/2343");
        Matcher matcher = mailPattern.matcher(date);
        if(matcher.matches()){
            System.out.println("It is right date");
        }
        else
            System.out.println("It is not right date");
    }


}
