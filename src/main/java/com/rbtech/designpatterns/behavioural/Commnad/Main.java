package com.rbtech.designpatterns.behavioural.Commnad;

public class Main {
    public static void main(String[] args) {
        // Receiver
        Light light = new Light();

        // Concrete Commands
        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command increaseIntensity=new IncreaseIntensity(light);
        Command decreaseIntensity=new DecreaseIntensity(light);

        // Invoker
        RemoteControl remote = new RemoteControl();

        // Turn on the light
        remote.setCommand(lightOn);
        remote.pressButton();  // Output: The light is on

        // Turn off the light
        remote.setCommand(lightOff);
        remote.pressButton();  // Output: The light is off

        remote.setCommand(increaseIntensity);
        remote.pressButton();

        remote.setCommand(decreaseIntensity);
        remote.pressButton();
    }
}

//In this example:
//
//        Command Interface: Command defines an interface with the execute method.
//        Concrete Commands: LightOnCommand and LightOffCommand implement the Command interface to perform actions on the Light receiver.
//        Receiver: Light is the object that performs the actual action.
//        Invoker: RemoteControl holds a command and triggers it.
//        Client: The Main class sets up the commands and invoker, demonstrating how to use the Command pattern to control the Light.
//        This Java example encapsulates the request to turn a light on or off as an object, allowing for parameterization, queuing of requests, logging, and undoable operations.
