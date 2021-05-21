package com.example.project1;

import android.app.AlertDialog;
import android.content.DialogInterface;
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

public class budgets extends AppCompatActivity {

    public static ArrayList<String> data = new ArrayList<String>();
    ImageView imageView2;
    ListView show;

    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_budgets);
        imageView2 = findViewById(R.id.imageView2);
        imageView2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(budgets.this, budgetManager.class);
                startActivity(intent);
            }
        });
        Intent intent = getIntent();
        show = (ListView) findViewById(R.id.list1);
        String str = intent.getStringExtra("input");
        String str2 = intent.getStringExtra("input2");
        if(str != null){   data.add(str); }

        boolean ans = data.isEmpty();
        //    receiver_msg = (TextView)findViewById(R.id.received_value_id);
        if (ans == true) {
            new AlertDialog.Builder(this)
                    .setTitle("add budget")
                    .setMessage("you got no budget !! , would you like to add now ?")

                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton(android.R.string.yes, new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(budgets.this, slide4.class);
                            startActivity(intent);
                        }
                    })

                    // A null listener allows the button to dismiss the dialog and take no further action.
                    .setNegativeButton(android.R.string.no, null)
                    .setIcon(android.R.drawable.ic_dialog_alert)
                    .show();

        } else {
            String both= "name="+str + "// value=" + str2;

            data.add(both);

            ArrayAdapter<String> adapter = new ArrayAdapter<String>(budgets.this, android.R.layout.simple_list_item_1, data);
            show.setAdapter(adapter);
            System.out.println(data);

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