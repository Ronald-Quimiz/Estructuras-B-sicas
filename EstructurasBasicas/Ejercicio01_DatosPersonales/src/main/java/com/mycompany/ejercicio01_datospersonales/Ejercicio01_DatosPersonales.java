/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejercicio01_datospersonales;
import java.util.Scanner;
/**
 *
 * @author Ronald SEbastian Quimiz San Martin
 */
public class Ejercicio01_DatosPersonales {

    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.print("Ingrese su carrera: ");
        String carrera = sc.nextLine();
        System.out.print("Ingrese su estatura en metros: ");
        double estatura = sc.nextDouble();
        System.out.println("\n--- Datos ingresados ---");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Estatura: " + estatura + " m");
        sc.close();
    }
}
