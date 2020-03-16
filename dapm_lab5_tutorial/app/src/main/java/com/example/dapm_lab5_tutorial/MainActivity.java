package com.example.dapm_lab5_tutorial;

import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;

public class MainActivity extends Activity {

    GridView simpleGrid;
    int animals[] = {
            R.drawable.snap_the_cat,
            R.drawable.snap_the_cat,
            R.drawable.snap_the_cat,
            R.drawable.snap_the_cat,
            R.drawable.snap_the_cat,
            R.drawable.snap_the_cat,
            R.drawable.snap_the_cat,
            R.drawable.snap_the_cat,
            R.drawable.snap_the_cat
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        simpleGrid = (GridView) findViewById(R.id.simpleGridView);
        CustomAdapter customAdapter = new CustomAdapter(getApplicationContext(), animals);
        simpleGrid.setAdapter(customAdapter);
    }
}