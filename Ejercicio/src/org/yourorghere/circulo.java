/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import javax.media.opengl.GL;

/**
 *
 * @author VERONICA
 */
public class circulo {
    GL gl;
       float r,g,b,a1,b1;

    public circulo(GL gl, float r, float g, float b) {
        this.gl = gl;
        this.r = r;
        this.g = g;
        this.b = b;
    }
   
    
    
    public void display(float radio){
         gl.glBegin(GL.GL_POLYGON);
         gl.glColor3f(r, g, b);
            // Set the current drawing color to red
            //se crea un poligno de 100 lados de manera que parece circulo
            //esto con iteraciones de punto flotante que pasa de 0.01 en 0.01 
            for (float i = 0; i < 10; i += 0.01f) {
                //para crear los lados de cada poligono
                a1 = (float) (Math.cos(i) * radio);
                b1 = (float) (radio * Math.sin(i));
                //se puede modificar las posicicones
                gl.glVertex2f(a1, b1 );
            }
            gl.glEnd();
    }
 
}
