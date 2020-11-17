package practice16;

import practice16.LinkedList.Node;

import java.util.Arrays;

public class TablesOrderManager implements Order{
    LinkedList<Item> tableOrder;
    Node current;

    public TablesOrderManager(){
        tableOrder = new LinkedList<>();
    }

    @Override
    public boolean add(Item menuItem) {
        //tableOrder.first.value.getName();
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
        return (int) Arrays.stream(tableOrder.toArray()).mapToInt(Item::getCost).sum();
    }

    @Override
    public Item[] getItems() {
        return tableOrder.toArray();
    }

    @Override
    public Object[] itemsNames() {
        return Arrays.stream(tableOrder.toArray()).map(Item::getName).toArray();
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
