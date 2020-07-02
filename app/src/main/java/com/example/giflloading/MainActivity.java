package com.example.giflloading;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.roger.gifloadinglibrary.GifLoadingView;
import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    private Button btnGif;
    private GifLoadingView gifLoadingView;
    private ImageView imgGif;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnGif = findViewById(R.id.btnGift);

//        gifLoadingView = new GifLoadingView();
//        gifLoadingView.setImageResource(R.drawable.num5);
//        gifLoadingView.show(getFragmentManager());

        btnGif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.loading);
                dialog.setCancelable(false);
                dialog.show();
            }
        });
    }
}