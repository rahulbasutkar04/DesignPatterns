package com.rbtech.designpatterns.structural.composition1;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Composite implements shape{

    public List<shape> list=new ArrayList<>();

    @Override
    public void draw(String color) {
         for(shape s:list)
         {
             s.draw(color);
         }
    }


    public void addShapes(shape s)
    {
        list.add(s);
    }

    public boolean remove(shape s)
    {
       return list.remove(s);

    }
    public void clear()
    {
        System.out.println("Clearing all shapes");
        list.clear();
    }
}
