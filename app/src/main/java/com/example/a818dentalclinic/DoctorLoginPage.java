package com.example.a818dentalclinic;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.Objects;

public class DoctorLoginPage extends AppCompatActivity {

    Button backButton;
    Button loginButton;
    EditText userID;
    EditText pass;
    FirebaseFirestore fStore;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.doctor_login_page);

        userID = findViewById(R.id.doctor_name);
        pass = findViewById(R.id.doctor_pass);
        fStore = FirebaseFirestore.getInstance();

        loginButton = findViewById(R.id.doctor_login);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String userName = userID.getText().toString().trim();
                String password = pass.getText().toString().trim();

                if (TextUtils.isEmpty(userName)) {
                    userID.setError("Username is Required!");
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    pass.setError("Password is Required!");
                    return;
                }

                if (password.length() < 6) {
                    pass.setError("Password must be greater than 5 characters!");
                    return;
                }



            }
        });

        backButton = findViewById(R.id.doctor_back_button);
        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DoctorLoginPage.this , MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
