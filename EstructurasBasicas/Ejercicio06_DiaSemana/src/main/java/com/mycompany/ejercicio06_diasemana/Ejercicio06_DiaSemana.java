/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio06_diasemana;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio06_DiaSemana {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero del 1 al 7: ");
        int dia = sc.nextInt();
        switch (dia) {
            case 1 -> System.out.println("Lunes");
            case 2 -> System.out.println("Martes");
            case 3 -> System.out.println("Miercoles");
            case 4 -> System.out.println("Jueves");
            case 5 -> System.out.println("Viernes");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Numero fuera del rango 1 a 7.");
        }

        sc.close();
    }
}
