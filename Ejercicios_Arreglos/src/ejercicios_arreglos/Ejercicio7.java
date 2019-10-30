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
public class Ejercicio7 {
    //Escribir un programa que recoja de la entrada estándar dos arrays de enteros de tamaño especificado por el usuario y los multiplique dos a dos, 
    //guardando el resultado en otro array e imprimiendo los valores de este último array. 

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese la dimensión de los arreglos array");
        int n = entrada.nextInt();

        int A[] = new int[n];
        System.out.println("Ingrese los valores para el primer arreglo");
        for (int i = 0; i < n; i++) {
            A[i] = entrada.nextInt();
        }

        int B[] = new int[n];

        System.out.println("Ingrese los valores para el segundo arreglo");
        for (int i = 0; i < n; i++) {
            B[i] = entrada.nextInt();
        }

        int mult;

        int vecMul[] = new int[n];

        //multiplicacion de vectores
        for (int i = 0; i < n; i++) {

            vecMul[i] = A[i] * B[i];

        }
        
        
        //imprimir vector resultante
        System.out.println("el vector resultante de la multiplicación es :");
        for (int i = 0; i < n; i++) {
            System.out.print(" "+vecMul[i]);
        }
        System.out.println("");

    }

}
