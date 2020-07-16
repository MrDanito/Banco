package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Banco {
    public List<Cuenta> cuentas = new ArrayList<>();

    void crearCuenta(String nombre, float saldo) {
        Cuenta c = new Cuenta();
        c.setNombre(nombre);
        c.setSaldo(saldo);
        cuentas.add(c);
    }

    void mostrarCuenta() {

        for (int i = 0; i < cuentas.size(); i++) {
            System.out.println((i + 1) + "-" + cuentas.get(i).getNombre() + " : " + cuentas.get(i).getSaldo() + "€.");
        }

    }

    void accederCuenta(int i, Scanner s) {
        Cuenta c = cuentas.get(i);

        int op = -1;

        do {

            System.out.println("Menu" +
                    "\n1- Ver Saldo" +
                    "\n2- Ingresar" +
                    "\n3- Retirar" +
                    "\n0- Salir al menu principal.");

            op = s.nextInt();

            switch (op) {

                case 1:
                    System.out.println(c.getSaldo());
                    break;

                case 2:
                    System.out.println("¿Cuanto quieres ingresar?");
                    c.ingresar(s.nextInt());
                    break;

                case 3:
                    System.out.println("¿Cuanto quieres retirar?");
                    c.retirar(s.nextInt());
                    break;
                case 0:
                    System.out.println("Volviendo al menu principal.");
                    break;

            }

        } while (op != 0);
    }


    void transferir(Cuenta c1, Cuenta c2, Scanner s) {
        System.out.println("¿Cuánto quieres transferir?");
        int dinero = s.nextInt();
        c1.retirar(dinero);
        c2.ingresar(dinero);

        System.out.println(c1.getNombre() + " ahora tiene " + c1.getSaldo() + " y " +
                c2.getNombre() + " ahora tiene " + c2.getSaldo());
    }
}
