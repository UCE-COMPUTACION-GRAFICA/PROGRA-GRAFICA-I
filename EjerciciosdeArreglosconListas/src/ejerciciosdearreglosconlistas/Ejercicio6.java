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
public class Ejercicio6 {

    //Hacer un programa que dados dos arrays determine si son iguales. Probarlo con los arrays [1,2,3] y [1,2,3], [1,2,3,4] y [1,2,3] y [1,2,3] y [1,2,2] 
    ArrayList A = new ArrayList();
    ArrayList B = new ArrayList();

    public void Ejercicio() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese la dimensión del primer array");
        int n = entrada.nextInt();

        //int A[]=new int[n];
        System.out.println("Ingrese los valores para el primer arreglo");
        for (int i = 0; i < n; i++) {
            A.add(entrada.nextInt());
        }

        System.out.println("Por favor ingrese la dimensión del segundo array");
        int m = entrada.nextInt();

        //int B[]=new int[m];
        System.out.println("Ingrese los valores para el segundo arreglo");
        for (int i = 0; i < m; i++) {
            B.add(entrada.nextInt());
        }

    }
    //boolean iguales;

    public void iguales() {
        //probaremos si ambos arrays son iguales

        if (A.size() == B.size()) {
            if (A.equals(B)) {
                System.out.println("Los vectores son idénticos ");
            } else {
                System.out.println("Los vectores no son iguales");
            }
        } else {
            System.out.println("Los vectores no tienen la misma dimensión, por lo tanto no son iguales ");
        }
    }

    public void ejemplos() {
        //probar con los ejemplos
        System.out.println("Probar con los ejemplos");

        System.out.println("Comprobar los vectores [1,2,3] y [1,2,3] ");
        //limpiamos los arrays 
        A.clear();
        B.clear();

        A.add(1);
        A.add(2);
        A.add(3);

        B.add(1);
        B.add(2);
        B.add(3);

        //probamos si son iguales, llamamos al método
        iguales();
        
        
        A.clear();
        B.clear();

        A.add(1);
        A.add(2);
        A.add(3);
        
       B.add(1);
        B.add(2);
        B.add(3);
        
        
        
        ArrayList C=new ArrayList();
        C.add(1);
        C.add(2);
        C.add(2);
        
        
        System.out.println("Comprobar con los vectores  [1,2,3,4] y [1,2,3] y [1,2,3] y [1,2,2]");
       
        if (A.size() == B.size() && A.size()==C.size() && B.size()==C.size()) {
            if (A.equals(B) && A.equals(C)) {
                System.out.println("Los vectores son idénticos ");
            } else {
                System.out.println("Los vectores no son iguales");
            }
        } else {
            System.out.println("Los vectores no tienen la misma dimensión, por lo tanto no son iguales ");
        }
        

    }

}
