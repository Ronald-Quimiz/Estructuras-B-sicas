/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio10_sumapromedio;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio10_SumaPromedio {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int numero;
            int suma = 0;
            
            for (int i = 1; i <= 10; i++) {
                System.out.print("Ingrese el numero " + i + ": ");
                numero = sc.nextInt();
                suma += numero;
            }
            
            double promedio = suma / 10.0;
            System.out.println("Suma: " + suma);
            System.out.println("Promedio: " + promedio);
        }
    }
}
