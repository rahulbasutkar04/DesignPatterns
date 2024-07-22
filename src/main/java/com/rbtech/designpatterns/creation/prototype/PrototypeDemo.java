package com.rbtech.designpatterns.creation.prototype;

public class PrototypeDemo {
    public static void main(String[] args) {


        Circle originalCircle=new Circle(5,"Blue");

        System.out.println("Original Circle"+originalCircle);

        Rectangle originalRectangle=new Rectangle(5,5,"Black");

        System.out.println("Original Rectangle"+originalRectangle);

        Circle clonedCircle=originalCircle.clone();

        clonedCircle.setColor("Red");
        clonedCircle.setRadius(10);

        System.out.println("Cloned Circle:"+clonedCircle);


        Rectangle clonedRectangle=originalRectangle.clone();

        clonedRectangle.setColor("Yellow");

        clonedRectangle.setHight(8);
        clonedRectangle.setWidth(7);

        System.out.println("Cloned Rectangle:"+clonedRectangle);

        System.out.println("Original Circle1"+originalCircle);


        System.out.println(originalCircle.hashCode());
        System.out.println(clonedCircle.hashCode());




    }
}
