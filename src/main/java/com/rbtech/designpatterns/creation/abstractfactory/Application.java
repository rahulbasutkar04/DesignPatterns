package com.rbtech.designpatterns.creation.abstractfactory;


public class Application {
    private  Button button;
    private  CheckBox checkBox;

    public  Application(GuiFactory factory)
    {
        button=factory.createButton();
        checkBox=factory.createCheckbox();
    }

    public  void paint()
    {
        button.press();
        checkBox.check();
    }


    public static void main(String[] args) {
        GuiFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();

        if (osName.contains("win")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacBookFactory();
        }

        Application app = new Application(factory);
        app.paint();
    }


}

