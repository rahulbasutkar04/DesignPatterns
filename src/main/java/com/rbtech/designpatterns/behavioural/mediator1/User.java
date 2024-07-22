package com.rbtech.designpatterns.behavioural.mediator1;

public abstract class User {

    private ChattingMediator chattingMediator;
    private String userName;

    public User(ChattingMediator chattingMediator, String userName) {
        this.chattingMediator = chattingMediator;
        this.userName = userName;
    }

    public String getUserName() {
     return this.userName;
    }
    public abstract void sendMessage(String message);
    public abstract void receiveMessage(String message);
}
