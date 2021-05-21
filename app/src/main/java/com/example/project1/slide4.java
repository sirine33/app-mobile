package com.example.project1;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.EditText;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;


public class slide4 extends AppCompatActivity {

    public static ArrayList<String> data=new ArrayList<String>();
    ImageView imageView;
    private Button savebtn;
    ListView show;
    public String input2;
    public String input1;
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
        show=(ListView)findViewById(R.id.list1);
        savebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
input2= text2.getText().toString();
input1= text1.getText().toString();
                if ( text1.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Value Field is Empty", Toast.LENGTH_LONG).show();}
             else   if ( text2.getText().toString().trim().equals("")){
                    Toast.makeText(getApplicationContext(),"Name Field is Empty", Toast.LENGTH_LONG).show();}
                else {
text2.setText("");
                    text1.setText("");
                    Intent intent = new Intent(getApplicationContext(), budgets.class);
                    System.out.println(input1);
System.out.println(input2);

                    intent.putExtra("input", input1);
intent.putExtra("input2",input2);
                    intent.putExtra("activity","budget");
                    startActivity(intent);

                }

            }

        });
    }
}






