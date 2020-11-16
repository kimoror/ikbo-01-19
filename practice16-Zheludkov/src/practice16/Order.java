package practice16;

public interface Order {
    public boolean add(Item menuItem);

    public boolean deleteItem(String name);

    public boolean deleteAllItems();

    public boolean SortedItemsByCost();

    public int costTotal();

    public Object[] getItems();
}