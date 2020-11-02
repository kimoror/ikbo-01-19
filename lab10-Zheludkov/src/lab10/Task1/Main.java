package lab10.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.lang.String;

public class Main {

    public static <E> void arrayToList(E[] array, List<E> list){
        list.addAll(Arrays.asList(array));
    }

    public static <E> void print(E[] array){
        for(E it:array){
            System.out.print(it + " ");
        }
    }

    public static void main(String[] args) {
        String[] array = new String []{"First", "Second", "Third", "Fouth", "Fifth"};
        List<String> list = new ArrayList<>();

        System.out.println("Array:");
        print(array);
        System.out.println();
        arrayToList(array, list);
        System.out.println("List:");
        print(array);
    }
}
