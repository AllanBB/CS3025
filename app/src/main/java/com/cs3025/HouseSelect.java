package com.cs3025;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HouseSelect extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_select);

        final Button newHouseButton = findViewById(R.id.new_house);
        final Button existHouseButton = findViewById(R.id.exist_house);

        newHouseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseSelect.this, NewHouse.class);
                startActivity(intent);
            }
        });

        existHouseButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(HouseSelect.this, ExistHouse.class);
                startActivity(intent);
            }
        });

    }
}
