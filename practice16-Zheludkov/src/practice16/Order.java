package practice16;

public interface Order {
    public boolean add(Item menuItem);

    public Object[] SortedItemsByCost();

    public int costTotal();

    public Item[] getItems();

    public Object[] itemsNames();

    int itemsQuantity(String itemName);

    int itemsQuantity(Item item);

    boolean remove (String name);

    boolean removeAll();
}