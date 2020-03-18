package com.example.a818dentalclinic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PatientAppointments extends AppCompatActivity {

    Button add_appointment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patient_appointments);

        add_appointment = findViewById(R.id.patient_add_button);
        add_appointment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(PatientAppointments.this , AddingAppointments.class);
                startActivity(intent);

            }
        });

    }

}
