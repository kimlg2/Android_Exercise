package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    EditText editText1;
    EditText editText2;
    ImageButton button1 ;
    ImageButton button2 ;
    ImageButton button3 ;
    ImageButton button4 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        textView1 = (TextView)findViewById(R.id.textView1);
        editText1 = (EditText)findViewById(R.id.editText1);
        editText2 = (EditText)findViewById(R.id.editText2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://m.post.naver.com/viewer/postView.nhn?volumeNo=16072619&memberNo=35758720"));
                startActivity(urlintent);
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=ZjR_40LsBwc"));
                startActivity(urlintent);
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=NDsjmxTROEo"));
                startActivity(urlintent);
            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent urlintent = new Intent(Intent.ACTION_VIEW,Uri.parse("https://www.youtube.com/watch?v=54tTYO-vU2E"));
                startActivity(urlintent);
            }
        });
    }

    public void onBtnResult(View v) {

        String strNum = editText1.getText().toString();
        double height = Integer.parseInt(strNum);
        strNum = editText2.getText().toString();
        double weight = Integer.parseInt(strNum);
        double result = weight / height / height * 10000;
        strNum = String.format("%.2f", result);
        textView1.setText(strNum);

    }
}