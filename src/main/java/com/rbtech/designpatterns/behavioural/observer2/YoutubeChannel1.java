package com.rbtech.designpatterns.behavioural.observer2;

import java.util.ArrayList;

public class YoutubeChannel1 implements Subject{

    ArrayList<Observer> observerList;// one youtube channel has number of user that is observers

    public YoutubeChannel1() {
        observerList=new ArrayList<>();
    }

    @Override
    public void subscribe(Observer o) {
         observerList.add(o);
    }

    @Override
    public void unSubscribe(Observer o) {
        int index=observerList.indexOf(o);
         if(index>0)
         {
             observerList.remove(index);

         }    }

    @Override
    public void notifyObserver(String message) {
       for(Observer o:observerList)
       {
           o.update(message);
       }
    }


    public void newVideoAdded(String msg)
    {
        notifyObserver(msg);

    }

}
