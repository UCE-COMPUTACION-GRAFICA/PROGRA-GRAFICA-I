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
public class ArbolPeque {
    public void arbolpeque() {
            //otro arbol
//arbol tronco
            gl.glBegin(gl.GL_QUADS);
            gl.glColor3f(1, 0.5f, 0);
            //gl.glColor3f(1, 0.7f, 0);

            gl.glVertex2d(160, 10);
            gl.glVertex2d(175, 10);
            gl.glVertex2d(175, 45);

            gl.glVertex2d(160, 45);

            gl.glEnd();

            // cabeza del arbol
            gl.glBegin(gl.GL_TRIANGLES);

            gl.glColor3f(0, 0.8f, 0);

            gl.glVertex2d(150, 40);
            gl.glVertex2d(185, 40);
            gl.glVertex2d(167.5f, 80);

            gl.glEnd();

            gl.glBegin(gl.GL_TRIANGLES);

            gl.glColor3f(0, 0.8f, 0);

            gl.glVertex2d(150, 50);
            gl.glVertex2d(185, 50);
            gl.glVertex2d(167.5f, 90);

            gl.glEnd();

            gl.glBegin(gl.GL_TRIANGLES);

            gl.glColor3f(0, 0.8f, 0);

            gl.glVertex2d(150, 60);
            gl.glVertex2d(185, 60);
            gl.glVertex2d(167.5f, 100);

            gl.glEnd();
        }
}
