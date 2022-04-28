package com.dinder.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dinder.MatchActivity;
import com.dinder.R;
import com.dinder.ShuffleActivity;

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
        startActivity(new Intent(this, ShuffleActivity.class));
    }
}