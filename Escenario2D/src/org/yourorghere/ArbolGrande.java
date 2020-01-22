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
public class ArbolGrande {
     public void arbolgrande() {

            //arbol techo
            gl.glBegin(gl.GL_TRIANGLES);

            gl.glVertex2d(130, 90);
            gl.glVertex2d(200, 90);
            gl.glVertex2d(165, 130);

            gl.glEnd();

            gl.glBegin(gl.GL_TRIANGLES);

            gl.glVertex2d(130, 70);
            gl.glVertex2d(200, 70);
            gl.glVertex2d(165, 130);

            gl.glEnd();

            gl.glBegin(gl.GL_TRIANGLES);
            gl.glVertex2d(130, 50);
            gl.glVertex2d(200, 50);
            gl.glVertex2d(165, 130);

            gl.glEnd();
        }
}
