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
public class Fondo {
     public void fondo() {
            //fondo
            gl.glBegin(gl.GL_QUADS);

            gl.glVertex2d(0, 0);
            gl.glVertex2d(250, 0);
            gl.glVertex2d(250, 180);
            gl.glVertex2d(0, 180);

            gl.glEnd();
        }
}
