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
public class LineaCarretera {
     public void lineacarretera() {

            gl.glBegin(gl.GL_QUADS);

            gl.glColor3f(1f, 1f, 1f);
            gl.glVertex2d(0, 15);
            gl.glVertex2d(25, 15);
            gl.glVertex2d(35, 25);
            gl.glVertex2d(10, 25);

            gl.glEnd();

        }
}
