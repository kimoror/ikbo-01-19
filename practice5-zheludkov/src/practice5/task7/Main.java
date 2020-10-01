package practice5.task7;

import java.util.Scanner;

public class Main {

    static void nextPrime(int num, int i){
        int t =0;
        while(!isPrime(num, i)){
            i+=1;//перебираем все чилсла от 0 до num
            if(i > num)
                break;
        }
        if(i <= num){
            System.out.print(i + " ");
            t = num / i;
            if(num == 1)
                return;
            else
                nextPrime(t, 2);
        }

    }

    static boolean isPrime(int num1, int i){
        boolean flag = true;
        for(int j = 2; j < i;j++){
            if(i % j ==0)
                flag = false;
        }
        if(num1 % i == 0 && flag == true)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, input number: ");
        int a = sc.nextInt();
        nextPrime(a,2);
    }
}
