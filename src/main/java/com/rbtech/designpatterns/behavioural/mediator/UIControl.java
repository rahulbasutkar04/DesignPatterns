package com.rbtech.designpatterns.behavioural.mediator;

import java.util.ArrayList;
import java.util.List;

public class UIControl {
private List<EventHandler> eventHandlers =new ArrayList<>();

public void addEventHandler(EventHandler eventHandler)
{
    eventHandlers.add(eventHandler);
}

protected void notifyEvenHandler()
{
    for(EventHandler eventHandler : eventHandlers)
    {
        eventHandler.handle();
    }

}
}
