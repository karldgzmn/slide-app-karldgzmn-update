package edu.byuh.cis300.myfirstapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class KarlView extends View {

    private Paint teddy;
    private Paint vanessa;
    private Bitmap duckImg;
    private boolean initialized;
    private Duck fah;

    public KarlView(Context c) {
        super(c);
        initialized = false;
        teddy = new Paint();
        teddy.setColor(Color.BLACK);
        teddy.setStyle(Paint.Style.STROKE);
        vanessa = new Paint();
        vanessa.setColor(Color.BLACK);
        duckImg = BitmapFactory.decodeResource(getResources(), R.drawable.duck);

    }

    @Override
    public void onDraw(Canvas c) {
        super.onDraw(c);
        float w = getWidth();
        float h = getHeight();
        float rectLeft = w * 0.1f;
        float rectRight = w * 0.9f;
        float rectTop = h * 0.25f;
        float rectBottom = h * 0.75f;
        if (!initialized) {
            //int duckSize = (int)(w * 0.25);
            //duckImg = Bitmap.createScaledBitmap(duckImg, duckSize, duckSize, true);
            fah = new Duck(getResources(), w);
            fah.setLocation(w * 0.5f, h * 0.6f);
            teddy.setStrokeWidth(getWidth() * 0.01f);
            vanessa.setStrokeWidth(getWidth() * 0.01f);
            initialized = true;
        }

        c.drawColor(Color.WHITE);
        c.drawRect(rectLeft, rectTop, rectRight ,rectBottom, teddy);
        c.drawLine(w * 0.26f, h * 0.25f, w * 0.26f, h * 0.75f, vanessa);
        c.drawLine(w * 0.42f, h * 0.25f, w * 0.42f, h * 0.75f, vanessa);
        c.drawLine(w * 0.58f, h * 0.25f, w * 0.58f, h * 0.75f, vanessa);
        c.drawLine(w * 0.74f, h * 0.25f, w * 0.74f, h * 0.75f, vanessa);
        c.drawLine(w * 0.1f, h * 0.35f, w * 0.9f, h * 0.35f, vanessa);
        c.drawLine(w * 0.1f, h * 0.45f, w * 0.9f, h * 0.45f, vanessa);
        c.drawLine(w * 0.1f, h * 0.55f, w * 0.9f, h * 0.55f, vanessa);
        c.drawLine(w * 0.1f, h * 0.65f, w * 0.9f, h * 0.65f, vanessa);
        //c.drawBitmap(duckImg, w*0.25f, h*0.5f, vanessa);
        fah.draw(c);
    }
}