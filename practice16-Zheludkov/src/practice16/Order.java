package practice16;

public interface Order {
    public boolean add(Item menuItem);

    public Item[] SortedItemsByCost();

    public int costTotal();

    public LinkedList getItems();

    public String[] itemsNames();

    int itemsQuantity(String itemName);

    int itemsQuantity(Item item);

    boolean remove(String name);

    public int countOfItems();

    boolean removeAll();

    public int countOf(String itemName);
}