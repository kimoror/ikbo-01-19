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
        Item bufferItem;
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++) {
            bufferItem = (Item) bufferNode.value;
            if(bufferItem.getName().equals(name))
                return tableOrder.remove(bufferItem);
            bufferNode = bufferNode.next;
        }
        return false;
    }

    @Override
    public boolean removeAll() {
        return tableOrder.removeAll();
    }

    @Override
    public Item[] SortedItemsByCost() {

        if(tableOrder.getSize() == 0)
            throw new NullPointerException();
        Item[] itemsArray = new Item[tableOrder.getSize()];
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++) {
            itemsArray[i]= (Item) bufferNode.value;
            bufferNode = bufferNode.next;
        }

        for(int i = itemsArray.length -1; i >=1; i--){
            for(int j = 0; j < i; j++)
                if(itemsArray[i].getCost() > itemsArray[j].getCost()){
                    Item bufferChange = itemsArray[i];
                    itemsArray[i] = itemsArray[j];
                    itemsArray[j] = bufferChange;
                }
        }
       //return Arrays.stream(tableOrder.toArray()).sorted((d1,d2) -> (int) (d1.getCost() - d2.getCost())).toArray();
        return itemsArray;
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
        Item bufferItem;
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++) {
            bufferItem = (Item) bufferNode.value;
            if(bufferItem.getName().equals(itemName))
                count++;
            bufferNode = bufferNode.next;
        }
        return count;
    }

    @Override
    public LinkedList getItems() {
        if(tableOrder.getSize() == 0)
            throw new NullPointerException();
        return tableOrder;
    }

    @Override
    public String[] itemsNames() {
        if(tableOrder.getSize() == 0)
            throw new NullPointerException();
        String[] itemsNamesArray = new String[tableOrder.getSize()];
        Item bufferItem;
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++) {
            bufferItem = (Item) bufferNode.value;
            itemsNamesArray[i] = bufferItem.getName();
            bufferNode = bufferNode.next;
        }
        return itemsNamesArray;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int cost = -1;
        Item bufferItem;
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++) {
            bufferItem = (Item) bufferNode.value;
            if(bufferItem.getName().equals(itemName)){
                cost = bufferItem.getCost();
                break;
            }
            bufferNode = bufferNode.next;
        }
        return cost;
    }

    @Override
    public int itemsQuantity(Item itemObj) {
        int cost = -1;
        Item bufferItem;
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++) {
            bufferItem = (Item) bufferNode.value;
            if(bufferItem.equals(itemObj)){
                cost = itemObj.getCost();
                break;
            }
            bufferNode = bufferNode.next;
        }
        return cost;
    }
}
