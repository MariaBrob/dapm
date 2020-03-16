package com.example.dapm_lab5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView listOfCars;
    CarAdapter carAdapter;
    private EditText addNewCar;
    private Button addButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //TODO 1
        listOfCars = findViewById(R.id.lv_list_cars);

        //TODO 2
        carAdapter = new CarAdapter(MainActivity.this);

        //TODO 3
        listOfCars.setAdapter(carAdapter);

        //TODO 4
        carAdapter.addCar("Dacia Logan", R.drawable.lab5_car_icon);
        carAdapter.addCar("Dacia Duster", R.drawable.lab5_car_icon);
        carAdapter.addCar("Honda Civic", R.drawable.lab5_car_icon);
        carAdapter.addCar("Volkswagen Golf", R.drawable.lab5_car_icon);

        //TODO ex8
        addNewCar = (EditText) findViewById(R.id.ed_new_car);
        addButton = (Button) findViewById(R.id.b_add_car);

        addButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                String name = addNewCar.getText().toString();

                carAdapter.addCar(name, R.drawable.lab5_car_icon);
                addNewCar.setText("");
            }
        });

    }
}

class Car {
    String name;
    int imageResource;
}

class TagCar{
    TextView name;
    ImageView image;
}