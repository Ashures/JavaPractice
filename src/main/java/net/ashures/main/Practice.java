package net.ashures.main;

import java.util.ArrayList;

public class Practice <T> {
    T item;
    ArrayList<T> itemList;
    public Practice(T toPrint) {
        this.item = toPrint;
    }

    public void printItem() {
        System.out.println(item);
    }
}
