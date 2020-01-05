package com.jojwebsandapps.practica2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    private TextView texto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        texto = (TextView) findViewById(R.id.textView);

        Bundle miBundle = getIntent().getExtras();
        if(miBundle != null && miBundle.getString("idHola") != null){
            String s = miBundle.getString("idHola");
            Toast.makeText(SecondActivity.this,s,Toast.LENGTH_SHORT);
            texto.setText(s);
        }else{
            Toast.makeText(SecondActivity.this,"Esta vacio",Toast.LENGTH_SHORT);

        }


    }
}
