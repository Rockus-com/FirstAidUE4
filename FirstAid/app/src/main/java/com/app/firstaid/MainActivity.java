package com.app.firstaid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void buttonGo(View view){
        Toast.makeText(this, "Вторая страница", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_first);
    }
    public void buttonLeave(View view){
        Toast.makeText(this, "Возвращаюсь назад", Toast.LENGTH_SHORT).show();
        setContentView(R.layout.activity_main);
    }
}