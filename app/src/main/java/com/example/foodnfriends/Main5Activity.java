package com.example.foodnfriends;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Main5Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        Button btn3=findViewById(R.id.button9);
        Button btn4=findViewById(R.id.button10);
        Button btn5=findViewById(R.id.button11);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3=new Intent(Main5Activity.this,Main6Activity.class);
                startActivity(intent3);
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4=new Intent(Main5Activity.this,Main4Activity.class);
                startActivity(intent4);
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5=new Intent(Main5Activity.this,MainActivity.class);
                Toast.makeText(Main5Activity.this,"Successfully Logged Out",Toast.LENGTH_LONG).show();
                startActivity(intent5);
            }
        });
    }
}
