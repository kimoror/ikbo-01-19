package lab5.var1;

import javax.swing.*;
import java.awt.*;

public class main {
public static void main(String args[]) {

    JFrame window = new JFrame();

    window.setTitle("GeomtricFigures");
    window.setSize(1280, 720);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//for central panel`s layout
    window.setLocationRelativeTo(null);
    window.setVisible(true);

    GraphicsPanel graphicsPanel = new GraphicsPanel();
    window.add(graphicsPanel);
}

}






