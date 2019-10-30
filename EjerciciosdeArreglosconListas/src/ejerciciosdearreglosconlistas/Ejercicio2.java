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
public class Ejercicio2 {
    //Escribir un bucle equivalente al del siguiente programa sin utilizar el 
	//operador &&. int lim = 10; int c = 1; 
	//Scanner sc = new Scanner(System.in); 
	//for (int i = 0; i < lim && c != 0; i++, c = sc.nextInt()) {} 
public void Ejercicio() {
  
    
    Scanner entrada=new Scanner(System.in);
       int lim=10;
      int c=1;
     
   
      System.out.println("Escriba el valor de c:");
     
      //creamos un contador que nos avise cuando llegue a la posicion menor que el limite
      
   int cont=0;
   // int numeros[]=new int[lim];
    
    ArrayList numeros=new ArrayList();
    
    
//    
//    //primero vamos a llenar un arreglo con lim valores
//    
//    for (int i = 0; i < lim; i++) {
//        numeros.add(0);
//    }
    
   
   
   //creamos un bucle que permite su salida cuando c sea cero
 
         while(c!=0){ 
             
             
         c=entrada.nextInt();
         numeros.add(c);
         
         
           //podemos realizar hasta el limite de iteraciones 
         if (cont==(lim-1)){
              c=0;
          }
         cont++;
         
    }
        
         
         
         
         
         
         //imprimimos el vector generado
         System.out.println("El array generado es:");
      
      for (int i = 0; i <cont; i++) {
          
          if((int)(numeros.get(i))!=0){
            System.out.println(" "+numeros.get(i));  
          }
          
          
          
          
    }
     
   
    
}
    
    
    
   
    
}
        

