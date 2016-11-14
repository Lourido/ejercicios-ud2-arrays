package com.lourido;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int horas = 24;
        double[] temperatura;
        // inicializo el array a 99.0
        temperatura = new double[horas];
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("Dame las temperaturas durante el día");
            temperatura[i] = Double.parseDouble(br.readLine());
        }

        // calcular la media, el máximo y el mínimo
        double total = 0;
        double max = Double.MIN_VALUE;
        double min = Double.MAX_VALUE;

        for (int i = 0; i < temperatura.length; i++) {
            total += temperatura[i];
            if (temperatura[i] > max) {
                max = temperatura[i];
            }
            if (temperatura[i] < min) {
                min = temperatura[i];
            }
            double media = total / temperatura.length;

            // hacer el dibujo

            for ( i = 0; i < temperatura.length; i++) {
                System.out.print(i);

                System.out.print(" ");

                for (int j = 0; j < temperatura[i]; j++) {
                    System.out.print("*");
                }
                System.out.print(" " + temperatura[i]);

                if (temperatura[i]== max){
                    System.out.print(" --> MAX");
                }
                if (temperatura[i]== min){
                    System.out.print(" --> MIN");
                }
                System.out.println();
            }

        }

    }
}
