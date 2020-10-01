package lab6.var1;

import javax.swing.*;
import java.awt.*;

public class MainPanel extends JFrame{
    private JPanel[] mainPanel = new JPanel[9];;
    private JLabel head;
    public MainPanel(){
        super("Quiz");
        setSize(720, 480);
        setLayout(new GridLayout(3,3));
        for(int i = 0; i < 9; i++)
        {
            mainPanel[i] = new JPanel();
            mainPanel[i].setLayout(new BorderLayout());
            add(mainPanel[i]);
        }
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        head = new JLabel("Input your number:", SwingConstants.CENTER);
        head.setForeground(Color.BLACK);
        mainPanel[4].add(head, BorderLayout.CENTER);
        setVisible(true);
    }
}
