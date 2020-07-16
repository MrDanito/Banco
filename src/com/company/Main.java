package com.company;

import java.util.Scanner;

public class Main {

    Scanner s = new Scanner(System.in);
    Banco bantierra;

    void EmpezarPrograma()
    {
        bantierra = new Banco();

        int op = -1;

        do {

            System.out.println("Menu" +
                    "\n1- Crear cuenta" +
                    "\n2- Mostrar cuentas" +
                    "\n3- Transferir dineros" +
                    "\n0- Salir");

            op = s.nextInt();

            switch (op) {

                case 1:
                    CrearCuenta();
                    break;

                case 2:
                    bantierra.mostrarCuenta();
                    System.out.println("¿A cuál quieres acceder?");
                    bantierra.accederCuenta(s.nextInt(), s);
                    break;
                case 3:
                    bantierra.mostrarCuenta();
                    System.out.println("¿De qué cuenta a qué cuenta?");
                    bantierra.transferir(bantierra.cuentas.get(s.nextInt() - 1),
                            bantierra.cuentas.get(s.nextInt() - 1), s);
                    break;

                case 0:
                    System.out.println("Hasta la vista.");
                    break;

            }

        } while (op != 0);


    }

    void CrearCuenta() {
        System.out.println("Nombre:");
        String nombre = s.next();
        System.out.println("Saldo: ");
        float saldo = s.nextFloat();
        bantierra.crearCuenta(nombre, saldo);
    }


    public static void main(String[] args) {
        new Main().EmpezarPrograma();
    }

}
