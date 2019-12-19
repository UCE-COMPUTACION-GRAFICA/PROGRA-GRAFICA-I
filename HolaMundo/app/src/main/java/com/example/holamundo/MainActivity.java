/*package com.example.holamundo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import android.os.Bundle;

import javax.microedition.khronos.opengles.GL10;


public class MainActivity extends AppCompatActivity {

    private GLSurfaceView mGLSurfaceView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mGLSurfaceView = new CustomGLSurfaceView(this);
        setContentView(mGLSurfaceView);
    }


    class GLRenderer implements GLSurfaceView.Renderer {
        private  Triangule mTriangule;


        // Para rotar

        private float[] mRotationMatrix = new float[16];

        // Para la camara

        private  final  float[]  mMVPMatrix = new float[16];
        private  final  float[]  mProjectionMatrix = new float[16];
        private  final  float[]  mViewMatrix = new float[16];


        @Override
        public void onDrawFrame(GL10 gl) {
            GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
            mTriangule.draw();
        }



        @Override
        public void onSurfaceCreated(GL10 gl, javax.microedition.khronos.egl.EGLConfig config) {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            mTriangule = new Triangule();
        }

        @Override
        public void onSurfaceChanged(GL10 unused, int width, int height) {
            GLES20.glViewport(0, 0, width, height);
            float ratio = (float) width / height;
            // Camara
            Matrix.frustumM(mProjectionMatrix,0,-ratio,ratio,-1,1,3,7);
        }


    }

    class CustomGLSurfaceView extends GLSurfaceView{
        private  final  GLRenderer mGLRenderer;

        public  CustomGLSurfaceView(Context context){
            super(context);
            setEGLContextClientVersion(2);
            mGLRenderer = new GLRenderer();
            setRenderer(mGLRenderer);
        }

    }
}
*/



package com.example.holamundo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;

import android.graphics.Path;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new MyView(this));
    }

    public class MyView extends View {


        public MyView(Context context) {
            super(context);
        }

        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            Paint paint=new Paint();
            paint.setStyle(Paint.Style.FILL);

            paint.setColor(Color.parseColor("#0040FF"));
            canvas.drawRect(300,800,600,500,paint);


            //circulo


            int x= getWidth();
            int y=getHeight();
            int radio;
            radio=100;

            paint.setColor(Color.parseColor("#FF0000"));

            canvas.drawCircle(x/2, y/2, radio, paint);


            //triangulo

            Path path=new Path();
            path.moveTo(300,400);
            path.lineTo(600,400);
            path.lineTo(450,50);

            paint.setColor(Color.parseColor("#000000"));

            canvas.drawPath(path, paint);


        }
    }
}



//circulo