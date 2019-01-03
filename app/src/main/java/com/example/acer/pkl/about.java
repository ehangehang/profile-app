package com.example.acer.pkl;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import com.getbase.floatingactionbutton.FloatingActionButton;

public class about extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        configureToActionA();
        configureToActionB();
        configureToActionC();
        configureToActionD();

    }

    private void configureToActionA(){
        FloatingActionButton action_a = (FloatingActionButton) findViewById(R.id.action_a);
        action_a.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(about.this, stematel.class));
            }
        });
    }

    private void configureToActionB(){
        FloatingActionButton action_b = (FloatingActionButton) findViewById(R.id.action_b);
        action_b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(about.this, techarea.class));
            }
        });
    }
    private void configureToActionC(){
        FloatingActionButton action_c_ = (FloatingActionButton) findViewById(R.id.action_c);
        action_c_.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(about.this, students.class));
            }
        });
    }

    private void configureToActionD(){
        FloatingActionButton action_d = (FloatingActionButton) findViewById(R.id.action_d);
        action_d.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                startActivity(new Intent(about.this, assignment.class));
            }
        });
    }
}
