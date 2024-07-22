package com.rbtech.designpatterns.behavioural.observer2;

public interface Subject {
    void subscribe(Observer o);
    void unSubscribe(Observer o);
    void notifyObserver(String message);
}
