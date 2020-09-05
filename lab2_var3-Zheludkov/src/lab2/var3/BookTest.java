package lab2.var3;

import java.util.Scanner;

public class BookTest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Book book = new Book();

    System.out.print("Input book`s author: ");
    book.setAuthor(sc.nextLine());
    System.out.print("Input book`s name: ");
    book.setBookName(sc.nextLine());
    System.out.print("Input book`s genre: ");
    book.setGenre(sc.nextLine());
    System.out.print("Input book`s writing year: ");
    if(sc.hasNextInt())
    {
        book.setWritingYear(sc.nextInt());
    }
    else {
        System.out.print("Erorr of input");
        return;
    }

    System.out.println("Book`s author: " + book.getAuthor());
    System.out.println("Book` name: " + book.getBookName());
    System.out.println("Book`s genre: " + book.getGenre());
    System.out.print("Book`s writing year: " + book.getWritingYear());
    }
}
