package com.example.yosuke.intent2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button submit, move;
    EditText editText, editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        submit = findViewById(R.id.btn1);
        move = findViewById(R.id.btn2);

        editText = findViewById(R.id.et1);
        editText2 = findViewById(R.id.et2);

        submit.setOnClickListener(this);
        move.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        String a = editText.getText().toString();
        String b = editText2.getText().toString();

        switch(view.getId()) {

            case R.id.btn1:

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("Name", a);
                intent.putExtra("Phone", b);

                startActivity(intent);
                break;

            case R.id.btn2:
                Intent intent1 = new Intent(getApplicationContext(),SecondActivity.class);
                startActivity(intent1);
                break;

        }
    }
}
