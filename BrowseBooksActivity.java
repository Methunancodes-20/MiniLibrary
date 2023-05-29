package com.example.minilibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class BrowseBooksActivity extends AppCompatActivity {
    ImageButton myImage;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browsebooks);

        goMain();
        goOok();
        diary();
        percyJack();
        perks();
        bothDie();
        potter();
        goAllBooks();

    }

    private void goMain(){
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BrowseBooksActivity.this, MainActivity.class));
            }
        });
    }

    private void goOok(){
        myImage = (ImageButton) findViewById(R.id.imageButton11);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BrowseBooksActivity.this, OokandGlukActivity2.class));
            }
        });
    }
    private void diary(){
        myImage = (ImageButton) findViewById(R.id.imageButton9);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BrowseBooksActivity.this, WimpyKidActivity.class));
            }
        });
    }
    private void perks(){
        myImage = (ImageButton) findViewById(R.id.imageButton20);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BrowseBooksActivity.this, theperksofbeingawallflowerActivity.class));
            }
        });
    }
    private void potter(){
        myImage = (ImageButton) findViewById(R.id.imageButton24);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BrowseBooksActivity.this, HarryPotterActivity1.class));
            }
        });
    }
    private void bothDie(){
        myImage = (ImageButton) findViewById(R.id.imageButton22);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BrowseBooksActivity.this, theybothdieattheendActivity.class));
            }
        });
    }
    private void percyJack(){
        myImage = (ImageButton) findViewById(R.id.imageButton18);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BrowseBooksActivity.this, percyActivity.class));
            }
        });
    }





    private void goAllBooks(){
        Button button = (Button) findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(BrowseBooksActivity.this, allBooksActivity.class));
            }
        });
    }






}