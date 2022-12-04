package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView main2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        main2 = findViewById(R.id.viewMain2);

        Intent intent = getIntent();
        Person p = (Person) intent.getSerializableExtra("person");
        main2.setText(p.toString());
    }
}