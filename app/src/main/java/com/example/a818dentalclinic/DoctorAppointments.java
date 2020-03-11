package com.example.a818dentalclinic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class DoctorAppointments extends AppCompatActivity {

    Button mSevenDaysButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_appointments_all);

        mSevenDaysButton = findViewById(R.id.buttonToSevenDaysAppointment);

        mSevenDaysButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToSevenDaysAppointment();
            }
        });
    }
    private void goToSevenDaysAppointment() {
        Intent intent = new Intent(this, DoctorAppointmentsSevenDays.class);
        startActivity(intent);
    }
}

