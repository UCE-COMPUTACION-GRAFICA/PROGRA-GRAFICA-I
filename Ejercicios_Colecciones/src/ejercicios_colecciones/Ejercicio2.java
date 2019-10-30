/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios_colecciones;

import java.util.ArrayList;

/**
 *
 * @author VERONICA
 */
public class Ejercicio2 {

    public static void main(String arg[]) {

        //Crea un conjunto al que se le va a llamar jugadores. Inserta en el conjunto los jugadores del FC Barcelona.
        //Realiza un bucle sobre los jugadores del conjunto y muestra sus nombres.
        //Pista:for (String nombre : jugadores) {System.out.println(nombre);}
        ArrayList jugadores = new ArrayList();
        jugadores.add("Marc-André ter Stegen");
        jugadores.add("Neto");
        jugadores.add("Iñaki Peña");
        jugadores.add("Nélson Semedo");
        jugadores.add("Gerard Piqué");
        jugadores.add("Nélson Semedo");
        jugadores.add("Jean-Clair Todibo");
        jugadores.add("Clément Lenglet");

        jugadores.add("Moussa Wague");
        jugadores.add("Clément Lenglet");
        jugadores.add("Jordi Alba");
        jugadores.add("Sergi Roberto");

        jugadores.add("Samuel Umtiti");
        jugadores.add("Júnior Firpo");
        jugadores.add("Ronald Araújo");

        jugadores.add("Ivan Rakitic");
        jugadores.add("Sergio Busquets");
        jugadores.add("Arthur");
        jugadores.add("Carles Aleñá");
        jugadores.add("Frenkie de Jong");
        jugadores.add("Arturo Vidal");
        jugadores.add("Luis Suárez");
        jugadores.add("Lionel Messi");

        jugadores.add("Ousmane Dembélé");
        jugadores.add("Antoine Griezmann");
        jugadores.add("Carles Pérez");
        jugadores.add("Ansu Fati");

        System.out.println("Los jugadores del FC Barcelona son:");
        for (Object nombre : jugadores) {
            System.out.println(nombre);
        }

    }
}
