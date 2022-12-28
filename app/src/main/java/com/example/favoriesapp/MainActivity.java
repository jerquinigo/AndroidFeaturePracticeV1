package com.example.favoriesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoProvider;

public class MainActivity extends AppCompatActivity {

    ImageView image1;
    ImageView image2;
    Button secondActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hello");
        image1 = findViewById(R.id.imageView5);
        image2 = findViewById(R.id.imageView4);
        secondActivity = findViewById(R.id.secondActivityButton);
        Picasso.get().load("https://cdna.artstation.com/p/assets/images/images/023/218/190/large/z-w-gu-spooky.jpg?1578494624").into(image1);
        Picasso.get().load("https://www.psu.com/wp/wp-content/uploads/2021/05/far-cry-6-ps4-ps5-release-date-dani-rojas.jpg").into(image2);
    }



    public void goToSecondActivity(View view) {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }






}