/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio04_aprobado;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio04_Aprobado {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la nota del estudiante: ");
        double nota = sc.nextDouble();
        if (nota >= 7) {
            System.out.println("Aprobado");
        } else {
            System.out.println("Reprobado");
        }
        sc.close();
    }
}
