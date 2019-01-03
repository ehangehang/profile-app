package com.example.acer.pkl;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        configureToTecharea();
        configureToProfile();
        configureToStematel();
        configureToAbout();
        configureToAssign();
    }
    private void configureToProfile(){
        CardView studentcard = (CardView) findViewById(R.id.studentcard);
        studentcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this, students.class));
            }
        });
    }
    private void configureToTecharea(){
        CardView techareacard = (CardView) findViewById(R.id.techareacard);
        techareacard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this, techarea.class));
            }
        });
    }
    private void configureToStematel(){
        CardView stematelcard = (CardView) findViewById(R.id.stematelcard);
        stematelcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this, stematel.class));
            }
        });
    }
    private void configureToAbout(){
        CardView aboutcard = (CardView) findViewById(R.id.aboutcard);
        aboutcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this, about.class));
            }
        });
    }
    private void configureToAssign(){
        CardView assignmentcard = (CardView) findViewById(R.id.assignmentcard);
        assignmentcard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(home.this, assignment.class));
            }
        });
    }
}
