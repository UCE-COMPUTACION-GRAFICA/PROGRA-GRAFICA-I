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
public class Ejercicio5 {
    //Escriba un programa que sume todos los elementos de un array de enteros. Utilicelo para sumar el vector: 
public static void main(String args[]){
    

    Scanner entrada=new Scanner(System.in);
    System.out.println(" Por favor escriba la dimensión del arreglo ");
    
    int n=entrada.nextInt();
    
    int arreglo[]=new int[n];
    
    System.out.println("Por favor escriba los números que desea introducir a su arreglo");
    for (int i = 0; i < n; i++) {
        arreglo[i]=entrada.nextInt();
    }
    
    int suma=0;
    
    
    for (int i = 0; i < n; i++) {
        
        
        
      suma=suma+arreglo[i];
      
       
        
        
    }
     System.out.println("La suma de los elementos del array es: "+ suma);
    
    // sumar el array int[] a = {1, 2, 3, 4, 5, 6}; 
    
    
    System.out.println("Probar el ejemplo: sumar el array int[] a = {1, 2, 3, 4, 5, 6}; ");
     int[] a = {1, 2, 3, 4, 5, 6}; 
     
  
    
   suma=0;
    
    
    for (int i = 0; i < a.length; i++) {
   
      suma=suma+a[i];
   
    }
     System.out.println("La suma de los elementos del array a es: "+ suma);
     
     
     
    
}
   
    
}
