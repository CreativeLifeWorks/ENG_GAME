package com.example.english_game;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DataBase2 extends SQLiteOpenHelper {
    public DataBase2(Context context) {
        super(context, "MyTable2.db2", null, 1);
    }


    @Override
    public void onCreate(SQLiteDatabase db2) {
        db2.execSQL("CREATE TABLE MyTable " +
                "(" +  "_id INTEGER PRIMARY KEY AUTOINCREMENT" +
                ", Quiz TEXT" +
                ", Ans0 TEXT" +
                ", Ans1 TEXT" +
                ", Ans2 TEXT" +
                ", Ans3 TEXT" +
                ", Ans4 TEXT" +
                ")");

        //10
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('冗談','joke','join','joy','fan','joke');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('工場','factory','industry','factory','company','buy');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('経済','economy','present','economy','market','room');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('感覚','sense','sprite','time','mind','sense');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('試し','try','play','try','bite','gain');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('正義','justice','truth','justice','study','clear');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('島','island','country','island','land','joke');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('利口な','smart','dependent','smart','full','lazy');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('怠惰な','lazy','diligent','lazy','earnest','cheerful');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('頑固な','obstinate','shy','timid','mind','obstinate');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('適切な','correct','exact','correct','slow','try');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('発熱','fever','illness','fever','medicine','pressure');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('表れ','sign','signal','symbol','name','sign');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('活動','active','action','active','habit','exercise');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('うなずき','nod','nod','pat','shake','wink');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('砂漠','desert','hill','valley','mountain','desert');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('情報','information','information','telephone','notice','note');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('正義','justice','truth','justice','study','clear');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('流行','fashion','simple','fish','flash','fashion');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('誇り','pride','doubt','anger','like','pride');");
        db2.execSQL("INSERT INTO MyTable(Quiz,ANS0, ANS1, ANS2, ANS3, ANS4) values ('効果','effect','effect','cause','difficult','shine');");


    }


    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
