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
        Intent intent = getIntent();

        String str = intent.getStringExtra("input");
        //    receiver_msg = (TextView)findViewById(R.id.received_value_id);
        if (str == null) {
        new AlertDialog.Builder(this)
                .setTitle("add budget")
                .setMessage("you got no budget !! , would you like to add now ?")

                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        Intent intent = new Intent(budgetManager.this, budgets.class);
                        startActivity(intent);
                    }
                })

                // A null listener allows the button to dismiss the dialog and take no further action.
                .setNegativeButton(android.R.string.no, null)
                .setIcon(android.R.drawable.ic_dialog_alert)
                .show();}
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

