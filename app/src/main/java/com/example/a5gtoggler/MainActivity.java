package com.example.a5gtoggler;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Directly open mobile network settings
        Intent intent = new Intent(Settings.ACTION_NETWORK_OPERATOR_SETTINGS);
        startActivity(intent);

        // Close the app after launching the settings
        finish();
    }
}
