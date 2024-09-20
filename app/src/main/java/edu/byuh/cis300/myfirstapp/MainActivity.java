package edu.byuh.cis300.myfirstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import edu.byuh.cis300.myfirstapp.KarlView;

public class MainActivity extends AppCompatActivity {

    private KarlView tv;

    @Override
    protected void onCreate(Bundle b) {
        super.onCreate(b);
        tv = new KarlView(this);
        setContentView(tv);
    }
}