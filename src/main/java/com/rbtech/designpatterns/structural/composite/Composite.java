package com.rbtech.designpatterns.structural.composite;

import com.rbtech.designpatterns.structural.composite.Component;

import java.util.ArrayList;
import java.util.List;


// composite object

public class Composite implements Component {
    String name;

    List<Component> componentList;

    public Composite(String name) {
        this.name = name;
        componentList=new ArrayList<>();
    }


    @Override
    public void showPrice() {

        for(Component comp:componentList)
        {
            comp.showPrice();
        }

    }

    @Override
    public void showName() {
        for(Component comp:componentList)
        {
            comp.showName();
        }
    }

    public  void addComponent(Component subComp)
    {
        componentList.add(subComp);
    }

    public  void removeComponent(Component component)
    {
        componentList.remove(component);
    }




}
