package ru.mirea.bandurin.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        String str = "КВАДРАТ ЗНАЧЕНИЯ МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ 16, а текущее время ";
        String text = (String) getIntent().getSerializableExtra("key");
        str = str+text;
        TextView textview = (TextView) findViewById(R.id.textView2);
        textview.setText(str);
    }
}