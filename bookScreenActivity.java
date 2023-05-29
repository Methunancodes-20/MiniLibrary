package com.example.minilibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class bookScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_screen);
    }
    public void goBrowseBooks(View view) {
        startActivity(new Intent(bookScreenActivity.this, BrowseBooksActivity.class));
    }

}