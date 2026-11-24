/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio09_tablamultiplicar;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio09_TablaMultiplicar {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Ingrese un numero entero: ");
            int numero = sc.nextInt();
            
            for (int i = 1; i <= 12; i++) {
                System.out.println(numero + " x " + i + " = " + (numero * i));
            }
        }
    }
}
