package com.example.pathomporn.basicsqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DBHelper db = new DBHelper(this, null, null, 0);
        db.getWritableDatabase();
        Toast.makeText(MainActivity.this, "Create New DB success!!",Toast.LENGTH_LONG).show();

    }

}