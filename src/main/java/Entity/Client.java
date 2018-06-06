package Entity;

import java.util.ArrayList;

public class Client {
    private int id;
    private String name;
    private String lastName;
    private String description;
    private ArrayList<Payment> Payments;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ArrayList<Payment> getPayments() {
        return Payments;
    }

    public void setPayments(ArrayList<Payment> payments) {
        Payments = payments;
    }
}
