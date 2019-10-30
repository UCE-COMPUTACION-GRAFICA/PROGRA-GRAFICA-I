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
public class Ejercicio12 {
    ArrayList A=new ArrayList();
    int n;
    public  void Ejercicio(){
        
 Scanner entrada = new Scanner(System.in);

        System.out.println("Por favor ingrese la dimensión del array");
        int n = entrada.nextInt();

        
        
        
        
        //int A[] = new int[n];
        System.out.println("Ingrese los valores para el arreglo");
        for (int i = 0; i < n; i++) {
            A.add(entrada.nextInt());
        }

       
        
        
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
    
    
    
    public void burbuja()
           
    {
        //System.out.println(" entro");
        for(int i = 0; i < A.size()- 1; i++)
        {
            for(int j = 0; j <A.size() - 1; j++)
            {
                if ( (int)A.get(j) < (int)A.get(j+1))
                {
                    int aux = (int)A.get(j+1);
                    
                    
                    
                   A.set(j+1, A.get(j));
                   
                    A.set(j,aux);
                }
            }
        }
        System.out.println("El arreglo ordenado es: ");
        for(int i = 0;i < A.size(); i++)
        {
            System.out.print(A.get(i)+"\n");
        }
        
}
    
    
    public void ejemplo(){
        
        A.clear();
        
        A.add(4);
        A.add(3);
        A.add(2);
        A.add(1);
        
        //int[] b={4,3,2,1};
        System.out.println("Para el arreglo b={4,3,2,1} ");
        burbuja();
        
        
        //int[] c={3,2,1,4};
        
         A.clear();
        
        A.add(3);
        A.add(2);
        A.add(1);
        A.add(4);
        
        
        
        
        System.out.println("Para el arreglo c={3,2,1,4} ");
        burbuja();
        
    }
    
    
    }

