package lab2.var3;

import java.lang.String;
import java.lang.System;

public class Book {
    private String author;
    private String bookName;
    private int writingYear;
    private String genre;

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setWritingYear(int writingYear) {
        this.writingYear = writingYear;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getWritingYear() {
        return writingYear;
    }

    public String getGenre() {
        return genre;
    }
}
