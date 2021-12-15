package com.example.sharedpreferences;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnLogin = (Button) findViewById(R.id.btnLogin);
        Button btnRegister = (Button) findViewById(R.id.btnRegister);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent DetailLogin = new Intent(MainActivity.this, DetailLogin.class);
                startActivity(DetailLogin);
            }
        });


        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerScreen = new Intent(MainActivity.this, Register.class);
                startActivity(registerScreen);
            }
        });
    }



}

// final EditText etName = (EditText) findViewById(R.id.etName);
// final EditText etPassword = (EditText) findViewById(R.id.etPassword);
//
// String user = etName.getText().toString();
//                String password = etPassword.getText().toString();
//                SharedPreferences preferences = getSharedPreferences("MYPREFS", MODE_PRIVATE);
//
//
//
//                String userDetails = preferences.getString(user + password + "data","No information on that user.");
//                SharedPreferences.Editor editor = preferences.edit();
//                editor.putString("display",userDetails);
//                editor.commit();