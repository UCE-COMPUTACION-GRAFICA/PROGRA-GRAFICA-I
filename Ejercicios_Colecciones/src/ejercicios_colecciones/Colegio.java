/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author VERONICA
 */
public class Colegio {

    public String nacionalidad;

    ArrayList alumno = new ArrayList();

    public void agregarAlumno() {

        String nacionEst;
        Scanner entrada = new Scanner(System.in);
        //System.out.println("Por favor ingrese la nacionalidad del estudiante");

      
        nacionEst = entrada.next();
        alumno.add(nacionEst);

    }

    public void imprimirNacionalidades() {
        System.out.println("Se ingresó estudiantes con las siguientes nacionalidades:"
                + "");
        for (int i = 0; i < alumno.size(); i++) {
            System.out.println(" "+ alumno.get(i));
        }
    }

}
