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
public class Ejercicio11 {
    //Escribe un programa que dada una matriz de 3x3 realice las siguientes funciones: 
//Calcule la media de todos los valores 
//Calcule el valor mínimo y el máximo de todos los valores 
//Sumar los valores en la diagonal descendente. 
//Sumar los valores en la diagonal ascendente. 
//Sumar los valores que están por encima de la diagonal descendente. 
//Sumar los valores que están por debajo de la diagonal descendente. 
//Probarlo con la matriz [ [1,2,3], [4,5,6], [7,8,9] ] 

     ArrayList<ArrayList<Integer>> A = new ArrayList();

    // public static int A[][] = new int[3][3];
    public void Ejercicio() {
        Scanner entrada = new Scanner(System.in);
        Ejercicio11 nuevo = new Ejercicio11();

        int n;

        do {

            System.out.println("Por favor ingrese la opcion que desee realizar: "
                    + "\n 1.Ingresar una Matriz "
                    + "\n 2.Imprimir la Matriz"
                    + "\n 3.Calcule la media de todos los valores "
                    + "\n 4.Calcule el valor mínimo y el máximo de todos los valores"
                    + "\n 5.Sumar los valores en la diagonal descendente"
                    + "\n 6.Sumar los valores en la diagonal ascendente"
                    + "\n 7.Sumar los valores que están por encima de la diagonal descendente"
                    + "\n 8.Sumar los valores que están por debajo de la diagonal descendente"
                    + "\n 9.Probarlo con la matriz [ [1,2,3], [4,5,6], [7,8,9] ] "
                    + "\n 10. Salir ");

            n = entrada.nextInt();
            switch (n) {
                case 1:
                    nuevo.ingresarmatriz();

                    break;
                case 2:
                    nuevo.imprimirmatriz();

                    break;
                case 3:
                    System.out.println("La media de los valores de la matriz es: " + nuevo.media());

                    break;
                case 4:

                    System.out.println("El número mínimo es :" + nuevo.minimo());

                    System.out.println("El número máximo es " + nuevo.maximo());

                    break;
                case 5:
                    nuevo.sumadiagonalDescendente();
                    break;
                case 6:
                    nuevo.sumadiagonalAscendente();
                    break;

                case 7:
                    nuevo.sumaencimadescendente();
                    break;
                case 8:
                    nuevo.sumadebajoascendente();
                    break;

                case 9:
                    nuevo.ejemplos();

                    break;

                case 10:
                    //salir
                    n = 0;
                default:
                    break;

            }
        } while (n != 0);

    }
    Scanner entrada = new Scanner(System.in);

    public ArrayList ingresarmatriz() {

        System.out.println("Por favor ingrese los valores de la matriz:"
                + "");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                A.add(new ArrayList<Integer>());

                A.get(i).add(j, entrada.nextInt());

            }
        }

        return A;

    }

    public void imprimirmatriz() {
        //imprimir matriz 
        System.out.println("Su matriz es : ");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + A.get(i).get(j));

            }
            System.out.println(" ");
        }
    }

    public double media() {
        //calcular la media de todos los valorea
        int suma = 0;
        double media;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                suma = suma + (int) A.get(i).get(j);
            }
        }

        media = suma / 9;

        return media;
    }

    public int minimo() {
        int min = A.get(0).get(0);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((int) A.get(i).get(j) < min) {
                    min = A.get(i).get(j);
                }

            }
        }
        return min;

    }

    public int maximo() {
        int max = A.get(0).get(0);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if ((int) A.get(i).get(j) > max) {
                    max = A.get(i).get(j);
                }

            }
        }
        return max;

    }

    public void sumadiagonalDescendente() {

        int suma = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    suma = suma + (int) A.get(i).get(j);
                }

            }
        }

        System.out.println("La suma de la diagonal descendiente es: " + suma);

    }

    public void sumadiagonalAscendente() {

        int suma;

        suma = (int) A.get(2).get(0) + (int) A.get(1).get(1) + (int) A.get(0).get(2);

        System.out.println("La suma de la diagonal ascendiente es: " + suma);

    }

    public void sumaencimadescendente() {

        int suma;

        suma = (int) A.get(0).get(0) + (int) A.get(0).get(1) + (int) A.get(1).get(0);

        System.out.println("La suma de los números de encima descendentes es: " + suma);

    }

    public void sumadebajoascendente() {

        int suma;

        suma = (int) A.get(1).get(2) + (int) A.get(2).get(1) + (int) A.get(2).get(2);

        System.out.println("La suma de los números de debajo es descendentes es: " + suma);

    }

    public void ejemplos() {
        
        //A.clear();
        
        //problema de que si no la añade el numero de veces sale que no hay un tamaño 
         for (int i = 0; i < 9; i++) {
             A.add(new ArrayList<Integer>());
        }
       
    
        
        A.get(0).add(0, 1); 
        A.get(0).add(1, 2);
        A.get(0).add(2, 3);
        System.out.println("o");
        
       
        
        
        A.get(1).add(0, 4);
        
        A.get(1).add(1, 5);
        A.get(1).add(2, 6);
       

        A.get(2).add(0, 7);
        A.get(2).add(1, 8);
        A.get(2).add(2, 9);
        

       

        imprimirmatriz();
        System.out.println("La media de los valores de la matriz es: " + media());
        System.out.println("El número mínimo es :" + minimo());

        System.out.println("El número máximo es " + maximo());
        sumadiagonalDescendente();
        sumadiagonalAscendente();
        sumaencimadescendente();
        sumadebajoascendente();
    }
}
