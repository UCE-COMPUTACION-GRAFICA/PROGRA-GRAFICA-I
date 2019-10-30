/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdearreglosconlistas;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VERONICA
 */
public class Ejercicio10 {
    //Escribir un programa que calcule el determinante de una matriz de 3x3. 
//Pruébelo con la matriz [ [1,2,3], [4,5,6], [7,8,8] ] cuyo determinante es 3 
    
     
     ArrayList<ArrayList<Integer>> A = new ArrayList();
          int det;
    public void Ejercicio() {

        Scanner entrada = new Scanner(System.in);

//declaramos la matriz de 3x3
        
   
        //int A[][] = new int[3][3];
        //hallemos el determinante
   

        
        
        int valor;
        System.out.println("Por favor ingrese los valores de la matriz:"
                + "");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                valor=entrada.nextInt();
               // A=new ArrayList();
               
                 A.add(new ArrayList<Integer>());
                
                A.get(i).add(j,valor);
                
              
            
                
                
            }
        }
        
        
        //imprimir matriz 
        System.out.println("Su matriz es : ");
       
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+A.get(i).get(j));
             
                
                
            }
             System.out.println(" ");
        }
        
       
 
        
    }
    
    
    public void determinante(){
       //System.out.println(" "+A.get(2).get(2));
       
        det = ((int)A.get(0).get(0) * (int)A.get(1).get(1)* (int)A.get(2).get(2)) + ((int)A.get(0).get(1) * (int)A.get(1).get(2) * (int)A.get(2).get(0))
                        + ((int)A.get(0).get(2) *(int)A.get(1).get(0) * (int)A.get(2).get(1)) - ((int)A.get(0).get(0) *(int)A.get(1).get(2) * (int)A.get(2).get(1))
                        - ((int)A.get(0).get(1) * (int)A.get(1).get(0) * (int)A.get(2).get(2)) - ((int)A.get(0).get(2) * (int)A.get(1).get(1) *(int)A.get(2).get(0));
        
        System.out.println("El determinante de la matriz A de 3x3 es:"+det);
    }
    
    
    public void ejemplo(){
        System.out.println(" Probando el ejemplo de la matriz [ [1,2,3], [4,5,6], [7,8,8] ] ");
       
       // A.clear();
       
       // A.add(new ArrayList<Integer>());
        A.get(0).add(0,1); A.get(0).add(1,2);  A.get(0).add(2,3);
        
        A.get(1).add(0,4); A.get(1).add(1,5);  A.get(1).add(2,6);
        A.get(2).add(0,7); A.get(2).add(1,8);  A.get(2).add(2,8);
        
        
       // System.out.println(" ejemplo "+A.get(0).get(0));
        
        
      determinante();
         
         
         // System.out.println("El determinante de esta matriz es:"+det);
         
    }

}
