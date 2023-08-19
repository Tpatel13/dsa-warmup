package Algos;

import java.sql.SQLOutput;
import java.util.*;

public class LRU {
    private Set<Integer> cache;
    private int size;

    public LRU(int size) {
        this.cache = new LinkedHashSet<>(size);
        this.size = size;
        LinkedHashMap<String,String> link=new LinkedHashMap<>();

        link.get("As");
    }

    public void insert(int value) {

    }



    public boolean get(int value) {

        if (!cache.contains(value)) {
            return false;
        } else {
            cache.remove(value);
            cache.add(value);
            return true;
        }
    }

    public void refer(int value) {
        if (!get(value)) {
            put(value);
        }
    }

    public void put(int value) {
        if (cache.size() == this.size) {
            int firstValue = cache.iterator().next();

            cache.remove(firstValue);
        }
        cache.add(value);
    }

    public void display() {

        System.out.println("Printing elements ");

        cache.forEach(e-> System.out.println(e));
    }

    public static void main(String[] args)
    {
        LRU ca = new LRU(2);
        ca.refer(1);
        ca.refer(2);
        ca.refer(3);
        ca.refer(1);
        ca.refer(4);
        ca.refer(5);
        ca.display();
    }
}
