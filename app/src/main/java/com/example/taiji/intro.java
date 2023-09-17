package com.example.taiji;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Button;

public class intro extends AppCompatActivity {

    Button button_lgn, button_signUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);


        button_lgn = findViewById(R.id.lgn_button);
        button_lgn.setOnClickListener(view -> {
            Intent intent = new Intent(intro.this, login.class);
            startActivity(intent);
        });

        button_signUp = findViewById(R.id.signUp_button);
        button_signUp.setOnClickListener(view -> {
            Intent intent = new Intent(intro.this, signup.class);
            startActivity(intent);
        });


    }
}