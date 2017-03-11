package com.example.vamsirao.rating;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import com.hsalf.smilerating.BaseRating;
import com.hsalf.smilerating.SmileRating;

public class MainActivity extends AppCompatActivity {

    private  int rating;


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

            setContentView(R.layout.activity_main);



        SmileRating smileRating= (SmileRating)findViewById(R.id.smile_rating);


        smileRating.setOnRatingSelectedListener(new SmileRating.OnRatingSelectedListener(){
            @Override
            public void onRatingSelected(int level, boolean reselected) {
                rating=level;
            }
        });



        Button button= (Button)findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(rating==0)
                {
                    Toast.makeText(MainActivity.this,"You've not rated, please do rate",Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(MainActivity.this, "Thank you", Toast.LENGTH_SHORT).show();
                }
        }});




    }




}
