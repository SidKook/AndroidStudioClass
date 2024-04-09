package com.company.androidstudioclass;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Switch;
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

        EditText passwordET = findViewById(R.id.passwordEditText);


        Button updateTextBtn = findViewById(R.id.updateTextButton);

        ImageView backgroundImage1 = findViewById(R.id.bgOneImageView);
        ImageView backgroundImage2 = findViewById(R.id.bgTwoImageView);

        backgroundImage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundImage1.setVisibility(View.INVISIBLE);
                backgroundImage2.setVisibility(View.VISIBLE);
            }
        });

        backgroundImage2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                backgroundImage1.setVisibility(View.VISIBLE);
                backgroundImage2.setVisibility(View.INVISIBLE);
            }
        });

        updateTextBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"Password Submit Button Pressed");

                if(passwordET.getText().toString().trim().equals("1234")) {
                    myNameIsTV.setText("Password Correct!");
                    backgroundImage1.setVisibility(View.VISIBLE);
                    backgroundImage2.setVisibility(View.INVISIBLE);
                } else if (passwordET.getText().toString().trim().equals("4321")) {
                    myNameIsTV.setText("Yay Other Password");
                    backgroundImage1.setVisibility(View.INVISIBLE);
                    backgroundImage2.setVisibility(View.VISIBLE);
                } else {
                    myNameIsTV.setText("Dude wrong password");
                }
            }
        });

        Button updateTextBtn2 = findViewById(R.id.updateTextButtonAgain);

        updateTextBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(TAG,"Button Pressed 2");

                myNameIsTV.setText("Yay I pressed buttton 2. I'm great");
                myNameIsTV.setTextColor(Color.GREEN);
                myNameIsTV.setTextSize(35);
            }
        });


        Switch switch1 = findViewById(R.id.switch1);
        CheckBox checkBox1 = findViewById(R.id.checkBox1);

        checkBox1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(checkBox1.isChecked()) {
                    backgroundImage1.setVisibility(View.VISIBLE);
                    backgroundImage2.setVisibility(View.INVISIBLE);
                    switch1.setText("Img 2");
                    checkBox1.setText("Img 2 also");
                    switch1.setChecked(true);
                } else {
                    backgroundImage1.setVisibility(View.INVISIBLE);
                    backgroundImage2.setVisibility(View.VISIBLE);
                    switch1.setText("Img 1");
                    checkBox1.setText("Img 1 also");
                    switch1.setChecked(false);
                }
            }
        });

        switch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(switch1.isChecked()) {
                    backgroundImage1.setVisibility(View.VISIBLE);
                    backgroundImage2.setVisibility(View.INVISIBLE);
                    switch1.setText("Img 2");
                    checkBox1.setText("Img 2 also");
                    checkBox1.setChecked(true);
                } else {
                    backgroundImage1.setVisibility(View.INVISIBLE);
                    backgroundImage2.setVisibility(View.VISIBLE);
                    switch1.setText("Img 1");
                    checkBox1.setText("Img 1 also");
                    checkBox1.setChecked(false);
                }
            }
        });


    }
}