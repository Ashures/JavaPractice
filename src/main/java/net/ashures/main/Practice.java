package net.ashures.main;

public class Practice <T> {
    T item;
    public Practice(T item) {
        this.item = item;
    }

    public void printItem() {
        System.out.println(item);
    }
}
