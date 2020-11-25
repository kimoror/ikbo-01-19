package lab16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class InternetOrder extends OrderManager {

    private HashMap<String, Order> orderHashMap;

    public InternetOrder(){
        orderHashMap = new HashMap<>();
    }

    public boolean add(String address, Order order){
        orderHashMap.put(address, order);
        return true;
    }

    public Order getOrder(String address){
        return orderHashMap.entrySet().stream().filter(i->i.getKey().equals(address)).findFirst().orElse(null).getValue();
    }

    public boolean remove(String address){
        orderHashMap.remove(address);
        return true;
    }

    public void addItem(String address, MenuItem menuItem){
        getOrder(address).add(menuItem);
    }

    public void getOrders(){
        orderHashMap.entrySet().forEach(i -> System.out.println("For address:" + i.getKey() +" : " +
                Arrays.toString(i.getValue().SortedItemsByCost())));
    }

    @Override
    public int costTotal() {
       //return (int) orderHashMap.entrySet().stream().mapToInt(i -> i.getValue().costTotal()).sum();
        int cost = 0;
        ArrayList<Order> values = new ArrayList<>(orderHashMap.values());
        for(Order it : values){
            cost+=it.costTotal();
        }

        return cost;
    }

    public int getOrdersSize(){
        return orderHashMap.size();
    }

}
