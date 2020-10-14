package lab7.var1;

import java.util.ArrayList;

public class Main {

    public static void print(ArrayList array){
        for(Object it : array){
            System.out.print(it +" ");
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(7);
        for(int i = 0; i < 7; i++){
            arr.add((int)(Math.random() * 100));
        }

        print(arr);

        arr.remove(6);
        System.out.println("\nArray after remove:");
        print(arr);

        int rndNum = (int)(Math.random() * 100);
        if(arr.contains(rndNum))
            System.out.print("\nArray contain " + rndNum);
        else
            System.out.print("\nArray doesn`t contain " + rndNum);

    }
}
