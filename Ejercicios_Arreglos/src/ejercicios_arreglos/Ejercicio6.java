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
public class Ejercicio6 {
    //Hacer un programa que dados dos arrays determine si son iguales. Probarlo con los arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] y [1,2,3] y [1,2,2] 

    public static void main (String args[]){
        
        
        Scanner entrada=new Scanner(System.in);
        
        System.out.println("Por favor ingrese la dimensión del primer array");
        int n=entrada.nextInt();
        
        int A[]=new int[n];
        System.out.println("Ingrese los valores para el primer arreglo");
        for (int i = 0; i < n; i++) {
            A[i]=entrada.nextInt();
        }
        
        System.out.println("Por favor ingrese la dimensión del segundo array");
        int m=entrada.nextInt();
        
        int B[]=new int[m];
        
         System.out.println("Ingrese los valores para el segundo arreglo");
        for (int i = 0; i < m; i++) {
            B[i]=entrada.nextInt();
        }
        
        
        
        //probaremos si ambos arrays son iguales
        boolean iguales=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(A[i]==B[j]){
                    
                  iguales=true;
                    //System.out.println("Los vectores no son iguales");
                }else{
                      iguales=false;
                }
             
            }
            
        }
        if(n==m){
           if(iguales){
            System.out.println("Los vectores son idénticos ");
        } else{
               System.out.println("Los vectores no son iguales");
           }  
        }else{
            System.out.println("Los vectores no tienen la misma dimensión, por lo tanto no son iguales ");
        }
       
        
        //probar con los ejemplos
        System.out.println("Probar con los ejemplos");
        
        System.out.println("Comprobar los vectores [1,2,3] y [1,2,3] ");
       int c[]={1,2,3};
       int d[]={1,2,3};
       n=3;
       m=3;
       
       iguales=true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(c[i]==d[j]){
                    
                  iguales=true;
                    //System.out.println("Los vectores no son iguales");
                }else{
                      iguales=false;
                }
             
            }
            
        }
        if(n==m){
           if(iguales){
            System.out.println("Los vectores son idénticos ");
        } else{
               System.out.println("Los vectores no son iguales");
           }  
        }else{
            System.out.println("Los vectores no tienen la misma dimensión, por lo tanto no son iguales ");
        }
       
        System.out.println("  ");
       int e[]={1,2,3,4};
     
       int h[]={1,2,2};
       
       n=4;
       m=3;
       
        System.out.println("Comprobar con los vectores  [1,2,3,4] y [1,2,3] y [1,2,3] y [1,2,2]");
       iguales=true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < m; j++) {
                if((e[i]==d[j])&& (e[i]==c[j])&& (e[i]==h[j])){
                    
                  iguales=true;
                    //System.out.println("Los vectores no son iguales");
                }else{
                      iguales=false;
                }
             
            }
            
        }
        if(n==m){
           if(iguales){
            System.out.println("Los vectores son idénticos ");
        } else{
               System.out.println("Los vectores no son iguales");
           }  
        }else{
            System.out.println("Los vectores no tienen la misma dimensión, por lo tanto no son iguales ");
            
            
        }
       
       
       
    }
    
    
}
