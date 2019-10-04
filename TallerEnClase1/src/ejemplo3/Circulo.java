/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo3;

/**
 *
 * @author fing.labcom
 */
public class Circulo extends Figura implements Dibujable {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }
    public double Area()    {
    return Math.PI*radio*radio;
}
    public void dibujar(){
        System.out.println("Se dibujo un circulo");
    }
    
}
