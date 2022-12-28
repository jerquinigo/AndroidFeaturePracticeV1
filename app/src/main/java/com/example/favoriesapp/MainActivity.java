package com.example.favoriesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;
import com.squareup.picasso.PicassoProvider;

public class MainActivity extends AppCompatActivity {

    ImageView image1;
    ImageView image2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("hello");
        image1 = findViewById(R.id.imageView5);
        image2 = findViewById(R.id.imageView4);
        Picasso.get().load("https://cdna.artstation.com/p/assets/images/images/023/218/190/large/z-w-gu-spooky.jpg?1578494624").into(image1);
        Picasso.get().load("https://www.psu.com/wp/wp-content/uploads/2021/05/far-cry-6-ps4-ps5-release-date-dani-rojas.jpg").into(image2);
    }

//    public void getImage1() {
//
//        Picasso.get().load("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3oO-z-aP4QQMOMHH0TGdpHyiO6BX0GB8gFSp17ckSlhZofISUfUuIRrqFzm8TTqacg-8&usqp=CAU").into(image1);
////        return image1;
//    }


    //    public void test() {
//        Picasso.get().load()
//    }









}