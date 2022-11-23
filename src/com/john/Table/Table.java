package com.john.Table;

import com.john.Wood;

public class Table {
    private Wood wood;
    private TableDimensions tableDimensions;
    private Drawers drawers;

    public Table(Wood wood) {
        this.wood = wood;
        tableDimensions = new TableDimensions(120, 80);
        this.drawers = Drawers.NONE;
    }

    public Table(int length, int width, Wood wood, Drawers drawers){
        tableDimensions = new TableDimensions(length, width);
        this.drawers = drawers;
        this.wood = wood;
    }

//    public void printWood(){
//        System.out.println("Wood " + wood);
//    }

    public int getArea(){
        return tableDimensions.getArea();
    }

    public TableDimensions getTableDimensions() {
        return tableDimensions;
    }

    public Drawers getDrawers() {
        return drawers;
    }

    public double getPrice(){
        double tablePrice;

        double basePrice;

        if (getArea() <= 9600) {
            basePrice = 42500;
        } else {
            int difference = getArea() - 9600;
            basePrice = (difference * 825) + 42500;
        }

        tablePrice = basePrice + wood.getWoodPrice() + drawers.getPrice();

        return tablePrice;
    }

}
