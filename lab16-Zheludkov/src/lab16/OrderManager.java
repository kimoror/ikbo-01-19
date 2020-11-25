package lab16;

import lab16.LinkedList.Node;

import java.util.Collection;

public class OrderManager implements Order{
    LinkedList<MenuItem> tableOrder;

    public OrderManager(){
        tableOrder = new LinkedList<>();
    }
    public OrderManager(MenuItem[] menuItemArray){tableOrder = new LinkedList<>(menuItemArray);}
    public OrderManager(Collection<? extends MenuItem> c){tableOrder = new LinkedList<>(c);}

    @Override
    public boolean add(MenuItem menuItem) {
        return tableOrder.add(menuItem);
    }

    @Override
    public boolean remove(String name) {
        MenuItem bufferMenuItem;
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++) {
            bufferMenuItem = (MenuItem) bufferNode.value;
            if(bufferMenuItem.getName().equals(name))
                return tableOrder.remove(bufferMenuItem);
            bufferNode = bufferNode.next;
        }
        return false;
    }

    @Override
    public boolean removeAll() {
        return tableOrder.removeAll();
    }

    @Override
    public MenuItem[] SortedItemsByCost() {

        if(tableOrder.getSize() == 0)
            throw new NullPointerException();
        MenuItem[] itemsArray = new MenuItem[tableOrder.getSize()];
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++) {
            itemsArray[i]= (MenuItem) bufferNode.value;
            bufferNode = bufferNode.next;
        }

        for(int i = itemsArray.length -1; i >=1; i--){
            for(int j = 0; j < i; j++)
                if(itemsArray[i].getCost() > itemsArray[j].getCost()){
                    MenuItem bufferChange = itemsArray[i];
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
        MenuItem bufferMenuItem;
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++){
            bufferMenuItem = (MenuItem) bufferNode.value;
            cost += bufferMenuItem.getCost();
            bufferNode=bufferNode.next;
        }
        return cost;
    }

    @Override
    public int countOfItems(){return tableOrder.getSize();}

    @Override
    public int countOf(String itemName){
        int count = 0;
        MenuItem bufferMenuItem;
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++) {
            bufferMenuItem = (MenuItem) bufferNode.value;
            if(bufferMenuItem.getName().equals(itemName))
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
        MenuItem bufferMenuItem;
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++) {
            bufferMenuItem = (MenuItem) bufferNode.value;
            itemsNamesArray[i] = bufferMenuItem.getName();
            bufferNode = bufferNode.next;
        }
        return itemsNamesArray;
    }

    @Override
    public int itemsQuantity(String itemName) {
        int cost = -1;
        MenuItem bufferMenuItem;
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++) {
            bufferMenuItem = (MenuItem) bufferNode.value;
            if(bufferMenuItem.getName().equals(itemName)){
                cost = bufferMenuItem.getCost();
                break;
            }
            bufferNode = bufferNode.next;
        }
        return cost;
    }

    @Override
    public int itemsQuantity(MenuItem menuItemObj) {
        int cost = -1;
        MenuItem bufferMenuItem;
        Node bufferNode = tableOrder.getFirst();
        for(int i = 0; i < tableOrder.getSize(); i++) {
            bufferMenuItem = (MenuItem) bufferNode.value;
            if(bufferMenuItem.equals(menuItemObj)){
                cost = menuItemObj.getCost();
                break;
            }
            bufferNode = bufferNode.next;
        }
        return cost;
    }
}
