package com.example.android.tic_tac_toe;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class StartscreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startscreen);

        Button three = (Button) findViewById(R.id.by3_board);
        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent three = new Intent(StartscreenActivity.this, MainActivity.class);
                startActivity(three);
            }
        });

        Button five = (Button) findViewById(R.id.by5_board);
        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent five = new Intent(StartscreenActivity.this, Main2Activity.class);
                startActivity(five);
            }
        });
    }
}


