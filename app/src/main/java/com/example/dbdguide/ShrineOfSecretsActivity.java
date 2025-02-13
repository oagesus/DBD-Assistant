package com.example.dbdguide;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.TimeZone;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class ShrineOfSecretsActivity extends AppCompatActivity {

    private ImageView shrinePerkIcon1, shrinePerkIcon2, shrinePerkIcon3, shrinePerkIcon4;
    private String shrinePerkSrc1, shrinePerkSrc2, shrinePerkSrc3, shrinePerkSrc4;
    private TextView textTimer; // Reference to the countdown timer TextView
    private TextView textDate;   // Reference to the TextView that will display the reset date

    private final OkHttpClient client = new OkHttpClient();
    private CountDownTimer countDownTimer; // Hold a reference so we can cancel if needed

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shrine_of_secrets);

        // Initialize ImageViews
        shrinePerkIcon1 = findViewById(R.id.shrine_perk_icon_1);
        shrinePerkIcon2 = findViewById(R.id.shrine_perk_icon_2);
        shrinePerkIcon3 = findViewById(R.id.shrine_perk_icon_3);
        shrinePerkIcon4 = findViewById(R.id.shrine_perk_icon_4);

        // Initialize the countdown TextView and the date TextView
        textTimer = findViewById(R.id.textTimer);
        textDate  = findViewById(R.id.textDate);

        // Start the weekly countdown (which also updates the reset date)
        startCountdown();

        // Fetch shrine perk sources from the web
        fetchShrineData();

        // Set drawable resources for each ImageView
        setDrawableResources();

        // Set click listeners for each ImageView
        setClickListeners();
    }

    /**
     * Starts or restarts the countdown to next Tuesday at 4pm Vienna time.
     * Also updates the textDate TextView with the reset date.
     */
    private void startCountdown() {
        // Cancel any existing timer
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }

        // Get current time in Vienna timezone
        TimeZone viennaTZ = TimeZone.getTimeZone("Europe/Vienna");
        Calendar now = Calendar.getInstance(viennaTZ);

        // Set up a Calendar instance for the target time (next Tuesday at 16:00)
        Calendar target = Calendar.getInstance(viennaTZ);
        target.set(Calendar.DAY_OF_WEEK, Calendar.TUESDAY);
        target.set(Calendar.HOUR_OF_DAY, 16);
        target.set(Calendar.MINUTE, 0);
        target.set(Calendar.SECOND, 0);
        target.set(Calendar.MILLISECOND, 0);

        // If the target time is before now, add 7 days
        if (!target.after(now)) {
            target.add(Calendar.DATE, 7);
        }

        // Update the date TextView with the reset date
        // Format: "Tuesday, Feb, 11 2025"
        SimpleDateFormat sdf = new SimpleDateFormat("MMM dd, yyyy (EEEE)");
        sdf.setTimeZone(viennaTZ);
        String dateString = sdf.format(target.getTime());
        textDate.setText(dateString);

        long millisUntilTarget = target.getTimeInMillis() - now.getTimeInMillis();

        // Create and start the CountDownTimer
        countDownTimer = new CountDownTimer(millisUntilTarget, 1000) {
            @Override
            public void onTick(long millisUntilFinished) {
                // Format the remaining time as days:hours:minutes:seconds
                long seconds = millisUntilFinished / 1000;
                long days = seconds / (24 * 3600);
                seconds %= (24 * 3600);
                long hours = seconds / 3600;
                seconds %= 3600;
                long minutes = seconds / 60;
                seconds %= 60;

                // Format with two digits each
                DecimalFormat df = new DecimalFormat("00");
                String timeFormatted = df.format(days) + "d:" +
                        df.format(hours) + "h:" +
                        df.format(minutes) + "m:" +
                        df.format(seconds) + "s";

                // Update the countdown TextView
                textTimer.setText(timeFormatted);
            }

            @Override
            public void onFinish() {
                // When finished, restart the countdown (i.e. add 7 days)
                startCountdown();
            }
        };

        countDownTimer.start();
    }

    private void setDrawableResources() {
        // Set drawable resources dynamically based on the fetched shrinePerkSrc values
        if (shrinePerkSrc1 != null) {
            int drawableResId1 = getResources().getIdentifier(shrinePerkSrc1, "drawable", getPackageName());
            if (drawableResId1 != 0) {
                shrinePerkIcon1.setImageResource(drawableResId1);
            } else {
                shrinePerkIcon1.setImageResource(R.drawable.icon_placeholder); // Fallback drawable
            }
        }

        if (shrinePerkSrc2 != null) {
            int drawableResId2 = getResources().getIdentifier(shrinePerkSrc2, "drawable", getPackageName());
            if (drawableResId2 != 0) {
                shrinePerkIcon2.setImageResource(drawableResId2);
            } else {
                shrinePerkIcon2.setImageResource(R.drawable.icon_placeholder); // Fallback drawable
            }
        }

        if (shrinePerkSrc3 != null) {
            int drawableResId3 = getResources().getIdentifier(shrinePerkSrc3, "drawable", getPackageName());
            if (drawableResId3 != 0) {
                shrinePerkIcon3.setImageResource(drawableResId3);
            } else {
                shrinePerkIcon3.setImageResource(R.drawable.icon_placeholder); // Fallback drawable
            }
        }

        if (shrinePerkSrc4 != null) {
            int drawableResId4 = getResources().getIdentifier(shrinePerkSrc4, "drawable", getPackageName());
            if (drawableResId4 != 0) {
                shrinePerkIcon4.setImageResource(drawableResId4);
            } else {
                shrinePerkIcon4.setImageResource(R.drawable.icon_placeholder); // Fallback drawable
            }
        }
    }

    private void setClickListeners() {
        // Set click listeners dynamically based on the fetched shrinePerkSrc values
        shrinePerkIcon1.setOnClickListener(v -> {
            if (shrinePerkSrc1 != null) {
                int drawableResId1 = getResources().getIdentifier(shrinePerkSrc1, "drawable", getPackageName());
                if (drawableResId1 != 0) {
                    showPopupForPerk(drawableResId1);
                }
            }
        });

        shrinePerkIcon2.setOnClickListener(v -> {
            if (shrinePerkSrc2 != null) {
                int drawableResId2 = getResources().getIdentifier(shrinePerkSrc2, "drawable", getPackageName());
                if (drawableResId2 != 0) {
                    showPopupForPerk(drawableResId2);
                }
            }
        });

        shrinePerkIcon3.setOnClickListener(v -> {
            if (shrinePerkSrc3 != null) {
                int drawableResId3 = getResources().getIdentifier(shrinePerkSrc3, "drawable", getPackageName());
                if (drawableResId3 != 0) {
                    showPopupForPerk(drawableResId3);
                }
            }
        });

        shrinePerkIcon4.setOnClickListener(v -> {
            if (shrinePerkSrc4 != null) {
                int drawableResId4 = getResources().getIdentifier(shrinePerkSrc4, "drawable", getPackageName());
                if (drawableResId4 != 0) {
                    showPopupForPerk(drawableResId4);
                }
            }
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

                        // Debugging: Print the entire HTML response to check if the content is being loaded correctly
                        System.out.println("Fetched HTML content:\n" + doc.toString());

                        // Get all elements with the class "cidahu2"
                        Elements elements = doc.getElementsByClass("cidahu2");

                        // Ensure there are at least 4 elements
                        if (elements.size() >= 4) {
                            shrinePerkSrc1 = extractPerkNameFromElement(elements.get(0));
                            shrinePerkSrc2 = extractPerkNameFromElement(elements.get(1));
                            shrinePerkSrc3 = extractPerkNameFromElement(elements.get(2));
                            shrinePerkSrc4 = extractPerkNameFromElement(elements.get(3));
                        } else {
                            // Handle case where there are fewer than 4 elements
                            shrinePerkSrc1 = null;
                            shrinePerkSrc2 = null;
                            shrinePerkSrc3 = null;
                            shrinePerkSrc4 = null;
                        }

                        // Debugging: Print out each of the image URLs being retrieved
                        System.out.println("Shrine Perk 1 URL: " + shrinePerkSrc1);
                        System.out.println("Shrine Perk 2 URL: " + shrinePerkSrc2);
                        System.out.println("Shrine Perk 3 URL: " + shrinePerkSrc3);
                        System.out.println("Shrine Perk 4 URL: " + shrinePerkSrc4);

                        runOnUiThread(() -> updateUI());
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }

    private String extractPerkNameFromElement(org.jsoup.nodes.Element element) {
        if (element != null) {
            // Look for the first <a> tag and get its href attribute
            String hrefText = element.getElementsByTag("a").first().attr("href");

            // Debugging: Print the href attribute to ensure it's being extracted
            System.out.println("Href text: " + hrefText);

            // Check if "/perks/" exists and remove it if found
            if (hrefText.contains("/perks/")) {
                hrefText = hrefText.replace("/perks/", "");
            }

            if (hrefText.contains(":")) {
                hrefText = hrefText.replace(":", "");
            }

            if (hrefText.contains("&")) {
                hrefText = hrefText.replace("&", "and");
            }

            // Convert to lowercase and prepare possible resource names
            hrefText = hrefText.toLowerCase();
            String killerDrawableName = "killer_" + hrefText;
            String survivorDrawableName = "survivor_" + hrefText;

            // Check if either drawable exists
            int killerResId = getResources().getIdentifier(killerDrawableName, "drawable", getPackageName());
            int survivorResId = getResources().getIdentifier(survivorDrawableName, "drawable", getPackageName());

            if (killerResId != 0) {
                System.out.println("Found drawable: " + killerDrawableName);
                return killerDrawableName;
            } else if (survivorResId != 0) {
                System.out.println("Found drawable: " + survivorDrawableName);
                return survivorDrawableName;
            }

            // Debugging: Print when no drawable was found
            System.out.println("No matching drawable found for: " + hrefText);
        }

        return null;
    }

    private void updateUI() {
        // Set drawable resources after fetching data
        setDrawableResources();
        setClickListeners();
    }

    private void showPopupForPerk(int drawableResId) {
        PerkItem perkItem = findPerkItemByDrawableResId(drawableResId);
        if (perkItem != null) {
            ButtonAdapterPerks buttonAdapterPerks = new ButtonAdapterPerks(this, getAllPerkItems());
            buttonAdapterPerks.showPopupWindow(
                    findViewById(android.R.id.content),
                    perkItem.getLabel(),
                    perkItem.getDescription(),
                    perkItem.getIconResId(),
                    perkItem.getTags(),
                    findViewById(R.id.background_overlay_character),
                    findViewById(R.id.character_portrait_killer),
                    findViewById(R.id.replica_icon_killer),
                    findViewById(R.id.popup_description),
                    findViewById(R.id.popup_description_2),
                    findViewById(R.id.popup_title_killer),
                    findViewById(R.id.close_popup_killer),
                    findViewById(R.id.square_container_perks),
                    findViewById(R.id.text_container_shrine),
                    findViewById(R.id.container_perks_shrine),
                    findViewById(R.id.button_generate)
            );
        }
    }

    private PerkItem findPerkItemByDrawableResId(int drawableResId) {
        List<PerkItem> allPerkItems = getAllPerkItems();
        for (PerkItem item : allPerkItems) {
            if (item.getIconResId() == drawableResId) {
                return item;
            }
        }
        return null;
    }

    private List<PerkItem> getAllPerkItems() {
        List<PerkItem> allPerkItems = new ArrayList<>();
        allPerkItems.addAll(PerkKillerItemData.getButtonItems());
        allPerkItems.addAll(PerkSurvivorItemData.getButtonItems());
        return allPerkItems;
    }
}