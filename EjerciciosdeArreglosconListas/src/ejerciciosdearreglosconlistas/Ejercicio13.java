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
public class Ejercicio13 {
    //Escriba un programa simule varios lanzamientos de un dado y muestre la frecuencia de cada una de las caras asi
    //́ como la proporcion del numero de veces que haya salido cada cara con respecto al total.
    //Para ello simule 6000 lanzamientos de un dado utilizando la funcion Math.random()*6 para simular cada lanzamiento. 

    public void Ejercicio() {

        Scanner entrada = new Scanner(System.in);

        ArrayList lanzamientos = new ArrayList();

        //int lanzamientos[] = new int[600];
        double contuno = 0;
        double contdos = 0;
        double contres = 0;
        double contcuatro = 0;
        double contcinco = 0;
       double contseis = 0;

        for (int i = 0; i < 600; i++) {
            lanzamientos.add((int) (Math.random() * 6));

            if ((int) lanzamientos.get(i) == 1) {
                contuno++;

            } else {
                if ((int) lanzamientos.get(i) == 2) {
                    contdos++;
                } else {
                    if ((int) lanzamientos.get(i) == 3) {
                        contres++;
                    } else {
                        if ((int) lanzamientos.get(i) == 4) {
                            contcuatro++;

                        } else {
                            if ((int) lanzamientos.get(i) == 5) {
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
       
       
        System.out.println("Proporcion de la cara uno: " + contuno + "/" + "600. " + "" + "Su porcentaje es: " + (contuno / 600) * 100 + "%");
        System.out.println("Proporcion de la cara dos: " + contdos + "/" + "600. " + "" + "Su porcentaje es: " + (contdos / 600) * 100 + "%");
        System.out.println("Proporcion de la cara tres: " + contres + "/" + "600. " + "" + "Su porcentaje es: " + (contres / 600) * 100 + "%");
        System.out.println("Proporcion de la cara cuatro: " + contcuatro + "/" + "600. " + "" + "Su porcentaje es: " + (contcuatro / 600) * 100 + "%");
        System.out.println("Proporcion de la cara cinco: " + contcinco + "/" + "600. " + "" + "Su porcentaje es: " + (contcinco / 600) * 100 + "%");
        System.out.println("Proporcion de la cara seis: " + contseis + "/" + "600. " + "" + "Su porcentaje es: " + (contseis / 600) * 100 + "%");

    }
}
