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
public class PisoG {
     public void piso() {
            //piso
            gl.glBegin(gl.GL_QUADS);

            gl.glColor3f(0, 1, 0);

            //0 a 180 en x
            //0 a 10 en y 
            //piso
            gl.glVertex2d(0, 0);
            gl.glVertex2d(0, 10);
            gl.glVertex2d(250, 10);
            gl.glVertex2d(250, 0);

            //casa
            //punto inicial va a ser (0, 10)
            gl.glEnd();
        }

}
