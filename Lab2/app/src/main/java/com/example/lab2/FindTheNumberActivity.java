package com.example.lab2;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

import static android.graphics.BlendMode.COLOR;

public class FindTheNumberActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_the_number);

        Button btn = (Button) findViewById(R.id.guessButton);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                guess(v);
            }
        });

        EditText guess_no = (EditText) findViewById(R.id.guess_no);



    }

    Random r = new Random();
    int low = 0;
    int high = 10;
    int result = r.nextInt(high-low) + low;

    public void guess(View v) {

        EditText g = (EditText) findViewById(R.id.guess_no);
        Integer guess_no = Integer.parseInt(g.getText().toString());
        Button btn = (Button) findViewById(R.id.guessButton);


        String tt = Integer.toString(result);
        Log.d(TAG, tt);
        if(guess_no > result) {
            Toast.makeText(FindTheNumberActivity.this,"Lower", Toast.LENGTH_LONG).show();
        } else {
            if(guess_no < result) {
                Toast.makeText(FindTheNumberActivity.this,"Higher", Toast.LENGTH_LONG).show();
            } else {
                Random r = new Random();
                int low = 0;
                int high = 10;
                int result = r.nextInt(high-low) + low;
                Log.d(TAG, tt);

                btn.setBackgroundColor(Color.parseColor("#0000FF"));


                Toast.makeText(FindTheNumberActivity.this,"You guessed \n You can guess again", Toast.LENGTH_LONG).show();
            }
        }

    }

}
