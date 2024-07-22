package com.rbtech.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

// FlyweightFactory class
public class FlyweightFactory {
    private final Map<String, Flyweight> flyweights = new HashMap<>();

    public Flyweight getFlyweight(String key) {
        if (!flyweights.containsKey(key)) {
            flyweights.put(key, new ConcreteFlyweight(key));
        }
        return flyweights.get(key);
    }
}
