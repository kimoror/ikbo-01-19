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

    private String rightNumber = "13";
    private int inputNumber = 0;
    private short moveCounter = 0;

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
                        //проверка на границу интервала и на integer
                        try {
                            if(Integer.parseInt(numEnter.getText()) < 0  || Integer.parseInt(numEnter.getText()) > 20)
                            {
                                JOptionPane.showMessageDialog(mainPanel[4], "Number must be > 20 and < 0");
                                numEnter.setText("");
                                return;
                            }
                        } catch (NumberFormatException ex) {
                            JOptionPane.showMessageDialog(mainPanel[4], "This is not integer number!");
                            numEnter.setText("");
                            return;
                        }
                        //если равно, больше, меньше.
                if(numEnter.getText().equals(rightNumber)){
                    JOptionPane.showMessageDialog(mainPanel[4], "You are right!");
                    System.exit(1);
                    numEnter.setText("");
                }
                else if(Integer.parseInt(numEnter.getText()) > Integer.parseInt(rightNumber)){
                    JOptionPane.showMessageDialog(mainPanel[4], "You are not right! The hidden number < than the entered one");
                    numEnter.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(mainPanel[4], "You are not right! The hidden number > than the entered one");
                }
                moveCounter+=1;
                if(moveCounter == 3){
                    JOptionPane.showMessageDialog(mainPanel[4], "No more attempts! The hidden number is 13!" +
                            " See you next time!");
                    System.exit(1);
                }
            }
        });
        mainPanel[7].add(ok, BorderLayout.NORTH);


        setVisible(true);
        JOptionPane.showMessageDialog(mainPanel[4], "Rules:\nYou have 3 attempts. The number is between 0 and 20." +
                " Good luck!");
    }
}
