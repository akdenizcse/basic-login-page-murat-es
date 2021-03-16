package com.murates.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText email,password;
    private TextView errorMessage;
    private Button login;
    private String emailUser,passwordUser,
            emailCorrect="murat@akdeniz.edu.tr",passwordCorrect="12345";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        email=findViewById(R.id.editTextEmail);
        password=findViewById(R.id.editTextPassword);
        errorMessage=findViewById(R.id.error);
    }

    public void login(View view){
        emailUser=email.getText().toString();
        passwordUser=password.getText().toString();


        if (emailUser.equals(emailCorrect)&&passwordUser.equals(passwordCorrect)){
            errorMessage.setVisibility(View.INVISIBLE);
            email.setText("");
            password.setText("");
            Intent intent=new Intent(MainActivity.this,Welcome.class);
            intent.putExtra("login",emailUser);
            startActivity(intent);
        }
        else {
            errorMessage.setVisibility(View.VISIBLE);
            if (!emailUser.equals(emailCorrect)&&passwordUser.equals(passwordCorrect)){
                errorMessage.setText("Email is wrong!");
            }
            else {
                errorMessage.setText("Password is wrong!");
            }
        }
    }
}
