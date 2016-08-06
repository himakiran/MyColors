package com.example.android.mycolors;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeColor(View view) {

        Button b = (Button) findViewById(R.id.closeBtn);
        b.setTextColor(Color.BLUE);
        b.setBackgroundColor(Color.RED);

        Button c = (Button) findViewById(R.id.pushButton);
        c.setVisibility(View.INVISIBLE);
        LinearLayout ll = (LinearLayout) findViewById(R.id.layoutOne);
        ll.setBackgroundColor(Color.RED);
        ActionBar a = getSupportActionBar();
        a.setBackgroundDrawable(new ColorDrawable(Color.RED));
        a.setDisplayShowTitleEnabled(false);


    }

    public void exitApp(View view) {
        finish();


    }
}
