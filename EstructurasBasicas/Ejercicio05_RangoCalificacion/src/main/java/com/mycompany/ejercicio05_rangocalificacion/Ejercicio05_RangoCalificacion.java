/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio05_rangocalificacion;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio05_RangoCalificacion {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese una calificacion entre 0 y 10: ");
        double nota = sc.nextDouble();
        if (nota < 0 || nota > 10) {
            System.out.println("Calificacion fuera del rango permitido.");
        } else if (nota >= 9) {
            System.out.println("Excelente");
        } else if (nota >= 8) {
            System.out.println("Muy Bue9no");
        } else if (nota >= 7) {
            System.out.println("Bueno");
        } else if (nota >= 5) {
            System.out.println("Regular");
        } else {
            System.out.println("Deficiente");
        }
        sc.close();
    }
}
