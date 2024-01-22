/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factorydesignpattern;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author EThornbury
 */
public class FactoryApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //this is added to git
        /*
        Shape shape = null;
        int choice = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("1-3 enter a choice");
        choice = scan.nextInt();
        if(choice == 1){
            shape = new Square();
        }else if(choice == 2){
            shape = new Circle();
        }else if(choice == 3){
            shape = new Rectangle();
        }
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter shape");
        String shape = scan.next();
        
        //printShape(shape);
        
        printShape(ShapeFactory.getShape(shape));
        
    }
    public static void printShape(Shape shape){
        DecimalFormat fmt = new DecimalFormat("00.##");
        System.out.println("This is a " +shape+ "\n"+"Area " +fmt.format(shape.getArea()));
    }
    
    public static void printArea(Shape shape){
       // DecimalFormat fmt = new DecimalFormat("00.##");
        //System.out.println("This is a " +shape+ "\n"+"Area " +fmt.format(shape.getArea()));
        System.out.println("Area "+ shape.getArea());
    }
    
}
