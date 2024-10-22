package com.example.weatherapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ResultCity extends AppCompatActivity {
    TextView txt;
    Button backtologin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_city);

        txt = findViewById(R.id.textView2);
        backtologin = findViewById(R.id.back);

        String val = getIntent().getStringExtra("main" );
        txt.setText(val );

        backtologin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ResultCity.this,MainActivity.class);
                startActivity(intent);
            }
     });


}
}