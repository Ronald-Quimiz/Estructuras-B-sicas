/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio03_mayoriaedad;

import java.util.Scanner;

/**
 *8
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio03_MayoriaEdad {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        if (edad >= 18) {
            System.out.println("Es mayor de edad.");
        }
        sc.close();
    }
}
