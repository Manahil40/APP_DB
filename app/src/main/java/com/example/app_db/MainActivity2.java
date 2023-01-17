package com.example.app_db;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    ImageButton whatsapp, github, result;
    TextView wapp, hub, res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        whatsapp = (ImageButton) findViewById(R.id.whatappButton);
        whatsapp.setOnClickListener((View.OnClickListener) this);

        github = (ImageButton) findViewById(R.id.githubButton);
        github.setOnClickListener((View.OnClickListener) this);

        result = (ImageButton) findViewById(R.id.resultButton);
        result.setOnClickListener((View.OnClickListener) this);



    }
}