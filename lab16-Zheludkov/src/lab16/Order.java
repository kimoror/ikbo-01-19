package lab16;

public interface Order {
    public boolean add(MenuItem menuItem);

    public MenuItem[] SortedItemsByCost();

    public int costTotal();

    public LinkedList getItems();

    public String[] itemsNames();

    public int itemsQuantity(String itemName);

    public int itemsQuantity(MenuItem menuItem);

    public int itemsQuantity();

    boolean remove(String name);

    boolean removeAll();

    public int countOf(String itemName);

    public Customer getCustomer();

    public void setCustomer(Customer customer);
}