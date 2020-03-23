package com.example.dapm_lab6;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        MySharedPreference mySharedPreference = new MySharedPreference(SecondActivity.this);
        TextView text = findViewById(R.id.textView);

        text.setText(mySharedPreference.getValue() + '\n' + getIntent().getStringExtra("name"));


    }

}
