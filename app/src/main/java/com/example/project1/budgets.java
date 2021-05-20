package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class budgets extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budgets);


    Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
public void onClick(View v) {
        System.out.println("Button Clicked");

        Intent activity2Intent = new Intent(getApplicationContext(), slide4.class);
        startActivity(activity2Intent);
        }
        });}}