/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import static org.yourorghere.Casa.gl;

/**
 *
 * @author VERONICA
 */
public class TroncoGrande {
    public void troncogrande() {
            //arbol tronco
            gl.glBegin(gl.GL_QUADS);

            gl.glColor3f(1, 0.5f, 0);

            gl.glVertex2d(150, 10);
            gl.glVertex2d(150, 90);
            gl.glVertex2d(180, 90);
            gl.glVertex2d(180, 10);

            gl.glEnd();
        }
}
