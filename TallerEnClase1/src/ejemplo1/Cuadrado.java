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
public class Cuadrado extends Figura {

    public Cuadrado(double x, double y, double lado) {
        super(x,y);
        this.lado = lado;
    }

    private double lado;
    
    
    
    @Override
    public double area(){
        return lado*lado;
    }
    
}
