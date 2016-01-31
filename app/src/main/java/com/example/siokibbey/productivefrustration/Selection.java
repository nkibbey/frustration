package com.example.siokibbey.productivefrustration;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.view.View.OnClickListener;
import android.content.Intent;


public class Selection extends AppCompatActivity implements OnClickListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selection);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(this); // calling onClick() method
        Button two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(this);
        Button three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(this);

        final int x = getIntent().getIntExtra("stars",0);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Snackbar.make(view, "Angry enough for "+x+" stars", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }


    @Override
    public void onClick(View v) {
        Intent intent;

        switch (v.getId()) {

            case R.id.button1:
                intent = new Intent(this, Gov.class);
                break;

            case R.id.button2:
                intent = new Intent(this, Cats.class);
                break;

            case R.id.button3:
                intent = new Intent(this, Charlie.class);
                break;

            default:
                intent = new Intent(this, Home.class);
                break;
        }
        startActivity(intent);

    }

}
