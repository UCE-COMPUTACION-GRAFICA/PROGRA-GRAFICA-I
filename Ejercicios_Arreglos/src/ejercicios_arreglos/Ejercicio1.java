/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_arreglos;

import java.util.Scanner;

/**
 *
 * @author VERONICA
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        //Suma de los primeros n elementos de un vector
        
        
        Scanner entrada=new Scanner(System.in);
        Scanner entrada1=new Scanner(System.in);
        
        int n;
        System.out.println("Por favor escriba el número de elemntos que desea que tenga el vector");
        n=entrada.nextInt();
        System.out.println("Escriba los números que desea ingresar al vector");
        double numeros[]=new double[n];
        //ingresa los valores al arreglo
        
        for (int i = 0; i < n; i++) {
            numeros[i]=entrada1.nextDouble();
            
        }
        
        System.out.println("Por favor elija el número de elementos que desea sumar, recuerde que usted tiene "+n+" elementos. ");
        
        int n_elem=entrada.nextInt();
        double suma=0;
        
        for (int i = 0; i < n; i++) {
          if (i<n_elem){
              suma=suma+numeros[i];
          }  
        }
        System.out.println("La suma de los "+n_elem+ "primeros elementos es:"+suma);
        
        
        
        
        
        
    }
    
}
