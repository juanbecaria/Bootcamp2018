package Entity;

import java.util.ArrayList;

public class Order {
    private int id;
    private ArrayList<Order> Items;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Order> getItems() {
        return Items;
    }

    public void setItems(ArrayList<Order> items) {
        Items = items;
    }
}
