package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class budgetManager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budget_manager);

    initEvent();
    }


    public void initEvent() {
        Button budgetButton = findViewById(R.id.budgetButton);
        Button transactionButton = findViewById(R.id.transactionButton);
        Button totalButton = findViewById(R.id.totalButton);
        budgetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(budgetManager.this, budgets.class);
                startActivity(intent);
            }
        });
        transactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(budgetManager.this, transactions.class);
                startActivity(intent);
            }
        });
        totalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(budgetManager.this, total.class);
                startActivity(intent);
            }
        });
    }}
