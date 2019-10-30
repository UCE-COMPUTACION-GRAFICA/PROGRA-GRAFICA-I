/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_arreglos;

/**
 *
 * @author VERONICA
 */
public class Ejercicio9 {
    //Declarar e inicializar una matriz de enteros de 2x3 e imprimirla.
public static void main( String arg[]){
    
    
    int A[][]=new int[2][3];
    
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            int rand= (int)(Math.random()*2);
            A[i][j]=rand;
                    
        }
    }
    
    
    //imprimir matriz
    
    
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
            System.out.print(" "+ A[i][j]);
        }
        System.out.println(" ");
    }
    
}
}
