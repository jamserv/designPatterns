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
public class Negro implements IColor{

    @Override
    public void pintar() {
        System.out.println("pintado de color negro");
    }
    
}
