package com.example.yosuke.intent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity implements View.OnClickListener {

    Button get, move;
    TextView textview1, textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        get = findViewById(R.id.btn1);
        move = findViewById(R.id.btn2);
        textview1 = findViewById(R.id.tv2);
        textView2 = findViewById(R.id.tv3);

        get.setOnClickListener(this);
        move.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn1:

               String a = getIntent().getStringExtra("Name111");
                String b = getIntent().getStringExtra("Phone");

                textview1.setText(a);
                textView2.setText(b);
                break;

            case R.id.btn2 :
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);


        }
    }
}
