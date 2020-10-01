package practice4;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.lang.*;

public class MatchTable extends JFrame{
    JPanel[] mainPanel = new JPanel[16];//Для панелей
    Font clubNames = new Font("Times new roman", Font.PLAIN, 24);//Настраиваем шрифт для надписи названия команд
    Font score = new Font("Times new roman", Font.BOLD, 32); //Настраиваем шрифт для записи кол-ва очков
    Font lastScoreFont = new Font("Times new roman",Font.PLAIN,  25);
    Font winnerFont = new Font("Times new roman",Font.BOLD,  25);

    private JLabel nameAcMilan;
    private JLabel nameRealCF;
    private JLabel scoreLabel;
    private JLabel lastSc;
    private JLabel winner;
    private JButton addScMilan;
    private JButton addScRealCF;

    private int scoreMilan = 0;
    private int scoreRealMadrid = 0;

    public void winnerToString(){
        if(scoreRealMadrid > scoreMilan)
            winner.setText("Winner: Real Madrid CF");
        else if(scoreRealMadrid < scoreMilan)
            winner.setText("Winner: AC Milan");
        else
            winner.setText("Winner: draw");
    }

    public MatchTable() {
        super("AC Milan vs Real Madrid CF");

        setDefaultCloseOperation(EXIT_ON_CLOSE);//чтобы при закрытие окна, работа программы заканчивалась
        setSize(1280,720);
        setLayout(new GridLayout(4,4));
        for(int i = 0; i < 12; i++){
            mainPanel[i] = new JPanel();
            add(mainPanel[i]);
        }

        //Создаём надпись c "Real Madrid CF"
        nameRealCF = new JLabel("Real Madrid CF");
        nameRealCF.setFont(clubNames);
        nameRealCF.setForeground(Color.BLACK);
        mainPanel[5].setLayout(new BorderLayout());//Настраиваем расположение надписи
        mainPanel[5].add(nameRealCF, BorderLayout.CENTER);//Добавляем на панель

        nameAcMilan = new JLabel("AcMilan");
        nameAcMilan.setForeground(Color.BLACK);
        nameAcMilan.setFont(clubNames);
        mainPanel[3].setLayout(new BorderLayout());
        mainPanel[3].add(nameAcMilan, BorderLayout.EAST);

        scoreLabel = new JLabel(scoreMilan + "X" + scoreRealMadrid, SwingConstants.CENTER);
        scoreLabel.setForeground(Color.BLACK);
        scoreLabel.setFont(score);
        mainPanel[4].setLayout(new BorderLayout());
        mainPanel[4].add(scoreLabel,BorderLayout.CENTER);

        winner = new JLabel("Winner: draw",SwingConstants.CENTER);
        winner.setForeground(Color.BLACK);
        winner.setFont(winnerFont);
        mainPanel[1].setLayout(new BorderLayout());
        mainPanel[1].add(winner, BorderLayout.CENTER);

        lastSc = new JLabel("Last score from:");
        lastSc.setForeground(Color.BLACK);
        lastSc.setFont(lastScoreFont);
        mainPanel[10].add(lastSc);


        addScMilan = new JButton("Goal to RealMadrid");
        addScMilan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++scoreMilan;
                scoreLabel.setText(scoreMilan + "X" + scoreRealMadrid);//update panel
                lastSc.setText("Last score from: AC Milan");
                winnerToString();
            }
        });
        mainPanel[6].add(addScMilan, BorderLayout.CENTER);

        addScRealCF = new JButton("Goal to AC Milan");
        addScRealCF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++scoreRealMadrid;
                scoreLabel.setText(scoreMilan + "X" + scoreRealMadrid);//update panel
                lastSc.setText("Last score from: Real Madrid CF");
                winnerToString();
            }
        });


        mainPanel[8].add(addScRealCF, BorderLayout.CENTER);
        setVisible(true);
    }
}
