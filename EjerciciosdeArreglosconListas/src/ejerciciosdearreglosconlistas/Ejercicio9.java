/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdearreglosconlistas;

import java.util.ArrayList;

/**
 *
 * @author VERONICA
 */
public class Ejercicio9 {
    //Declarar e inicializar una matriz de enteros de 2x3 e imprimirla.
public void Ejercicio(){
    
    
 
     ArrayList<ArrayList<Integer>> A = new ArrayList();
     
    
    
    //int A[][]=new int[2][3];
    
    
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
           
          A.add(new ArrayList<Integer>());
                
                A.get(i).add(j,(int) (Math.random() * 9+1));
                
     
    
     
         
           // System.out.println("contadro"+cont);
     
        }
        
     
           
       
    }
    
    
    //imprimir matriz
    System.out.println("La matriz generada es");
    
    
    for (int i = 0; i < 2; i++) {
        for (int j = 0; j < 3; j++) {
           
            System.out.print(" "+ A.get(i).get(j));
           
        }
        System.out.println(" ");
    }
    
}
}
