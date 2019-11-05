/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.Animator;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import static javax.media.opengl.GL.GL_COLOR_BUFFER_BIT;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLCapabilities;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import javax.swing.JFrame;

/**
 *
 * @author UCE
 */
public class Casa extends JFrame {
 float radio,a,b;
    static GL gl;
    static GLU glu;

    public Casa() {
        setTitle("Puntos");
        setSize(700, 700);

        // Intancia de clase GraphicListener
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas = new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);

    }

    public static void main(String args[]) {
        Casa frame = new Casa();
        frame.setVisible(true);
        frame.
                setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public class GraphicListener
            implements GLEventListener {

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
            glu.gluOrtho2D(0, 200, 0, 150);

            // Creación de linea
            // Definir el grosor de la linea
            gl.glLineWidth(7);
            gl.glColor3f(1, 0, 0
            );
            
            
            
            // Creacion
            int x, y, x1, y1;
            x = 0;
            y = 0;

            x1 = 250;
            y1 = 10;
            
            //fondo
            
            
            
             gl.glBegin(gl.GL_QUADS);
            gl.glColor3f(0, 1f, 1f);
            gl.glVertex2d(0, 0);
            gl.glVertex2d(250, 0);
            gl.glVertex2d(250, 180);
            gl.glVertex2d(0, 180);

            gl.glEnd();
            
            
           
            
            //piso

            gl.glBegin(gl.GL_QUADS);

            gl.glColor3f(0, 1, 0);

            //0 a 180 en x
            //0 a 10 en y 
            //piso
            gl.glVertex2d(x, y);
            gl.glVertex2d(x, y1);
            gl.glVertex2d(x1, y1);
            gl.glVertex2d(x1, y);

            //casa
            //punto inicial va a ser (0, 10)
            gl.glEnd();

            gl.glBegin(gl.GL_QUADS);
            gl.glColor3f(0, 0, 1);
            gl.glVertex2d(x + 10, y + 10);
            gl.glVertex2d(x + 10, y1 + 80);
            gl.glVertex2d(x1 / 2, y1 + 80);
            gl.glVertex2d(x1 / 2, y + 10);

            gl.glEnd();
            
            
            //ventanas
            
             gl.glBegin(gl.GL_QUADS);
            gl.glColor3f(0, 1, 1);
            gl.glVertex2d(20,60 );
            gl.glVertex2d(20,80 );
            gl.glVertex2d(50,80 );
            gl.glVertex2d(50,60 );

            gl.glEnd();
            
             gl.glBegin(gl.GL_QUADS);
            gl.glColor3f(0, 1, 1);
            gl.glVertex2d(80,60 );
            gl.glVertex2d(80,80 );
            gl.glVertex2d(110,80 );
            gl.glVertex2d(110,60 );

            gl.glEnd();
            
            
            
            //puerta
            
             

            gl.glBegin(gl.GL_QUADS);
            
            gl.glColor3f(1,0.8f, 0);
            
            gl.glVertex2d(x + 40, y + 10);
            gl.glVertex2d(x + 40, y1 + 45);
            gl.glVertex2d(x1-160, y1 + 45);
            gl.glVertex2d(x1-160, y + 10);

            gl.glEnd();
            
            
            //techo
            
            gl.glBegin(gl.GL_TRIANGLES);
            
            gl.glColor3f(0,0, 0);
            
            gl.glVertex2d(10,90);
            gl.glVertex2d(125,90);
            gl.glVertex2d(67.5,140);

            gl.glEnd();
            
            //arbol tronco
            gl.glBegin(gl.GL_QUADS);
            
            gl.glColor3f(1,0.5f, 0);
            
            gl.glVertex2d(150,10);
            gl.glVertex2d(150,90);
            gl.glVertex2d(180,90);
            gl.glVertex2d(180,10);
            

            gl.glEnd();
            
             //arbol techo
            
            
           
            
            
            
            
            
           
            
            
            
             gl.glBegin(gl.GL_TRIANGLES);
            
            gl.glColor3f(0,1, 0);
            
            
            gl.glVertex2d(130,90);
            gl.glVertex2d(200,90);
            gl.glVertex2d(165,130);
            
           

            gl.glEnd();
          
            
            gl.glBegin(gl.GL_TRIANGLES);
            
            gl.glColor3f(0,1, 0);
            
            
            gl.glVertex2d(130,70);
            gl.glVertex2d(200,70);
            gl.glVertex2d(165,130);
            
           

            gl.glEnd(); 
            
            gl.glBegin(gl.GL_TRIANGLES);
            
            gl.glColor3f(0,1, 0);
            
            
            gl.glVertex2d(130,50);
            gl.glVertex2d(200,50);
            gl.glVertex2d(165,130);
            
           

            gl.glEnd();
            
            
            
            
            
            //otro arbol
            
            
            
            
            
            
//arbol tronco

            gl.glBegin(gl.GL_QUADS);
            
            gl.glColor3f(1,0.7f, 0);
            
            gl.glVertex2d(160,10);
            gl.glVertex2d(175,10);
            gl.glVertex2d(175,45);
            
            gl.glVertex2d(160,45);
            

            gl.glEnd();
            
            
            
            // cabeza del arbol
            
             gl.glBegin(gl.GL_TRIANGLES);
            
            gl.glColor3f(0,0.8f, 0);
            
            
            gl.glVertex2d(150,40);
            gl.glVertex2d(185,40);
            gl.glVertex2d(167.5f,80);
            
           

            gl.glEnd();
            
            
            gl.glBegin(gl.GL_TRIANGLES);
            
            gl.glColor3f(0,0.8f, 0);
            
            
            gl.glVertex2d(150,50);
            gl.glVertex2d(185,50);
            gl.glVertex2d(167.5f,90);
            
           

            gl.glEnd();
            
            gl.glBegin(gl.GL_TRIANGLES);
            
            gl.glColor3f(0,0.8f, 0);
            
            
            gl.glVertex2d(150,60);
            gl.glVertex2d(185,60);
            gl.glVertex2d(167.5f,100);
            
           

            gl.glEnd();
            
            
            // gl.glClear(GL_COLOR_BUFFER_BIT);
             gl.glBegin(GL.GL_POLYGON);
            // Set the current drawing color to red
            
          gl.glColor3f(1,1, 0);
           radio=15;
            for (float i = 0; i < 10; i+=0.01f) {
                 a=(float) (Math.cos(i)*radio);
                b=(float) (radio*Math.sin(i));
                 gl.glVertex2f(a+120, b+125); 
                  
            }
           
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
