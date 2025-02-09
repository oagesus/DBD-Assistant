package com.example.dbdguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ConstraintLayout buttonPerksKiller = findViewById(R.id.buttonPerksKiller);
        buttonPerksKiller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PerksKillerActivity.class);
                startActivity(intent);
            }
        });

        ConstraintLayout buttonPerksSurvivor = findViewById(R.id.buttonPerksSurvivor);
        buttonPerksSurvivor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, PerksSurvivorActivity.class);
                startActivity(intent);
            }
        });

        ConstraintLayout buttonCharactersKiller = findViewById(R.id.buttonCharactersKiller);
        buttonCharactersKiller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CharactersKillerActivity.class);
                startActivity(intent);
            }
        });

        ConstraintLayout buttonCharactersSurvivor = findViewById(R.id.buttonCharactersSurvivor);
        buttonCharactersSurvivor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CharactersSurvivorActivity.class);
                startActivity(intent);
            }
        });

        ConstraintLayout buttonMaps = findViewById(R.id.buttonMaps);
        buttonMaps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        ConstraintLayout buttonShrineOfSecrets = findViewById(R.id.buttonShrineOfSecrets);
        buttonShrineOfSecrets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ShrineOfSecretsActivity.class);
                startActivity(intent);
            }
        });
    }
}