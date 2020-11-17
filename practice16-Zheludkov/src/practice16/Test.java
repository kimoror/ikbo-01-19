package practice16;


import java.net.Inet4Address;
import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
//        LinkedList test = new LinkedList();
//        test.add(1);
//        test.add(2);
//        test.add(20);
//        test.add(32);
//        test.viewList();
//
//        System.out.println("List after remove:");
//        test.remove(20);
//        test.add(23);
//        test.add(10);
//        test.add(89);
//        test.viewList();
//
//        System.out.println("Last element:"+test.last.value);
//        System.out.println("Last.prev:"+test.last.prev.value);
//        System.out.println("Last.next:" + test.last.next.value);
//
//        test.add(111);
//
//        System.out.println("Last element after add:"+test.last.value);
//        System.out.println("Last.prev after add:"+test.last.prev.value);
//        System.out.println("Last.next after add:" + test.last.next.value);

        //Test addAll methods

        //Add array to new LinkedList
//        Dish[] items = new Dish[5];
//        items[0] = new Dish("First", "First");
//        items[1] = new Dish("First1", "First1");
//        items[2] = new Dish("First2", "First2");
//        items[3] = new Dish("First3", "First3");
//        items[4] = new Dish("First4", "First4");
//        LinkedList test2 = new LinkedList(items);
//        test2.viewList();

        //Add array to exist LinkedList
//        test.addAll(items);
//        test.viewList();

        //Add colletions to new LinkedList
//        ArrayList<Dish> itemsCollection= new ArrayList<Dish>();
//        itemsCollection.add(new Dish("First", "First"));
//        itemsCollection.add(new Dish("First1", "First1"));
//        itemsCollection.add(new Dish("First2", "First2"));
//        itemsCollection.add(new Dish("First3", "First3"));
//        itemsCollection.add(new Dish("First4", "First4"));
//        LinkedList test3 = new LinkedList(itemsCollection);
//        test3.viewList();
//
//        //Add collenction to exist LinkedList
//        test.addAll(itemsCollection.toArray());
//        test.viewList();
//  }
        Item drink01 = new Drink("Drink1", "Drink1_description", 100);
        Item drink02 = new Drink("Drink2", "Drink2_description", 114);
        Item drink03 = new Drink("Drink3", "Drink3_description", 99);
        Item drink04 = new Drink("Drink4", "Drink4_description", 10234);

        RestaurantOrder order = new RestaurantOrder();
        order.add(drink01);
        order.add(drink02);
        order.add(drink03);
        order.add(drink04);
        System.out.println("Cost total:" + order.costTotal());
        System.out.println("Count of items:" + order.countOfItems());
        System.out.println("Number of Drink1: "+order.countOf("Drink1"));
        order.remove("Drink2");
        System.out.println("Count of items after remove Drink2: " + order.countOfItems());
        System.out.println("Number of Drink2: "+order.countOf("Drink2"));
        Item[] itemsArray = order.SortedItemsByCost();
        System.out.println("\nSorted by cost:");
        for(int i = 0; i < itemsArray.length; i++){
            System.out.println(itemsArray[i].getName()+": "+itemsArray[i].getCost());
        }
        System.out.println("\nCost of Drink4: " + order.itemsQuantity("Drink4"));

        System.out.println("\n======================================================\n" +
                "\nInternet orders:\n");
        InternetOrder internetOrder = new InternetOrder();
        internetOrder.add("address1" ,order);
        System.out.println("Total cost:" + internetOrder.costTotal());
        System.out.println("Intenet order size: "+internetOrder.getOrdersSize());

    }
}
