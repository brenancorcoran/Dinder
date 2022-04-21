package com.dinder.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.dinder.FifthActivity;
import com.dinder.R;
import com.dinder.SecondActivity;

public class ThirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
    }

    public void findLikeClick(View view) {
        startActivity(new Intent(this, FifthActivity.class));
    }

    public void findDislikeClick(View view) {
        startActivity(new Intent(this, SecondActivity.class));
    }
}