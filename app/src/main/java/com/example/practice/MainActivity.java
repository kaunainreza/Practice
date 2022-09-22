package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Second.class);
                startActivity(intent);
            }
        });

        Log.i("State","onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("State","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("State","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("State","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("State","onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("State","onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("State","onDestroy");
    }
}