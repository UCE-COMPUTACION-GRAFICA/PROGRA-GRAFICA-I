/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import com.sun.opengl.util.Animator;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
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
public class Casa extends JFrame implements GLEventListener, KeyListener {

    float cont = -125;
    float cont2 = -125;
    float cont3 = 20;
    float radio;

    private static float trasladax = -125;

    private static float trasladay = 0;
    private static boolean dia = true;

    
    static GL gl;
    static GLU glu;
       Fondo fon=new Fondo();
       Estrellas es=new Estrellas();
       Circulo cir=new Circulo();
       Persona per=new Persona();
       Cuadrado cua=new Cuadrado();
       Cuerpo cuer=new Cuerpo();
       Auto au=new Auto();
       Semicirculo semcir=new Semicirculo();
       Nubes nub=new Nubes();
       Casita cas=new Casita();
       ArbolGrande arbgra=new ArbolGrande();
       ArbolPeque arbpe=new ArbolPeque();
       TroncoGrande troncgra=new TroncoGrande();
       PisoG pis=new PisoG();
       FondoCarretera fondca=new FondoCarretera();
       CarreteraG carrg=new CarreteraG();
       LineaCarretera linca=new LineaCarretera();
       
       

    public Casa() {
        //Frame frame = new Frame();
        //frame.setTitle("Casa");

        setSize(900, 700);

        // Intancia de clase GraphicListener
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas = new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
        final Animator animator = new Animator(canvas);
        addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                // Run this on another thread than the AWT event queue to
                // make sure the call to Animator.stop() completes before
                // exiting
                new Thread(new Runnable() {

                    public void run() {
                        animator.stop();
                        System.exit(0);
                    }
                }).start();
            }
        });
        // Center frame
        //frame.setLocationRelativeTo(null);
        // frame.setVisible(true);
        animator.start();
        addKeyListener(this);
        
        
       
        
    }

    public static void main(String args[]) {
        Casa frame = new Casa();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
         
    }

    @Override
    public void keyTyped(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_RIGHT) {

            if (trasladax < 20) {
                trasladax += 0.4f;
            }

            System.out.println("Valor en la traslacion de X: " + trasladax);
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {

            if (trasladax > -125) {
                trasladax -= 0.4f;
            }
        }

        if (e.getKeyCode() == KeyEvent.VK_DOWN) {

            if ((trasladay >= 0)) {
                trasladay -= 0.2f;
            }

        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            if (trasladay <= 28) {
                trasladay += 0.2f;
            }

        }

        //cambio de día a noche
        if (e.getKeyCode() == KeyEvent.VK_D) {

            dia = true;

        }
        if (e.getKeyCode() == KeyEvent.VK_N) {
            dia = false;
        }

        //cambio de posición del auto co la letra p
        if (e.getKeyCode() == KeyEvent.VK_P) {
            //trasladarlo a la posición inicial
            trasladax = -125;
            trasladay = 0;

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void init(GLAutoDrawable drawable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public class GraphicListener
            implements GLEventListener {

        @Override
        public void init(GLAutoDrawable arg0) {
            // Activar propiedades 
                            


        }

        @Override
        public void display(GLAutoDrawable arg0) {
            
             //objetos
          
            
            
            
            glu = new GLU();
            gl = arg0.getGL();

            gl.glClearColor(0, 0, 1, 0);

            gl.glMatrixMode(gl.GL_MODELVIEW);
            gl.glLoadIdentity();

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
            //fondo
            if (dia) {
                gl.glColor3f(0f, 1, 1f);
                fon.fondo();
            } else {
                gl.glColor3f(0, 0, 0.3f);
                fon.fondo();
                es.estrellas();

            }

            gl.glPushMatrix();
            gl.glScalef(1, 4, 0);
            pis.piso();
            gl.glPopMatrix();

            //arbol más grande
            gl.glPushMatrix();
            gl.glScalef(0.7f, 0.8f, 0f);
            gl.glTranslatef(70, 40, 0);
            troncgra.troncogrande();
            gl.glColor3f(0, 0.9f, 0);
            arbgra.arbolgrande();
            gl.glPopMatrix();

            //arbol derecha
            gl.glPushMatrix();
            gl.glScalef(0.7f, 0.8f, 0);
            gl.glTranslatef(100, 37, 0);
            gl.glColor3f(0, 0.9f, 0);
            arbpe.arbolpeque();
            gl.glPopMatrix();

            //casa
            gl.glPushMatrix();
            gl.glScalef(0.6f, 0.6f, 0f);
            gl.glTranslatef(-10, 50, 0);
            cas.casa();
            gl.glTranslatef(122, 0, 0);
            cas.casa();
            gl.glPopMatrix();

            //sol
            if (dia) {
                gl.glColor3f(1, 1, 0);
            } else {
                gl.glColor3f(1, 1, 1);
            }

            radio = 12.5f; //un radio para el círculo
            cir.circulo( radio );

            //nubes 1
            if (dia) {
                gl.glPushMatrix();
                gl.glTranslatef(cont, 0, 0); //tope a la izquierda -125 y derecha 20
                nub.nubes();
                gl.glPopMatrix();

                //nubes 2
                gl.glPushMatrix();
                gl.glTranslatef(cont3, 0, 0); //tope a la izquierda -125 y derecha 20
                nub.nubes();
                gl.glPopMatrix();
            }

            carrg.carretera();
            //persona
            per.persona();

            // auto morado
            gl.glColor3f(0.7f, 0.2f, 0.9f);
            gl.glPushMatrix();
            gl.glTranslatef(cont3, 18, 0);
            au.auto();
            gl.glPopMatrix();

            //auto red
            gl.glPushMatrix();
            gl.glTranslatef(trasladax, trasladay, 0);
            gl.glColor3f(1, 0, 0);
            au.auto();
            gl.glPopMatrix();

            //movimiento de las nubes
            cont2 = (float) (cont2 + 0.1f);

            if ((cont2 >= 20)) {
                cont = (float) (cont - 0.1f);
                cont3 = (float) (cont3 + 0.1f);

            } else {
                cont = (float) (cont + 0.1f);
                cont3 = (float) (cont3 - 0.1f);

            }

            if (cont == -125) {
                cont2 = -125;
            }

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
