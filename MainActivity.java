package com.example.prac_xml;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


       Button btn=findViewById(R.id.button);;

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent newintent= new Intent(MainActivity.this,xml.class);
                startActivity(newintent);

                // assigning ID of the toolbar to a variable
                Toolbar toolbar = (Toolbar) findViewById(R.id.my_toolbar);

                // using toolbar as ActionBar
                setSupportActionBar(toolbar);
                ActionBar ab = getSupportActionBar();

                // Enable the Up button
                ab.setDisplayHomeAsUpEnabled(true);
            }

        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
// Inflate the menu; this adds items to the action bar if it is
        this.getMenuInflater().inflate(R.menu.example_menu, menu);
        return true;
    }
}