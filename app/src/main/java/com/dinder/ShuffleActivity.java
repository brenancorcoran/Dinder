package com.dinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class ShuffleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shuffle);

    }

    public void findFoodClick(View view) {

        String[] views = {
                "SaladActivity",
                "PizzaActivity",
                "SushiActivity",
        };

        int randomInt = new Random().nextInt(views.length);

        String randomActivity = views[randomInt];

        try {
            Class<?> klazz = Class.forName("com.dinder.ui." + randomActivity);
            startActivity(new Intent(this, klazz));
        } catch (ClassNotFoundException e)  {
            e.printStackTrace();
        }
    }
}

