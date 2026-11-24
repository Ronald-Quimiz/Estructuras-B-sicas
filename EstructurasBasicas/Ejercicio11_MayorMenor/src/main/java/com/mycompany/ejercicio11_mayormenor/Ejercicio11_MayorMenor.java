/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio11_mayormenor;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio11_MayorMenor {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese el numero 1: ");
            int numero = sc.nextInt();
            int mayor = numero;
            int menor = numero;
            for (int i = 2; i <= 10; i++) {
                System.out.print("Ingrese el numero " + i + ": ");
                numero = sc.nextInt();
                
                if (numero > mayor) {
                    mayor = numero;
                }
                if (numero < menor) {
                    menor = numero;
                }
            }
            System.out.println("Numero mayor: " + mayor);
            System.out.println("Numero menor: " + menor);
        }
    }
}
