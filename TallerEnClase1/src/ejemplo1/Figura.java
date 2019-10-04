/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1;

/**
 *
 * @author VERONICA
 */
public abstract class Figura {

    public Figura(double x, double y) {
        this.x = x;
        this.y = y;
    }
   
    protected double x;
    protected double y;
    
     public abstract double area();
    
}
