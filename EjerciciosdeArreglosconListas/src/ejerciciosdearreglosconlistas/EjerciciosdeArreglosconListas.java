/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosdearreglosconlistas;

import java.util.Scanner;

/**
 *
 * @author VERONICA
 */
public class EjerciciosdeArreglosconListas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int n;

        do {

            System.out.println("Por favor ingrese el número del ejercicio que desea visualizar:"
                    + "\n Recuerde que puede ingresar valores entre 1 y 13. Presione 0 para Salir  ");

            n = entrada.nextInt();
            switch (n) {

                case 0:

                    n = 0;
                    break;

                case 1:
                    
                    Ejercicio1 nuevo=new Ejercicio1();
                    nuevo.Ejercicio();
                    break;
                case 2:
                      Ejercicio2 nuevo2=new Ejercicio2();
                       nuevo2.Ejercicio();
                    break;
                case 3:
                      Ejercicio3 nuevo3=new Ejercicio3();
                       nuevo3.Ejercicio();
                    break;
                case 4:
                      Ejercicio4 nuevo4=new Ejercicio4();
                      nuevo4.Ejercicio();
                    break;
                case 5:
                      Ejercicio5 nuevo5=new Ejercicio5();
                      nuevo5.Ejercicio();
                      nuevo5.suma();
                      
                      nuevo5.ejemplo();
                      
                    break;
                case 6:
                     Ejercicio6 nuevo6=new Ejercicio6();
                     nuevo6.Ejercicio();
                     nuevo6.iguales();
                     nuevo6.ejemplos();
                    break;

                case 7:
                      Ejercicio7 nuevo7=new Ejercicio7();
                      nuevo7.Ejercicio();
                      nuevo7.multiplicar();
                      
                    break;
                case 8:
                      Ejercicio8 nuevo8=new Ejercicio8();
                      nuevo8.Ejercicio();
                      nuevo8.imprimir();

                    break;

                case 9:
                    
                      Ejercicio9 nuevo9=new Ejercicio9();
                      nuevo9.Ejercicio();
                    break;

                case 10:
                    
                      Ejercicio10 nuevo10=new Ejercicio10();
                      nuevo10.Ejercicio();
                      nuevo10.determinante();
                      nuevo10.ejemplo();
                    break;

                case 11:
                    
                      Ejercicio11 nuevo11=new Ejercicio11();
                      
                      nuevo11.Ejercicio();
                    break;

                case 12:
                      Ejercicio12 nuevo12=new Ejercicio12();
                      nuevo12.Ejercicio();
                      nuevo12.burbuja();
                      nuevo12.ejemplo();
                    break;

                case 13:
                    
                      Ejercicio13 nuevo13=new Ejercicio13();
                      nuevo13.Ejercicio();

                    break;

                default:
                    break;

            }
        } while ((n > 0) && (n < 14));
    }

}
