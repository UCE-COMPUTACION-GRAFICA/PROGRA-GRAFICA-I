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
public class Ejercicio4 {
    public void Ejercicio(){
        //Imprimir los números primos que hay desde 1 al 100 y almacenarlos en un array

        
        int numero=1;
        
        ArrayList num=new ArrayList();
        //int num[]=new int[600];
        
        ArrayList numPrimos=new ArrayList();
      // int numPrimos[]=new int[100];
        
        
      
        for (int i = 0; i < 600; i++) {
            
            num.add(numero);
           // System.out.println(" "+numero);
            numero++;
            
      
        }
        
        
        int cont=0;
         int a=0,i;
        
        //System.out.println("Los primeros 100 números primos son: ");  
              
              
        for (int j = 0; j < 600; j++) {
            
        for(i=1;i<((int)num.get(j)+1);i++){
         if((int)num.get(j)%i==0){
             a++;
            }
         }
         if(a!=2){
              //System.out.println(num[j]+"No es Primo");
              
              
            }else{
             //Si es Primo
             if(cont<100){
                 numPrimos.add(num.get(j));
                // System.out.println(num[j]+" "); 
             }
            
               cont++;
                
         }
         
         a=0;
        
           
           
         
        }
        
       //imprimir array de numeros primos
        System.out.println("  El array de los 100 primeros números primos es:");
        for (int j = 0; j < 100; j++) {
            System.out.println(" "+numPrimos.get(j));
        }
        
        
    }
}
