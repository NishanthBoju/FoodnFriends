package com.example.foodnfriends;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {

    EditText ed1,ed2;
    Button b1,b2;
    TextView txt1;
    public static final List<String> user1 = new ArrayList<>();
    public static final List<String> pass1 = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ed1=(EditText)findViewById(R.id.editText);
//        ed2=(EditText) findViewById(R.id.editText2);
//        String s1= ed1.getText().toString().trim();
//         String s2= ed2.getText().toString().trim();
        user1.add("food");
        pass1.add("1234");

        b1=(Button)findViewById(R.id.button);
        b2=(Button)findViewById(R.id.button2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                login();

            }

            private void login() {
                //openactivity3();
                ed1=(EditText)findViewById(R.id.editText);
                ed2=(EditText) findViewById(R.id.editText2);
                String s1= ed1.getText().toString().trim();
                String s2= ed2.getText().toString().trim();
                int count=0;
                for(int i=0;i<user1.size();i++) {
                    if (s1.equals(user1.get(i)) && s2.equals(pass1.get(i))) {
                        //openactivity3();
                        count++;
                        Intent intent3 = new Intent(MainActivity.this, Main3Activity.class);
                        startActivity(intent3);
                    }
                }
                if(count==0){
                    Toast.makeText(MainActivity.this, "Invalid Credentials.Username or Password doesn't match", Toast.LENGTH_SHORT).show();
                    //  txt1.setText("Invalid Credentials.Username or Password doesn't match");
                }
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openactivity2();
            }
        });

        Intent i1=getIntent();
        String m1=i1.getStringExtra("register");
        String m2=i1.getStringExtra("user");
        String m3=i1.getStringExtra("pass");
        user1.add(m2);
        pass1.add(m3);






    }

//
//    public void openactivity3() {
//        Intent intent3=new Intent(MainActivity.this,Main3Activity.class);
//        startActivity(intent3);
//    }

    public void openactivity2() {
        Intent intent=new Intent(MainActivity.this,Main2Activity.class);
        startActivity(intent);
    }
}
