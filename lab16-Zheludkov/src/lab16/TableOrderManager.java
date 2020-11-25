package lab16;

import java.util.Collection;

public class TableOrderManager implements OrderManager{

    Customer customer;

    LinkedList<MenuItem> tableOrderManager;

    public TableOrderManager(){
        tableOrderManager = new LinkedList<>();
    }
    public TableOrderManager(MenuItem[] menuItemArray){
        tableOrderManager = new LinkedList<>(menuItemArray);}
    public TableOrderManager(Collection<? extends MenuItem> c){
        tableOrderManager = new LinkedList<>(c);}

    @Override
    public int itemsQuantity(String itemName) {
        int cost = -1;
        MenuItem bufferMenuItem;
        LinkedList.Node bufferNode = tableOrderManager.getFirst();
        for(int i = 0; i < tableOrderManager.getSize(); i++) {
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
    public int itemsQuantity(MenuItem menuItem) {
        int cost = -1;
        MenuItem bufferMenuItem;
        LinkedList.Node bufferNode = tableOrderManager.getFirst();
        for(int i = 0; i < tableOrderManager.getSize(); i++) {
            bufferMenuItem = (MenuItem) bufferNode.value;
            if(bufferMenuItem.equals(menuItem)){
                cost = menuItem.getCost();
                break;
            }
            bufferNode = bufferNode.next;
        }
        return cost;
    }

    @Override
    public LinkedList<MenuItem> getOrders() {
        return tableOrderManager;
    }

    @Override
    public int ordersQuantity() {
        return tableOrderManager.getSize();
    }

    @Override
    public int orderCostSummary(){
        int cost = 0;
        MenuItem bufferMenuItem;
        LinkedList.Node bufferNode = tableOrderManager.getFirst();
        for(int i = 0; i < tableOrderManager.getSize(); i++){
            bufferMenuItem = (MenuItem) bufferNode.value;
            cost += bufferMenuItem.getCost();
            bufferNode=bufferNode.next;
        }
        return cost;
    }

    public boolean add(MenuItem menuItem) {
        return tableOrderManager.add(menuItem);
    }

    public boolean remove(String name) {
        MenuItem bufferMenuItem;
        LinkedList.Node bufferNode = tableOrderManager.getFirst();
        for(int i = 0; i < tableOrderManager.getSize(); i++) {
            bufferMenuItem = (MenuItem) bufferNode.value;
            if(bufferMenuItem.getName().equals(name))
                return tableOrderManager.remove(bufferMenuItem);
            bufferNode = bufferNode.next;
        }
        return false;
    }

    public boolean removeAll() {
        return tableOrderManager.removeAll();
    }
}
