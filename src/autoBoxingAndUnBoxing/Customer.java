package autoBoxingAndUnBoxing;

import java.util.ArrayList;

public class Customer {
    private ArrayList<Double> transactions;
    private String name;

    public Customer(String name, double initTransaction) {
        this.name = name;
        this.transactions = new ArrayList<Double>();
        addTransaction(initTransaction);
    }

    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }
}
