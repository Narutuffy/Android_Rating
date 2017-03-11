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

     /*   final Dialog dialogBox=new Dialog(MainActivity.this);
        dialogBox.setContentView(R.layout.activity_main);
        dialogBox.setCancelable(false);
        dialogBox.show();*/



       // final RatingBar ratingBar= (RatingBar)dialogBox.findViewById(R.id.rating_bar);

        SmileRating smileRating= (SmileRating)findViewById(R.id.smile_rating);

        //setting onClickListener on SmileyRating

        smileRating.setOnSmileySelectionListener(new SmileRating.OnSmileySelectionListener(){

            @Override
            public void onSmileySelected(@BaseRating.Smiley int smiley, boolean reselected) {
                switch (smiley) {
                    case SmileRating.BAD:
                         break;
                    case SmileRating.GOOD:
                        break;
                    case SmileRating.GREAT:
                        break;
                    case SmileRating.OKAY:
                        break;
                    case SmileRating.TERRIBLE:
                        break;
                }
            }
        });

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




                Toast.makeText(MainActivity.this,"You've rated "+rating+"",Toast.LENGTH_SHORT).show();

        }});




    }




}
