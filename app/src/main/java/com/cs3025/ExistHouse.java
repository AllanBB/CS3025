package com.cs3025;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ExistHouse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exist_house);

        final Button nextButton = findViewById(R.id.next);
        final EditText keyInput = (EditText) findViewById(R.id.input);

        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(keyInput.getText().length() != 8){
                    Toast.makeText(getApplicationContext(), "Invalid Room Key", Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intent = new Intent(ExistHouse.this, MainActivity.class);
                    startActivity(intent);
                }

            }
        });
    }
}
