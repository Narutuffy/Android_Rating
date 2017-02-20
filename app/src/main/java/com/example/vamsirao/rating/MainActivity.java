package com.example.vamsirao.rating;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void  onClick(View view){

        RatingBar ratingBar= (RatingBar) findViewById(R.id.rating_bar);

        String rating=String.valueOf(ratingBar.getRating());
        Toast.makeText(this,"You've rated "+rating+" stars",Toast.LENGTH_SHORT).show();
    }
}
