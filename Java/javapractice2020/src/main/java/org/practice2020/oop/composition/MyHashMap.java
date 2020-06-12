package org.practice2020.oop.composition;

public class MyHashMap {

    // example of COMPOSITION
    // has-a relationship
    private HashMap hashMap;

    public MyHashMap() {
        this.hashMap = new HashMap();
    }

    public void add() {
        // here we can do different tricks
        // then use final method from original hashMap
        // easy
        hashMap.add();
    }
}
