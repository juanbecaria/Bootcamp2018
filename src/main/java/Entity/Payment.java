package Entity;

public class Payment {
    private int Id;
    private Order order;
    private double amount;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
