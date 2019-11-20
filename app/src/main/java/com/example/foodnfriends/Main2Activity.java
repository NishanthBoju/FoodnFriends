package com.example.foodnfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    EditText ed3,ed4,ed5,ed6,ed7;
    Button b11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
//        ed3=findViewById(R.id.editText3);
//        ed4=findViewById(R.id.editText4);
//        ed5=findViewById(R.id.editText5);
//        ed6=findViewById(R.id.editText6);
        b11=findViewById(R.id.button3);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity();
            }
        });

    }

    private void openactivity() {
        ed3=findViewById(R.id.editText3);
        ed4=findViewById(R.id.editText4);
        ed5=findViewById(R.id.editText5);
        ed6=findViewById(R.id.editText6);
        ed7=findViewById(R.id.editText7);

        String s3= ed3.getText().toString().trim();
        String s4= ed4.getText().toString().trim();
        String s5= ed5.getText().toString().trim();
        String s6= ed6.getText().toString().trim();
        String s7= ed7.getText().toString().trim();
        if(s3.isEmpty()||s4.isEmpty()||s5.isEmpty()||s6.isEmpty()||s7.isEmpty()){
            Toast.makeText(this, "One or More Fields Cannot be Empty", Toast.LENGTH_SHORT).show();
        }else {
            if (s6.equals(s7)) {
                Intent intent2 = new Intent(Main2Activity.this, MainActivity.class);
                intent2.putExtra("register", "Thank You for Registering with us.Please Login In with your credentials");
                intent2.putExtra("user",s5);
                intent2.putExtra("pass",s6);
                startActivity(intent2);
            } else {
                Toast.makeText(Main2Activity.this, "Sorry password doesn't match try again", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
