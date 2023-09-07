package com.example.dobile;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.android.material.snackbar.Snackbar;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn_sign_in = (Button)findViewById(R.id.buttonSignIn);
        EditText et_email = (EditText) findViewById(R.id.ET_EmailAddress);
        EditText et_password = (EditText) findViewById(R.id.ET_NumberPassword);

        btn_sign_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = et_email.getText().toString();
                String password = et_password.getText().toString();
                String test = email+password;

            }
        });
    }


}