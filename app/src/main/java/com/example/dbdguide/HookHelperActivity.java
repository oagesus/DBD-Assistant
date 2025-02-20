package com.example.dbdguide;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.slider.Slider;

public class HookHelperActivity extends AppCompatActivity {

    // Counters for each container (for hook visibility)
    private int count1 = 0, count2 = 0, count3 = 0, count4 = 0;

    // Arrays to hold hook ImageViews for each container
    private ImageView[] hooks1, hooks2, hooks3, hooks4;

    // “Stage” for the shrine perk icon for each container (from 0 to 4)
    private int stage1 = 0, stage2 = 0, stage3 = 0, stage4 = 0;

    // ImageViews for the shrine perk icons
    private ImageView shrinePerkIcon1, shrinePerkIcon2, shrinePerkIcon3, shrinePerkIcon4;

    // Handler and Runnable for timer updates
    private Handler handler = new Handler();
    private final int[] currentTime = {0};
    private Runnable timerRunnable;
    private Slider sliderTimer;
    private ColorStateList originalTrackColorActive, originalTrackColorInactive;
    private ColorStateList originalThumbColor, originalHaloColor, originalTickColor;
    private CircularProgressIndicator progressCircle;
    private TextView textCountdown;

    private TextView textTimerSet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hook_helper);

        sliderTimer = findViewById(R.id.slider_timer);

        float savedValue = getSharedPreferences("HookHelperPrefs", MODE_PRIVATE)
                .getFloat("slider_value", 60f);  // Default to 60 if no saved value exists
        sliderTimer.setValue(savedValue);

        originalTrackColorActive = sliderTimer.getTrackActiveTintList();
        originalTrackColorInactive = sliderTimer.getTrackInactiveTintList();
        originalThumbColor = sliderTimer.getThumbTintList();
        originalHaloColor = sliderTimer.getHaloTintList();
        originalTickColor = sliderTimer.getTickTintList();

        // Initialize progress circle
        progressCircle = findViewById(R.id.progress_circle);
        progressCircle.setMax((int) sliderTimer.getValue());  // Match slider's max
        progressCircle.setProgress(0);  // Start with empty circle

        textTimerSet = findViewById(R.id.text_timer_set);

        // Initialize TextView for timer display
        textCountdown = findViewById(R.id.text_countdown);
        textCountdown.setText(String.format("%01ds", (int) savedValue));
        textCountdown.setTextColor(ContextCompat.getColor(this, R.color.darker_grey));  // Default color

        // Initialize hook arrays for container 1
        hooks1 = new ImageView[]{
                findViewById(R.id.hook_1_1),
                findViewById(R.id.hook_1_2),
                findViewById(R.id.hook_1_3)
        };

        // Initialize hook arrays for container 2
        hooks2 = new ImageView[]{
                findViewById(R.id.hook_2_1),
                findViewById(R.id.hook_2_2),
                findViewById(R.id.hook_2_3)
        };

        // Initialize hook arrays for container 3
        hooks3 = new ImageView[]{
                findViewById(R.id.hook_3_1),
                findViewById(R.id.hook_3_2),
                findViewById(R.id.hook_3_3)
        };

        // Initialize hook arrays for container 4
        hooks4 = new ImageView[]{
                findViewById(R.id.hook_4_1),
                findViewById(R.id.hook_4_2),
                findViewById(R.id.hook_4_3)
        };

        // Ensure all hooks start with alpha 0 (invisible)
        setHooksAlpha(hooks1, 0f);
        setHooksAlpha(hooks2, 0f);
        setHooksAlpha(hooks3, 0f);
        setHooksAlpha(hooks4, 0f);

        // Initialize Slider (again, to set value range and step size)
        sliderTimer.setValueFrom(0);
        sliderTimer.setValueTo(80);
        sliderTimer.setStepSize(10);

        // Update progress circle max when slider changes
        sliderTimer.addOnChangeListener(new Slider.OnChangeListener() {
            @Override
            public void onValueChange(Slider slider, float value, boolean fromUser) {
                progressCircle.setMax((int) value);
                progressCircle.setProgress(0);  // Reset progress when slider changes
                textCountdown.setText(String.format("%01ds", (int) value));
                textCountdown.setTextColor(ContextCompat.getColor(HookHelperActivity.this, R.color.darker_grey));

                getSharedPreferences("HookHelperPrefs", MODE_PRIVATE)
                        .edit()
                        .putFloat("slider_value", value)
                        .apply();
            }
        });

        // Initialize timer start and reset buttons
        Button buttonTimerStart = findViewById(R.id.button_timer_start);
        Button buttonTimerReset = findViewById(R.id.button_timer_reset);

        // Define the timer Runnable which updates the TextView and progress circle every second
        timerRunnable = new Runnable() {
            @Override
            public void run() {
                textCountdown.setText(String.format("%01ds", currentTime[0]));
                progressCircle.setProgress(currentTime[0]);  // Update progress circle

                int target = (int) sliderTimer.getValue();
                if (currentTime[0] < target) {
                    currentTime[0]++;
                    handler.postDelayed(this, 1000);
                } else {
                    // Re-enable slider when timer completes
                    sliderTimer.setEnabled(true);
                    sliderTimer.setTrackActiveTintList(originalTrackColorActive);
                    sliderTimer.setTrackInactiveTintList(originalTrackColorInactive);
                    sliderTimer.setThumbTintList(originalThumbColor);
                    sliderTimer.setHaloTintList(originalHaloColor);
                    sliderTimer.setTickTintList(originalTickColor);

                    textTimerSet.setTextColor(ContextCompat.getColor(HookHelperActivity.this, R.color.white));
                }
            }
        };

        // When start is clicked, reset timer to 0 and begin counting up
        buttonTimerStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Disable Slider and set its colors to darker_grey.
                sliderTimer.setEnabled(false);
                sliderTimer.setTrackActiveTintList(ColorStateList.valueOf(ContextCompat.getColor(HookHelperActivity.this, R.color.darker_grey)));
                sliderTimer.setTrackInactiveTintList(ColorStateList.valueOf(ContextCompat.getColor(HookHelperActivity.this, R.color.darker_grey)));
                sliderTimer.setThumbTintList(ColorStateList.valueOf(ContextCompat.getColor(HookHelperActivity.this, R.color.darker_grey)));
                sliderTimer.setHaloTintList(ColorStateList.valueOf(ContextCompat.getColor(HookHelperActivity.this, R.color.darker_grey)));
                sliderTimer.setTickTintList(ColorStateList.valueOf(ContextCompat.getColor(HookHelperActivity.this, R.color.darker_grey)));

                textTimerSet.setTextColor(ContextCompat.getColor(HookHelperActivity.this, R.color.darker_grey));

                // Animate progress circle indicator color from its current color (first element of the array) to white.
                int currentColor = progressCircle.getIndicatorColor()[0];
                int targetColor = ContextCompat.getColor(HookHelperActivity.this, android.R.color.white);
                ValueAnimator colorAnimator = ValueAnimator.ofObject(new ArgbEvaluator(), currentColor, targetColor);
                colorAnimator.setDuration(50); // Duration in milliseconds (adjust as needed)
                colorAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                    @Override
                    public void onAnimationUpdate(ValueAnimator animator) {
                        progressCircle.setIndicatorColor((int) animator.getAnimatedValue());
                    }
                });
                colorAnimator.start();

                // Set text color to white when timer starts.
                textCountdown.setTextColor(ContextCompat.getColor(HookHelperActivity.this, android.R.color.white));

                // Reset progress and start timer.
                progressCircle.setMax((int) sliderTimer.getValue());
                progressCircle.setProgress(0);
                handler.removeCallbacks(timerRunnable);
                currentTime[0] = 0;
                handler.postDelayed(timerRunnable, 0);
            }
        });

        buttonTimerReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Re-enable Slider and restore original colors
                sliderTimer.setEnabled(true);
                sliderTimer.setTrackActiveTintList(originalTrackColorActive);
                sliderTimer.setTrackInactiveTintList(originalTrackColorInactive);
                sliderTimer.setThumbTintList(originalThumbColor);
                sliderTimer.setHaloTintList(originalHaloColor);
                sliderTimer.setTickTintList(originalTickColor);

                textTimerSet.setTextColor(ContextCompat.getColor(HookHelperActivity.this, R.color.white));

                // Set text color back to darker_grey when reset
                textCountdown.setTextColor(ContextCompat.getColor(HookHelperActivity.this, R.color.darker_grey));
                progressCircle.setIndicatorColor(ContextCompat.getColor(HookHelperActivity.this, R.color.darker_grey));

                // Reset progress and timer to slider's current value
                int resetValue = (int) sliderTimer.getValue();  // Get current slider value
                progressCircle.setProgress(resetValue);
                handler.removeCallbacks(timerRunnable);
                currentTime[0] = resetValue;
                textCountdown.setText(String.format("%01ds", currentTime[0]));
            }
        });

        // Initialize shrine perk icon ImageViews
        shrinePerkIcon1 = findViewById(R.id.shrine_perk_icon_1);
        shrinePerkIcon2 = findViewById(R.id.shrine_perk_icon_2);
        shrinePerkIcon3 = findViewById(R.id.shrine_perk_icon_3);
        shrinePerkIcon4 = findViewById(R.id.shrine_perk_icon_4);

        // Initialize and configure Clear Button
        Button buttonHookClear = findViewById(R.id.button_hook_clear);
        buttonHookClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Reset Container 1
                setHooksAlpha(hooks1, 0f);
                count1 = 0;
                stage1 = 0;
                shrinePerkIcon1.setImageResource(getResourceId("icon_hook_stage_1_0"));

                // Reset Container 2
                setHooksAlpha(hooks2, 0f);
                count2 = 0;
                stage2 = 0;
                shrinePerkIcon2.setImageResource(getResourceId("icon_hook_stage_2_0"));

                // Reset Container 3
                setHooksAlpha(hooks3, 0f);
                count3 = 0;
                stage3 = 0;
                shrinePerkIcon3.setImageResource(getResourceId("icon_hook_stage_3_0"));

                // Reset Container 4
                setHooksAlpha(hooks4, 0f);
                count4 = 0;
                stage4 = 0;
                shrinePerkIcon4.setImageResource(getResourceId("icon_hook_stage_4_0"));
            }
        });

        // --- Container 1 buttons ---
        Button buttonPlus1 = findViewById(R.id.button_plus_1);
        Button buttonMinus1 = findViewById(R.id.button_minus_1);

        buttonPlus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Update hooks for container 1
                if (count1 < hooks1.length) {
                    hooks1[count1].setAlpha(1f);
                    count1++;
                }
                // Increase stage (max 3) and update shrine perk icon image
                if (stage1 < 3) {
                    stage1++;
                    shrinePerkIcon1.setImageResource(getResourceId("icon_hook_stage_1_" + stage1));
                }
            }
        });

        buttonMinus1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Update hooks for container 1
                if (count1 > 0) {
                    count1--;
                    hooks1[count1].setAlpha(0f);
                }
                // Decrease stage (min 0) and update shrine perk icon image
                if (stage1 > 0) {
                    stage1--;
                    shrinePerkIcon1.setImageResource(getResourceId("icon_hook_stage_1_" + stage1));
                }
            }
        });

        // --- Container 2 buttons ---
        Button buttonPlus2 = findViewById(R.id.button_plus_2);
        Button buttonMinus2 = findViewById(R.id.button_minus_2);

        buttonPlus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count2 < hooks2.length) {
                    hooks2[count2].setAlpha(1f);
                    count2++;
                }
                if (stage2 < 3) {
                    stage2++;
                    shrinePerkIcon2.setImageResource(getResourceId("icon_hook_stage_2_" + stage2));
                }
            }
        });

        buttonMinus2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count2 > 0) {
                    count2--;
                    hooks2[count2].setAlpha(0f);
                }
                if (stage2 > 0) {
                    stage2--;
                    shrinePerkIcon2.setImageResource(getResourceId("icon_hook_stage_2_" + stage2));
                }
            }
        });

        // --- Container 3 buttons ---
        Button buttonPlus3 = findViewById(R.id.button_plus_3);
        Button buttonMinus3 = findViewById(R.id.button_minus_3);

        buttonPlus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count3 < hooks3.length) {
                    hooks3[count3].setAlpha(1f);
                    count3++;
                }
                if (stage3 < 3) {
                    stage3++;
                    shrinePerkIcon3.setImageResource(getResourceId("icon_hook_stage_3_" + stage3));
                }
            }
        });

        buttonMinus3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count3 > 0) {
                    count3--;
                    hooks3[count3].setAlpha(0f);
                }
                if (stage3 > 0) {
                    stage3--;
                    shrinePerkIcon3.setImageResource(getResourceId("icon_hook_stage_3_" + stage3));
                }
            }
        });

        // --- Container 4 buttons ---
        Button buttonPlus4 = findViewById(R.id.button_plus_4);
        Button buttonMinus4 = findViewById(R.id.button_minus_4);

        buttonPlus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count4 < hooks4.length) {
                    hooks4[count4].setAlpha(1f);
                    count4++;
                }
                if (stage4 < 3) {
                    stage4++;
                    shrinePerkIcon4.setImageResource(getResourceId("icon_hook_stage_4_" + stage4));
                }
            }
        });

        buttonMinus4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count4 > 0) {
                    count4--;
                    hooks4[count4].setAlpha(0f);
                }
                if (stage4 > 0) {
                    stage4--;
                    shrinePerkIcon4.setImageResource(getResourceId("icon_hook_stage_4_" + stage4));
                }
            }
        });
    }

    // Helper method to set alpha for an array of ImageViews
    private void setHooksAlpha(ImageView[] hooks, float alpha) {
        for (ImageView hook : hooks) {
            hook.setAlpha(alpha);
        }
    }

    // Helper method to get resource ID safely
    private int getResourceId(String name) {
        return getResources().getIdentifier(name, "drawable", getPackageName());
    }
}