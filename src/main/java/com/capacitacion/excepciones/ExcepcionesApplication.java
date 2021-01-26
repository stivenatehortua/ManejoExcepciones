package com.capacitacion.excepciones;

import com.capacitacion.excepciones.personalizadas.ExcepcionesPersonalizadas;
import com.capacitacion.excepciones.procesos.ProcesarDatos;

import java.util.Scanner;

import static com.capacitacion.excepciones.utils.Constantes.*;

public class ExcepcionesApplication {

    public static void main(String[] args) {
        int opc;
        Scanner lee = new Scanner(System.in);
        do {
            System.out.println(MENU);
            opc = lee.nextInt();
            switch (opc) {
                case 0:
                    System.out.println("Cerrando sistema");
                    System.exit(0);
                    break;
                case 1:
                    caso1();
                    break;
                case 2:
                    caso2();
                    break;
                case 3:
                    caso3();
                    break;
                case 4:
                    caso4();
                    break;
                case 5:
                    caso5();
                    break;
                default:
                    System.out.println("opción inválida");
                    break;
            }
        } while (opc != 0);
    }

    public static void caso1() {

        ProcesarDatos procesarDatos = new ProcesarDatos();

        System.out.println(procesarDatos.division("48", "0"));
        System.out.println(procesarDatos.division("15.8", "30"));
    }

    public static void caso2() {

        ProcesarDatos procesarDatos = new ProcesarDatos();

        String[] array = new String[]{"palabra", "verbo", "frase"};
        procesarDatos.arreglo(array);
    }

    public static void caso3() {

        ProcesarDatos procesarDatos = new ProcesarDatos();
        try {
            procesarDatos.fecha("20200805");
        } catch (Exception e) {
            System.out.println(CAUSA + e.getCause());
            System.out.println(FALLA + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void caso4() {
        ProcesarDatos procesarDatos = new ProcesarDatos();
        try {
            procesarDatos.leerArchivo(RUTA);
        } catch (ExcepcionesPersonalizadas excepcionesPersonalizadas) {
            System.out.println(excepcionesPersonalizadas.getCausa());
            System.out.println(excepcionesPersonalizadas.getTipoFalla());
        }
    }

    public static void caso5() {

        ProcesarDatos procesarDatos = new ProcesarDatos();

        try {
            procesarDatos.lecturaYEscritura(RUTA);
        } catch (ExcepcionesPersonalizadas excepcionesPersonalizadas) {
            System.out.println(excepcionesPersonalizadas.getCausa());
            System.out.println(excepcionesPersonalizadas.getTipoFalla());
        }
    }
}
