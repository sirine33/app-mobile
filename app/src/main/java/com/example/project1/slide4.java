package com.example.project1;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class slide4 extends AppCompatActivity {


    ImageView imageView;
    private Button savebtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_slide4);

        imageView = findViewById(R.id.imageView);
        imageView.setOnClickListener(new View.OnClickListener(){
          @Override
            public void onClick(View v) {
                Intent intent = new Intent(slide4.this, budgetManager.class);
                startActivity(intent);
            }
        });
        final EditText text1 = (EditText) findViewById(R.id.text1);
        final EditText text2 = (EditText) findViewById(R.id.text2);
        Button savebtn = (Button) findViewById(R.id.savebtn);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (text1.getText().toString() != null || text2.getText().toString() != null) {
                    Toast.makeText(getApplicationContext(), text1.getText().toString(), Toast.LENGTH_LONG).show();
                }
                openslide5();
            }

        });
    }   public void openslide5() {
        Intent intent = new Intent(this, budgets.class);
        startActivity(intent);
    }
}






