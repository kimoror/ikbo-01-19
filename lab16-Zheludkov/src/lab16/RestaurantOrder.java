package lab16;

import java.util.Collection;

public class RestaurantOrder extends OrderManager{
    public RestaurantOrder() {super();}
    public RestaurantOrder(Collection<? extends MenuItem> c) { super(c); }
    public RestaurantOrder(MenuItem[] menuItems){super(menuItems);}
}
