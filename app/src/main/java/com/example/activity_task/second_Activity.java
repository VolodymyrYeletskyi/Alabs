package com.example.activity_task;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;

public class second_Activity extends AppCompatActivity {
    TextView text1, text2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_);

        text1 = findViewById(R.id.tv1);
        text2 = findViewById(R.id.tv2);

        Intent intent = getIntent();

        String name = intent.getStringExtra("send_name");
        String surname = intent.getStringExtra("send_surname");
        int age = intent.getIntExtra("send_age", 0);

        text1.setText("Hello " + name + " " + surname);

        if(age < 18)
        {
            text2.setText("Sorry, but your age less than 18");
        }
        else
        {
            text2.setText("Your age 18 or more, so you can watch our content");
        }
    }
}
