package com.example.project1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    Button button1, button2, button3;
    CheckBox checkBox, checkBox2, checkBox3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CheckBox checkBox = (CheckBox)findViewById(R.id.checkBox1);
        CheckBox checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        CheckBox checkBox3 = (CheckBox)findViewById(R.id.checkBox3);
        button1 = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        checkBox.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button1.getVisibility() == View.INVISIBLE) {
                    button1.setVisibility(View.VISIBLE);
                }
            }
        }) ;
        checkBox2.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button2.getVisibility() == View.INVISIBLE) {
                    button1.setVisibility(View.VISIBLE);
                }
            }
        }) ;
        checkBox.setOnClickListener(new CheckBox.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(button3.getVisibility() == View.INVISIBLE) {
                    button1.setVisibility(View.VISIBLE);
                }
            }
        }) ;
    }
}