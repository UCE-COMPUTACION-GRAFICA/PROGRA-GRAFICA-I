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
public class Ejercicio3 {
    public static void main(String[] args) {
      Scanner entrada=new Scanner(System.in); 
       Scanner entrada1=new Scanner(System.in); 
   //Escriba un programa que lea de la entrada un numero y determine si es un numero primo. 

   
        System.out.println("Porfavor escriba de la dimensión del vector");
        int n=entrada.nextInt();
        
        System.out.println("Escriba los números que desea ingresar al vector para determinar que número es primo");
        
        int num[]=new int[n];
        //ingresa los datos al vector
        for (int i = 0; i < n; i++) {
           num[i]=entrada1.nextInt();
          
        }
        // encuentra el o los números prmos
        
        //primeros veinte números primos
        //2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67 y 71
//        System.out.println("Su vector es:");
//        for (int i = 0; i < n; i++) {
//            System.out.println(""+num[i]);
//        }




                int a=0,i;
        
              System.out.println("Los números primos son: ");  
              
              //algoritmo para determinar si un números es primo de un conjunto de números de un vector
        for (int j = 0; j < n; j++) {
            
        for(i=1;i<(num[j]+1);i++){
         if(num[j]%i==0){
             a++;
            }
         }
         if(a!=2){
              //System.out.println(num[j]+"No es Primo");
              
              
            }else{
             //Si es Primo
             
                System.out.println(num[j]+" ");
         }
         
         a=0;
        
           
           
         
        }
        
        
       
       
        
        
    }  
}