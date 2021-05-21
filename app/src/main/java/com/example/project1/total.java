package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

public class total extends AppCompatActivity {
    TextView show;
    TextView showmoneyleft;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
       /* imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(transaction.this, budgetManager.class);
                startActivity(intent);
            }
        });*/
        Intent intent = getIntent();


        String activity = intent.getStringExtra("activity");

        if (activity == null) {
            Intent activity2Intent = new Intent(getApplicationContext(), total.class);
            startActivity(activity2Intent);

        } else if (activity.equals("budgets")){
            String str=intent.getStringExtra("input2");
            show = (TextView) findViewById(R.id.total_money);
            showmoneyleft=(TextView) findViewById(R.id.money_left);
         String text= show.getText().toString();
         String moneyleft=showmoneyleft.getText().toString();
         int totalmoneyleft=Integer.parseInt(str)+Integer.parseInt(moneyleft);

            int total = Integer.parseInt(str)+Integer.parseInt(text);
            String totalstring= "total_money:="+ String.valueOf(total);
            String leftstring="money_left:="+ String.valueOf(totalmoneyleft) ;
            show.setText(totalstring);
            showmoneyleft.setText(leftstring);


        }else if (activity.equals("transaction")){
            String str=intent.getStringExtra("input2");
            show = (TextView) findViewById(R.id.money_spent);
            showmoneyleft=(TextView) findViewById(R.id.money_left);
            String text= show.getText().toString();
            String moneyleft=showmoneyleft.getText().toString();
            int totalmoneyleft=Integer.parseInt(moneyleft)-Integer.parseInt(str);

            int total = Integer.parseInt(str)+Integer.parseInt(text);
            String totalstring="money spent:="+ String.valueOf(total);
            show.setText(totalstring  );
            String totalleft="money left:="+ String.valueOf(totalmoneyleft);
            showmoneyleft.setText(totalleft );


        }

/*
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                System.out.println("Button Clicked");
                Intent activity2Intent = new Intent(getApplicationContext(), addTransaction.class);
                startActivity(activity2Intent);
            }
        });
    }*/
}}