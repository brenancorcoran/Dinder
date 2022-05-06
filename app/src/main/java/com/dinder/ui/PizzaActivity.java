package com.dinder.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.dinder.MatchActivity;
import com.dinder.R;

public class PizzaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);
    }

    public void findLikeClick(View view) {
        startActivity(new Intent(this, MatchActivity.class));
    }

    public void findDislikeClick(View view) {
        startActivity(new Intent(this, SushiActivity.class));
    }
}