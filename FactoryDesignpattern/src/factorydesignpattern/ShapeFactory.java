/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorydesignpattern;

/**
 *
 * @author EThornbury
 */
public class ShapeFactory {
    
    //getter to return the Shape and we are going to pass a param also
    public static Shape getShape(String shape){
        if(shape.equalsIgnoreCase("square")){
            //return new Square();
        }else if(shape.equalsIgnoreCase("rectangle")){
            return new Rectangle();
        }else if(shape.equalsIgnoreCase("circle")){
            return new Circle();
        }
        return null; //fall back return
        
    }
    
    
}
