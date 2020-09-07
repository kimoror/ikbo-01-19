package practice2.task1;

import java.lang.System.*;
import java.util.Scanner;

public class TestAuthor {
    public static void main(String[] args) {
        Author author = new Author("Danila,", "SmartBoy@pochta.ru", 'U');
        Scanner sc = new Scanner(System.in);
        System.out.print("Test setEmail. Input email: ");
        author.setEmail(sc.nextLine());
        System.out.println("Test getName: " + author.getName());
        System.out.println("Test getEmail: " + author.getEmail());
        System.out.println("Test getGender: " + author.getGender());
        System.out.print(author.toString());

    }
}
