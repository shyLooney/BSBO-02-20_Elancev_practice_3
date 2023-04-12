package ru.mirea.elancev.intentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import java.text.SimpleDateFormat;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
        String message = getIntent().getStringExtra("message");
//        String message = savedInstanceState.getString("message");
        TextView textView = findViewById(R.id.textView);
        textView.setText("КВАДРАТ ЗНАЧЕНИЯ\n" +
                "МОЕГО НОМЕРА ПО СПИСКУ В ГРУППЕ СОСТАВЛЯЕТ " + (5 * 5) +
                ", а текущее время равно " + message);
        //System.out.println(intent.getStringExtra("message"));
        //textView.setText(intent.getStringExtra("message"));
    }
}