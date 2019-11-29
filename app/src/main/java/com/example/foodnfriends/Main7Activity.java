package com.example.foodnfriends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main7Activity extends AppCompatActivity {

    float myRating=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        RatingBar rt=findViewById(R.id.ratingBar);
        Button btn71=findViewById(R.id.button8);
        Button btn72=findViewById(R.id.button13);

        rt.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                int rating=(int) v;
                String message ="";
                myRating=(int)ratingBar.getRating();
                if(rating>=4){
                    message="Great! Thank You!";
                } else if(rating>=3 && rating<4) {
                    message="Thank You! we will try to improve";

                }else
                {
                    message="Sorry to Hear That!";

                }
                Toast.makeText(Main7Activity.this,""+message,Toast.LENGTH_LONG).show();
            }
        });

        btn71.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent71=new Intent(Main7Activity.this,Main4Activity.class);
                startActivity(intent71);
            }
        });
        btn72.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent72=new Intent(Main7Activity.this,MainActivity.class);
                Toast.makeText(Main7Activity.this,"Successfully Logged Out",Toast.LENGTH_LONG).show();
                startActivity(intent72);
            }
        });
    }
}
