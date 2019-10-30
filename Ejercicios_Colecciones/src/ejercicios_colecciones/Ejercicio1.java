/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author VERONICA
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Crea una lista que contenga los días de la semana.
        //Pista:List listDias = new ArrayList();
        ArrayList listDias = new ArrayList();
        System.out.println("Los días de la semana son:");
        listDias.add("Lunes");
        listDias.add("Martes");
        listDias.add("Miercoles");
        listDias.add("Jueves");
        listDias.add("Viernes");
        listDias.add("Sábado");
        listDias.add("Domingo");
        
        
        //imprimir lista 
        
        
        for (int i = 0; i <listDias.size(); i++) {
            System.out.println(" "+ listDias.get(i));
        }
        
        
        
    }

}
