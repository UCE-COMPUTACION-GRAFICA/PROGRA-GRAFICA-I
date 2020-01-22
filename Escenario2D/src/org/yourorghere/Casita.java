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
public class Casita {
    public void casa1() {
            gl.glBegin(gl.GL_QUADS);
            gl.glColor3f(0, 0, 1);
            gl.glVertex2d(10, 10);
            gl.glVertex2d(10, 90);
            gl.glVertex2d(125, 90);
            gl.glVertex2d(125, 10);

            gl.glEnd();

            //ventanas
            gl.glBegin(gl.GL_QUADS);
            gl.glColor3f(0, 1f, 0.8f);
            gl.glVertex2d(20, 60);
            gl.glVertex2d(20, 80);
            gl.glVertex2d(50, 80);
            gl.glVertex2d(50, 60);

            gl.glEnd();

            gl.glBegin(gl.GL_QUADS);
            gl.glColor3f(0, 1f, 0.8f);
            gl.glVertex2d(80, 60);
            gl.glVertex2d(80, 80);
            gl.glVertex2d(110, 80);
            gl.glVertex2d(110, 60);

            gl.glEnd();

            //puerta
            gl.glBegin(gl.GL_QUADS);

            gl.glColor3f(1, 0.8f, 0);

            gl.glVertex2d(40, 10);
            gl.glVertex2d(40, 55);
            gl.glVertex2d(90, 55);
            gl.glVertex2d(90, 10);

            gl.glEnd();

            //techo
            gl.glBegin(gl.GL_TRIANGLES);

            gl.glColor3f(1, 0.8f, 0);

            gl.glVertex2d(10, 90);
            gl.glVertex2d(125, 90);
            gl.glVertex2d(67.5, 140);

            gl.glEnd();
        }
    
    
    
    public void casa2() {
            gl.glBegin(gl.GL_QUADS);
            gl.glColor3f(1f, 0.3f , 0.2f);
            gl.glVertex2d(10, 10);
            gl.glVertex2d(10, 90);
            gl.glVertex2d(125, 90);
            gl.glVertex2d(125, 10);

            gl.glEnd();

            //ventanas
            gl.glBegin(gl.GL_QUADS);
            gl.glColor3f(0, 1f, 0.8f);
            gl.glVertex2d(20, 60);
            gl.glVertex2d(20, 80);
            gl.glVertex2d(50, 80);
            gl.glVertex2d(50, 60);

            gl.glEnd();

            gl.glBegin(gl.GL_QUADS);
            gl.glColor3f(0, 1f, 0.8f);
            gl.glVertex2d(80, 60);
            gl.glVertex2d(80, 80);
            gl.glVertex2d(110, 80);
            gl.glVertex2d(110, 60);

            gl.glEnd();

            //puerta
            gl.glBegin(gl.GL_QUADS);

            gl.glColor3f(1, 0.8f, 0);

            gl.glVertex2d(40, 10);
            gl.glVertex2d(40, 55);
            gl.glVertex2d(90, 55);
            gl.glVertex2d(90, 10);

            gl.glEnd();

            //techo
            gl.glBegin(gl.GL_TRIANGLES);

            gl.glColor3f(1, 0.8f, 0);

            gl.glVertex2d(10, 90);
            gl.glVertex2d(125, 90);
            gl.glVertex2d(67.5, 140);

            gl.glEnd();
        }
}
