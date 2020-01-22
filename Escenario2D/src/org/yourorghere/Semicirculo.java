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
public class Semicirculo {
    
    public float  a, b;
     public void semicirculo( float radio) {
    
        
            // para crear circulo
            gl.glBegin(GL.GL_POLYGON);
            // Set the current drawing color to red
            //se crea un poligno de 100 lados de manera que parece circulo
            //esto con iteraciones de punto flotante que pasa de 0.01 en 0.01 
            for (float i = 0; i < 3.14; i += 0.01f) {
                //para crear los lados de cada poligono
                a = (float) (Math.cos(i) * radio);
                b = (float) (radio * Math.sin(i));
                //se puede modificar las posicicones
                gl.glVertex2f(a + 90, b + 130);
            }
            gl.glEnd();

        }
}
