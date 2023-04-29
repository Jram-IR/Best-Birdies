package com.project.bestbirdies;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.project.bestbirdys.R;

public class BirdActivity extends AppCompatActivity {

    public static final String B1 = "Black Browed Albastross";
    public static final String B2 = "Siberian Crane";
    public static final String B3 = "Eskimo Curlew";
    public static final String B4 = "Piping Plover";
    public static final String B5 = "Hyacinth Macaw";
    public static final String B6 = "California Condor";

    public static final String NAME = "bird name";
    public static final String INFO = "bird info";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_birds);
    }

    public void birdClick(View v)
    {
        switch (v.getTag().toString())
        {
            case "b1":
                createIntent(B1,getResources().getString(R.string.bird1));
                break;

            case "b2":
                createIntent(B2,getResources().getString(R.string.bird2));
                break;

            case "b3":
                createIntent(B3,getResources().getString(R.string.bird3));
                break;

            case "b4":
                createIntent(B4,getResources().getString(R.string.bird4));
                break;

            case "b5":
                createIntent(B5,getResources().getString(R.string.bird5));
                break;

            case "b6":
                createIntent(B6,getResources().getString(R.string.bird6));
                break;
        }
    }

    void createIntent(String bird, String info )
    {
        Toast.makeText(this, bird, Toast.LENGTH_SHORT).show();
        Intent intent = new Intent(BirdActivity.this, BirdInfoActivity.class);
        intent.putExtra(NAME,bird);
        intent.putExtra(INFO,info);
        startActivity(intent);
    }
}