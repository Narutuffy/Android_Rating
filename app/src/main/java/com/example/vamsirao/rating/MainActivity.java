package com.example.vamsirao.rating;

import android.app.Dialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        final Dialog dialogBox=new Dialog(MainActivity.this);
        dialogBox.setContentView(R.layout.activity_main);
        dialogBox.setCancelable(false);
        dialogBox.show();

        final RatingBar ratingBar= (RatingBar)dialogBox.findViewById(R.id.rating_bar);

        Button button= (Button)dialogBox.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                float rating=ratingBar.getRating();

              if(rating!=0.0)
                dialogBox.dismiss();
                Toast.makeText(MainActivity.this,"You've rated "+rating+" stars",Toast.LENGTH_SHORT).show();
            }
        });




    }




}
