package com.example.videoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button video1,video2,video3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        video1 = findViewById(R.id.video1);
        video2 = findViewById(R.id.video2);
        video3 = findViewById(R.id.video3);

        video1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                videoplayer.video_url1 ="https://www.youtube.com/embed/PG53NSAYuMg";
                Intent myIntent = new Intent(MainActivity.this,videoplayer.class);
                startActivity(myIntent);

            }
        });

        video2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                videoplayer.video_url2 ="https://www.youtube.com/embed/zgUiRrrVt3Q";
                Intent myIntent = new Intent(MainActivity.this,videoplayer.class);
                startActivity(myIntent);

            }
        });

        video3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                videoplayer.video_url1 ="https://www.youtube.com/embed/mR92ql0P0q4";
                Intent myIntent = new Intent(MainActivity.this,videoplayer.class);
                startActivity(myIntent);

            }
        });



    }
}