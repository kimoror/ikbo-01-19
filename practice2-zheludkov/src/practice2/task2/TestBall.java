package practice2.task2;

import java.lang.*;
import java.util.Scanner;
public class TestBall {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Scanner sc = new Scanner(System.in);
        System.out.println("Test getX: " + ball.getX());
        System.out.println("Test getY: " + ball.getY());
        System.out.print("Test setX. Please input x: ");
        ball.setX(sc.nextDouble());
        System.out.print("Test setY. Please input Y: ");
        ball.setY(sc.nextDouble());
        ball.move(1.5, 1.5);
        System.out.println("After method move: ");
        System.out.print(ball.toString());

    }
}
