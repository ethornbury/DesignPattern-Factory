/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpattern;

/**
 *
 * @author EThornbury
 */
public class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public Rectangle() {
        this.length = 4;
        this.width = 5;
    }

    @Override
    public double getArea(){
        return length * width;
    }
    
    public double getPerimeter(){
        return (length * 2) + (width * 2);
    }

    @Override
    public String toString() {
        return "Rectangle";
    }
    
    
}
