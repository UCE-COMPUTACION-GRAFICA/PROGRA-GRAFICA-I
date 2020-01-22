/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import static org.yourorghere.Main.gl;

/**
 *
 * @author VERONICA
 */
public class Nubes {
    public void nubes() {
        Circulo nuevo=new Circulo();
            gl.glPushMatrix();
            gl.glScalef(1.8f, 0.5f, 0);
            gl.glTranslatef(-10, 135, 0);
            gl.glColor3f(1, 1, 1);
            float radio = 10f; //un radio para el círculo
            nuevo.circulo(radio);
            gl.glTranslatef(10, 0, 0);
            nuevo.circulo(radio);
            gl.glScalef(0.75f, 0.9f, 0);
            gl.glTranslatef(25, 25, 0);
            nuevo.circulo(radio);
            gl.glPopMatrix();

        }

}
