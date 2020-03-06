package com.example.activity_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button submit;//button
    EditText name, surname, age;//fields

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submit = findViewById(R.id.button);
        name = findViewById(R.id.name);
        surname = findViewById(R.id.surname);
        age = findViewById(R.id.age);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, second_Activity.class);
        intent.putExtra("send_name", name.getText().toString());//send name to 2nd activity
        intent.putExtra("send_surname", surname.getText().toString());//send surname to 2nd activity
        //send age to 2nd activity
        if((age.getText().toString()).equals(""))//if you didn't enter age
        {
            intent.putExtra("send_age", 0);
        }
        else
        {
            intent.putExtra("send_age", Integer.parseInt(age.getText().toString()));
        }

        startActivity(intent);
    }

}

