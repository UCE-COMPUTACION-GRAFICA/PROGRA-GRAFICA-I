/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.GLUT;
import javax.media.opengl.GL;

/**
 *
 * @author Alison
 */
public class Tetera {
    float x,y,z;
    float size;
    float r,g,b;
    GL gl;
    
    float mover_x;
    float mover_y;
    float mover_z;

    public Tetera(GL gl,float x, float y, float z, float size, float r, float g, float b) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.size = size;
        this.r = r;
        this.g = g;
        this.b = b;
        this.gl=gl;
    }
    
    public void dibujarTetera(float trasladaTeteraX,float trasladaTeteraY,float trasladaTeteraZ){
        GLUT glut=new GLUT();
        gl.glTranslatef(x,y,z);
        gl.glTranslatef(trasladaTeteraX,trasladaTeteraY,trasladaTeteraZ);
       
         gl.glColor3f(1,1,0);
         
         glut.glutWireTeapot(size);
     
         
        // gl.glTranslatef(mover_x,mover_y ,mover_z );
         
    }
    public void otraFigura(){
        GLUT glut=new GLUT();
         gl.glTranslatef(x,y,z);
        glut.glutSolidTeapot(size/7);
    }
    
    

   
    
    
    
    
    
}
