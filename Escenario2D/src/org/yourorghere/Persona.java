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
public class Persona {
    public void persona() {
        Circulo nuevo=new Circulo();
        Cuerpo nuevo1=new Cuerpo();
           float radio = 5;
            gl.glPushMatrix();
            nuevo1.cuerpo();
            gl.glColor3f(1f, 0f, 0f);
            gl.glTranslatef(75, -72, 0);
            nuevo.circulo(radio);

            gl.glPopMatrix();

        }
}
