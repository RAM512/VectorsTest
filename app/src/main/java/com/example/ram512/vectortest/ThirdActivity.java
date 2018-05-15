package com.example.ram512.vectortest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Switch;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        Switch tailLightsSwitch = findViewById(R.id.TailLightsOff);
        Switch leftTurnLightSwitch = findViewById(R.id.LeftTurnLightOff);
        Switch rightTurnLightSwitch = findViewById(R.id.RightTurnLightOff);

        tailLightsSwitch.setTrackResource(R.drawable.track);
        leftTurnLightSwitch.setTrackResource(R.drawable.track);
        rightTurnLightSwitch.setTrackResource(R.drawable.track);
    }
}
