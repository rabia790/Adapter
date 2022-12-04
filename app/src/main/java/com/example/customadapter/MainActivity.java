package com.example.customadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ArrayList<Person> personArrayList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        List<Person> personList = new ArrayList<>();

        for (int i = 1; i <= 20 ; i++) {
            Person person = new Person("Person" + i , i, "person"+i+"@mail.com");
            personList.add(person);
        }

        PersonAdapter personAdapter = new PersonAdapter(this, R.layout.personlayout, personList);
        listView.setAdapter(personAdapter);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Person person = new Person("a", 1, "d@d");
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("person", person);
                startActivity(intent);
            }
        });

    }
}