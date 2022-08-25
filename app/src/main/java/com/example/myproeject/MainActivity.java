package com.example.myproeject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button button;
    static int count = 0;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        button = findViewById(R.id.clickButton);
        textView = findViewById(R.id.textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                button.setText(count + "");

                if (count > 100 && count < 1000) {
                    textView.setText("Хорошее начало");
                }
                if (count > 100 && count < 1000) {
                    textView.setText("Так держать!!!");
                }
                if(count == 10){
                    Toast.makeText(getApplicationContext(),"10 это только начало", Toast.LENGTH_LONG).show();
                }
                if(count == 1000){
                    Toast.makeText(getApplicationContext(),"КРАСАВА!", Toast.LENGTH_LONG).show();
                }
            }
        });
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(intent);
            }
        });

    }
}