package com.example.favoriesapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {


    Button submitButton;
    TextView greetingResult;
    EditText editText;
    String nameContent;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_activity);
        System.out.println("hello");

        submitButton = findViewById(R.id.submitName);
        editText = findViewById(R.id.personName);
        greetingResult = findViewById(R.id.greetingResult);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Log.v("EditText", editText.getText().toString());
                nameContent = "Hello, " + editText.getText().toString();
                Log.v("EditText", nameContent);

                greetingResult.setText(nameContent);

            }
        });





    }



    public void goToFourthActivity(View view) {
        Intent intent = new Intent(this, FourthActivity.class);
        startActivity(intent);
    }











}