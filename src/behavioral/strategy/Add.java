/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package behavioral.strategy;

/**
 *
 * @author janez
 */
public class Add implements Arithmetic{

    @Override
    public Double operation(double a, double b) {
        return (a + b);
    }
    
}
