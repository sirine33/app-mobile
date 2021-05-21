package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class transaction extends AppCompatActivity {

    public static ArrayList<String> data = new ArrayList<String>();
    ImageView imageView2;
    ListView show;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transaction);
        imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(transaction.this, budgetManager.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        show = (ListView) findViewById(R.id.list1);
        String str = intent.getStringExtra("input");
        String str2 = intent.getStringExtra("input2");
        if (str == null) {
            Intent activity2Intent = new Intent(getApplicationContext(), addTransaction.class);
            startActivity(activity2Intent);

        } else {
            String both= "name="+str + "// value=" + str2;

            data.add(both);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(transaction.this, android.R.layout.simple_list_item_1, data);
            show.setAdapter(adapter);


        }


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent activity2Intent = new Intent(getApplicationContext(), addTransaction.class);
                startActivity(activity2Intent);
            }
        });


    }
}