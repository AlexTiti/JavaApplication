package com.example.administrator.javaapplication.face_design_pattern;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.administrator.javaapplication.MainActivity;
import com.example.administrator.javaapplication.R;

public class FaceDesignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_face_design);
        final WatchMovie watchMovie = new WatchMovie();
        watchMovie.watchMovie();
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                watchMovie.closeMovie();
            }
        },5000);
    }
    public void click(View view){
        startActivity(new Intent(this, MainActivity.class));
    }
}
