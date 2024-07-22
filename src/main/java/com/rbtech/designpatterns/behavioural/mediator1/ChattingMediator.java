package com.rbtech.designpatterns.behavioural.mediator1;

public interface ChattingMediator {
    void sendMessage(String message,User  user);
    void addUser(User user);
}
