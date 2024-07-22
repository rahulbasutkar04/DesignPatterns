package com.rbtech.designpatterns.creation.prototype;

public class Rectangle implements prototype{
    private int width;
    private int hight;
    private String color;


    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHight() {
        return hight;
    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Rectangle(int width, int hight, String color) {
        this.width = width;
        this.hight = hight;
        this.color = color;
    }
    @Override
    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", hight=" + hight +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public Rectangle clone() {
        return new Rectangle(this.width,this.hight,this.color);
    }
}
