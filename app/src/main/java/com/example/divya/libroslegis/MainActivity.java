package com.example.divya.libroslegis;

import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;
    private CardView text1, text2, text3, text4, text5, text6;
    private FloatingActionButton fab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mDrawerLayout=findViewById(R.id.drawer);
        mToggle=new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);
        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //various activities
        text1 = findViewById(R.id.card_view1);
        text2 = findViewById(R.id.card_view2);
        text3 = findViewById(R.id.card_view3);
        text4 = findViewById(R.id.card_view4);
        text5 = findViewById(R.id.card_view5);
        text6 = findViewById(R.id.card_view6);


        //Adding click listeners
        text1.setOnClickListener(this);
        text2.setOnClickListener(this);
        text3.setOnClickListener(this);
        text4.setOnClickListener(this);
        text5.setOnClickListener(this);
        text6.setOnClickListener(this);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, fabChatbot.class);
                startActivity(intent);
            }
        });


    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if (mToggle.onOptionsItemSelected(item))
        {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View view) {
        Intent i;
        switch (view.getId()){
            case R.id.card_view1 : i = new Intent(this, Maternity.class); startActivity(i); break;
            case R.id.card_view2 : i = new Intent(this, Harrass.class);startActivity(i); break;
            case R.id.card_view3 : i = new Intent(this, Equal.class); startActivity(i); break;
            case R.id.card_view4 : i = new Intent(this, Factories.class); startActivity(i); break;
            case R.id.card_view5 : i = new Intent(this, Violence.class); startActivity(i); break;
            case R.id.card_view6 : i = new Intent(this, Work.class); startActivity(i); break;

            default:break;
        }
    }
}

