package practice7.var3;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Deque<Integer> player1 = new ArrayDeque<>();
        Deque<Integer> player2 = new ArrayDeque<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Please, input numbers of first player:");
        for(int i = 0; i < 5; i++){
            player1.addFirst(sc.nextInt());
        }

        System.out.println("Please, input numbers of second player:");
        for(int i = 0; i < 5; i++){
            player2.addFirst(sc.nextInt());
        }

        int i = 0;
        //TODO  прописать условие с 0
        while (i < 106 && player1.peekFirst() != null && player2.peekFirst() != null) {
            if(player1.peekFirst() > player2.peekFirst() && !(player1.peekFirst() == 9 && player2.peekFirst() == 0)||
                    (player1.peekFirst() == 0 && player2.peekFirst() == 9)){
                player1.addLast(player1.pollFirst());
                player1.addLast(player2.pollFirst());
            }
            else if((player2.peekFirst() > player1.peekFirst()) && !(player1.peekFirst() == 0 && player2.peekFirst() == 9) ||
                    (player1.peekFirst() == 9 && player2.peekFirst() == 0)){
                player2.addLast(player2.pollFirst());
                player2.addLast(player1.pollFirst());
            }
                i++;
        }
        if(i == 106)
            System.out.println("botva");
        else{
            if(player1.peekFirst() == null){
                System.out.println("second " + i);
            }
            else
                System.out.println("first " + i);
        }




    }
}
