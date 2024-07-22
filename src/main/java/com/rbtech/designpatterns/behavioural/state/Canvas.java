package com.rbtech.designpatterns.behavioural.state;

public class Canvas {

    // this is an context
    private Tool tool;

    public  void mouseDown()
    {
        tool.mouseDown();
    }

    public void mouseUp(){
        tool.mouseUp();
    }

    public Tool getTool() {
        return tool;
    }

    public void setTool(Tool tool) {
        this.tool = tool;
    }
}
