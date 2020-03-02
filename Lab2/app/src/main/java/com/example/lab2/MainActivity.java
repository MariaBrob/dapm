package com.example.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "merge");

        Button btn = (Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                login(v);
            }
        });

        EditText user = (EditText) findViewById(R.id.username);
        EditText pass = (EditText) findViewById(R.id.pass);
    }

    public void login(View v) {

        EditText user = (EditText) findViewById(R.id.username);
        EditText pass = (EditText) findViewById(R.id.pass);

        String username = user.getText().toString();
        String password = pass.getText().toString();

        if(username.equals("student") && password.equals("student")) {
            openActivity();
        }
        else {
            Toast.makeText(MainActivity.this,"Wreong credentials", Toast.LENGTH_LONG).show();
        }
    }

    public void openActivity() {
        Intent i = new Intent(MainActivity.this,FindTheNumberActivity.class);
        startActivity(i);

    }
}
