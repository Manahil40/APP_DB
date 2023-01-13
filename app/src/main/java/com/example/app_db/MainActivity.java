package com.example.app_db;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btnEven, btnOdd;
    TextView txtQ, txtQNo, txtscore, txtAns;
    int numbers = 0, n = 1, score = 0;
    String ans = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtQ = findViewById(R.id.txtQuestions);
        txtQNo = findViewById(R.id.textQNo);
        txtscore = findViewById(R.id.textScore);
        txtAns = findViewById(R.id.textAns);

        btnEven = findViewById(R.id.even);
        btnEven.setOnClickListener(this);

        btnOdd = findViewById(R.id.odd);
        btnOdd.setOnClickListener(this);

        GenerateNumbers();
    }

    private void GenerateNumbers(){

        Random rand = new Random();

        if (n <=10) {
            numbers = rand.nextInt(100) + 1;
            txtQNo.setText("Question # "+n);
            txtQ.setText(numbers + " is Even or Odd?");

            if (numbers % 2 == 0) {
                ans = "Even";
            } else {
                ans = "Odd";
            }
        }
    }
    @Override
    public void onClick(View view) {
        if (n <=10) {
            switch (view.getId()) {
                case R.id.even:
                    if (ans == "Even") {
                        txtAns.setText("Correct Answer!");
                        score++;
                        txtscore.setText("Score: " + score);
                    } else {
                        txtAns.setText("Incorrect Answer!");
                    }
                    break;

                case R.id.odd:
                    if (ans == "Odd") {
                        txtAns.setText("Correct Answer!");
                        score++;
                        txtscore.setText("Score: " + score);
                    } else {
                        txtAns.setText("Incorrect Answer!");
                    }
                    break;
            }n++;
            GenerateNumbers();
        }
    }
}