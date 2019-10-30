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
public class Ejercicio10 {
    //Escribir un programa que calcule el determinante de una matriz de 3x3. 
//Pruébelo con la matriz [ [1,2,3], [4,5,6], [7,8,8] ] cuyo determinante es 3 

    public static void main(String arg[]) {

        Scanner entrada = new Scanner(System.in);

//declaramos la matriz de 3x3
        int A[][] = new int[3][3];
        //hallemos el determinante
        int det;

        
        
        System.out.println("Por favor ingrese los valores de la matriz:"
                + "");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[i][j]=entrada.nextInt();
                
                
            }
        }
        
        
        //imprimir matriz 
        System.out.println("Su matriz es : ");
        
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+A[i][j]);
                
                
            }
             System.out.println(" ");
        }
        
        
        det = (A[0][0] * A[1][1] * A[2][2]) + (A[0][1] * A[1][2] * A[2][0])
                        + (A[0][2] * A[1][0] * A[2][1]) - (A[0][0] * A[1][2] * A[2][1])
                        - (A[0][1] * A[1][0] * A[2][2]) - (A[0][2] * A[1][1] * A[2][0]);
        
        System.out.println("El determinante de la matriz A de 3x3 es:"+det);

        
        
        System.out.println(" Probando el ejemplo de la matriz [ [1,2,3], [4,5,6], [7,8,8] ] ");
        
        A[0][0]=1;   A[0][1]=2;  A[0][2]=3;
        A[1][0]=4;   A[1][1]=5;  A[1][2]=6;
        A[2][0]=7;   A[2][1]=8;  A[2][2]=8;
        
         det = (A[0][0] * A[1][1] * A[2][2]) + (A[0][1] * A[1][2] * A[2][0])
                        + (A[0][2] * A[1][0] * A[2][1]) - (A[0][0] * A[1][2] * A[2][1])
                        - (A[0][1] * A[1][0] * A[2][2]) - (A[0][2] * A[1][1] * A[2][0]);
         
         
          System.out.println("El determinante de esta matriz es:"+det);
         
         
        
        
        
        
        
        
                
                
        
        
        
        
    }

}
