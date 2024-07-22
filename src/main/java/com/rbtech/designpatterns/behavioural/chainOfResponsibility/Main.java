package com.rbtech.designpatterns.behavioural.chainOfResponsibility;

public class Main {
    public static void main(String[] args) {
        // authenticato->logger->compresso

        Compressor compressor=new Compressor(null);
        Logger logger=new Logger(compressor);
        Authenticator authenticator=new Authenticator(logger);

        WebServer webServer=new WebServer(authenticator);
        webServer.handle(new HttpRequest("Rahul","1234"));

    }
}
