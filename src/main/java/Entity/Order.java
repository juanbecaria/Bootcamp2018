package Entity;

import java.util.ArrayList;

public class Order implements Comparable<Order>{
    private int Id;
    private ArrayList<Item> Items;

    public int getId() {
        return Id;
    }

    public Order(int id) {
        this.Id = id;
        this.Items = new ArrayList<Item>() ;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public ArrayList<Item> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Item> items) {
        Items = items;
    }

    public int compareTo(Order o) {
        return this.getId() - o.getId();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!Order.class.isAssignableFrom(obj.getClass())) {
            return false;
        }
        final Order other = (Order) obj;

        if (this.getId() != other.getId()) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String str = "Order Id: "+ getId();
        for (Item i : getItems()
             ) {
            str += i.toString();
        }
        return str;

    }
}
