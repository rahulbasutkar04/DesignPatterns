package com.rbtech.designpatterns.creation.abstractfactory;

public class WindowsFactory implements GuiFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckbox() {
        return new WindowsCheckBox();
    }
}
