package com.rbtech.designpatterns.behavioural.Iterator;

public interface Iterator<T> {
    boolean hasNext();
    T current();
    void next();

}
