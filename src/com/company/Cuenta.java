package com.company;

public class Cuenta {

    private String nombre;
    private float saldo;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void retirar(int dinero) {

        if (saldo < dinero) {
            System.out.println("No hay tanto dinero en la cuenta. Disponible " + saldo);
        } else {
            saldo -= dinero;
        }

    }

    public void ingresar(int dinero) {

        saldo += dinero;
    }
}
