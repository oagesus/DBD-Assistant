package com.example.dbdguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PerksKillerSurvivorActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perks_killer_survivor);
        Button buttonPerksKiller = findViewById(R.id.buttonPerksKiller);
        buttonPerksKiller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerksKillerSurvivorActivity.this, PerksKillerActivity.class);
                startActivity(intent); // Start the new activity
            }
        });

        Button buttonPerksSurvivor = findViewById(R.id.buttonPerksSurvivor);
        buttonPerksSurvivor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(PerksKillerSurvivorActivity.this, PerksSurvivorActivity.class);
                startActivity(intent); // Start the new activity
            }
        });
    }
}