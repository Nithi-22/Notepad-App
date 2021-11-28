package com.example.notepad;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Main1Activity extends AppCompatActivity {
    EditText pwd;
    Button but;
    int pass = 123;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main1);
        pwd = findViewById(R.id.password);
        but = findViewById(R.id.button);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String psd = pwd.getText().toString();
                if (psd.equals(pass)) {
                    Toast.makeText(Main1Activity.this, "Success", Toast.LENGTH_LONG).show();
                    Intent intent = new Intent(getApplicationContext(),MainActivity2.class );
                    startActivity(intent);
                }
                else{
                    Toast.makeText(Main1Activity.this,"Invalid credential",Toast.LENGTH_LONG).show();
                }

            }

        });
    }
}
