package lab5.var1;
//TODO Организовать классы фигур можно так, чтобы когда я создавал объект этого класса, то у мне бы нужно было тупо создать объект и добавить его на панель
import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class Window extends JFrame {
    JFrame mainPanel;
    public Window(){
        mainPanel = new JFrame("Lab 5");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        mainPanel.setSize(1280, 920);
        mainPanel.setLayout(new FlowLayout());

        mainPanel.setVisible(true);
    }
    public void paint(Graphics g) {
        Graphics2D gr2d = (Graphics2D) g;
        gr2d.setBackground(Color.green);
        // Рисуем простые линии
        gr2d.setPaint(Color.RED);
        gr2d.drawLine(300, 50, -50, 300);
        gr2d.setPaint(Color.BLUE);
        gr2d.drawLine(500, 50, 300, 300);
        // Рисуем многоугольник (треуголник или звезда
        // частный случай многоугольника)
        BasicStroke с = new BasicStroke(3); //толщина линии 3  многоугольника
        gr2d.setStroke(с);

        gr2d.setPaint(Color.MAGENTA);
        Polygon j = new Polygon();
        j.addPoint(270, 439);
        j.addPoint(185, 400);
        j.addPoint(100, 470);
        j.addPoint(200, 550);
        j.addPoint(240, 590);
        j.addPoint(270, 539);
        g.drawPolygon(j);


        gr2d.setPaint(Color.YELLOW);
        gr2d.drawRoundRect(200, 50, 200, 300, 200, 400);
        gr2d.setPaint(Color.DARK_GRAY);
        //Прямоугольник с закругленными краями
        gr2d.drawRoundRect(500, 500, 70, 40, 10, 10);
        // Фигура овал
        gr2d.drawOval(300, 50, 300, 300);
        // Заполненный овал
        gr2d.fillOval(100, 50, 200, 300);
        gr2d.setPaint(Color.pink);
        gr2d.drawArc(100, 200, 300, 300, ABORT, ABORT);
        // Получаем толстую линию
        gr2d.setPaint(Color.lightGray);
        BasicStroke p = new BasicStroke(10); //толщина линии 20
        gr2d.setStroke(p);
        //Овал с толстой линией
        gr2d.drawOval(100,100,300,300);
        gr2d.setPaint(Color.red);
        //Получаем цветной треугольник
        for (int i = 0; i < 30; i++) {
            gr2d.setPaint(Color.getHSBColor(5+i*350, 5+i*100, 5+i*100));
            gr2d.drawLine(400 + i*5, 400- i*6, 400 + i*4, 400 + i*3);
        }


        //clearRect очищает указанную область(координаты левого верхнего                      //угла прямоугольника;
        //width — ширина прямоугольника;
        //height — высота прямоугольника, вырезанная область зеленого цвета                 // фона
        gr2d.clearRect(50, 40, 200, 200);


    }
}
