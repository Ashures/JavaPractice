package net.ashures.main;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Practice<Integer> printer = new Practice<>(123);
        Practice<String> printer2 = new Practice<>("Dog");
        Practice<Double> printer3 = new Practice<>(25.7);

        ArrayList<Practice<?>> items = new ArrayList<>();
        items.add(printer);
        items.add(printer2);
        items.add(printer3);

        for (Practice<?> obj : items) {
            obj.printItem();
        }
    }
}