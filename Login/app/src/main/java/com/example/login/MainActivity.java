package com.example.login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private TextView textviewkayit,textviewSifirlama;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textviewkayit=(TextView)findViewById(R.id.textKayitOl);
        textviewkayit.setOnClickListener(this);
        textviewSifirlama=(TextView)findViewById(R.id.textSifirla);
        textviewSifirlama.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textKayitOl:
                startActivity(new Intent(this,Kayit.class));
                break;
            case R.id.textSifirla:
                startActivity(new Intent(this,Sifirla.class));
                break;
        }

    }
}