package com.rbtech.designpatterns.behavioural.mediator1;

public class Main {
    public static void main(String[] args) {
        ChattingMediator chattingMediator=new ChattingMediatorImple();

        User user1=new UserImpl(chattingMediator,"Rahul");
        User user2=new UserImpl(chattingMediator,"Shubham");
        User user3=new UserImpl(chattingMediator,"Vasant");
        User user4=new UserImpl(chattingMediator,"Zikra");

        chattingMediator.addUser(user1);
        chattingMediator.addUser(user2);
        chattingMediator.addUser(user3);
        chattingMediator.addUser(user4);

        user2.sendMessage("Hello, Everyone");
    }
}
