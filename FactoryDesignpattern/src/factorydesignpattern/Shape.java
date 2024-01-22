/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpattern;

/**
 *
 * @author EThornbury
 */
public abstract class Shape {
    public Shape(){}
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
    @Override
    public String toString(){
        return "shape";
    }
    
    public String printShape(){
        return "shape";
    }
    
}
