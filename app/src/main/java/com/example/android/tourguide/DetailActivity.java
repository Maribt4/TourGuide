package com.example.android.tourguide;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_detail);

        // Get the data from previous activity (selected location and all details from arrays) and display it
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            TextView nameTextView = findViewById(R.id.detail_name);
            TextView addressTextView = findViewById(R.id.detail_address);
            TextView descriptionTextView = findViewById(R.id.detail_description);
            ImageView imageViewView = findViewById(R.id.imageView);
            nameTextView.setText(extras.getString("LOCATIONNAME"));
            addressTextView.setText(extras.getString("LOCATIONADDRESS"));
            descriptionTextView.setText(extras.getString("LOCATIONDESCRIPTION"));
            imageViewView.setImageResource(extras.getInt("LOCATIONIMAGE"));
        }
    }
}
