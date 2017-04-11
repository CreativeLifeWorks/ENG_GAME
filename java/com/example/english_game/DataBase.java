package com.example.english_game;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DataBase extends SQLiteOpenHelper {
    public DataBase(Context context) {
        super(context, "MyTable.db", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE MyTable " +
                "(" +  "_id INTEGER PRIMARY KEY AUTOINCREMENT" +
                ", Quiz TEXT" +
                ", Ans0 TEXT" +
                ", Ans1 TEXT" +
                ", Ans2 TEXT" +
                ", Ans3 TEXT" +
                ", Ans4 TEXT" +
                ")");
        //10
        db.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('vote','投票','投票','与党','人口','野党');");
        db.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('court','裁判所','告訴','裁判所','法律','司法');");
        db.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('education','教育','教育','教室','演習','学問');");
        db.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('moment','瞬間','分','時間','すぐに','瞬間');");
        db.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('shine','輝く','光','反射','屈折','輝く');");
        db.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('neighbor','隣人','集団','隣人','案内人','人ごみ');");
        db.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('language','言語','知識','考え','勉強','言語');");
        db.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('fashion','流行','流出','言葉','流行','才能');");
        db.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('like','','好き','好き','物','最高','お気に入りの');");
        db.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('city','市','市','県','所在地','町');");

    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
