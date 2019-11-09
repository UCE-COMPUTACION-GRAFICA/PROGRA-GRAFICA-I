/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;
import static org.yourorghere.Casa.gl;

/**
 *
 * @author VERONICA
 */
public class Auto {
     public void auto() {
            Circulo nuevo=new Circulo();
            Semicirculo nuevo1=new Semicirculo();
            //limite de carretera superior 30 , derecha 250
            //rectangulo del auto
           
            gl.glPushMatrix();
            gl.glTranslatef(125f, 0f, 0f);
            gl.glBegin(GL.GL_POLYGON);
            gl.glVertex2f(0, 5);
            gl.glVertex2f(55, 5);
            gl.glVertex2f(55, 16);
            gl.glVertex2f(0, 16);
            gl.glEnd();

            //semicirculo del auto parte sup
            gl.glTranslatef(-62.5f, -120f, 0f);
             float radio = 20;
            nuevo1.semicirculo(radio);
            radio = 5;
            gl.glColor3f(0, 0, 0);
            gl.glTranslatef(-10f, -5, 0f);
            nuevo.circulo(radio);
            gl.glTranslatef(20f, 0, 0f);
            nuevo.circulo(radio);

            gl.glColor3f(1, 1f, 1);
            radio = 10;
            gl.glTranslatef(-10f, 10, 0f);
            nuevo1.semicirculo(radio);
            gl.glPopMatrix();

        }
}
