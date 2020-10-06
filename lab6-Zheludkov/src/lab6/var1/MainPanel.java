package lab6.var1;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

public class MainPanel extends JFrame{
    private JPanel[] mainPanel = new JPanel[9];;
    private JLabel head;
    private JTextField numEnter;
    private JButton ok;
    private String rightNumber = "34";
    private int inputNumber = 0;

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
        head.setFont(new Font("Dialog", Font.PLAIN, 16));
        head.setForeground(Color.BLACK);
        mainPanel[4].add(head, BorderLayout.CENTER);

        numEnter = new JTextField();
        mainPanel[4].add(numEnter, BorderLayout.SOUTH);
        numEnter.setFont(new Font("Dialog", Font.PLAIN, 18));

        ok = new JButton ("Ok");
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(numEnter.getText().equals(rightNumber)){
                    JOptionPane.showMessageDialog(null, "You are right!");
                }
                else{
                    JOptionPane.showMessageDialog(null, "You are not right!");
                }
            }
        });
        mainPanel[7].add(ok, BorderLayout.NORTH);


        setVisible(true);
    }
}
