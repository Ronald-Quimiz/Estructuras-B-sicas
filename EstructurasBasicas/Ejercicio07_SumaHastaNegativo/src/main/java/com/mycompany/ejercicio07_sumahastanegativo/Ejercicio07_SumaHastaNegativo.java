/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio07_sumahastanegativo;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio07_SumaHastaNegativo {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int numero;
        int cantidad = 0;
        int suma = 0;
        System.out.println("Ingrese numeros. Un numero negativo termina el programa.");
        System.out.print("Numero: ");
        numero = sc.nextInt();
        while (numero >= 0) {
            cantidad++;
            suma += numero;
            System.out.print("Numero: ");
            numero = sc.nextInt();
        }
        System.out.println("Cantidad de numeros ingresados: " + cantidad);
        System.out.println("Suma total: " + suma);

        sc.close();
    }
}
