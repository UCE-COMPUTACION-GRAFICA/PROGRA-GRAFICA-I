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
public class FondoCarretera {
     public void fondocarretera() {
            //parte ploma
            gl.glBegin(gl.GL_QUADS);

            gl.glColor3f(0.4f, 0.4f, 0.4f);
            gl.glVertex2d(0, 0);
            gl.glVertex2d(250, 0);
            gl.glVertex2d(250, 30);
            gl.glVertex2d(0, 30);

            gl.glEnd();
        }
}
