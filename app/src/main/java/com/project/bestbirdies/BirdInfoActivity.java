package com.project.bestbirdies;

import static com.project.bestbirdies.BirdActivity.INFO;
import static com.project.bestbirdies.BirdActivity.NAME;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.project.bestbirdys.R;

public class BirdInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_info);

        String birdName = getIntent().getStringExtra(NAME);
        String birdInfo = getIntent().getStringExtra(INFO);

        TextView txt_name = findViewById(R.id.bName);
        TextView txt_info = findViewById(R.id.bInfo);

        txt_name.setText(birdName);
        txt_info.setText(birdInfo);


    }
}