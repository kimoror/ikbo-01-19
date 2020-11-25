package lab16;

public interface OrderManager{
    public int itemsQuantity(String itemName);

    public int itemsQuantity(MenuItem menuItem);

    public LinkedList<MenuItem> getOrders();

    public int ordersQuantity();//countOfItems

    public int orderCostSummary();//costTotal


}
