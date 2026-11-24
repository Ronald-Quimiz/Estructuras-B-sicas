/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio02_operaciones;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio02_Operaciones {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer numero entero: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo numero entero: ");
        int b = sc.nextInt();

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));

        if (b != 0) {
            System.out.println("Division: " + ((double) a / b));
            System.out.println("Residuo: " + (a % b));
        } else {
            System.out.println("No se puede dividir ni calcular residuo entre cero.");
        }

        sc.close();
    }
}
