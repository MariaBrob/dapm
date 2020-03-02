package com.example.hello;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn = (Button) findViewById(R.id.mybutton);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                myFancyMethod(v);
            }
        });

        Log.d(TAG, "Debug - useful debugging message");
        Log.e(TAG, "Error - error message (exceptions that break a component appear as such messages)");
        Log.i(TAG, "I - Information - informative message");
        Log.w(TAG, "Warning - warning message (exceptions that are not very important and do not have an important impact on the component appear as such messages)");
        Log.v(TAG, "Verbose - additional information displayed by the programs (generally on request, they are used to detect problems generally resulting from misconfiguration of programs)");

    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "on start");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "on restart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "on resume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "on pause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "on stop");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "on destroy");

    }

    // some more code
    public void myFancyMethod(View v) {
        Toast.makeText(MainActivity.this,"You pushed the button from on create", Toast.LENGTH_LONG).show();

    }

    public void myFancyMethod1(View v) {
        Toast.makeText(this, "You pushed the button from push function", Toast.LENGTH_SHORT).show();
    }




}
