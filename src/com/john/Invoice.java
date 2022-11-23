package com.john;

import com.john.Table.Table;

public class Invoice {
    Table table;
    int quantity;
    final double DISCOUNT = 0.05;
    double discount=0;
    double moneyPaid;

    public Invoice(Table table, int quantity, double moneyPaid) {
        this.table = table;
        this.quantity = quantity;
        this.moneyPaid = moneyPaid;
    }

    boolean shouldApplyDiscount() {
        return quantity > 1;
    }

    private double calculatePrice() {
        double price = table.getPrice() * quantity;

        double netPrice;

        if (shouldApplyDiscount()) {
            discount = price * DISCOUNT;
            netPrice = price - discount;
        } else {
            netPrice = price;
        }

        return netPrice;
    }

    public double getBalance(){
        return moneyPaid - calculatePrice();
    }

    public void printInvoice(){
        System.out.println("Table Length: "+ table.getTableDimensions().getLength()); //print length
        System.out.println("Table Width: "+table.getTableDimensions().getWidth()); //print width
        System.out.println("Number of drawers: "+table.getDrawers().getValue());
        System.out.println("No. of tables: "+quantity); //print number of tables bought
        System.out.println("Discount given: "+discount); // print discount if any
        System.out.println("Amount to pay: "+calculatePrice()); //print net price
        System.out.println("Amount paid: "+moneyPaid); //money paid
        System.out.println("Balance: "+getBalance()); //print balance
    }
}
