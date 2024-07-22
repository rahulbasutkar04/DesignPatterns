package com.rbtech.designpatterns.behavioural.observer1;

public interface Subject {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}