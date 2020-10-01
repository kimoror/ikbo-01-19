package practice5.task9;

//Такие последовательности возможны,, если максимальное колицчество нулей в комбинации больше чем количество единиц
//на 2

import java.util.Scanner;

public class Main {
    static long count(int a, int b, long sum){
        if(a > b+1)
            return 0;
        //чтобы не выходил в минус при инкременции
        if( a == 0 || b ==0){
            sum +=1;
            return 1;
        }
        //либо b становиться меньше, либо a и b одновременно уменьшаются (см. условие при котором равенства возможны)
        sum += count(a,b-1, sum)+count(a-1,b-1, sum);
        return sum;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter number of 0: ");
        int a = sc.nextInt();
        System.out.print("Please, enter number of 1: ");
        int b = sc.nextInt();
        long sum = 0;
        if(a+b == 0)
            System.out.print(0);
        else
            System.out.print(count(a,b,sum));
    }

}
