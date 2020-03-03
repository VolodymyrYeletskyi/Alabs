package com.example.activity_task;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button submit;
    EditText name, surname, age;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        submit = findViewById(R.id.button);
        name = findViewById(R.id.Name);
        surname = findViewById(R.id.Surname);
        age = findViewById(R.id.Age);

        submit.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, second_Activity.class);
        intent.putExtra("send_name", name.getText().toString());
        intent.putExtra("send_surname", surname.getText().toString());
        int temp_age;
        if((age.getText().toString()) == "")
        {
            temp_age = 0;
        }
        else
        {
            temp_age = Integer.parseInt(age.getText().toString());
        }
        intent.putExtra("send_age", temp_age);
        startActivity(intent);
    }

}

