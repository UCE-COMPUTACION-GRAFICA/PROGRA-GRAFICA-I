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
public class Ejercicio13 {
    //Escriba un programa simule varios lanzamientos de un dado y muestre la frecuencia de cada una de las caras asi
    //́ como la proporcion del numero de veces que haya salido cada cara con respecto al total.
    //Para ello simule 6000 lanzamientos de un dado utilizando la funcion Math.random()*6 para simular cada lanzamiento. 

    public static void main(String arg[]) {

        Scanner entrada = new Scanner(System.in);

        int lanzamientos[] = new int[600];

        int contuno = 0;
        int contdos = 0;
        int contres = 0;
        int contcuatro = 0;
        int contcinco = 0;
        int contseis = 0;

        for (int i = 0; i < lanzamientos.length; i++) {
            lanzamientos[i] = (int) (Math.random() * 6);

            if (lanzamientos[i] == 1) {
                contuno++;

            } else {
                if (lanzamientos[i] == 2) {
                    contdos++;
                } else {
                    if (lanzamientos[i] == 3) {
                        contres++;
                    } else {
                        if (lanzamientos[i] == 4) {
                            contcuatro++;

                        } else {
                            if (lanzamientos[i] == 5) {
                                contcinco++;
                            } else {
                                contseis++;
                            }

                        }
                    }
                }
            }

        }

        //frecuencia de las caras debe ser el número mayor de veecs que se repitió
        if ((contuno > contdos) && (contuno > contres) && (contuno > contcuatro) && (contuno > contcinco) && (contuno > contseis)) {
            System.out.println("La cara más frecuente es: 1 ");
        } else {
            if ((contdos > contuno) && (contdos > contres) && (contdos > contcuatro) && (contdos > contcinco) && (contdos > contseis)) {
                System.out.println("La cara más frecuente es: 2");
            } else {
                if ((contres > contuno) && (contres > contdos) && (contres > contcuatro) && (contres > contcinco) && (contres > contseis)) {
                    System.out.println("La cara más frecuente es: 3 ");
                } else {
                    if ((contcuatro > contuno) && (contcuatro > contdos) && (contcuatro > contres) && (contcuatro > contcinco) && (contcuatro > contseis)) {
                        System.out.println("La cara más frecuente es: 4 ");
                    } else {
                        if ((contcinco > contuno) && (contcinco > contdos) && (contcinco > contres) && (contcinco > contcuatro) && (contcinco > contseis)) {
                            System.out.println("La cara más frecuente es: 5 ");
                        } else {
                            if ((contseis > contuno) && (contseis > contdos) && (contseis > contres) && (contseis > contcuatro) && (contseis > contcinco)) {
                                System.out.println("La cara más frecuente es: 6");
                            }
                        }
                    }

                }
            }
        }

        System.out.println("La frecuencia de cada una de las caras es: ");
        System.out.println("La frecuencia de la cara 1 es: " + contuno);
        System.out.println("La frecuencia de la cara 2 es: " + contdos);
        System.out.println("La frecuencia de la cara 3 es: " + contres);
        System.out.println("La frecuencia de la cara 4 es: " + contcuatro);
        System.out.println("La frecuencia de la cara 5 es: " + contcinco);
        System.out.println("La frecuencia de la cara 6 es: " + contseis);

        
        
        
        System.out.println(" ");
        //proporcion de numero de veces que haya salido con respecto al total
        System.out.println("Proporcion de la cara uno: " + contuno + "/" + "600");
        System.out.println("Proporcion de la cara dos: " + contdos + "/" + "600");
        System.out.println("Proporcion de la cara tres: " + contres + "/" + "600");
        System.out.println("Proporcion de la cara cuatro: " + contcuatro + "/" + "600");
        System.out.println("Proporcion de la cara cinco: " + contcinco + "/" + "600");
        System.out.println("Proporcion de la cara seis: " + contseis + "/" + "600");
        
        

    }
}
