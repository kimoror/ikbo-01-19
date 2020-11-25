package lab16;

public interface Order {
    public boolean add(MenuItem menuItem);

    public MenuItem[] SortedItemsByCost();

    public int costTotal();

    public LinkedList getItems();

    public String[] itemsNames();

    int itemsQuantity(String itemName);

    int itemsQuantity(MenuItem menuItem);

    boolean remove(String name);

    public int countOfItems();

    boolean removeAll();

    public int countOf(String itemName);
}