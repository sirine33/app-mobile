package com.example.project1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class budgets extends AppCompatActivity {
    TextView receiver_msg;
    public static ArrayList<String> data = new ArrayList<String>();
    ListView show;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budgets);
        Intent intent = getIntent();
        show = (ListView) findViewById(R.id.list1);
        String str = intent.getStringExtra("input");
        //    receiver_msg = (TextView)findViewById(R.id.received_value_id);
        if (str == null) {
            Intent activity2Intent = new Intent(getApplicationContext(), slide4.class);
            startActivity(activity2Intent);

        } else {
            // create the get Intent object


            // receive the value by getStringExtra() method
            // and key must be same which is send by first activity

            data.add(str);
            ArrayAdapter<String> adapter = new ArrayAdapter<String>(budgets.this, android.R.layout.simple_list_item_1, data);
            show.setAdapter(adapter);

            // display the string into textView
        }


        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent activity2Intent = new Intent(getApplicationContext(), slide4.class);
                startActivity(activity2Intent);
            }
        });


    }
}