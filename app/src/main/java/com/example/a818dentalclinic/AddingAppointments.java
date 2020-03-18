package com.example.a818dentalclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AddingAppointments extends AppCompatActivity {

    Button btn_add_one;
    Button btn_add_two;
    Button btn_add_three;
    Button btn_add_four;
    Button btn_add_five;
    Button btn_add_six;
    Button btn_add_seven;
    Button btn_add_eight;
    Button btn_add_nine;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adding_appointments);

        btn_add_one = findViewById(R.id.button_one);
        btn_add_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent one = new Intent(getApplicationContext(),PopActivityClassOne.class);
                startActivity(one);
            }
        });
        btn_add_two = findViewById(R.id.button_two);
        btn_add_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent two = new Intent(getApplicationContext(),PopActivityClassTwo.class);
                startActivity(two);
            }});
        btn_add_three = findViewById(R.id.button_three);
        btn_add_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent three = new Intent(getApplicationContext(),PopActivityClassThree.class);
                startActivity(three);
            }});

        btn_add_four = findViewById(R.id.button_four);
        btn_add_four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent four = new Intent(getApplicationContext(),PopActivityClassFour.class);
                startActivity(four);
            }});
        btn_add_five = findViewById(R.id.button_five);
        btn_add_five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent five = new Intent(getApplicationContext(),PopActivityClassFive.class);
                startActivity(five);
            }});
        btn_add_six = findViewById(R.id.button_six);
        btn_add_six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent six = new Intent(getApplicationContext(),PopActivityClassSix.class);
                startActivity(six);
            }});
        btn_add_seven = findViewById(R.id.button_seven);
        btn_add_seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent seven = new Intent(getApplicationContext(),PopActivityClassSeven.class);
                startActivity(seven);
            }});
        btn_add_eight = findViewById(R.id.button_eight);
        btn_add_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent eight = new Intent(getApplicationContext(),PopActivityClassEight.class);
                startActivity(eight);
            }});
        btn_add_nine = findViewById(R.id.button_nine);
        btn_add_nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nine = new Intent(getApplicationContext(),PopActivityClassNine.class);
                startActivity(nine);
            }});


    }


}
