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
public class Cuerpo {
    public void cuerpo() {
        Cuadrado nuevo=new Cuadrado();
            gl.glPushMatrix();

            //gl.glScalef(0.7f, 0.8f,0 );
            gl.glColor3f(0, 0, 0);
            gl.glTranslatef(150, 33, 0);
            nuevo.cuadrado();

            gl.glPopMatrix();

            //piernas
            gl.glPushMatrix();
            gl.glColor3f(0, 0, 1);
            gl.glScalef(0.4f, 1, 0);
            gl.glTranslatef(392, 23, 0);
            nuevo.cuadrado();
            gl.glTranslatef(12, 0, 0);
            nuevo.cuadrado();
            gl.glPopMatrix();

            //brazos
            gl.glPushMatrix();
            gl.glColor3f(0, 0, 1);
            gl.glScalef(0.3f, 1, 0);
            gl.glTranslatef(516, 33, 0);
            nuevo.cuadrado();

            gl.glPopMatrix();

            gl.glPushMatrix();
            gl.glColor3f(0, 0, 1);
            gl.glScalef(0.3f, 1f, 0);
            gl.glTranslatef(556, 33, 0);
            nuevo.cuadrado();
            gl.glPopMatrix();

//            gl.glColor3f(0, 0, 0);
//            gl.glTranslatef(150, 33, 0);
//            cuadrado();
        }
}
