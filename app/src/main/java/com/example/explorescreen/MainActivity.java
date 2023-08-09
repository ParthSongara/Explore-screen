package com.example.explorescreen;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Get references to UI elements
        ImageView headerImageView = findViewById(R.id.headerImageView);
        TextView titleTextView = findViewById(R.id.titleTextView);
        CardView itemCardView = findViewById(R.id.itemCardView);
        ImageView itemImageView = findViewById(R.id.itemImageView);
        TextView itemTitleTextView = findViewById(R.id.itemTitleTextView);
        TextView itemDescriptionTextView = findViewById(R.id.itemDescriptionTextView);

        // Set header image
        headerImageView.setImageResource(R.drawable.explore_header_image);

        // Set title text
        titleTextView.setText("Explore");

        // Set item details
        itemImageView.setImageResource(R.drawable.explore_header_image);
        itemTitleTextView.setText("Item Title");
        itemDescriptionTextView.setText("Item Description");

        // Set click listener for the item
        itemCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle item click event
                Toast.makeText(MainActivity.this, "Item clicked!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
