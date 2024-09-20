package edu.byuh.cis300.myfirstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import edu.byuh.cis300.myfirstapp.TedView;

public class MainActivity extends AppCompatActivity {

    private TedView tv;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        tv = new TedView(this);
        setContentView(tv);
    }
}