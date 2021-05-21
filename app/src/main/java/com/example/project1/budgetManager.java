package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
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
        Button totalbutton = findViewById(R.id.totalbutton);
        Button transactionButton = findViewById(R.id.transactionButton);



        budgetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(budgetManager.this, budgets.class);
                startActivity(intent);
            }
        });
        totalbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(budgetManager.this, total.class);
                startActivity(intent);
            }
        });
        transactionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(budgetManager.this, transaction.class);
                startActivity(intent);
            }
        });}}

