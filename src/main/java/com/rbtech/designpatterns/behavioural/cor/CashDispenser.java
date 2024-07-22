package com.rbtech.designpatterns.behavioural.cor;

public interface CashDispenser {

    void setNextChain(CashDispenser cashDispenser);
    void dispense(Currency currency);
}


class  Node
{
    int number;
    Node next;

    public Node() {
        next=null;
    }

    public Node(int number, Node node) {
        this.number = number;
        this.next = node;
    }
}