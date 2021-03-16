package com.murates.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Welcome extends AppCompatActivity {

    private TextView welcome;
    private String email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        welcome=findViewById(R.id.textViewWelcome);

        Intent intent=getIntent();
        email=intent.getStringExtra("login");
        welcome.setText("Welcome "+email);
    }
}
