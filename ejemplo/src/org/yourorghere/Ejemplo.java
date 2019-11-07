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
public class Ejemplo extends JFrame {

    static GL gl;
    static GLU glu;

    public Ejemplo() {
        setTitle("Puntos");
        setSize(700, 700);

        // Intancia de clase GraphicListener
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas = new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);

    }

    public static void main(String args[]) {
        Ejemplo frame = new Ejemplo();
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
            //Primero colocamos la matriz de modelo vista
            gl.glMatrixMode(gl.GL_MODELVIEW);
            gl.glLoadIdentity();  //colocamos siempre esta función para cargar la matriz de identidad y resetear.
            //Luego una vez que se haya visualizado el modelo se puedo proceder a las proyecciones
            gl.glMatrixMode(gl.GL_PROJECTION);
            gl.glLoadIdentity(); //de la misma manera es necesario cargar la matriz de indentidad para evitarnos inconvenientes.

            glu.gluOrtho2D(0, 700, 0, 700); 

            // Creación de linea
            // Definir el grosor de la linea
            gl.glLineWidth(7);

            
            // En esta sección se puede ver el proceso de transformación de un triangulo, al cual se escalo, rotó y trasladó.
            //Mantiene el orden en el que OpenGL realiza las operaciones.
            gl.glPushMatrix(); //Usamos esta función para duplicar en la pila la matriz,la coloca en la parte superior y trabaja sobre esta sin afectar a la original
            gl.glScalef(0.5f, 0.5f, 0.5f); //escalamos el triangulo
            gl.glRotatef(150, 0, 0, 1); //rotamos el triangulo
            gl.glTranslatef(-400, -1500, 1); //Finalmente trasladamos el triangulo a otra posición
            gl.glColor3f(1f, 0.3f, 0.5f); //Defnimos un color para el triangulo creado.
            gl.glBegin(GL.GL_TRIANGLES);  //Creamos el triangulo en su posición inicial.
                gl.glVertex2f(0, 0);
                gl.glVertex2f(350, 350);
                gl.glVertex2f(0, 700);
            gl.glEnd();

            gl.glPopMatrix(); //Eliminamos la matriz superior, y nos quedamos con la original.
            

         

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
