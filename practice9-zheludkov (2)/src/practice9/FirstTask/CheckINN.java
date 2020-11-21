package practice9.FirstTask;

import java.util.Scanner;

public class CheckINN {
    public static void main(String[] args) throws ExceptionInn {
        Scanner sc = new Scanner(System.in);
        String secondName, name, fatherName;
        int inn, rightInn=12345678;
        System.out.print("Please input your name: ");
        name = sc.nextLine();
        System.out.print("Please input your second name: ");
        secondName = sc.nextLine();
        System.out.print("Please input your father`s name: ");
        fatherName = sc.nextLine();
            System.out.print("Please input your INN: ");
            inn = sc.nextInt();
            if (inn != rightInn)
                throw new ExceptionInn("Invalid inn");


    }
}
