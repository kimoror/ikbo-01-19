package practice16;

import java.util.Collection;

public class RestaurantOrder extends OrderManager{
    public RestaurantOrder() {super();}
    public RestaurantOrder(Collection<? extends Item> c) { super(c); }
    public RestaurantOrder(Item[] items){super(items);}
}
