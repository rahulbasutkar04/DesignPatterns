package com.rbtech.designpatterns.behavioural.state;

public class Main {
    public static void main(String[] args) {
        Canvas canvas=new Canvas();
       // canvas.setTool(new BrushTool());
        //canvas.setTool(new Eraser());
        canvas.setTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }
}
