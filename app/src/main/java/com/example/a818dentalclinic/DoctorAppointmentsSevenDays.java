package com.example.a818dentalclinic;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class DoctorAppointmentsSevenDays extends AppCompatActivity{

    Button mAppointmentsButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_appointments_seven_days);

        mAppointmentsButton = findViewById(R.id.buttonToAllSchedule);

        mAppointmentsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goToAllAppointments();
            }
        });
    }
    private void goToAllAppointments() {
        Intent intent = new Intent(this, DoctorAppointments.class);
        startActivity(intent);
    }


}
