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
public class CarreteraG {
    FondoCarretera nuevo=new FondoCarretera();
    LineaCarretera nuevo1=new LineaCarretera();
    
    public void carretera() {

            nuevo.fondocarretera();

            //lineas calle
            gl.glPushMatrix();
            gl.glRotatef(3.4f, 1, 0, 0);

            for (int i = 0; i < 6; i++) {

                nuevo1.lineacarretera();
                gl.glTranslatef(35, 0, 0);
            }
            gl.glPopMatrix();

        }
}
