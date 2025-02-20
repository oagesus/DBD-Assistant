package com.example.dbdguide;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {
    // Fields to hold the fetched shrine perk data.
    private String shrinePerkSrc1, shrinePerkSrc2, shrinePerkSrc3, shrinePerkSrc4;
    private final OkHttpClient client = new OkHttpClient();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Pre-fetch shrine data as soon as MainActivity is created.
        fetchShrineData();

        ConstraintLayout buttonPerksKiller = findViewById(R.id.buttonPerksKiller);
        buttonPerksKiller.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PerksKillerActivity.class);
            startActivity(intent);
        });

        ConstraintLayout buttonPerksSurvivor = findViewById(R.id.buttonPerksSurvivor);
        buttonPerksSurvivor.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PerksSurvivorActivity.class);
            startActivity(intent);
        });

        ConstraintLayout buttonCharactersKiller = findViewById(R.id.buttonCharactersKiller);
        buttonCharactersKiller.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CharactersKillerActivity.class);
            startActivity(intent);
        });

        ConstraintLayout buttonCharactersSurvivor = findViewById(R.id.buttonCharactersSurvivor);
        buttonCharactersSurvivor.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, CharactersSurvivorActivity.class);
            startActivity(intent);
        });

        ConstraintLayout buttonMaps = findViewById(R.id.buttonMaps);
        buttonMaps.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, MapsActivity.class);
            startActivity(intent);
        });

        ConstraintLayout buttonShrineOfSecrets = findViewById(R.id.buttonShrineOfSecrets);
        buttonShrineOfSecrets.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ShrineOfSecretsActivity.class);
            // Pass the pre-fetched shrine data to the shrine activity.
            intent.putExtra("shrinePerkSrc1", shrinePerkSrc1);
            intent.putExtra("shrinePerkSrc2", shrinePerkSrc2);
            intent.putExtra("shrinePerkSrc3", shrinePerkSrc3);
            intent.putExtra("shrinePerkSrc4", shrinePerkSrc4);
            startActivity(intent);
        });

        ConstraintLayout buttonPerksRandom = findViewById(R.id.buttonPerksRandom);
        buttonPerksRandom.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, PerksRandomActivity.class);
            startActivity(intent);
        });

        ConstraintLayout buttonHookHelper = findViewById(R.id.buttonHookHelper);
        buttonHookHelper.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, HookHelperActivity.class);
            startActivity(intent);
        });
    }

    private void fetchShrineData() {
        new Thread(() -> {
            try {
                Request request = new Request.Builder()
                        .url("https://nightlight.gg/shrine")
                        .build();
                try (Response response = client.newCall(request).execute()) {
                    if (response.isSuccessful() && response.body() != null) {
                        Document doc = Jsoup.parse(response.body().string());
                        Elements elements = doc.getElementsByClass("cidahu2");
                        String newPerkSrc1 = null, newPerkSrc2 = null, newPerkSrc3 = null, newPerkSrc4 = null;
                        if (elements.size() >= 4) {
                            newPerkSrc1 = extractPerkNameFromElement(elements.get(0));
                            newPerkSrc2 = extractPerkNameFromElement(elements.get(1));
                            newPerkSrc3 = extractPerkNameFromElement(elements.get(2));
                            newPerkSrc4 = extractPerkNameFromElement(elements.get(3));
                        }
                        // Update instance variables with fetched data.
                        shrinePerkSrc1 = newPerkSrc1;
                        shrinePerkSrc2 = newPerkSrc2;
                        shrinePerkSrc3 = newPerkSrc3;
                        shrinePerkSrc4 = newPerkSrc4;
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    // Duplicate (or extract into a shared utility) of the helper method.
    private String extractPerkNameFromElement(org.jsoup.nodes.Element element) {
        if (element != null) {
            String hrefText = element.getElementsByTag("a").first().attr("href");
            if (hrefText.contains("/perks/")) {
                hrefText = hrefText.replace("/perks/", "");
            }
            if (hrefText.contains(":")) {
                hrefText = hrefText.replace(":", "");
            }
            if (hrefText.contains("&")) {
                hrefText = hrefText.replace("&", "and");
            }
            hrefText = hrefText.toLowerCase();
            String killerDrawableName = "killer_" + hrefText;
            String survivorDrawableName = "survivor_" + hrefText;
            int killerResId = getResources().getIdentifier(killerDrawableName, "drawable", getPackageName());
            int survivorResId = getResources().getIdentifier(survivorDrawableName, "drawable", getPackageName());
            if (killerResId != 0) {
                return killerDrawableName;
            } else if (survivorResId != 0) {
                return survivorDrawableName;
            }
        }
        return null;
    }
}
