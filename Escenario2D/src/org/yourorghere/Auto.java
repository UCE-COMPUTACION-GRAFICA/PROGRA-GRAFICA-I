/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;
import static org.yourorghere.Main.gl;

/**
 *
 * @author VERONICA
 */
public class Auto {

    Circulo nuevo = new Circulo();
    Semicirculo nuevo1 = new Semicirculo();

    public void auto() {

        gl.glPushMatrix();
        gl.glTranslatef(125f, 0f, 0f);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(0, 5);
        gl.glVertex2f(0, 16);
        gl.glVertex2f(7, 16);
        gl.glVertex2f(15, 27);
        gl.glVertex2f(33, 27);
        gl.glVertex2f(40, 18);
        gl.glVertex2f(50, 16);
        gl.glVertex2f(55, 10);
        gl.glVertex2f(55, 5);

        gl.glEnd();

        //parte aabjo
        gl.glColor3f(0.55f, 0.47f, 0.14f);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(0, 5f);
        gl.glVertex2f(55f, 5);

        gl.glVertex2f(55, 7.5f);
        gl.glVertex2f(0, 7.5f);

        gl.glEnd();
        gl.glPopMatrix();

        //ruedas 
        gl.glPushMatrix();
        float radio = 5;
        gl.glColor3f(0, 0, 0);
        gl.glTranslatef(50f, -125, 0f);
        nuevo.circulo(radio);
        gl.glTranslatef(20f, 0, 0f);
        nuevo.circulo(radio);

        gl.glPopMatrix();

        //ventanas
        gl.glPushMatrix();
        gl.glColor3f(1, 1, 1);
        gl.glTranslatef(132f, 0, 0f);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(4f, 18);
        gl.glVertex2f(10, 18);
        gl.glVertex2f(10, 25);
        gl.glVertex2f(8, 25);

        //ventana 2
        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(12, 18);
        gl.glVertex2f(27, 18);
        gl.glVertex2f(20f, 25);
        gl.glVertex2f(12, 25);

        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);

        gl.glVertex2f(29, 18);
        gl.glVertex2f(33f, 18);
        gl.glVertex2f(27.5f, 25);
        gl.glVertex2f(23, 25);

        gl.glEnd();
        //ventana 3

        //partes
        gl.glColor3f(1.0f, 0.5f, 0);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(-7, 9.5f);
        gl.glVertex2f(-7, 12);
        gl.glVertex2f(0, 12);
        gl.glVertex2f(0, 9.5f);

        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(48, 9.5f);
        gl.glVertex2f(46.5f, 12);
        gl.glVertex2f(40, 12);
        gl.glVertex2f(40, 9.5f);

        gl.glEnd();
        gl.glColor3f(0, 0, 0);

        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(12, 15f);
        gl.glVertex2f(17f, 15);

        gl.glVertex2f(17, 16f);
        gl.glVertex2f(12, 16f);

        gl.glEnd();

        gl.glPopMatrix();

    }
    
    
    

    public void auto2() {
        gl.glPushMatrix();
        gl.glTranslatef(125f, 0f, 0f);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(0, 5);
        gl.glVertex2f(0, 10);
        gl.glVertex2f(5, 16);
        gl.glVertex2f(15, 18);
        gl.glVertex2f(22, 27);
        gl.glVertex2f(40, 27);
        gl.glVertex2f(48, 16);
        gl.glVertex2f(55, 16);
        gl.glVertex2f(55, 5);

        gl.glEnd();

        //parte aabjo
        gl.glColor3f(0.55f, 0.47f, 0.14f);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(0, 5f);
        gl.glVertex2f(55f, 5);

        gl.glVertex2f(55, 7.5f);
        gl.glVertex2f(0, 7.5f);

        gl.glEnd();
        gl.glPopMatrix();

        //ruedas 
        gl.glPushMatrix();
        float radio = 5;
        gl.glColor3f(0, 0, 0);
        gl.glTranslatef(50f, -125, 0f);
        nuevo.circulo(radio);
        gl.glTranslatef(20f, 0, 0f);
        nuevo.circulo(radio);

        gl.glPopMatrix();

        //ventanas
        gl.glPushMatrix();
        gl.glColor3f(1, 1, 1);
        gl.glTranslatef(117f, 0, 0f);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(51, 18);
        gl.glVertex2f(47, 25);
        gl.glVertex2f(45, 25);
        gl.glVertex2f(45, 18);
        
        gl.glEnd();

     //ventana 2
       
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(43, 18);
        gl.glVertex2f(28, 18);
        gl.glVertex2f(35f, 25);
        gl.glVertex2f(43, 25);
        

        gl.glEnd();
     //ventana 3

        gl.glBegin(GL.GL_POLYGON);

        gl.glVertex2f(21f, 18);
        gl.glVertex2f(25f, 18);
        gl.glVertex2f(32f, 25);
        gl.glVertex2f(28, 25);

        gl.glEnd();
       

        //partes
        gl.glColor3f(1.0f, 0.5f, 0);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(56, 9.5f);
        gl.glVertex2f(56, 12);
        gl.glVertex2f(63, 12);
        gl.glVertex2f(63, 9.5f);

        gl.glEnd();

        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(15, 9.5f);
        gl.glVertex2f(15f, 12);
        gl.glVertex2f(9.5f, 12);
        gl.glVertex2f(8, 9.5f);

        gl.glEnd();
        gl.glColor3f(0, 0, 0);
        
        gl.glPushMatrix();
        gl.glTranslatef(27, 0, 0);
        gl.glBegin(GL.GL_POLYGON);
        gl.glVertex2f(12, 15f);
        gl.glVertex2f(17f, 15);

        gl.glVertex2f(17, 16f);
        gl.glVertex2f(12, 16f);

        gl.glEnd();
        gl.glPopMatrix();

        gl.glPopMatrix();
    }
}
