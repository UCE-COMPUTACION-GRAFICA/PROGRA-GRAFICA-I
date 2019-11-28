package org.yourorghere;

import static com.sun.java.accessibility.util.AWTEventMonitor.addKeyListener;
import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;

/**
 * Ejercicio.java <BR>
 * author: Brian Paul (converted to Java by Ron Cemer and Sven Goethel)
 * <P>
 *
 * This version is equal to Brian Paul's version 1.2 1999/10/21
 */
public class Ejercicio implements GLEventListener, KeyListener {

    float count = -1.9f, cont = -1.9f;
    float count1=0.9f;
    float radio;
    circulo c1, c2,c3;

    public Ejercicio() {
        addKeyListener(this);
    }

    public static void main(String[] args) {
        Frame frame = new Frame("Simple JOGL Application");
        GLCanvas canvas = new GLCanvas();

        canvas.addGLEventListener(new Ejercicio());
        frame.add(canvas);
        frame.setSize(700, 700);
        final Animator animator = new Animator(canvas);
        frame.addWindowListener(new WindowAdapter() {

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
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        animator.start();

    }

    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));
//
//        GL gl = drawable.getGL();
//        System.err.println("INIT GL IS: " + gl.getClass().getName());
//
//        // Enable VSync
//        gl.setSwapInterval(1);
//
//        // Setup the drawing area and shading mode
//        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
//        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
//        GL gl = drawable.getGL();
//        GLU glu = new GLU();
//
//        if (height <= 0) { // avoid a divide by zero error!
//        
//            height = 1;
//        }
//        final float h = (float) width / (float) height;
//        gl.glViewport(0, 0, width, height);
//        gl.glMatrixMode(GL.GL_PROJECTION);
//        gl.glLoadIdentity();
//        glu.gluPerspective(45.0f, h, 1.0, 20.0);
//        gl.glMatrixMode(GL.GL_MODELVIEW);
//        gl.glLoadIdentity();
    }
    boolean arriba = true, abajo = false;
    float limite_sup = 0.9f;
GL gl;
float m1;
        float m2;
float tx,ty;
boolean izquierda=false, derecha=true;
    public void display(GLAutoDrawable drawable) {
        gl = drawable.getGL();

        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();

        // Move the "drawing cursor" around
        //gl.glTranslatef(-1.5f, 0.0f, -6.0f);
        // Drawing Using Triangles
//        gl.glPushMatrix();
//        gl.glRotatef(count, 1, 0, 0);
//        gl.glBegin(GL.GL_TRIANGLES);
//            gl.glColor3f(1.0f, 0.0f,0f);    // Set the current drawing color to red
//            gl.glVertex2f(0.5f, 1.0f);   // Top
//           // gl.glColor3f(0.0f, 1.0f);    // Set the current drawing color to green
//            gl.glVertex2f(-0.8f, -1.0f); // Bottom Left
//          //  gl.glColor3f(0.0f, 0.0f);    // Set the current drawing color to blue
//            gl.glVertex2f(0.8f, -1.0f);  // Bottom Right
//        // Finished Drawing The Triangle
//        gl.glEnd();
//    gl.glPopMatrix();
        // public Cuadrado(GL gl, float tx, float ty, float rx, float ry, float rz, float escx, float escy, float r, float g, float b) {
//     gl.glPushMatrix();
//    gl.glRotatef(count, 1, 0, 0);
//    gl.glScalef(1.5f, 1.5f, 0);
//    gl.glTranslatef(-0.5f, 0, 0);
//    Cuadrado nuevo=new Cuadrado(gl,1,0,1);
//    nuevo.display();
//    gl.glPopMatrix();
       
        
        
      //orbitas
     orbitas(0.01f,1,1);
      orbitas(0.01f,0.8f,0.8f);
       orbitas(0.01f,0.6f,0.6f);
         orbitas(0.01f,0.4f,0.4f);
        orbitas(0.01f,0.2f,0.2f);
      
        //planetas
        //sol
        
       crear_planeta(0.1f, 0,0, 1,1,0);
       
       //segundo planeta
       gl.glPushMatrix();
        m1 = (float) (Math.cos(cont) * 0.9f);
        m2 = (float) (0.9f * Math.sin(cont));
            gl.glTranslatef(m1+0.35f,m2 ,0);
              crear_planeta(0.05f, -0.36f,0,0.8f, 0f, 0.9f);
              
       gl.glPopMatrix();
       
       //tercer planeta
      gl.glPushMatrix();
        m1 = (float) (Math.cos(cont) * 0.6f);
        m2 = (float) (0.6f * Math.sin(cont));
        
            gl.glTranslatef(m1+0.45f,m2 ,0);
         crear_planeta(0.05f, -0.54f,0,1, 0.5f, 0.3f);
              
       gl.glPopMatrix();
  
         
      gl.glPushMatrix();
        m1 = (float) (Math.cos(cont) * 0.6f);
        m2 = (float) (0.6f * Math.sin(cont));
            gl.glTranslatef(m1+0.85f,m2 ,0);
     crear_planeta(0.05f, -0.73f,0,1, 0f, 0.3f);
              
       gl.glPopMatrix();
      
      
      
        cont=cont+0.1f;
        
      //crear asteroide
      radio=0.05f;
      
        gl.glPushMatrix();
       gl.glScalef(0.5f, 1.1f, 0);
       
        gl. glTranslatef(count,0,0);
            c1 = new circulo(gl, 1, 0.8f, 0.9f);
            c1.display(radio);
        gl.glPopMatrix();
        
        if (cont<=1.9f && derecha==true ){
            count=count+0.1f;
            //izquierda=false;
        }else{
            count=count-0.1f;
            derecha=false;
           izquierda=true;
            if(count==-1.9f && izquierda==true){
                
            count=count+0.1f;
            derecha=true;
            izquierda=false;
        }
        }
            
      
      
      
      
        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }
float a1,b1;
    public void orbitas(float radio,float x, float y){
     for (float i = 0; i < 10; i += 0.01f) {
               
      
                //para crear los lados de cada poligono
                a1 = (float) (Math.cos(i) * 0.9f);
                b1 = (float) (0.9f * Math.sin(i));
                //se puede modificar las posicicones
                gl.glPushMatrix();
                gl.glScalef(x, y, 0);
                
                
                gl.glTranslatef(a1,b1, 0);
                c2 = new circulo(gl, 1, 1, 1);
        c2.display(radio);
         gl.glPopMatrix();
            }
    }
    
    
    public void crear_planeta(float radio, float tx, float ty, float r, float g, float b){
        gl.glPushMatrix();
        gl. glTranslatef(tx, ty,0);
            c1 = new circulo(gl, r, g, b);
            c1.display(radio);
        gl.glPopMatrix();
    }
    
    
    public void mover_planeta(){
            
    }
    
    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }

    public void keyTyped(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void keyPressed(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void keyReleased(KeyEvent ke) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
