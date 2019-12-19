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
public class casa {
    GL gl;

    public casa(GL gl) {
        this.gl = gl;
    }
   Cuadrado d=new Cuadrado(gl, 1,1,0.5f);
   
    
    public void casa1() {
           
        d.display();
        
        }
}
