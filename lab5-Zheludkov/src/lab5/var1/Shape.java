package lab5.var1;

import java.awt.Color;
import java.util.Random;

public abstract class Shape {
    //private static java.awt.Color color;
    private Double x;
    private Double y;

//    public static Color getColor(){
//        return color;
//    }

    public void setX(Double x){this.x = x;}

    public Double getX(){return x;}

    public void setY(Double y){this.y = y;}

    public Double getY(){return y;}

    public static int randomNum;

    public static Random generator = new Random();

    public static java.awt.Color setColor() {
        java.awt.Color color = new java.awt.Color(0,0,0);
        randomNum = generator.nextInt(8);
        System.out.println(randomNum);
        switch (randomNum){
            case (0):
                color = Color.RED;
                break;
            case(1):
                color = Color.GREEN;
                break;
            case(2):
                color = Color.BLUE;
                break;
            case(3):
                color = Color.BLACK;
                break;
            case(4):
                color = Color.GRAY;
                break;
            case(5):
                color = Color.CYAN;
                break;
            case(6):
                color = Color.MAGENTA;
                break;
            case(7):
                color = Color.ORANGE;
                break;
        }
        return color;
    }
//    public Shape(){
//        this.color = setColor();
//    }
}
