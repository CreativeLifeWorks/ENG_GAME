package com.example.english_game;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.view.View;
import android.view.View.OnClickListener;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class Result extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Intent intent = getIntent();

        int Correct = intent.getIntExtra("Correct",0);

        TextView txt = (TextView) findViewById(R.id.Result);
        txt.setText("正解数は" + String.valueOf(Correct));

        Button btnDisp = (Button)findViewById(R.id.button1);

        btnDisp.setOnClickListener(new OnClickListener() {

            public void onClick(View v) {

                Intent intent = new Intent();

                intent.setClassName("com.example.english_game", "com.example.english_game.MainActivity");
                startActivity(intent);

            }
        });

    }
}