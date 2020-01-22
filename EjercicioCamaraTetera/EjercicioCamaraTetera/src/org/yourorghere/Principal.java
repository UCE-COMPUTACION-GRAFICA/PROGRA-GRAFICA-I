package org.yourorghere;

import com.sun.opengl.util.Animator;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.nio.file.Files.size;
import javax.media.opengl.GL;
import javax.media.opengl.GLAutoDrawable;
import javax.media.opengl.GLCanvas;
import javax.media.opengl.GLEventListener;
import javax.media.opengl.glu.GLU;
import com.sun.opengl.util.GLUT;
import java.awt.event.KeyEvent;
import javax.media.opengl.GLCapabilities;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import java.awt.event.KeyListener;



public class Principal extends JFrame implements  KeyListener {
    public static int ncam=1;
   
    GLUT glut;
    Tetera t;
    float cos,sen,angulo;
   float cosa, sena, anguloa;


    public Principal(){
//        setTitle("Puntos");
        setSize(700,700);
        setLocation(10,40);
       
        // Intancia de clase GraphicListener
        
        GraphicListener listener = new GraphicListener();
        GLCanvas canvas= new GLCanvas(new GLCapabilities());
        canvas.addGLEventListener(listener);
        getContentPane().add(canvas);
          Animator animator = new Animator(canvas);
        animator.start();
        
                addKeyListener(this); // Para que canvas reconozca las pulsaciones del teclado
        
    }
    
    public static void main(String[] args) {
        
         Principal frame = new Principal();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
                       
 
    }
 public class GraphicListener implements GLEventListener{
    public void init(GLAutoDrawable drawable) {
        // Use debug pipeline
        // drawable.setGL(new DebugGL(drawable.getGL()));

        GL gl = drawable.getGL();
        System.err.println("INIT GL IS: " + gl.getClass().getName());

        // Enable VSync
        gl.setSwapInterval(1);
        
        // Setup the drawing area and shading mode
        gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        gl.glShadeModel(GL.GL_SMOOTH); // try setting this to GL_FLAT and see what happens.
        
    t=new Tetera(gl,1.5f,-0.6f,-6,0.8f,0.6f,0.3f,0.6f);
    tc=new Teclado();
        
    }

    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
        GL gl = drawable.getGL();
        GLU glu = new GLU();
        glut=new GLUT();

        if (height <= 0) { // avoid a divide by zero error!
        
            height = 1;
        }
        final float h = (float) width / (float) height;
        gl.glViewport(0, 0, width, height);
        gl.glMatrixMode(GL.GL_PROJECTION);
        gl.glLoadIdentity();
        glu.gluPerspective(45.0f, h, 1.0, 20.0);
        gl.glMatrixMode(GL.GL_MODELVIEW);
        gl.glLoadIdentity();
    }


    public void display(GLAutoDrawable drawable) {
        GL gl = drawable.getGL();
       
        // Clear the drawing area
        gl.glClear(GL.GL_COLOR_BUFFER_BIT | GL.GL_DEPTH_BUFFER_BIT);
        // Reset the current matrix to the "identity"
        gl.glLoadIdentity();
        GLU glu= new GLU ();       
             if(ncam==1){
           glu.gluLookAt(t.x+2+Teclado.getTrasladaX(),t.y+2+Teclado.getTrasladaY(),t.z+2,t.x,t.y,t.z,0,1,0);}
             if(ncam==2){
                 //circulo
                glu.gluLookAt(t.x+cos,t.y,t.z+sen,t.x,t.y,t.z,0,1,0);}
             if(ncam==3){
                 //traslada la tetera con eventos de teclado
                glu.gluLookAt(t.x+2,t.y+2,t.z+2,t.x,t.y,t.z,0,1,0);}
             if(ncam==4){
                 //camara en forma eliptiptica
                glu.gluLookAt(t.x+2,t.y+2+cosa,t.z+2+sena,t.x,t.y,t.z,0,1,0);}
              if(ncam==5){
                  //traslada y la camara le sigue
                glu.gluLookAt(t.x+2+Teclado.getTrasladaTeteraX(),t.y+2+Teclado.getTrasladaTeteraY(),t.z+2+Teclado.getTrasladaTeteraZ(),t.x,t.y,t.z,0,1,0);}
             
        // Move the "drawing cursor" around      
       t.dibujarTetera(Teclado.getTrasladaTeteraX(), Teclado.getTrasladaTeteraY(),Teclado.getTrasladaTeteraZ());
          
       //camara que se mueva en forma eliptico
       
       cos=(float)Math.cos(angulo)*3f;
       sen=(float)Math.sin(angulo)*3f;
       angulo+=0.05f;
       
       
       cosa=(float)Math.cos(anguloa)*12f;
       sena=(float)Math.sin(anguloa)*3f;
       anguloa+=0.05f;
       
       
        
       
         
          

        // Flush all drawing operations to the graphics card
        gl.glFlush();
    }

    public void displayChanged(GLAutoDrawable drawable, boolean modeChanged, boolean deviceChanged) {
    }
    
     }
 
  Teclado tc;
    public void keyTyped(KeyEvent e) {
       
       tc.keyTyped(e);
    
        
    }    

    public void keyPressed(KeyEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
  
     tc.keyPressed(e);

    }

    public void keyReleased(KeyEvent ke) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void dibujarElipse(float a, float b, float centroX, float centroY){
        for (int i = 0; i < 2*Math.PI; i++) {
            
        }
    }   
    
    
}

