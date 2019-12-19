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
public class Triangulo {
     GL gl;
   
    float r,g,b;

    public Triangulo(GL gl, float r, float g, float b) {
        this.gl = gl;
        
        this.r=r;
        this.g=g;
        this.b=b;
    }
    
        
    
        public void display(){
    // gl.glPushMatrix();
//     gl.glTranslatef(tx,ty,0);
//      gl.glRotatef(rx, 1, 0, 0);
    //  gl.glRotatef(ry, 0, 1, 0);
//      gl.glRotatef(rz, 0, 0, 1);
//      gl.glScalef(escx, escy, 0);
             
         
            gl.glColor3f(r,g,b);              
            gl.glBegin(gl.GL_TRIANGLES);
//                gl.glVertex2d(0, 0);
//                gl.glVertex2d(1, 0);
//                gl.glVertex2d(1, 1);
//                gl.glVertex2d(0,1);
                
                
                
                
                 gl.glVertex2f(0f, 0.1f);   // Top
           // gl.glColor3f(0.0f, 1.0f);    // Set the current drawing color to green
            gl.glVertex2f(0.2f, 0.3f); // Bottom Left
          //  gl.glColor3f(0.0f, 0.0f);    // Set the current drawing color to blue
            gl.glVertex2f(0.45f, 0.1f); 
           
//
         
            gl.glEnd();
            
           
              
    // gl.glPopMatrix();
     
        
    }
}
