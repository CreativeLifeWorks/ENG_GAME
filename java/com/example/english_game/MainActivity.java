package com.example.english_game;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity  {

    @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            //タイトルバーを非表示にする（必ずsetContentViewの前にすること）
            requestWindowFeature(Window.FEATURE_NO_TITLE);
            // レイアウトをセットする
            setContentView(R.layout.activity_main);

            // フォントを変更 ここから***********************************************************************************
        // タイトルテキスト
            ((TextView)findViewById(R.id.titleText)).setTypeface(Typeface.createFromAsset(getAssets(), "manteka.ttf"));
            // Normalボタン
            ((Button)findViewById(R.id.button_eng)).setTypeface(Typeface.createFromAsset(getAssets(), "manteka.ttf"));
            // Randomボタン
            ((Button)findViewById(R.id.button_jpn)).setTypeface(Typeface.createFromAsset(getAssets(), "manteka.ttf"));
            // TimeAttackボタン
            ((Button)findViewById(R.id.button_time)).setTypeface(Typeface.createFromAsset(getAssets(), "manteka.ttf"));
            // フォントを変更 ここまで***********************************************************************************
        }

        // ボタンがタッチされた時の処理
        @SuppressWarnings("unused")
        public void onClick(View v){
            switch (v.getId()) {
                // タッチされたボタンがノーマルの場合
                case R.id.button_eng:
                    Toast.makeText(this, "START！", Toast.LENGTH_SHORT).show();
                    Intent intent;
                    intent = new Intent(MainActivity.this,English.class);
                    startActivity(intent);
                    break;
                // タッチされたボタンがランダムの場合
                case R.id.button_jpn:
                    Toast.makeText(this, "START！", Toast.LENGTH_SHORT).show();
                    intent = new Intent(MainActivity.this,Japanese.class);
                    startActivity(intent);
                    break;
                // タッチされたボタンがタイムアタックの場合time
                case R.id.button_time:
                    Toast.makeText(this, "タッチされた！", Toast.LENGTH_SHORT).show();

            }
        }
    }

