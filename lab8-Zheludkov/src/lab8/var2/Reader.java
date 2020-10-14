package lab8.var2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("/home/danila/MEGAsync/Institute/3-rd_semestr/ProgrammingInJava/Programming/ikbo-01-19/lab8-Zheludkov/TextFile.txt");
        int c;
        while((c = reader.read())!= -1){
            System.out.print((char) c);
        }
    }
}
