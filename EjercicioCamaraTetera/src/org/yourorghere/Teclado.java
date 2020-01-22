/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.yourorghere;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.media.opengl.GL;

/**
 *
 * @author Alison
 */
public class Teclado implements KeyListener {

    static GL gl;

    private static float trasladaX = 0;
    private static float trasladaY = 0;
    private static float trasladaZ = 0;

    private static float escalaX = 1;
    private static float escalaY = 1;

    private static float rotarX = 0;
    private static float rotarY = 0;
    private static float rotarZ = 0;

    static boolean validargiro = false;

    public static float getTrasladaTeteraX() {
        return trasladaTeteraX;
    }

    public static float getTrasladaTeteraY() {
        return trasladaTeteraY;
    }
     public static float getTrasladaTeteraZ() {
        return trasladaTeteraZ;
    }
    
    private static float trasladaTeteraX=0;
    private static float trasladaTeteraY=0;
    private static float trasladaTeteraZ=0;

    public static float getTrasladaX() {
        return trasladaX;
    }

    public static float getTrasladaY() {
        return trasladaY;
    }

    public static float getTrasladaZ() {
        return trasladaZ;
    }

    public static float getRotarX() {
        return rotarX;
    }

    public static void rotarY(GL gl) {
        rotarY += 0.8f;
        gl.glRotatef(rotarY, 0, 1, 0);
    }

    @Override
    public void keyTyped(KeyEvent e) {
             if (e.getKeyChar() == '1') {
            Principal.ncam = 1;
            
        }

        if (e.getKeyChar() == '2') {
            Principal.ncam = 2;
        }
        
         if (e.getKeyChar() == '3') {
            Principal.ncam = 3;
        }
         if (e.getKeyChar() == '4') {
            Principal.ncam = 4;
        }
         if (e.getKeyChar() == '5') {
            Principal.ncam = 5;
        }
          if (e.getKeyChar() == '6') {
            Principal.ncam = 6;
        }
    }

    @Override
    public void keyPressed(KeyEvent e) {
            if (e.getKeyCode()==KeyEvent.VK_UP) {
                trasladaY+=0.1f;
                
            }
            if (e.getKeyCode()==KeyEvent.VK_DOWN) {
                trasladaY-=0.1f;
            }
            if (e.getKeyCode()==KeyEvent.VK_LEFT) {
                trasladaX+=0.1f;
            }
            if (e.getKeyCode()==KeyEvent.VK_RIGHT) {
                trasladaX-=0.1f;
            }
            
             if (e.getKeyCode()==KeyEvent.VK_A) {
                 //mueve la tetera en x a la izquierda
                 
                trasladaTeteraX-=0.1f;
                
            }
             
              if (e.getKeyCode()==KeyEvent.VK_S) {
                 //mueve la tetera en x a la derecha
                  trasladaTeteraX+=0.1f;
                
            }
               if (e.getKeyCode()==KeyEvent.VK_E) {
                 //mueve la tetera en y hacia arriba
                  trasladaTeteraY+=0.1f;
                
            }
                if (e.getKeyCode()==KeyEvent.VK_D) {
                 //mueve la tetera en y hacia abajo
                  trasladaTeteraY-=0.1f;
                
            }
                
                   if (e.getKeyCode()==KeyEvent.VK_Q) {
                 //mueve la tetera en z positiva
                  trasladaTeteraZ+=0.1f;
                
            }
                if (e.getKeyCode()==KeyEvent.VK_W) {
                 //mueve la tetera en z negativo
                  trasladaTeteraZ-=0.1f;
                
            }
             
             
       
        salir(e);
    }

    @Override
    public void keyReleased(KeyEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void salir(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            System.exit(0);
        }
    }

}
