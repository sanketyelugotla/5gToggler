package com.example.a5gtoggler;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Settings;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Open mobile network settings directly
        Intent intent = new Intent(Settings.ACTION_NETWORK_OPERATOR_SETTINGS);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);

            // Start the accessibility service to handle the button click
            // Directly trigger the service as soon as settings page is opened
            Intent accessibilityServiceIntent = new Intent(this, MyAccessibilityService.class);
            startService(accessibilityServiceIntent);
        } else {
            System.err.println("Network settings activity not available!");
        }

        // Close the app immediately after opening the settings
        finish();
    }
}
