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
public class Cuadrado extends Figura implements Rotable, Dibujable {
    
    private double lado;

    public Cuadrado(double lado, double grados ) {
        
        this.lado = lado;
    }
    
    public double Area(){
        return lado*lado;
     }   
    
    public void dibujar(){
        System.out.println("Se dibujo un cuadrado");
    }
    
    public void Rotar(double grados){
        System.out.println("Se roto el cuadrado");
    }
}
