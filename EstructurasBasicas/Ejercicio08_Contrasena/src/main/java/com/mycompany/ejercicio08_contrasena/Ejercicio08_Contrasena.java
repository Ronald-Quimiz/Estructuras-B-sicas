/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio08_contrasena;

import java.util.Scanner;

/**
 *
 * @author Ronald Sebastian Quimiz San Martin
 */
public class Ejercicio08_Contrasena {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String clave;
            
            do {
                System.out.print("Ingrese la contrasena: ");
                clave = sc.nextLine();
            } while (!clave.equals("java2026"));
            
            System.out.println("Acceso concedido.");
        }
    }j
}
