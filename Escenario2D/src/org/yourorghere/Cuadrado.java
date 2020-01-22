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
public class Cuadrado {
    public void cuadrado() {
            gl.glBegin(GL.GL_POLYGON);

            gl.glVertex2f(10, 10);
            gl.glVertex2f(20, 10);
            gl.glVertex2f(20, 20);
            gl.glVertex2f(10, 20);
            gl.glEnd();
        }

}
