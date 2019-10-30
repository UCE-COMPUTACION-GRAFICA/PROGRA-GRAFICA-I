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
public class Ejercicio5 {

    //Escriba un programa que sume todos los elementos de un array de enteros. Utilicelo para sumar el vector: 
    ArrayList arreglo = new ArrayList();
    int n;

    public void Ejercicio() {

        Scanner entrada = new Scanner(System.in);
        System.out.println(" Por favor escriba la dimensión del arreglo ");

        n = entrada.nextInt();

        //int arreglo[]=new int[n];
        System.out.println("Por favor escriba los números que desea introducir a su arreglo");
        for (int i = 0; i < n; i++) {
            arreglo.add(entrada.nextInt());
        }

        // sumar el array int[] a = {1, 2, 3, 4, 5, 6}; 
    }

    public void suma() {
        int suma = 0;

        for (int i = 0; i < arreglo.size(); i++) {

            suma = suma + (int) arreglo.get(i);

        }
        System.out.println("La suma de los elementos del array es: " + suma);
    }

    public void ejemplo() {
        System.out.println("Probaremos el ejemplo: sumar el array int[] a = {1, 2, 3, 4, 5, 6}; ");
        //limpiamos el array de los datos anteriormente ingresados
        arreglo.clear();
        
        //añadimos el nuevo array
        arreglo.add(1);
        arreglo.add(2);
        arreglo.add(3);
        arreglo.add(4);
        arreglo.add(5);
        arreglo.add(6);

        //realizamos la suma
        suma();

    }
}
