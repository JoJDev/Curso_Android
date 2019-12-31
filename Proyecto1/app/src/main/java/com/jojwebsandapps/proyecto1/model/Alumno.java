package com.jojwebsandapps.proyecto1.model;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alumno {

    private String nombre;
    private int numCuenta;
    private Date fechaNacimiento;


     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(int year,int month, int day) {
         Calendar fecha = new GregorianCalendar(year, month, day);
         this.fechaNacimiento = fecha.getTime();
    }
}
