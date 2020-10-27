package pracitce8;


import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.ArrayList;

//TODO переключись на другую ветку
public class Main {
    public static void main(String[] args) {
        IWaitList<Integer> boundedList = new BoundedWaitList<>(5);
        IWaitList<Integer> unfairList = new UnfairWaitList<>();
        ArrayList test = new ArrayList();
        test.add(34);
        test.add(334);
        test.add(44);
        test.add(97);


        for(int i = 0; i < 5; i++){
            boundedList.add(i*13);
        }
        System.out.println(boundedList);
        boundedList.remove();
        System.out.println("Bounded list after remove: " + boundedList);
        System.out.println("Bounded list contains 13: " + boundedList.contains(13));
        System.out.println("Bounded list contains 132: " + boundedList.contains(132));
        System.out.println("Bounded list contains array test: " + boundedList.containsAll(test));

        for(int i = 0; i <9; i++){
            unfairList.add(i * 9);
        }
        System.out.println();
        System.out.println(unfairList);
        unfairList.remove();
        System.out.println("Unfair list after remove: " + unfairList);
        System.out.println("Unfair list contains 9: " + unfairList.contains(13));
        System.out.println("Unfair list contains 132: " + unfairList.contains(132));
        System.out.println("Unfair list contains array test: " + unfairList.containsAll(test));

        BoundedWaitList<Integer> list = new BoundedWaitList<>(5);
        for(int i = 0; i < 5; i++){
            list.add(i*13);
        }
        System.out.println();
        System.out.println(list);
        list.remove();
        System.out.println("List after remove: " + list);
        System.out.println("List contains 13: " + list.contains(13));
        System.out.println("List contains 132: " + list.contains(132));
        System.out.println("List contains array test: " + list.containsAll(test));
        System.out.println("List capacity: " + list.getCapacity());
        System.out.println(list.toString());
        System.out.println("List is empty: " + list.isEmpty());
    }
}
