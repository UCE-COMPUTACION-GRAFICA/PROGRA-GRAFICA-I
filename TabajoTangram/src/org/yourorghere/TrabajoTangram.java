/*
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.Animator;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;


/**
 *
 * @author UCE
 */
public class TrabajoTangram extends JFrame{
    static  GL gl;
    static GLU glu;
    
    public  TrabajoTangram(){
        setTitle("Puntos");
        setSize(700,700);
        
        // Intancia de clase GraphicListener
        
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas= new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
        
    }
    
    public static void main(String args[]){
        TrabajoTangram frame = new TrabajoTangram();
        frame.setVisible(true);
        frame.
    setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public class GraphicListener 
            implements GLEventListener{

        @Override
        public void init(GLAutoDrawable arg0) {
            // Activar propiedades 

            
        }

        @Override
        public void display(GLAutoDrawable arg0) {
            glu = new GLU();
            gl = arg0.getGL();
            
            gl.glClearColor(0, 0, 1, 0);
            
            // Establecer los parametros de la proyección
            gl.glMatrixMode(gl.GL_PROJECTION);
            gl.glLoadIdentity();
           glu.gluOrtho2D(0,700,0 ,700);
            
            
            
            // Creación de linea
            // Definir el grosor de la linea
            gl.glLineWidth(7);
          
            // Creacion
            
            
            
            //triangulo rosado
              gl.glColor3f(1f,0.3f,0.5f);
            gl.glBegin(GL.GL_TRIANGLES);
            // Set the current drawing color to red
            gl.glVertex2f(0,0);
             gl.glVertex2f(350,350);
              gl.glVertex2f(0,700);
              
                  gl.glEnd();
                  
                  
                  
            //triangulo celeste
            
             gl.glColor3f(0,1,1);
             
            gl.glBegin(GL.GL_TRIANGLES);
            // Set the current drawing color to red
            gl.glVertex2f(0,700);
             gl.glVertex2f(350,350);
              gl.glVertex2f(700,700);
              
                  gl.glEnd();
        
         
                 // triangulo amarillo
             gl.glColor3f(1,1,0);
             
            gl.glBegin(GL.GL_TRIANGLES);
            // Set the current drawing color to red
            gl.glVertex2f(350,0);
             gl.glVertex2f(700,350);
              gl.glVertex2f(700,0);
              
                  gl.glEnd();
        
                  
                  
              //trapecio
              
              
                gl.glColor3f(0,0,1);
             
            gl.glBegin(GL.GL_POLYGON);
            // Set the current drawing color to red
            gl.glVertex2f(0,0);
             gl.glVertex2f(175,175);
              gl.glVertex2f(525,175);
               gl.glVertex2f(350,0);
              
                  gl.glEnd();
                  
                  
                  //triangulo verde
                  
                    gl.glColor3f(0,1,0);
             
            gl.glBegin(GL.GL_TRIANGLES);
            // Set the current drawing color to red
           
             gl.glVertex2f(175,175);
              gl.glVertex2f(525,175);
             gl.glVertex2f(350,350);
              
                  gl.glEnd();
        
                  
                  //cuadrado rojo
                  
                      gl.glColor3f(1,0,0);
                  gl.glBegin(GL.GL_QUADS);
            // Set the current drawing color to red
            
           gl.glVertex2f(525,525);
             gl.glVertex2f(700,350);
              gl.glVertex2f(525,175);
             gl.glVertex2f(350,350);
              
                  gl.glEnd();
                  
                  
                  //triangulo purpura
                  
                 gl.glColor3f(0.5f,0.2f,0.5f);
                  gl.glBegin(GL.GL_TRIANGLES);
            // Set the current drawing color to red
            
           gl.glVertex2f(525,525);
             gl.glVertex2f(700,700);
              gl.glVertex2f(700,350);
            
              
                  gl.glEnd(); 
                  
                  
                  
              
              
              
              
                  
            
    
        
            
          
              
            
            
            gl.glFlush();

             
        }

        @Override
        public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
            
        }
        @Override
        public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
            
        }
        
    }
    
}
