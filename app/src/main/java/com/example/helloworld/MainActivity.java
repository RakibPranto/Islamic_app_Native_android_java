package com.example.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button Lb,Lo;
    private TextView t;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Lb=(Button) findViewById(R.id.button1);
        t=(TextView)findViewById(R.id.t2);
         Lo=(Button) findViewById(R.id.button2);
        Lb.setOnClickListener(this);
        Lo.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button1) {

            t.setText("Allah is One");
            Toast.makeText(MainActivity.this, "Allah is One!", Toast.LENGTH_SHORT).show();
            Log.v("Tag", "Allah is One");
        }
        if(v.getId()==R.id.button2
        ) {

            Intent intent = new Intent(MainActivity.this,MainActivity2.class);
            startActivity(intent);
        }
    }
}
