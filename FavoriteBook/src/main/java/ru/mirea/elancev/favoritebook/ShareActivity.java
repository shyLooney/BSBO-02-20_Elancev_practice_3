package ru.mirea.elancev.favoritebook;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        Bundle extras = getIntent().getExtras();
        extras = getIntent().getExtras();
        if (extras != null) {
            TextView ageView = findViewById(R.id.textView3);
            String university = extras.getString(MainActivity.KEY);
            ageView.setText(String.format("Моя любимая книга: %s", university));
        }
    }

    public void clickSend(View view) {
        Intent data = new Intent();
        data.putExtra(MainActivity.USER_MESSAGE, "sema");
        setResult(Activity  .RESULT_OK, data);
        finish();
    }
}