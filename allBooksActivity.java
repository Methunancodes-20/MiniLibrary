package com.example.minilibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class allBooksActivity extends AppCompatActivity {
    ImageButton myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_books);
        marco();
        diary();
        perks();
        percyJack();
        seaMon();
        goOok();
        potter2();
        potter();
        bothDie();
        invisible();
        pi();
        money();
        lying();
        jobs();
        tokyo();
        goBB();

    }
    private void goOok(){
        myImage = (ImageButton) findViewById(R.id.imageButton11);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, OokandGlukActivity2.class));
            }
        });
    }
    private void diary(){
        myImage = (ImageButton) findViewById(R.id.imageButton9);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, WimpyKidActivity.class));
            }
        });
    }
    private void perks(){
        myImage = (ImageButton) findViewById(R.id.imageButton20);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, theperksofbeingawallflowerActivity.class));
            }
        });
    }
    private void potter(){
        myImage = (ImageButton) findViewById(R.id.imageButton24);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, HarryPotterActivity1.class));
            }
        });
    }
    private void bothDie(){
        myImage = (ImageButton) findViewById(R.id.imageButton22);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, theybothdieattheendActivity.class));
            }
        });
    }
    private void percyJack(){
        myImage = (ImageButton) findViewById(R.id.imageButton18);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, percyActivity.class));
            }
        });
    }
    private void potter2(){
        myImage = (ImageButton) findViewById(R.id.imageButton29);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, HarryPotterActivity2.class));
            }
        });
    }
    private void pi(){
        myImage = (ImageButton) findViewById(R.id.imageButton19);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, LifeofPiActivity.class));
            }
        });
    }
    private void invisible(){
        myImage = (ImageButton) findViewById(R.id.imageButton15);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, theinvisiblelifeofaddielarueActivity.class));
            }
        });
    }
    private void money(){
        myImage = (ImageButton) findViewById(R.id.imageButton10);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, psychologyofmoneyActivity.class));
            }
        });
    }
    private void lying(){
        myImage = (ImageButton) findViewById(R.id.imageButton6);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, oneofusislyingActivity.class));
            }
        });
    }
    private void seaMon(){
        myImage = (ImageButton) findViewById(R.id.imageButton3);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, SeaofMonActivity.class));
            }
        });
    }
    private void jobs(){
        myImage = (ImageButton) findViewById(R.id.imageButton4);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, JobsActivity.class));
            }
        });
    }
    private void tokyo(){
        myImage = (ImageButton) findViewById(R.id.imageButton2);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, TokyoActivity.class));
            }
        });
    }
    private void marco(){
        myImage = (ImageButton) findViewById(R.id.imageButton);
        myImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, MarcoPoloActivity.class));
            }
        });
    }
    private void goBB(){
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(allBooksActivity.this, BrowseBooksActivity.class));
            }
        });
    }









}