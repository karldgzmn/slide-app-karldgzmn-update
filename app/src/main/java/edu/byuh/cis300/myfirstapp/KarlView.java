/**package edu.byuh.cis300.myfirstapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class KarlView extends View {

    private Paint momo;
    private Paint alema;

    public KarlView(Context c){
        super(c);
        momo = new Paint();
        momo.setColor(Color.BLUE);
        momo.setStyle(Paint.Style.STROKE);
        alema = new Paint();
        alema.setColor(Color.RED);
        alema.setStyle(Paint.Style.STROKE);


    }
    @Override
    public void onDraw(Canvas c) {
        super.onDraw(c);
        float w = getWidth();
        float h = getHeight();
        float rectLeft = w * 0.25f;
        float recRight = w * 0.5f;
        float rectTop = h * 0.2f;
        float rectBottom = h * 0.6f;
        momo.setStrokeWidth(getWidth() * 0.02f);
        alema.setStrokeWidth(getWidth() *0.02f);
        c.drawColor(Color.GREEN);
        c.drawRect(rectLeft, rectTop, recRight, rectBottom,momo);
        c.drawLine(w * 0.4f,h * 0.3f,w*0.8f,h *.8f,alema );
    }
}
 */