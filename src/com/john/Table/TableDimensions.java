package com.john.Table;

public class TableDimensions {
    private int length;
    private int width;

    public TableDimensions(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    public int getArea(){
        return length * width;
    }
}
