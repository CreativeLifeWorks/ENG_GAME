package com.example.english_game;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Notification;
import android.content.DialogInterface;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.drawable.TransitionDrawable;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;


public class Japanese extends Activity implements OnClickListener {
    String QuestionNo;
    String Answer;
    Intent intent;

    // SoundPool(効果音再生)
    private SoundPool mSoundPool;
    private int[] mSoundId = new int[2]; // 使う効果音の数だけ配列作成

    private String path;
    int Correct = 0;
    private int mCount=0;


    int Cnt = 1;

    SQLiteDatabase db;
    Cursor c;
    int ret;
    int cn;

    String Ans0;
    String Ans1;
    String Ans2;
    String Ans3;
    String Ans4;
    int No[] = new int[10];

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanese);

        Random rnd = new Random();
        for (int i = 0; i < 10; i++) {

            No[i] = rnd.nextInt(10) + 1;
            int x = No[i];

            for (i = 0; i < 10; i++)
                if (No[i] == x)

                    break;
        }

        onQuestion();
    }

    @Override
    protected void onResume() {
        super.onResume();

        // 効果音を使えるように読み込み
        mSoundPool = new SoundPool(3, AudioManager.STREAM_MUSIC, 0);
        mSoundId[0] = mSoundPool.load(getApplicationContext(), R.raw.se_maoudamashii_onepoint15, 1);
        mSoundId[1] = mSoundPool.load(getApplicationContext(), R.raw.se_maoudamashii_onepoint33, 1);

    }

    //問題表示
    public void onQuestion() {
        //データベース読み込み
        String sql = "SELECT _id, Quiz, Ans0, Ans1, Ans2, Ans3, Ans4 FROM MyTable " +
                "WHERE _id=" + String.valueOf(No[Cnt - 1]);

        DataBase2 dbHelper = new DataBase2(this);
        db = dbHelper.getReadableDatabase();

        c = db.rawQuery(sql, null);
        c.moveToFirst();
        String Quiz = c.getString(c.getColumnIndex("Quiz"));
        Ans1 = c.getString(c.getColumnIndex("Ans1"));
        Ans2 = c.getString(c.getColumnIndex("Ans2"));
        Ans3 = c.getString(c.getColumnIndex("Ans3"));
        Ans4 = c.getString(c.getColumnIndex("Ans4"));

        Answer = c.getString(c.getColumnIndex("Ans0")); // 答え

        TextView txt = (TextView) findViewById(R.id.textQuestion);
        txt.setText(Quiz);
        Button btnAns1 = (Button) findViewById(R.id.button1);
        Button btnAns2 = (Button) findViewById(R.id.button2);
        Button btnAns3 = (Button) findViewById(R.id.button3);
        Button btnAns4 = (Button) findViewById(R.id.button4);

        btnAns1.setText(Ans1);
        btnAns2.setText(Ans2);
        btnAns3.setText(Ans3);
        btnAns4.setText(Ans4);
        btnAns1.setOnClickListener(this);
        btnAns2.setOnClickListener(this);
        btnAns3.setOnClickListener(this);
        btnAns4.setOnClickListener(this);

        // mCount++;
        TextView countView = (TextView) findViewById(R.id.textNo);
        countView.setText("クイズNo." + Cnt);

    }

    public void onClick(View v) {

        Button btn=(Button)v;


        // 押されたボタンのテキストと正解を比較
        if (((Button) v).getText().equals(Answer)) {

              // 正解の処理
            mSoundPool.play(mSoundId[0], 1.0f, 1.0f, 0, 0, 1.0f); // 正解音を再生
            new AlertDialog.Builder(this)
                    .setTitle("判定")
                    .setMessage("正解")
                    .setPositiveButton("OK", null)
                    .show();

            Cnt++;
            Correct++;
            onQuestion();
        }
        else {
            // 不正解の処理
            mSoundPool.play(mSoundId[1], 1.0f, 1.0f, 0, 0, 1.0f); // 不正解音を再生
            new AlertDialog.Builder(this)
                    .setTitle("判定")
                    .setMessage("不正解!正解は"+Answer)
                    .setPositiveButton("OK", null)
                    .show();
            Cnt++;
            Correct--;
            onQuestion();
        }
            if(Cnt==10){
            intent =new Intent(this,Result.class);
            intent.putExtra("Correct", Correct );
            startActivity(intent);
        }
    }




    // onPauseが呼ばれたら効果音に関する物は全て解放する
    @Override
    protected void onPause() {
        super.onPause();
        // SoundPool 解放
        mSoundPool.unload(mSoundId[0]);
        mSoundPool.unload(mSoundId[1]);

        mSoundPool.release();
    }

}
