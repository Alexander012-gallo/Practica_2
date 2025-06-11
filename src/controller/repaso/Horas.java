/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller.repaso;

import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Horas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hora, x, min;
        char sig;
        System.out.println("Ingrese la hora: ");
        x = sc.nextInt();
        System.out.println("Ingrese el signo: ");
        sig = sc.next().charAt(0);
        System.out.println("Ingrese los minutos: ");
        min = sc.nextInt();
        System.out.println("Ingrese el numero de horas a calcular; ");
        hora = sc.nextInt();
        if (sig == '+') {
            System.out.println("El resultado es: " + (x + hora) + ":" + min);
        } else if (sig == '-') {
            System.out.println("El resultado es: " + (x - hora) + ":" + min);
        }
    }

}
