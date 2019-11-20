package com.example.foodnfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {
Button m3b1,m3b2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        m3b1=findViewById(R.id.button4);
        m3b2=findViewById(R.id.button5);
        m3b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(Main3Activity.this, Main4Activity.class);
                startActivity(intent4);
            }
        });
        m3b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intent5);
                Toast.makeText(Main3Activity.this, "Successfully logged Out", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
