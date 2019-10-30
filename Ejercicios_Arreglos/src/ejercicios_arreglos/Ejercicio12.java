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
public class Ejercicio12 {
    public static void main(String arg[]){
        
 Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese la dimensión del array");
        int n = entrada.nextInt();

        int A[] = new int[n];
        System.out.println("Ingrese los valores para el arreglo");
        for (int i = 0; i < n; i++) {
            A[i] = entrada.nextInt();
        }

        Ejercicio12 nuevo=new Ejercicio12();
        nuevo.burbuja(A);
        //ordenar el arreglo
        
        //metódo de la burbúja
        
        nuevo.ejemplo();
        
        
    }
    
    
    
    public void burbuja(int arreglo[])
    {
        for(int i = 0; i < arreglo.length - 1; i++)
        {
            for(int j = 0; j < arreglo.length - 1; j++)
            {
                if (arreglo[j] < arreglo[j + 1])
                {
                    int aux = arreglo[j+1];
                    arreglo[j+1] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
        System.out.println("El arreglo ordenado es: ");
        for(int i = 0;i < arreglo.length; i++)
        {
            System.out.print(arreglo[i]+"\n");
        }
        
}
    
    
    public void ejemplo(){
        int[] b={4,3,2,1};
        
        int[] c={3,2,1,4};
        System.out.println("Para el arreglo b={4,3,2,1} ");
        burbuja(c);
        System.out.println("Para el arreglo c={3,2,1,4} ");
        burbuja(b);
        
    }
    
    
    }

