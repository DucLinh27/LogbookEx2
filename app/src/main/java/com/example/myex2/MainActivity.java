package com.example.myex2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private ImageView imageView;
    private int[] imageIds = {R.drawable.image1, R.drawable.image2, R.drawable.image3};
    private int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView = findViewById(R.id.imageView);
        imageView.setImageResource(imageIds[currentIndex]);

    }

    public void showPreviousImage(View view) {
        if (currentIndex > 0) {
            currentIndex--;
            imageView.setImageResource(imageIds[currentIndex]);
        }
    }

    public void showNextImage(View view) {
        if (currentIndex < imageIds.length - 1) {
            currentIndex++;
            imageView.setImageResource(imageIds[currentIndex]);
        }
    }
}
