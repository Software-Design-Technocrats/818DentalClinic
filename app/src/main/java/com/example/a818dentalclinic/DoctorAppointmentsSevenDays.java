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
