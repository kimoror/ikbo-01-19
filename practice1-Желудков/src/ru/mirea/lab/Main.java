package ru.mirea.lab;

public class Main {

    public static void main(String[] args) {
    Book book = new Book();
    Ball ball = new Ball();
    Dog dog = new Dog();
    System.out.println("Book size is " + book.getSize() + " pages");
    System.out.println("Ball radius is " + ball.getRadius());
	System.out.println("My dog`s name is " + dog.getName());
    }
}
