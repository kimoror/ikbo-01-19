package lab8.var1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Writer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            FileWriter writer = new FileWriter("/home/danila/MEGAsync/Institute/3-rd_semestr/ProgrammingInJava/Programming/ikbo-01-19/lab8-Zheludkov/TextFile.txt", false);
            System.out.println("Please, input text:");
            writer.write(sc.nextLine());
            writer.flush();
        }
        catch (IOException e) {
            System.out.println("File doesn`t exist");
        }
    }
}
