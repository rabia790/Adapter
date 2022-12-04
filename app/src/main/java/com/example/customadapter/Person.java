package com.example.customadapter;

import androidx.annotation.NonNull;

import java.io.Serializable;

public class Person implements Serializable {

    String name;
    int id;
    String email;

    public Person(String name, int id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    @NonNull
    @Override
    public String toString() {

        return name + "\n" + id + "\n" + email;
    }
}
