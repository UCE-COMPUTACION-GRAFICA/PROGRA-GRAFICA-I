/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones;

import java.util.Scanner;

/**
 *
 * @author VERONICA
 */
public class Ejercicio3 {
    //Crea una clase colegio que almacene la nacionalidad de los alumnos de un colegio. La clase tendrá los siguientes métodos.
    //addAlumno(String nacionalidad) añade la nacionalidad de un nuevo alumno

    public static void main(String arg[]) {
        Colegio nuevoAlumno = new Colegio();

        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor escriba el número de alumnos que desea ingresar");
        int n = entrada.nextInt();

        int cont=1;
        for (int i = 0; i < n; i++) {
            System.out.println("Por favor ingrese la nacionalidad del estudiante N#"+cont+" que desea ingresar");

            nuevoAlumno.agregarAlumno();
            cont++;
        }

        //imprimir nacionalidades
        nuevoAlumno.imprimirNacionalidades();

    }

}
