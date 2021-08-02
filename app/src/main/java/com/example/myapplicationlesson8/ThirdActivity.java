package com.example.myapplicationlesson8;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ThirdActivity extends AppCompatActivity {
    EditText etFile;
    Button btnNext3, btnChoose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);
        etFile = findViewById(R.id.et_file);
        btnNext3 = findViewById(R.id.btn_next3);
        btnChoose = findViewById(R.id.btn_choose);
        btnNext3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int file = Integer.parseInt(etFile.getText().toString());
                Intent intent = new Intent(ThirdActivity.this, FourthActivity.class);
                intent.putExtra("file", file);
                startActivity(intent);
            }
        });
        btnChoose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_SCREEN_ON);

            }
        });
    }

}