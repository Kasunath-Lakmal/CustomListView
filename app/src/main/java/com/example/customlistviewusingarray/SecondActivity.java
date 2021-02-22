package com.example.customlistviewusingarray;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    ImageView imageView;
    TextView title,description;
    int position;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
   // 5. steps
        ActionBar actionbar = getSupportActionBar();
        if(actionbar != null)
        {
            actionbar.setDisplayHomeAsUpEnabled(true);
            actionbar.setDisplayShowHomeEnabled(true);
   //6. also set the manifest
        }
   //7. step

        imageView = findViewById(R.id.img2_id);
        title = findViewById(R.id.titleText);
        description = findViewById(R.id.descriptionText);

        if(position ==0)
        {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionbar.setTitle(aTitle);
        }

        if(position ==1)
        {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionbar.setTitle(aTitle);
        }

        if(position ==2)
        {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionbar.setTitle(aTitle);
        }

        if(position ==3)
        {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionbar.setTitle(aTitle);
        }

        if(position ==4)
        {
            Intent intent = getIntent();
            Bundle bundle = this.getIntent().getExtras();
            int pic = bundle.getInt("image");
            String aTitle = intent.getStringExtra("title");
            String aDescription = intent.getStringExtra("description");

            imageView.setImageResource(pic);
            title.setText(aTitle);
            description.setText(aDescription);

            actionbar.setTitle(aTitle);
        }

    }
}