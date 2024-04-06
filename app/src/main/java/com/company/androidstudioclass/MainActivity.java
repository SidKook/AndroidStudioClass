package com.company.androidstudioclass;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String firstName = "Sid";

        // Displaying Logs
        Log.d(TAG,"My Name is " + firstName);
        // Log.e(TAG,"My Name is sid");

        String lastName = "Kukert";

        Log.d(TAG,"My full name is " + firstName + " " + lastName);

        Integer myFavoriteNumber = 34;

        Log.d(TAG,"My favorite number is " + myFavoriteNumber);

        Integer mySecondNumber = 17;

        Integer bothNumbers = myFavoriteNumber + mySecondNumber;

        Log.d(TAG,"Both numbers = " + bothNumbers);

        String myThirdNumber = "15";

        myFavoriteNumber = myFavoriteNumber + mySecondNumber + Integer.valueOf(myThirdNumber);

        Log.d(TAG,"My new favorite number = " + myFavoriteNumber);


        TextView myNameIsTV = findViewById(R.id.MyNameTextView);

        myNameIsTV.setText("I like burgers");
        myNameIsTV.setTextColor(Color.RED);
        myNameIsTV.setTextSize(50);

        EditText myNameET = findViewById(R.id.nameEditText);

        myNameET.setTextColor(Color.GREEN);
        myNameET.setTextSize(15);
    }
}