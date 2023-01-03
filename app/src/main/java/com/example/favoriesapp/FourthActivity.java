package com.example.favoriesapp;

import android.os.Bundle;
import android.os.Handler;
import android.os.StrictMode;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.squareup.picasso.Picasso;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

public class FourthActivity extends AppCompatActivity {

//    public JsonNode mainNode = null;
//    public ObjectMapper objMapper = null;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fourth_activity);
        System.out.println("hello");
        //onViewCreated(this,savedInstanceState);

        if (android.os.Build.VERSION.SDK_INT > 9) {
            StrictMode.ThreadPolicy gfgPolicy =
                    new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(gfgPolicy);
        }
            OkHttpClient client = new OkHttpClient();
        getPhotos(client);



//    OkHttpClient client = new OkHttpClient();
//    getPhotos(client);


    }

    @Override
    protected void onStart() {
        super.onStart();
        //OkHttpClient client = new OkHttpClient();
        //getPhotos(client);
        System.out.println("after the on create");
    }



    public void onViewCreated(FourthActivity view, Bundle savedInstanceState) {
        int SDK_INT = android.os.Build.VERSION.SDK_INT;
        if (SDK_INT > 8)
        {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder()
                    .permitAll().build();
            StrictMode.setThreadPolicy(policy);
            //your codes here

        }
    }



    public String getPhotos(OkHttpClient client) {
       ConstraintLayout constraintlayout = findViewById(R.id.forthActivityLayout);

        Request request = new Request.Builder()
                .url("https://dog.ceo/api/breeds/image/random")
                .build();


//        ImageView dynImage = new ImageView(this);
//         new Thread(new Runnable() {
//
//            @Override
//            public void run() {
//
//                try {
//                    JsonNode mainNode = null;
//
//                    ObjectMapper objMapper = new ObjectMapper();
//                    Response response = client.newCall(request).execute();
//                    if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);
//
//                    System.out.println(response.body().charStream());
//
//
//
//            mainNode = objMapper.readTree(response.body().charStream());
//
//            //System.out.println(mainNode.path("message"));
//
//
//
//            for(int i = 0; i < mainNode.path("message").size(); i++) {
//                System.out.println(mainNode.path("message").get(i).asText() + " us the value");
//                Picasso.get().load(mainNode.path("message").get(i).asText()).into(dynImage);
//
//
//
//                constraintlayout.addView(dynImage);
//
//            }
//                    setContentView(constraintlayout);
//
//
//                    //Picasso.get().load("https://cdna.artstation.com/p/assets/images/images/023/218/190/large/z-w-gu-spooky.jpg?1578494624").into(image1);
//
//                } catch (IOException e) {
//                    e.printStackTrace();
//                    System.out.println("error in process");
//                }
//
//            }
//        }).start();


        JsonNode mainNode = null;
        ObjectMapper objMapper = new ObjectMapper();

        try {
            Response response = client.newCall(request).execute();
            if (!response.isSuccessful()) throw new IOException("Unexpected code " + response);

            System.out.println(response.body().charStream());


            mainNode = objMapper.readTree(response.body().charStream());

            System.out.println(mainNode.path("message"));
            System.out.println("before teh loop");

            for(int i = 0; i < mainNode.path("message").size(); i++) {
                System.out.println("starting loop");
                System.out.println(mainNode.path("message").get(i).asText() + " us the value");
                ImageView dynImage = new ImageView(this);
                Picasso.get().load(mainNode.path("message").get(i).asText()).into(dynImage);



                constraintlayout.addView(dynImage);
                System.out.println("here");

            }
            //setContentView(constraintlayout);


            //Picasso.get().load("https://cdna.artstation.com/p/assets/images/images/023/218/190/large/z-w-gu-spooky.jpg?1578494624").into(image1);

        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("error in process");
        }

        return "null";
    }




}