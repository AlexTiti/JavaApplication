package com.example.administrator.javaapplication.modle_design_pattern;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.administrator.javaapplication.R;

public class ModleDesignActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_modle_design);
        ITWorker itWorker = new ITWorker("Alex");
        itWorker.workOneDay();
        HRWorker hrWorker = new HRWorker("Titi");
        hrWorker.workOneDay();
    }
}
