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
public class Ejercicio8 {

    public static void main(String arg[]) {
        //Escriba un programa que lea de la entrada un número y utilice ese número para crear un array de enteros de ese tamaño. 
        //A continuación, el programa inicializará el array con los valores que el usuario introduzca por la entrada.
        //Finalmente, se deberá recorrer el array e imprimir tantos caracteres ‘*’ como indique el valor de cada elemento del array.
        //Ejemplo: los valores 5,4,3,2 producirán la siguiente salida: 
//***** 
//**** 
//***
//** 

 Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese la dimensión de los arreglos array");
        int n = entrada.nextInt();

        int A[] = new int[n];
        System.out.println("Ingrese los valores para el primer arreglo");
        for (int i = 0; i < n; i++) {
            A[i] = entrada.nextInt();
        }

        //imprimir asteriscos conforme indique el valor de cada elemento del array
        
        int cont=0;
        
        for (int i = 0; i < n; i++) {
            
        cont=A[i];
            for (int j = 0; j < cont; j++) {
                 System.out.print("*");
            }
            System.out.println(" ");
           
        }
        
        
        
        




    }
}
