/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package creational.bridge;

/**
 *
 * @author janez
 */
public class Rectangle extends AbstractFigura{

    public Rectangle(IColor color) {
        super(color);        
    }

    @Override
    public void draw() {
        System.out.println("draw rectangle.!");
        color.pintar();
    }
    
}
