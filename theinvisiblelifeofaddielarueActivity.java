package com.example.minilibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class theinvisiblelifeofaddielarueActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_theinvisiblelifeofaddielarue);
        goBrowseBooks();
        goRequestBooks();

    }

    private void goRequestBooks(){
        Button button = (Button) findViewById(R.id.RequestBook);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(theinvisiblelifeofaddielarueActivity.this, RequestActivity.class));
            }
        });
    }

    private void goBrowseBooks(){
        Button button = (Button) findViewById(R.id.backButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(theinvisiblelifeofaddielarueActivity.this, BrowseBooksActivity.class));
            }
        });
    }
}