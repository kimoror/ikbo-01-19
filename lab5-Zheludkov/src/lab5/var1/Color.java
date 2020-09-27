package lab5.var1;
//TODO Убрать enum и переместить метод setColor в shape
import org.w3c.dom.css.Rect;

import java.util.Random;

public enum Color {RED, GREEN, BLUE, BLACK,YELLOW;

    int randomNum;
    Random generator = new Random();

    public java.awt.Color setColor() {
        java.awt.Color color = new java.awt.Color();
        randomNum = generator.nextInt(5);
        switch (randomNum){
            case (0):
                color = color.RED;
            case(1):
                color = color.GREEN;
            case(2):
                color = color.BLUE;
            case(3):
                color = color.BLACK;
            case(4):
                color = color.YELLOW;
        }
        return color;
    }

}
