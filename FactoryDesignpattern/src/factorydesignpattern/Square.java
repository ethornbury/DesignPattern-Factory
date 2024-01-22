/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpattern;

/**
 *
 * @author EThornbury
 */
public class Square extends Shape{
    private double side;

    public Square(double side) {
        this.side = side;
    }
    public Square() {
        this.side = 2;
    }
    
    @Override
    public double getArea(){
        return side * side;
    }
    
    @Override
    public double getPerimeter(){
        return side * 4;
    }
}
