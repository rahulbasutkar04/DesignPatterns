package com.rbtech.designpatterns.creation.abstractfactory;

public class MacBookFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new MacCheckBox();
    }
}
