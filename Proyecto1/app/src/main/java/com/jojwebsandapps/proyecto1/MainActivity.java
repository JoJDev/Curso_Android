package com.jojwebsandapps.proyecto1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.jojwebsandapps.proyecto1.model.Alumno;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Alumno alumno = new Alumno();
        alumno.setNombre("jesus");
        alumno.setNumCuenta(12120);
        alumno.setFechaNacimiento(1999,10,10);
    }
}
