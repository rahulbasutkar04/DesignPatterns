package com.rbtech.designpatterns.behavioural.mediator1;

public class UserImpl extends User{
    private ChattingMediator chattingMediator;
    private String userName;
    public UserImpl(ChattingMediator chattingMediator, String userName) {
        super(chattingMediator, userName);
        this.chattingMediator=chattingMediator;
        this.userName=userName;
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(userName+" "+"Sending Message "+message);
        chattingMediator.sendMessage(message,this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(userName+ " Received Message "+message);

    }
}
