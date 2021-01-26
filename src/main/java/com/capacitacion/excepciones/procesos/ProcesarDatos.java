package com.capacitacion.excepciones.procesos;

import com.capacitacion.excepciones.personalizadas.ExcepcionesPersonalizadas;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import static com.capacitacion.excepciones.utils.Constantes.*;

public class ProcesarDatos {

    public int division(String numero1, String numero2) {
        int resultado = 0;

        try {
            resultado = Integer.parseInt(numero1) / Integer.parseInt(numero2);
        } catch (ArithmeticException | NumberFormatException e) {
            System.out.println(CAUSA + e.getCause());
            System.out.println(FALLA + e.getMessage());
            e.printStackTrace();
        }
        return resultado;
    }


    public void arreglo(String[] lista) {

        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println(lista[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(CAUSA + e.getCause());
            System.out.println(FALLA + "El arreglo es de " + e.getMessage() + " posiciones");
            e.printStackTrace();
        }
    }

    public void fecha(String input) throws Exception {

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date date = format.parse(input);
            date.toString();
        } catch (ParseException e) {
            throw new Exception(e);
        }
    }

    public void leerArchivo(String ruta) throws ExcepcionesPersonalizadas {

        try {
            Scanner lee = new Scanner(new File(ruta));
            while (lee.hasNextLine()) {
                System.out.println(lee.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new ExcepcionesPersonalizadas(CAUSA + e.getCause(),
                    FALLA + "No se encontró la ruta " + e.getMessage());
        }
    }

    public void lecturaYEscritura(String ruta) throws ExcepcionesPersonalizadas {

        BufferedWriter bufferedWriter = null;
        try {
            Scanner lee = new Scanner(new File(ruta));
            File archivo = new File(RUTA2);
            bufferedWriter = new BufferedWriter(new FileWriter(archivo));

            while (lee.hasNextLine()) {
                String[] arreglo = lee.nextLine().split(";");
                if (arreglo.length < 3)
                    bufferedWriter.write(arreglo[0] + "," + arreglo[1] + "\n");
                else
                    bufferedWriter.write(arreglo[0] + "," + arreglo[2] + "\n");
            }
        } catch (FileNotFoundException e) {
            throw new ExcepcionesPersonalizadas(e.getCause().toString(), e.getMessage());
        } catch (IOException e) {
            throw new ExcepcionesPersonalizadas(e.getCause().toString(), e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new ExcepcionesPersonalizadas(CAUSA + e.getCause(),
                    FALLA + "el arreglo solo tiene " + e.getMessage() + " posiciones");
        } finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                throw new ExcepcionesPersonalizadas(CAUSA + e.getCause(), FALLA + e.getMessage());
            } catch (NullPointerException e) {
                throw new ExcepcionesPersonalizadas(CAUSA + e.getCause(), FALLA + "el objeto es " + e.getMessage());
            }
        }
    }
}
