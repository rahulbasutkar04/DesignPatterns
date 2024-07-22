package com.rbtech.designpatterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");
        // Image will be loaded from disk only when display is called for the first time
        image.display();  // Output: Loading test_image.jpg
                          //         Displaying test_image.jpg
        image=new ProxyImage("rahulpic.jpg");
        image.display();
    }
}
