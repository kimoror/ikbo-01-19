package practice16;

import practice16.LinkedList.Node;

import java.lang.management.BufferPoolMXBean;
import java.util.Arrays;
import java.util.Collection;

public class OrderManager implements Order{
    LinkedList<Item> tableOrder;

    public OrderManager(){
        tableOrder = new LinkedList<>();
    }
    public OrderManager(Item[] itemArray){tableOrder = new LinkedList<>(itemArray);}
    public OrderManager(Collection<? extends Item> c){tableOrder = new LinkedList<>(c);}

    @Override
    public boolean add(Item menuItem) {
        return tableOrder.add(menuItem);
    }

    @Override
    public boolean remove(String name) {
        for(Item item : tableOrder.toArray()){
            if(item.getName().equals(name)){
                return tableOrder.remove(item);
            }
        }
        return false;
    }

    @Override
    public boolean removeAll() {
        return tableOrder.removeAll();
    }

    @Override
    public Object[] SortedItemsByCost() {
        return Arrays.stream(tableOrder.toArray()).sorted((d1,d2) -> (int) (d1.getCost() - d2.getCost())).toArray();
    }

    @Override
    public int costTotal() {
        int cost = 0;
        Item bufferItem;
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++){
            bufferItem = (Item) bufferNode.value;
            cost += bufferItem.getCost();
            bufferNode=bufferNode.next;
        }
        return cost;
    }

    @Override
    public int countOfItems(){return tableOrder.getSize();}

    @Override
    public int countOf(String itemName){
        int count = 0;

        for(Item item : tableOrder.toArray()){
            if(item.getName().equals(itemName))
                count++;
        }
        return count;
    }

    @Override
    public Item[] getItems() {
        if(tableOrder.getSize() == 0)
            throw new NullPointerException();
        return tableOrder.toArray();
    }

    @Override
    public Object[] itemsNames() {
        return Arrays.stream(tableOrder.toArray()).map(Item::getName).distinct().toArray();
    }

    @Override
    public int itemsQuantity(String itemName) {
        int cost = -1;
        for(Item item : tableOrder.toArray()){
            if(item.getName().equals(itemName)){
                cost = item.getCost();
                break;
            }
        }
        return cost;
    }

    @Override
    public int itemsQuantity(Item itemObj) {
        int cost = -1;
        for(Item item : tableOrder.toArray()){
            if(item.equals(itemObj)){
                cost = item.getCost();
                break;
            }
        }
        return cost;
    }
}
