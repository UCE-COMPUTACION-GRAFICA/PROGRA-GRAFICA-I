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
public  class Circulo extends Figura {
    private double radio;
    
    public Circulo( double x, double y, double radio){
       super(x,y);
        this.radio=radio;
        
    }
    
    @Override
    public double area(){
        return Math.PI*radio*radio;
    }
    
}
