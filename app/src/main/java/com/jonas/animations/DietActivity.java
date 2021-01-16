package com.jonas.animations;

import android.content.Intent;
import android.support.v4.app.ActivityOptionsCompat;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class DietActivity extends AppCompatActivity {

    private Button btnDash;
    private Button btnMedi;
    private ImageView imageDash;
    private ImageView imageMedi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diet);

        //Buttons
        btnDash = findViewById(R.id.btnDash);
        btnMedi = findViewById(R.id.btnMedi);

        //Images
        imageDash = findViewById(R.id.imgDash);
        imageMedi = findViewById(R.id.imgMedi);

        btnDash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DietActivity.this, ViewDash.class);

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(DietActivity.this, imageDash, ViewCompat.getTransitionName(imageDash));
                startActivity(intent, options.toBundle());
            }
        });

        btnMedi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DietActivity.this, ViewMed.class);

                ActivityOptionsCompat options = ActivityOptionsCompat.makeSceneTransitionAnimation(DietActivity.this, imageMedi, ViewCompat.getTransitionName(imageMedi));
                startActivity(intent, options.toBundle());
            }
        });

    }
}
