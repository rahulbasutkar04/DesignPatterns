package com.rbtech.designpatterns.behavioural.mediator1;

import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.List;

public class ChattingMediatorImple implements ChattingMediator{

    private List<User> userList;

    public ChattingMediatorImple() {
        userList=new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u:userList)
        {
            if(!u.getUserName().equalsIgnoreCase(user.getUserName())){
                u.receiveMessage(message);
            }

        }
    }

    @Override
    public void addUser(User user) {
          userList.add(user);
    }
}
