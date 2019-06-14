package com.example.displayshapeswithgraphics;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView( new MyLayout(this) );
    }

    class MyLayout extends View {

        public MyLayout(Context context) {
            super(context);
        }
        Paint paint=new Paint();
        @Override
        protected void onDraw(Canvas canvas) {
            super.onDraw(canvas);

            paint.setColor(Color.YELLOW);
            paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(100,100,75,paint);

            paint.setColor(Color.RED);
            paint.setStyle(Paint.Style.FILL);
            canvas.drawRect(50,50,200,100,paint);
        }
    }
}
