/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo2;

import java.util.Scanner;

/**
 *
 * @author fing.labcom
 */
public class Principal {
    public static void main(String[] args) {
        
        //System.out.println("Por favor elija la figura con la que desea trabajar: \n 1. Cuadrado \n 2. Círculo");
        int n=1;
        Scanner entrada = new Scanner (System.in);
        n=1;
        
        
        
      
        do{
             System.out.println("Por favor elija la opción con la que desea trabajar: \n 1. Cuadrado \n 2. Círculo \n 3. Salir");
            n=entrada.nextInt();
            
            
            switch(n)
            {
                
                //para calcular el area del cuadrado
                case 1: 
                    
                    System.out.println("Ingrese el valor de un lado del cuadrado: ");
                    double l=entrada.nextDouble();
                    ejemplo2.Cuadrado a= new ejemplo2.Cuadrado(l);
                     double r1=a.Area();
                    System.out.println("El area es:"+ r1);
                    
                    break;
                    
                    // para calcular el area del circulo
                case 2:
                    System.out.println("Ingrese el valor del radio: ");
                    double r=entrada.nextDouble();
                    ejemplo2.Circulo b= new ejemplo2.Circulo(r);
                   double r2=b.Area();
                    
                     System.out.println("El area es:"+ r2);
                    
                    break;
                    
                    //para salir
                case 3:
                    
                    n=0;
                    break;
                default:
                    break;
                    
                    
                    
            }
            
            
        }while(n!=0);
               
    }
}
