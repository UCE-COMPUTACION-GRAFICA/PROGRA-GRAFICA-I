/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import static org.yourorghere.Casa.gl;

/**
 *
 * @author VERONICA
 */
public class Estrellas {
    public void estrellas() {
            Circulo nuevo=new Circulo();
            gl.glPushMatrix();
            gl.glTranslatef(-81, 10, 0);
            gl.glColor3f(1, 1, 1);
            float radio = 0.5f;
            for (int i = 0; i < 15; i++) {
                nuevo.circulo(radio);
                gl.glTranslatef(20, 0, 0);
                nuevo.circulo(radio);
                gl.glTranslatef(20, 5, 0);

                nuevo.circulo(radio);
                gl.glTranslatef(20, -5, 0);

            }

            gl.glPopMatrix();
        }
}
